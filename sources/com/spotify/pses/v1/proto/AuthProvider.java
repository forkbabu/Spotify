package com.spotify.pses.v1.proto;

import com.google.protobuf.o;

public enum AuthProvider implements o.c {
    AUTH_PROVIDER_UNSPECIFIED(0),
    AUTH_PROVIDER_EMAIL(1),
    AUTH_PROVIDER_FACEBOOK(2),
    AUTH_PROVIDER_APPLE(3),
    AUTH_PROVIDER_PHONE_NUMBER(4),
    AUTH_PROVIDER_GOOGLE(5),
    UNRECOGNIZED(-1);
    
    private final int value;

    private AuthProvider(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
