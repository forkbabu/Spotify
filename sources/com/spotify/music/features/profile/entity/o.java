package com.spotify.music.features.profile.entity;

import com.spotify.music.features.profile.entity.l;
import kotlin.jvm.internal.h;

public final class o implements fjf<hq7> {
    private final wlf<t> a;

    public o(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t tVar = this.a.get();
        l.a aVar = l.a;
        h.e(tVar, "profileEntityPageParameters");
        return new k(tVar);
    }
}
