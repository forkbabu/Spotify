package com.spotify.music.promodisclosure.impl;

import com.spotify.music.promodisclosure.impl.a;
import com.spotify.remoteconfig.ka;
import kotlin.jvm.internal.h;

public final class b implements fjf<Boolean> {
    private final wlf<ka> a;

    public b(wlf<ka> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ka kaVar = this.a.get();
        a.C0338a aVar = a.a;
        h.e(kaVar, "properties");
        return Boolean.valueOf(kaVar.a());
    }
}
