package com.spotify.music.features.voice;

import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;

public final class q implements fjf<p> {
    private final wlf<e> a;
    private final wlf<w52> b;
    private final wlf<b> c;

    public q(wlf<e> wlf, wlf<w52> wlf2, wlf<b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static p a(e eVar, w52 w52, b bVar) {
        return new p(eVar, w52, bVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get());
    }
}
