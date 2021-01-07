package com.spotify.searchview.proto;

import com.google.protobuf.o;

public enum EntityType implements o.c {
    ENTITY_TYPE_UNKNOWN(0),
    ENTITY_TYPE_ARTIST(1),
    ENTITY_TYPE_TRACK(2),
    ENTITY_TYPE_ALBUM(3),
    ENTITY_TYPE_PLAYLIST(4),
    ENTITY_TYPE_GENRE(5),
    ENTITY_TYPE_AUDIO_SHOW(6),
    ENTITY_TYPE_AUDIO_EPISODE(7),
    ENTITY_TYPE_PROFILE(8),
    ENTITY_TYPE_TOPIC(9),
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
