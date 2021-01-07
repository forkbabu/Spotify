package com.spotify.music.features.login.startview.presenter;

import androidx.lifecycle.n;
import com.spotify.effortlesslogin.prerequisites.f;
import com.spotify.loginflow.navigation.d;

public final class a implements fjf<StartPresenter> {
    private final wlf<fo5> a;
    private final wlf<ae0> b;
    private final wlf<cqe> c;
    private final wlf<com.spotify.libs.pse.model.a> d;
    private final wlf<f> e;
    private final wlf<n> f;
    private final wlf<d> g;
    private final wlf<zy0> h;

    public a(wlf<fo5> wlf, wlf<ae0> wlf2, wlf<cqe> wlf3, wlf<com.spotify.libs.pse.model.a> wlf4, wlf<f> wlf5, wlf<n> wlf6, wlf<d> wlf7, wlf<zy0> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new StartPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
