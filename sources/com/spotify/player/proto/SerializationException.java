package com.spotify.player.proto;

public final class SerializationException extends RuntimeException {
    private static final long serialVersionUID = 3027429512488055769L;

    public SerializationException(String str) {
        super(str);
    }
}
