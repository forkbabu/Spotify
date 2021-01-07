package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy$Policy;
import com.spotify.podcast.endpoints.collection.c;
import com.spotify.podcast.endpoints.collection.i;
import kotlin.jvm.internal.h;

public final class p implements fjf<i.a> {
    private final wlf<CollectionEpisodesPolicy$Policy> a;

    public p(wlf<CollectionEpisodesPolicy$Policy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy = this.a.get();
        h.e(collectionEpisodesPolicy$Policy, "policy");
        Optional of = Optional.of(collectionEpisodesPolicy$Policy);
        h.d(of, "Optional.of(policy)");
        Optional of2 = Optional.of(c.c.b());
        h.d(of2, "Optional.of(CollectionEp….SORT_ORDER_PUBLISH_DATE)");
        Optional of3 = Optional.of(new i.a.AbstractC0379a.C0380a(Episode.MediaType.VIDEO));
        h.d(of3, "Optional.of(FilterMediaT…Episode.MediaType.VIDEO))");
        Boolean bool = Boolean.TRUE;
        Optional of4 = Optional.of(bool);
        h.d(of4, "Optional.of(true)");
        Optional of5 = Optional.of(bool);
        h.d(of5, "Optional.of(true)");
        Optional of6 = Optional.of(new i.a.b.C0381a(0));
        h.d(of6, "Optional.of(\n           …      )\n                )");
        Optional of7 = Optional.of(Boolean.FALSE);
        h.d(of7, "Optional.of(false)");
        return new i.a(null, null, of, null, of3, of2, of5, of4, of6, of7, 11);
    }
}
