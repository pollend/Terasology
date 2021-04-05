// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.engine.persistence.internal.data;

import org.terasology.engine.entitySystem.entity.EntityManager;
import org.terasology.engine.world.chunks.Chunk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.function.Supplier;

public class ChunkSerializer {
    public static final int VERSION = 0x1;

    public static void decode(int version, DataInputStream buffer, Supplier<Chunk> chunk, Supplier<EntityManager> entityManagerSupplier) throws IOException {
        switch (version) {
            case V1.VERSION:
                V1.decode(buffer);
                EntitySerializer.V1.decode(buffer);
                break;
        }
    }


    public static class V1 {
        public static final int VERSION = 0x1;

        public static Chunk decode(DataInputStream buffer) {

            return null;
        }
        public static void encode(DataOutputStream buffer) {

        }
    }


}
