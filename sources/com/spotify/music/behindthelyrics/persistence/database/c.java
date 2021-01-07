package com.spotify.music.behindthelyrics.persistence.database;

import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ g a;

    public /* synthetic */ c(g gVar) {
        this.a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d();
    }
}
