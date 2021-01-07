package com.spotify.music.libs.freetiertrackpreview.transformer;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

public final class b implements fjf<a> {
    private final wlf<CollectionStateProvider> a;
    private final wlf<String> b;

    public b(wlf<CollectionStateProvider> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
