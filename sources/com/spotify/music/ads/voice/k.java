package com.spotify.music.ads.voice;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.f;

public final class k implements fjf<f> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final k a = new k();
    }

    public static k a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(PageIdentifiers.ADS.name(), ViewUris.h0.toString());
    }
}
