package com.spotify.music.libs.viewuri;

import com.spotify.music.libs.viewuri.c;

public final class d implements fjf<c> {
    private final wlf<c.a> a;

    public d(wlf<c.a> wlf) {
        this.a = wlf;
    }

    public static c a(c.a aVar) {
        c viewUri = aVar.getViewUri();
        yif.g(viewUri, "Cannot return null from a non-@Nullable @Provides method");
        return viewUri;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
