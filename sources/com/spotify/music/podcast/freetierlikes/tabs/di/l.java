package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy$Policy;
import com.spotify.podcast.endpoints.collection.d;
import kotlin.jvm.internal.h;

public final class l implements fjf<d.a> {
    private final wlf<CollectionEpisodesPolicy$Policy> a;

    public l(wlf<CollectionEpisodesPolicy$Policy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy = this.a.get();
        h.e(collectionEpisodesPolicy$Policy, "policy");
        Optional of = Optional.of(collectionEpisodesPolicy$Policy);
        h.d(of, "Optional.of(policy)");
        return new d.a(null, null, of, null, null, 27);
    }
}
