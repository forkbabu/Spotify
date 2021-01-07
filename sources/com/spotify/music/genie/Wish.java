package com.spotify.music.genie;

public abstract class Wish {

    public enum Action {
        DO_NOTHING,
        PLAY_CURRENT_SESSION,
        PLAY_URI
    }

    public abstract Action a();

    public abstract String b();

    public abstract String c();
}
