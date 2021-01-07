package com.spotify.remoteconfig.client.model.resolve;

import kotlin.jvm.internal.f;

public enum FetchType {
    UNKNOWN(0),
    BACKGROUND_SYNC(1),
    BLOCKING(2),
    DELAYED(3),
    UNRECOGNIZED(-1);
    
    public static final a p = new a(null);
    private final int number;

    public static final class a {
        public a(f fVar) {
        }
    }

    private FetchType(int i) {
        this.number = i;
    }

    public final int d() {
        return this.number;
    }
}
