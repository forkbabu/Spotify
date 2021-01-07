package com.spotify.music.nowplaying.drivingmode.presenter.voice;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import defpackage.tvb;

public class i implements tvb.a {
    private final wlf<Player> a;

    public i(wlf<Player> wlf) {
        this.a = wlf;
    }

    public void a(String str) {
        if (!MoreObjects.isNullOrEmpty(str)) {
            this.a.get().play(PlayerContext.createFromContextUrl(str, "context://" + str), null);
        }
    }
}
