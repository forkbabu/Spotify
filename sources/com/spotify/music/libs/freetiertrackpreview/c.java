package com.spotify.music.libs.freetiertrackpreview;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.b4;

public final class c<T> implements fjf<b<T>> {
    private final wlf<Context> a;
    private final wlf<com.spotify.music.libs.viewuri.c> b;
    private final wlf<b4<T>> c;

    public c(wlf<Context> wlf, wlf<com.spotify.music.libs.viewuri.c> wlf2, wlf<b4<T>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), ejf.a(this.c));
    }
}
