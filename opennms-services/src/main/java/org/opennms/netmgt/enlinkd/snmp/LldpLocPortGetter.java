/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.enlinkd.snmp;

import java.util.ArrayList;
import java.util.List;

import org.opennms.core.utils.LldpUtils.LldpPortIdSubType;
import org.opennms.netmgt.model.LldpLink;
import org.opennms.netmgt.snmp.SnmpAgentConfig;
import org.opennms.netmgt.snmp.SnmpObjId;
import org.opennms.netmgt.snmp.SnmpValue;
import org.opennms.netmgt.snmp.proxy.LocationAwareSnmpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LldpLocPortGetter extends SnmpGetter {

    private final static Logger LOG = LoggerFactory.getLogger(LldpLocPortGetter.class);

    public final static SnmpObjId LLDP_LOC_PORTID_SUBTYPE = SnmpObjId.get(".1.0.8802.1.1.2.1.3.7.1.2");
    public final static SnmpObjId LLDP_LOC_PORTID         = SnmpObjId.get(".1.0.8802.1.1.2.1.3.7.1.3");
    public final static SnmpObjId LLDP_LOC_DESCR          = SnmpObjId.get(".1.0.8802.1.1.2.1.3.7.1.4");

	public LldpLocPortGetter(SnmpAgentConfig peer, LocationAwareSnmpClient client, String location) {
	    super(peer, client, location);
	}

    public LldpLink get(Integer lldpRemLocalPortNum) {
        List<SnmpObjId> oids = new ArrayList<SnmpObjId>(3);
                oids.add(SnmpObjId.get(LLDP_LOC_PORTID_SUBTYPE));
                oids.add(SnmpObjId.get(LLDP_LOC_PORTID));
                oids.add(SnmpObjId.get(LLDP_LOC_DESCR)) ;

        List<SnmpValue> val = get(oids,lldpRemLocalPortNum);

        LldpLink lldplink = new LldpLink();
        lldplink.setLldpLocalPortNum(lldpRemLocalPortNum);
        if (val == null ) {
            LOG.warn("get: cannot find local instance for lldp local port number {}",
                     lldpRemLocalPortNum);
            LOG.warn("get: setting default not found Values: portidtype \"InterfaceAlias\", portid=\"Not Found On lldpLocPortTable\"");
            lldplink.setLldpPortIdSubType(LldpPortIdSubType.LLDP_PORTID_SUBTYPE_INTERFACEALIAS);
            lldplink.setLldpPortId("\"Not Found On lldpLocPortTable\"");
            lldplink.setLldpPortDescr("");
            return lldplink;
        }

        if (val.get(0) == null || val.get(0).isError() || !val.get(0).isNumeric()) {
            LOG.warn("get: port id subtype is null or invalid for lldp local port number {}",
                     lldpRemLocalPortNum);
            LOG.warn("get: setting default not found Values: portidtype \"InterfaceAlias\"");
            lldplink.setLldpPortIdSubType(LldpPortIdSubType.LLDP_PORTID_SUBTYPE_INTERFACEALIAS);
        } else {
            lldplink.setLldpPortIdSubType(LldpPortIdSubType.get(val.get(0).toInt()));
        }
        if (val.get(1) == null || val.get(1).isError()) {
            LOG.warn("get: port id is null for lldp local port number {}",
                     lldpRemLocalPortNum);
            LOG.warn("get: setting default not found Values: portid=\"Not Found On lldpLocPortTable\"");
            lldplink.setLldpPortId("\"Not Found On lldpLocPortTable\"");
        } else {
            lldplink.setLldpPortId(LldpRemTableTracker.decodeLldpPortId(lldplink.getLldpPortIdSubType().getValue(),
                                                                        val.get(1)));
        }
        if (val.get(2) != null && !val.get(2).isError())
            lldplink.setLldpPortDescr((val.get(2).toDisplayString()));
        else
            lldplink.setLldpPortDescr("");
        if (val.get(0).isNumeric()
                && val.get(0).toInt() == LldpPortIdSubType.LLDP_PORTID_SUBTYPE_LOCAL.getValue().intValue()) {
            try {
                lldplink.setLldpPortIfindex((val.get(1).toInt()));
            } catch (Exception e) {
                LOG.debug("get: failed to convert to ifindex local port id {}",
                          val.get(1));
            }
        }
        return lldplink;
    }

}
