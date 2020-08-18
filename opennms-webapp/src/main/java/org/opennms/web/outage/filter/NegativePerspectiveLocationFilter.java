/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2002-2020 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2020 The OpenNMS Group, Inc.
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

package org.opennms.web.outage.filter;

import java.util.Objects;

import org.opennms.web.filter.NotEqualsFilterNullAware;
import org.opennms.web.filter.SQLType;
import org.opennms.web.outage.OutageUtil;

public class NegativePerspectiveLocationFilter extends NotEqualsFilterNullAware {
    public static final String TYPE = "notperspective";

    public NegativePerspectiveLocationFilter(String perspective) {
        super(TYPE, SQLType.STRING, "PERSPECTIVE", "perspective.locationName", perspective);
    }

    @Override
    public String getTextDescription() {
        return ("perspective is not " + getValue());
    }

    @Override
    public String getTextDescriptionAsSanitizedHtml() {
        String perspectiveString = OutageUtil.getPerspectiveLabel(getValue());
        return ("perspective is not " + perspectiveString);
    }

    @Override
    public String toString() {
        return ("<NegativePerspectiveLocationFilter: " + this.getDescription() + ">");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NegativePerspectiveLocationFilter that = (NegativePerspectiveLocationFilter) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
