package com.spotify.music.storylines.service;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ StorylinesUrisFetcher a;

    public /* synthetic */ e(StorylinesUrisFetcher storylinesUrisFetcher) {
        this.a = storylinesUrisFetcher;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b bVar = (b) obj;
        this.a.t.f();
    }
}
