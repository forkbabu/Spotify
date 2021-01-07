package com.spotify.facebook.authentication.login;

import androidx.lifecycle.Lifecycle;
import com.spotify.facebook.authentication.tracker.FacebookTracker;
import com.spotify.login.r0;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.j;
import io.reactivex.y;

public final class p implements fjf<FacebookSSOPresenter> {
    private final wlf<c> a;
    private final wlf<zl0> b;
    private final wlf<y> c;
    private final wlf<r0> d;
    private final wlf<Lifecycle> e;
    private final wlf<q> f;
    private final wlf<f> g;
    private final wlf<j> h;
    private final wlf<FacebookTracker> i;
    private final wlf<Boolean> j;

    public p(wlf<c> wlf, wlf<zl0> wlf2, wlf<y> wlf3, wlf<r0> wlf4, wlf<Lifecycle> wlf5, wlf<q> wlf6, wlf<f> wlf7, wlf<j> wlf8, wlf<FacebookTracker> wlf9, wlf<Boolean> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FacebookSSOPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get().booleanValue());
    }
}
