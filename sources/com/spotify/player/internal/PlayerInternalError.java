package com.spotify.player.internal;

public class PlayerInternalError extends RuntimeException {
    private static final long serialVersionUID = -7273478517771827127L;

    public PlayerInternalError(Throwable th) {
        super(th);
    }
}
