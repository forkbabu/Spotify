package com.spotify.music.offlinetrials.limited.trackentity;

import androidx.lifecycle.n;
import com.spotify.music.offlinetrials.limited.logging.c;
import com.spotify.music.offlinetrials.limited.trackentity.endpoint.a;
import com.spotify.music.offlinetrials.limited.uicomponents.u;
import io.reactivex.y;

public final class k implements fjf<j> {
    private final wlf<n> a;
    private final wlf<n> b;
    private final wlf<u> c;
    private final wlf<String> d;
    private final wlf<a> e;
    private final wlf<y> f;
    private final wlf<c> g;
    private final wlf<com.spotify.music.libs.viewuri.c> h;
    private final wlf<com.spotify.instrumentation.a> i;

    public k(wlf<n> wlf, wlf<n> wlf2, wlf<u> wlf3, wlf<String> wlf4, wlf<a> wlf5, wlf<y> wlf6, wlf<c> wlf7, wlf<com.spotify.music.libs.viewuri.c> wlf8, wlf<com.spotify.instrumentation.a> wlf9) {
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

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
