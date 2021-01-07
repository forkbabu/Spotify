package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.m;

public final class o3 implements fjf<n3> {
    private final wlf<ia9> a;
    private final wlf<a8a> b;
    private final wlf<CollectionStateProvider> c;
    private final wlf<m> d;

    public o3(wlf<ia9> wlf, wlf<a8a> wlf2, wlf<CollectionStateProvider> wlf3, wlf<m> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
