package com.spotify.music.features.album.encore;

import androidx.lifecycle.n;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class j implements fjf<PlayFromContextOrPauseCommandHandler> {
    private final wlf<d> a;
    private final wlf<n> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<a71> d;

    public j(wlf<d> wlf, wlf<n> wlf2, wlf<g<PlayerState>> wlf3, wlf<a71> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayFromContextOrPauseCommandHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
