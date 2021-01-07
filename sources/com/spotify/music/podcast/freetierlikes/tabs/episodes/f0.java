package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.base.Predicate;
import com.spotify.playlist.models.Episode;

final class f0<T> implements Predicate<Episode> {
    public static final f0 a = new f0();

    f0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Predicate
    public boolean apply(Episode episode) {
        Episode episode2 = episode;
        if (episode2 == null) {
            return false;
        }
        String header = episode2.getHeader();
        if (header == null || header.length() == 0) {
            return true;
        }
        return false;
    }
}
