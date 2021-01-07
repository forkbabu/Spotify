package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.base.Predicate;
import com.spotify.playlist.models.Episode;

final class b0<T> implements Predicate<Episode> {
    final /* synthetic */ a0 a;

    b0(a0 a0Var) {
        this.a = a0Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Predicate
    public boolean apply(Episode episode) {
        Episode episode2 = episode;
        this.a.getClass();
        if (episode2 == null) {
            return false;
        }
        Integer x = episode2.x();
        String header = episode2.getHeader();
        if (!(header == null || header.length() == 0) || x == null || episode2.j() - x.intValue() < 30) {
            return true;
        }
        return false;
    }
}
