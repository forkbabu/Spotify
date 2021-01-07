package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.o;

public enum Gradient implements o.c {
    VERSION_1(0),
    VERSION_2(1),
    UNRECOGNIZED(-1);
    
    private final int value;

    private Gradient(int i) {
        this.value = i;
    }

    public static Gradient d(int i) {
        if (i == 0) {
            return VERSION_1;
        }
        if (i != 1) {
            return null;
        }
        return VERSION_2;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
