package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;

public class w implements a {
    private final sjd a;
    private final djd b;

    public w(sjd sjd, djd djd) {
        this.a = sjd;
        this.b = djd;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        if (!this.b.a()) {
            return false;
        }
        if (this.b.b()) {
            return playerState.track().get().metadata().containsKey("storylines.id");
        }
        return this.a.a(playerState.track().get().uri());
    }
}
