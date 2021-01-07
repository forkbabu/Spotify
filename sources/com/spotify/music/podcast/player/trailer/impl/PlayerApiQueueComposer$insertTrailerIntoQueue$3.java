package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.music.podcast.player.trailer.impl.i;
import defpackage.zwd;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlayerApiQueueComposer$insertTrailerIntoQueue$3 extends FunctionReferenceImpl implements nmf<zwd, i.a> {
    PlayerApiQueueComposer$insertTrailerIntoQueue$3(PlayerApiQueueComposer playerApiQueueComposer) {
        super(1, playerApiQueueComposer, PlayerApiQueueComposer.class, "commandResultToComposerResult", "commandResultToComposerResult(Lcom/spotify/player/CommandResult;)Lcom/spotify/music/podcast/player/trailer/impl/PodcastTrailerQueueComposer$Result;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public i.a invoke(zwd zwd) {
        zwd zwd2 = zwd;
        h.e(zwd2, "p1");
        ((PlayerApiQueueComposer) this.receiver).getClass();
        if (zwd2 instanceof zwd.b) {
            return i.a.b.a;
        }
        if (!(zwd2 instanceof zwd.a)) {
            return new i.a.C0329a("Unknown result");
        }
        String c = ((zwd.a) zwd2).c();
        h.d(c, "commandResult.asFailure().reasons()");
        return new i.a.C0329a(c);
    }
}
