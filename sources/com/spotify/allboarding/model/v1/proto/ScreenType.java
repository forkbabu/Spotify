package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.o;

public enum ScreenType implements o.c {
    LOADING(0),
    PICKER(1),
    UNRECOGNIZED(-1);
    
    private final int value;

    private ScreenType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
