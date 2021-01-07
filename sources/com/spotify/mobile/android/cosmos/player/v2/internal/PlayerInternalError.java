package com.spotify.mobile.android.cosmos.player.v2.internal;

public class PlayerInternalError extends RuntimeException {
    private static final long serialVersionUID = -6263428516441827120L;

    public PlayerInternalError(Throwable th) {
        super(th);
    }
}
