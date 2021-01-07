package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$4 extends Lambda implements nmf<Episode, Boolean> {
    public static final ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$4 a = new ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$4();

    ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$4() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(Episode episode) {
        h.e(episode, "it");
        return Boolean.TRUE;
    }
}
