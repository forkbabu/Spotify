package com.spotify.music.explicitcontent;

import com.spotify.mobile.android.rx.w;

public final class h implements fjf<g> {
    private final wlf<w> a;

    public h(wlf<w> wlf) {
        this.a = wlf;
    }

    public static g a(w wVar) {
        return new g(wVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
