package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.i;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

final class j<T, R> implements l<i, v<? extends i<Episode>>> {
    public static final j a = new j();

    j() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends i<Episode>> apply(i iVar) {
        i iVar2 = iVar;
        h.e(iVar2, "it");
        if (iVar2 instanceof i.b) {
            return s.i0(((i.b) iVar2).a());
        }
        if (iVar2 instanceof i.a) {
            return s.P(new Throwable(((i.a) iVar2).a()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
