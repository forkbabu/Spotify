package com.spotify.music.podcastentityrow;

import com.spotify.music.libs.collection.played.a;
import com.spotify.music.podcast.episode.util.h;

public class k implements j {
    private final a b;
    private final h c;
    private final ajf<m> d;

    public k(a aVar, h hVar, ajf<m> ajf) {
        this.b = aVar;
        this.c = hVar;
        this.d = ajf;
    }

    @Override // com.spotify.music.podcastentityrow.j
    public void a(String str, String str2, int i) {
        this.b.a(str);
        this.c.b(str);
        this.d.get().a();
    }
}
