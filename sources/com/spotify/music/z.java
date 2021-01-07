package com.spotify.music;

import android.app.Application;
import com.spotify.http.w;
import com.spotify.instrumentation.navigation.logger.NavigationLoggerApplicationInstaller;
import com.spotify.mobile.android.orbit.OrbitLibraryLoader;
import com.spotify.mobile.android.spotlets.uitooling.a;
import com.spotify.music.container.app.foregroundstate.AppUiForegroundState;
import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.libs.facebook.q;

public final class z implements fjf<y> {
    private final wlf<Application> a;
    private final wlf<zw1> b;
    private final wlf<gj9> c;
    private final wlf<NavigationLoggerApplicationInstaller> d;
    private final wlf<q> e;
    private final wlf<w> f;
    private final wlf<w0> g;
    private final wlf<xhd> h;
    private final wlf<ProcessType> i;
    private final wlf<OrbitLibraryLoader> j;
    private final wlf<a> k;
    private final wlf<AppUiForegroundState> l;
    private final wlf<x70> m;
    private final wlf<b28> n;

    public z(wlf<Application> wlf, wlf<zw1> wlf2, wlf<gj9> wlf3, wlf<NavigationLoggerApplicationInstaller> wlf4, wlf<q> wlf5, wlf<w> wlf6, wlf<w0> wlf7, wlf<xhd> wlf8, wlf<ProcessType> wlf9, wlf<OrbitLibraryLoader> wlf10, wlf<a> wlf11, wlf<AppUiForegroundState> wlf12, wlf<x70> wlf13, wlf<b28> wlf14) {
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
        return new y(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
