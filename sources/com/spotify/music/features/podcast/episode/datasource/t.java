package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class t implements l {
    public final /* synthetic */ RxEpisodeDataLoader a;
    public final /* synthetic */ String b;

    public /* synthetic */ t(RxEpisodeDataLoader rxEpisodeDataLoader, String str) {
        this.a = rxEpisodeDataLoader;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (Response) obj);
    }
}
