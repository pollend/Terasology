// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.engine.persistence.internal.data;

import org.terasology.engine.entitySystem.entity.EntityManager;
import org.terasology.engine.world.chunks.Chunk;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class EntitySerializer {

    public static class V1 {
        public static final int VERSION = 0x1;

        public static void decode(DataInputStream buffer, EntityManager entityManager) {

//            return null;
        }
        public static void encode(DataOutputStream buffer) {

        }
    }
}
