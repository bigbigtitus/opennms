/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2018-2018 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2018 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.telemetry.distributed.minion;

import org.opennms.core.health.api.SimpleHealthCheck;
import org.opennms.netmgt.telemetry.config.api.ListenerDefinition;

import java.util.Arrays;
import java.util.List;

import static org.opennms.core.health.api.HealthConstants.LOCAL;
import static org.opennms.core.health.api.HealthConstants.TELEMETRY;

public class ListenerHealthCheck extends SimpleHealthCheck {

    public ListenerHealthCheck(ListenerDefinition listenerDefinition) {
        super(() -> "Verifying Listener " + listenerDefinition.getName() + " (" + listenerDefinition.getClassName() + ")");
    }

    @Override
    public List<String> getTags() {
        return Arrays.asList(LOCAL, TELEMETRY);
    }
}


