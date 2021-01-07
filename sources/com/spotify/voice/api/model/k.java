package com.spotify.voice.api.model;

import com.spotify.player.model.PlayerState;

public abstract class k {
    public static k b(PlayerState playerState, String str, boolean z) {
        return new e(playerState, str, z);
    }

    public abstract String a();

    public abstract boolean c();

    public abstract PlayerState d();
}
