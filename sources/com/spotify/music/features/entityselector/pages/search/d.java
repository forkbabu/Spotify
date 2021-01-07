package com.spotify.music.features.entityselector.pages.search;

import com.spotify.libs.search.online.entity.c;
import kotlin.jvm.internal.h;

public final class d implements fjf<c> {
    private final wlf<com.spotify.libs.search.online.entity.d> a;

    public d(wlf<com.spotify.libs.search.online.entity.d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        com.spotify.libs.search.online.entity.d dVar = this.a.get();
        h.e(dVar, "entityVersionProvider");
        return dVar;
    }
}
