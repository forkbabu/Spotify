package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.instrumentation.a;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.logging.c;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class s implements fjf<r> {
    private final wlf<g<PlayerState>> a;
    private final wlf<UserMixDataSource> b;
    private final wlf<Boolean> c;
    private final wlf<w> d;
    private final wlf<u> e;
    private final wlf<y> f;
    private final wlf<c> g;
    private final wlf<com.spotify.music.libs.viewuri.c> h;
    private final wlf<a> i;

    public s(wlf<g<PlayerState>> wlf, wlf<UserMixDataSource> wlf2, wlf<Boolean> wlf3, wlf<w> wlf4, wlf<u> wlf5, wlf<y> wlf6, wlf<c> wlf7, wlf<com.spotify.music.libs.viewuri.c> wlf8, wlf<a> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static s a(wlf<g<PlayerState>> wlf, wlf<UserMixDataSource> wlf2, wlf<Boolean> wlf3, wlf<w> wlf4, wlf<u> wlf5, wlf<y> wlf6, wlf<c> wlf7, wlf<com.spotify.music.libs.viewuri.c> wlf8, wlf<a> wlf9) {
        return new s(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get(), this.c.get().booleanValue(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
