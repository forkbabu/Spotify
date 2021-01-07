package com.spotify.music.libs.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.viewuri.c;

public final class n implements fjf<k> {
    private final wlf<CollectionStateProvider> a;
    private final wlf<o> b;
    private final wlf<c> c;

    public n(wlf<CollectionStateProvider> wlf, wlf<o> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get(), this.c.get());
    }
}
