package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.i;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

final class n<T, R> implements l<i, d0<? extends i<Episode>>> {
    public static final n a = new n();

    n() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends i<Episode>> apply(i iVar) {
        i iVar2 = iVar;
        h.e(iVar2, "it");
        if (iVar2 instanceof i.b) {
            return z.z(((i.b) iVar2).a());
        }
        if (iVar2 instanceof i.a) {
            return z.q(new Throwable(((i.a) iVar2).a()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
