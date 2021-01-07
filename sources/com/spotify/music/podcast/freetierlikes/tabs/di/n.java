package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy$DecorationPolicy;
import com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy$EpisodePolicy;
import com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy$Policy;
import com.spotify.podcast.endpoints.collection.a;
import com.spotify.podcast.endpoints.collection.b;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class n implements fjf<CollectionEpisodesPolicy$Policy> {
    private final wlf<Map<String, Boolean>> a;
    private final wlf<b> b;
    private final wlf<a> c;

    public n(wlf<Map<String, Boolean>> wlf, wlf<b> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        Map<String, Boolean> map = this.a.get();
        b bVar = this.b.get();
        a aVar = this.c.get();
        h.e(map, "episodeAttributes");
        h.e(bVar, "showPolicy");
        h.e(aVar, "podcastSegmentsPolicy");
        return new CollectionEpisodesPolicy$Policy(new CollectionEpisodesPolicy$DecorationPolicy(new CollectionEpisodesPolicy$EpisodePolicy(map, bVar, aVar)));
    }
}
