package com.spotify.music.storylines.service;

import com.spotify.mobile.android.storylines.model.StorylinesUris;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ StorylinesUrisFetcher a;

    public /* synthetic */ g(StorylinesUrisFetcher storylinesUrisFetcher) {
        this.a = storylinesUrisFetcher;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        StorylinesUris storylinesUris = (StorylinesUris) obj;
        this.a.t.e();
    }
}
