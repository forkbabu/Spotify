package com.spotify.music.playlist.permissions.proto;

import com.google.protobuf.o;

public enum PermissionLevel implements o.c {
    UNKNOWN(0),
    BLOCKED(1),
    VIEWER(2);
    
    private final int value;

    private PermissionLevel(int i) {
        this.value = i;
    }

    public static PermissionLevel d(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return BLOCKED;
        }
        if (i != 2) {
            return null;
        }
        return VIEWER;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
