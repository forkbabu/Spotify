package com.spotify.music.lyrics.vocalremoval.model;

public enum VocalVolume {
    OFF(Double.valueOf(0.9999999d)),
    HIGH(Double.valueOf(0.25d)),
    LOW(Double.valueOf(0.1d));
    
    private final Double mVocalVolume;

    private VocalVolume(Double d) {
        this.mVocalVolume = d;
    }

    public Double d() {
        return this.mVocalVolume;
    }
}
