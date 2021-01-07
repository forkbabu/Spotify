package com.spotify.pses.v1.proto;

import com.google.protobuf.o;

public enum AuthProviderState implements o.c {
    AUTH_PROVIDER_STATE_UNSPECIFIED(0),
    AUTH_PROVIDER_STATE_LOGIN_ONLY(1),
    AUTH_PROVIDER_STATE_LOGIN_SIGNUP(2),
    UNRECOGNIZED(-1);
    
    private final int value;

    private AuthProviderState(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
