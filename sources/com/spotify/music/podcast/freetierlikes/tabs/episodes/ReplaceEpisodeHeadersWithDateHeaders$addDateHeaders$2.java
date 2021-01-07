package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$2 extends Lambda implements nmf<Episode, Boolean> {
    final /* synthetic */ g0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$2(g0 g0Var) {
        super(1);
        this.this$0 = g0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(Episode episode) {
        Episode episode2 = episode;
        h.e(episode2, "episode");
        return Boolean.valueOf(g0.c(this.this$0, episode2));
    }
}
