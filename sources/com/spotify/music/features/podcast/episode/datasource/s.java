package com.spotify.music.features.podcast.episode.datasource;

import java.util.concurrent.Callable;

public final /* synthetic */ class s implements Callable {
    public final /* synthetic */ RxEpisodeDataLoader a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean f;

    public /* synthetic */ s(RxEpisodeDataLoader rxEpisodeDataLoader, String str, boolean z, boolean z2) {
        this.a = rxEpisodeDataLoader;
        this.b = str;
        this.c = z;
        this.f = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b, this.c, this.f);
    }
}
