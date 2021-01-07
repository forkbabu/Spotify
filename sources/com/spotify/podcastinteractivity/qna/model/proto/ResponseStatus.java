package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.o;

public enum ResponseStatus implements o.c {
    ACTIVE(0),
    DELETED_BY_USER(1),
    UNRECOGNIZED(-1);
    
    private final int value;

    private ResponseStatus(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
