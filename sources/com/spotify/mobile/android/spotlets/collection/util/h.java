package com.spotify.mobile.android.spotlets.collection.util;

public final class h implements fjf<CollectionStateProvider> {
    private final wlf<f> a;

    public h(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CollectionStateProvider(this.a.get());
    }
}
