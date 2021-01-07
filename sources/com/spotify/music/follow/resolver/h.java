package com.spotify.music.follow.resolver;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

public final class h implements fjf<g> {
    private final wlf<CollectionStateProvider> a;
    private final wlf<RxFollowersCountResolver> b;

    public h(wlf<CollectionStateProvider> wlf, wlf<RxFollowersCountResolver> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
