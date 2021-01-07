package com.spotify.music.appprotocol.volume;

public class VolumeOutOfRangeException extends RuntimeException {
    private static final long serialVersionUID = 4042722278750821513L;

    public VolumeOutOfRangeException() {
        super("The value of volume should be between 0f (inclusive) and 1f (inclusive).");
    }
}
