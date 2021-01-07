package com.spotify.music.libs.accountlinkingnudges;

import androidx.appcompat.app.g;
import com.spotify.libs.connect.providers.h;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.y;

public final class i implements fjf<DefaultGoogleAccountLinkingNudgeAttacher> {
    private final wlf<g> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;
    private final wlf<h> d;
    private final wlf<io.reactivex.g<rga>> e;
    private final wlf<qv0> f;
    private final wlf<pv0> g;
    private final wlf<cy9> h;
    private final wlf<SpSharedPreferences<Object>> i;
    private final wlf<com.spotify.music.libs.googleassistantaccountlinking.g> j;
    private final wlf<my9> k;
    private final wlf<com.spotify.glue.dialogs.g> l;
    private final wlf<cqe> m;
    private final wlf<y> n;
    private final wlf<ay9> o;

    public i(wlf<g> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<h> wlf4, wlf<io.reactivex.g<rga>> wlf5, wlf<qv0> wlf6, wlf<pv0> wlf7, wlf<cy9> wlf8, wlf<SpSharedPreferences<Object>> wlf9, wlf<com.spotify.music.libs.googleassistantaccountlinking.g> wlf10, wlf<my9> wlf11, wlf<com.spotify.glue.dialogs.g> wlf12, wlf<cqe> wlf13, wlf<y> wlf14, wlf<ay9> wlf15) {
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
        this.o = wlf15;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultGoogleAccountLinkingNudgeAttacher(this.a.get(), this.b.get().booleanValue(), this.c.get().booleanValue(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get());
    }
}
