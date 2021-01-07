package com.spotify.mobile.android.recentlyplayed.model;

import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c();
    }
}
