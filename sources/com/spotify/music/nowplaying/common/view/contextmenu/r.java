package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.player.model.PlayerState;

public abstract class r {
    public static r b(String str, String str2, PlayerState playerState) {
        return new k(str, str2, playerState);
    }

    public abstract String a();

    public abstract PlayerState c();

    public abstract String d();
}
