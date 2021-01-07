package com.spotify.music.features.nowplayingbar.di;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import kotlin.jvm.internal.h;

public final class b implements fjf<rt5> {
    private final wlf<mba> a;

    public b(wlf<mba> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        mba mba = this.a.get();
        h.e(mba, "connectInstrumentation");
        return new rt5(mba, PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR, ViewUris.e0);
    }
}
