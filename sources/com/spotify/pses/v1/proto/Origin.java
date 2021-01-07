package com.spotify.pses.v1.proto;

import com.google.protobuf.o;

public enum Origin implements o.c {
    APP_LAUNCH(0),
    MANUAL_LOGOUT(1),
    FORCED_LOGOUT(2),
    UNRECOGNIZED(-1);
    
    private final int value;

    private Origin(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
