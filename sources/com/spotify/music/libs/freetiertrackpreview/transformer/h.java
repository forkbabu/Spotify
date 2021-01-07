package com.spotify.music.libs.freetiertrackpreview.transformer;

import androidx.lifecycle.n;
import com.spotify.music.libs.freetiertrackpreview.logging.a;
import com.spotify.music.preview.v;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.f8;
import io.reactivex.g;

public final class h implements fjf<TrackPreviewPlayerStateUpdateHandlerImpl> {
    private final wlf<a> a;
    private final wlf<nfa> b;
    private final wlf<f8> c;
    private final wlf<v> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<n> f;

    public h(wlf<a> wlf, wlf<nfa> wlf2, wlf<f8> wlf3, wlf<v> wlf4, wlf<g<PlayerState>> wlf5, wlf<n> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TrackPreviewPlayerStateUpdateHandlerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
