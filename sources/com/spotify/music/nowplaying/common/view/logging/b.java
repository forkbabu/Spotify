package com.spotify.music.nowplaying.common.view.logging;

import com.spotify.instrumentation.a;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.libs.viewuri.c;

public final class b implements fjf<a> {
    private final wlf<jz1> a;
    private final wlf<LegacyPlayerState> b;
    private final wlf<c> c;
    private final wlf<a> d;
    private final wlf<String> e;
    private final wlf<cqe> f;

    public b(wlf<jz1> wlf, wlf<LegacyPlayerState> wlf2, wlf<c> wlf3, wlf<a> wlf4, wlf<String> wlf5, wlf<cqe> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static b a(wlf<jz1> wlf, wlf<LegacyPlayerState> wlf2, wlf<c> wlf3, wlf<a> wlf4, wlf<String> wlf5, wlf<cqe> wlf6) {
        return new b(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b, this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
