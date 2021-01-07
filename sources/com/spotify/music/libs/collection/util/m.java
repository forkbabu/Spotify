package com.spotify.music.libs.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

public final class m implements fjf<l> {
    private final wlf<CollectionStateProvider> a;
    private final wlf<o> b;

    public m(wlf<CollectionStateProvider> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a, this.b);
    }
}
