package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.o;

public enum OfflinePluginResourceType$ResourceType implements o.c {
    OTHER(0),
    AUDIO(1),
    DRM(2),
    IMAGE(3),
    VIDEO(4),
    UNRECOGNIZED(-1);
    
    private final int value;

    private OfflinePluginResourceType$ResourceType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
