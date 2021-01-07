package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.music.podcast.player.trailer.impl.k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlayerApiTrailerPlayerActionPerformer$playFromNewContext$1 extends FunctionReferenceImpl implements nmf<zwd, k.a> {
    PlayerApiTrailerPlayerActionPerformer$playFromNewContext$1(PlayerApiTrailerPlayerActionPerformer playerApiTrailerPlayerActionPerformer) {
        super(1, playerApiTrailerPlayerActionPerformer, PlayerApiTrailerPlayerActionPerformer.class, "commandResultToActionResult", "commandResultToActionResult(Lcom/spotify/player/CommandResult;)Lcom/spotify/music/podcast/player/trailer/impl/TrailerPlayerActionPerformer$ActionResult;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public k.a invoke(zwd zwd) {
        zwd zwd2 = zwd;
        h.e(zwd2, "p1");
        return PlayerApiTrailerPlayerActionPerformer.b((PlayerApiTrailerPlayerActionPerformer) this.receiver, zwd2);
    }
}
