/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2020 The OpenNMS Group, Inc.
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

package org.opennms.core.ipc.grpc.client;

import org.opennms.core.health.api.Context;
import org.opennms.core.health.api.HealthCheck;
import org.opennms.core.health.api.Response;
import org.opennms.core.health.api.Status;

import io.grpc.ConnectivityState;

public class GrpcHealthCheck implements HealthCheck {

    private final MinionGrpcClient minionGrpcClient;

    public GrpcHealthCheck(MinionGrpcClient minionGrpcClient) {
        this.minionGrpcClient = minionGrpcClient;
    }

    @Override
    public String getDescription() {
        return "Connecting to gRPC IPC Server";
    }

    @Override
    public HealthTag getTag() {
        return HealthTag.UNDEFINED;
    }

    @Override
    public Response perform(Context context) throws Exception {
        if (minionGrpcClient.getChannelState().equals(ConnectivityState.READY)) {
            return new Response(Status.Success);
        } else if (minionGrpcClient.getChannelState().equals(ConnectivityState.CONNECTING)) {
            return new Response(Status.Starting);
        }
        return new Response(Status.Failure);
    }
}
