package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.i;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class o<T, R> implements l<i<Episode>, i> {
    public static final o a = new o();

    o() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public i apply(i<Episode> iVar) {
        i<Episode> iVar2 = iVar;
        h.e(iVar2, "it");
        return new i.b(iVar2);
    }
}
