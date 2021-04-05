// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.engine.persistence.internal.storage;

import org.joml.Vector3ic;

import java.io.InputStream;

public class SaveFileStore implements DataStorage {

    @Override
    public InputStream readChunkStream(Vector3ic pos) {
        return null;
    }
}
