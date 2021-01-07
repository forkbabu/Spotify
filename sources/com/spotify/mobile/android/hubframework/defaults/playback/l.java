package com.spotify.mobile.android.hubframework.defaults.playback;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.play.f;
import io.reactivex.y;

public final class l implements fjf<HubsTracksPlayerHelper> {
    private final wlf<Context> a;
    private final wlf<w> b;
    private final wlf<f> c;
    private final wlf<c.a> d;
    private final wlf<n> e;
    private final wlf<y> f;
    private final wlf<lxd> g;

    public l(wlf<Context> wlf, wlf<w> wlf2, wlf<f> wlf3, wlf<c.a> wlf4, wlf<n> wlf5, wlf<y> wlf6, wlf<lxd> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static l a(wlf<Context> wlf, wlf<w> wlf2, wlf<f> wlf3, wlf<c.a> wlf4, wlf<n> wlf5, wlf<y> wlf6, wlf<lxd> wlf7) {
        return new l(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HubsTracksPlayerHelper(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
