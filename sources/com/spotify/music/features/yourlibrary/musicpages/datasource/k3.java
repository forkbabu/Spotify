package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.datasource.j3;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import io.reactivex.s;

public final class k3 implements fjf<j3> {
    private final wlf<ia9> a;
    private final wlf<m> b;
    private final wlf<CollectionStateProvider> c;
    private final wlf<j3.a> d;
    private final wlf<s<Boolean>> e;

    public k3(wlf<ia9> wlf, wlf<m> wlf2, wlf<CollectionStateProvider> wlf3, wlf<j3.a> wlf4, wlf<s<Boolean>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
