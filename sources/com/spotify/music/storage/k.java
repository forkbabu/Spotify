package com.spotify.music.storage;

import android.content.Context;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.mobile.android.service.o;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.storage.j;

public final class k implements fjf<j> {
    private final wlf<Context> a;
    private final wlf<cqe> b;
    private final wlf<j.b> c;
    private final wlf<SpSharedPreferences<Object>> d;
    private final wlf<dd0> e;
    private final wlf<MovingOrchestrator> f;
    private final wlf<j.a> g;
    private final wlf<o> h;

    public k(wlf<Context> wlf, wlf<cqe> wlf2, wlf<j.b> wlf3, wlf<SpSharedPreferences<Object>> wlf4, wlf<dd0> wlf5, wlf<MovingOrchestrator> wlf6, wlf<j.a> wlf7, wlf<o> wlf8) {
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
        return new j(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
