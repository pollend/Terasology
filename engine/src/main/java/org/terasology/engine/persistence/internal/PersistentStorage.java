// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.engine.persistence.internal;

import org.joml.Vector3ic;
import org.terasology.engine.entitySystem.entity.EntityManager;
import org.terasology.engine.entitySystem.entity.EntityRef;
import org.terasology.engine.persistence.internal.data.ChunkSerializer;
import org.terasology.engine.persistence.internal.storage.DataStorage;
import org.terasology.engine.world.chunks.Chunk;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;

public class PersistentStorage {
    private final DataStorage storage;
    private final EntityManager entityManager;

    public PersistentStorage(DataStorage storage, EntityManager entityManager) {
        this.storage = storage;
        this.entityManager = entityManager;
    }

    public void readChunk(Vector3ic chunkPos, Supplier<EntityRef> entity, Supplier<Chunk> chunk) throws IOException {
        try (InputStream bufferedReader = storage.readChunkStream(chunkPos)) {
            DataInputStream stream = new DataInputStream(bufferedReader);
            int version = stream.readInt();
            switch (version) {
                case ChunkSerializer.V1.VERSION:
                    break;
            }
        }
    }

    public void writeChunk(Vector3ic chunkPos,)
}
