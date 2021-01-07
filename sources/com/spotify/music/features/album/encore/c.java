package com.spotify.music.features.album.encore;

import com.spotify.music.navigation.t;

public final class c implements fjf<b> {
    private final wlf<String> a;
    private final wlf<hf3> b;
    private final wlf<t> c;
    private final wlf<t8a> d;
    private final wlf<uk9> e;
    private final wlf<tw3> f;
    private final wlf<iy3> g;
    private final wlf<PlayFromContextOrPauseCommandHandler> h;

    public c(wlf<String> wlf, wlf<hf3> wlf2, wlf<t> wlf3, wlf<t8a> wlf4, wlf<uk9> wlf5, wlf<tw3> wlf6, wlf<iy3> wlf7, wlf<PlayFromContextOrPauseCommandHandler> wlf8) {
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
        return new b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
