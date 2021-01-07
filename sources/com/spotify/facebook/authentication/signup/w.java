package com.spotify.facebook.authentication.signup;

import androidx.lifecycle.Lifecycle;
import com.spotify.facebook.authentication.tracker.FacebookTracker;
import com.spotify.login.r0;
import com.spotify.loginflow.navigation.a;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.connection.n;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.j;
import com.spotify.termsandconditions.l;
import io.reactivex.y;

public final class w implements fjf<CreateAccountPresenter> {
    private final wlf<y> a;
    private final wlf<iae> b;
    private final wlf<zl0> c;
    private final wlf<a> d;
    private final wlf<l> e;
    private final wlf<n> f;
    private final wlf<Lifecycle> g;
    private final wlf<f> h;
    private final wlf<j> i;
    private final wlf<xd0> j;
    private final wlf<d> k;
    private final wlf<r0> l;
    private final wlf<i31> m;
    private final wlf<FacebookTracker> n;

    public w(wlf<y> wlf, wlf<iae> wlf2, wlf<zl0> wlf3, wlf<a> wlf4, wlf<l> wlf5, wlf<n> wlf6, wlf<Lifecycle> wlf7, wlf<f> wlf8, wlf<j> wlf9, wlf<xd0> wlf10, wlf<d> wlf11, wlf<r0> wlf12, wlf<i31> wlf13, wlf<FacebookTracker> wlf14) {
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
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CreateAccountPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
