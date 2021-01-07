package com.spotify.music.storylines.service;

import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ StorylinesUrisFetcher a;

    public /* synthetic */ f(StorylinesUrisFetcher storylinesUrisFetcher) {
        this.a = storylinesUrisFetcher;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.t.b(((Throwable) obj).getMessage());
    }
}
