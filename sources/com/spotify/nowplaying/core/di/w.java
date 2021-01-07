package com.spotify.nowplaying.core.di;

import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class w implements fjf<g<dqd>> {
    private final wlf<g<String>> a;
    private final wlf<g<Long>> b;
    private final wlf<g<Long>> c;

    public w(wlf<g<String>> wlf, wlf<g<Long>> wlf2, wlf<g<Long>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static g<dqd> a(g<String> gVar, g<Long> gVar2, g<Long> gVar3) {
        h.e(gVar, "trackUri");
        h.e(gVar2, "trackPosition");
        h.e(gVar3, "trackDuration");
        return gVar.f0(new o(gVar2, gVar3));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}
