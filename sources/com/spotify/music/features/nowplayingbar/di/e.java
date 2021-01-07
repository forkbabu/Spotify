package com.spotify.music.features.nowplayingbar.di;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.v4;

public final class e implements fjf<v4> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final e a = new e();
    }

    public static e a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v4("", ViewUris.e0.toString());
    }
}
