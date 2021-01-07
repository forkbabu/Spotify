package com.spotify.music.ondemandsharing.shufflebutton;

import androidx.lifecycle.n;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import io.reactivex.g;

public final class j implements fjf<OnDemandSharingShufflePlayButtonHubsCommandHandler> {
    private final wlf<g<PlayerState>> a;
    private final wlf<f> b;
    private final wlf<PlayOrigin> c;
    private final wlf<d> d;
    private final wlf<n> e;

    public j(wlf<g<PlayerState>> wlf, wlf<f> wlf2, wlf<PlayOrigin> wlf3, wlf<d> wlf4, wlf<n> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new OnDemandSharingShufflePlayButtonHubsCommandHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
