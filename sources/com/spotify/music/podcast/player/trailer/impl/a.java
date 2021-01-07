package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.music.podcast.player.trailer.impl.PlayerApiPodcastTrailerPlayer;
import com.spotify.music.podcast.player.trailer.impl.i;
import com.spotify.music.podcast.player.trailer.impl.j;
import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

final class a<T1, T2, R> implements c<i.a, j.c, PlayerApiPodcastTrailerPlayer.b> {
    public static final a a = new a();

    a() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public PlayerApiPodcastTrailerPlayer.b a(i.a aVar, j.c cVar) {
        i.a aVar2 = aVar;
        j.c cVar2 = cVar;
        h.e(aVar2, "queue");
        h.e(cVar2, "item");
        return new PlayerApiPodcastTrailerPlayer.b(aVar2, cVar2);
    }
}
