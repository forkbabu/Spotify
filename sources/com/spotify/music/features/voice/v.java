package com.spotify.music.features.voice;

import com.spotify.music.libs.voice.e;

public final class v implements fjf<u> {
    private final wlf<e> a;
    private final wlf<cif> b;

    public v(wlf<e> wlf, wlf<cif> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static u a(e eVar, cif cif) {
        return new u(eVar, cif);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get());
    }
}
