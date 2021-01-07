package com.spotify.music.podcast.freetierlikes.tabs;

import com.google.common.collect.ImmutableList;
import com.spotify.music.podcast.freetierlikes.tabs.downloads.f;
import com.spotify.music.podcast.freetierlikes.tabs.episodes.x;
import com.spotify.music.podcast.freetierlikes.tabs.followed.k;
import com.spotify.music.yourlibrary.interfaces.g;
import com.spotify.music.yourlibrary.interfaces.h;

public class p implements h {
    private final f a;
    private final x b;
    private final k c;

    public p(f fVar, x xVar, k kVar) {
        this.a = fVar;
        this.b = xVar;
        this.c = kVar;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.h
    public ImmutableList<g> a() {
        return ImmutableList.of((k) this.b, (k) this.a, this.c);
    }
}
