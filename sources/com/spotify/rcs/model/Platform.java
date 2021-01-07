package com.spotify.rcs.model;

import com.google.protobuf.o;

public enum Platform implements o.c {
    UNKNOWN(0),
    ANDROID(1),
    BACKEND(2),
    IOS(3),
    WEB(4),
    UNRECOGNIZED(-1);
    
    private final int value;

    private Platform(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
