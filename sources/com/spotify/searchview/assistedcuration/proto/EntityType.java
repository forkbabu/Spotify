package com.spotify.searchview.assistedcuration.proto;

import com.google.protobuf.o;

public enum EntityType implements o.c {
    ENTITY_TYPE_UNKNOWN(0),
    ENTITY_TYPE_ARTIST(1),
    ENTITY_TYPE_TRACK(2),
    ENTITY_TYPE_ALBUM(3),
    UNRECOGNIZED(-1);
    
    private final int value;

    private EntityType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
