package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final t a;

    public b(t tVar) {
        h.e(tVar, "navigator");
        this.a = tVar;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.a
    public void a(a aVar) {
        h.e(aVar, "model");
        this.a.d(aVar.a().b().e().toString());
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.a
    public void b(a aVar) {
        h.e(aVar, "model");
        t tVar = this.a;
        String b = aVar.a().b().b();
        h.c(b);
        tVar.d(b);
    }
}
