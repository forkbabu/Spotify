package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

import io.reactivex.z;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class PodcastMoreForYouDataLoader {
    private final c a;
    private final d b;

    public PodcastMoreForYouDataLoader(c cVar, d dVar) {
        h.e(cVar, "moreForYouEndpoint");
        h.e(dVar, "podcastMoreForYouParser");
        this.a = cVar;
        this.b = dVar;
    }

    public final z<h> a(String str) {
        h.e(str, "episodeUri");
        z<R> A = this.a.a(d.x(new Pair("episodeUri", str))).A(new a(new PodcastMoreForYouDataLoader$fetch$1(this.b)));
        h.d(A, "moreForYouEndpoint\n     …tMoreForYouParser::parse)");
        return A;
    }
}
