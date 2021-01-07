package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.player.model.PlayerQueue;
import io.reactivex.z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlayerApiQueueComposer$insertTrailerIntoQueue$2 extends FunctionReferenceImpl implements nmf<PlayerQueue, z<zwd>> {
    PlayerApiQueueComposer$insertTrailerIntoQueue$2(PlayerApiQueueComposer playerApiQueueComposer) {
        super(1, playerApiQueueComposer, PlayerApiQueueComposer.class, "updateQueue", "updateQueue(Lcom/spotify/player/model/PlayerQueue;)Lio/reactivex/Single;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public z<zwd> invoke(PlayerQueue playerQueue) {
        PlayerQueue playerQueue2 = playerQueue;
        h.e(playerQueue2, "p1");
        return PlayerApiQueueComposer.b((PlayerApiQueueComposer) this.receiver, playerQueue2);
    }
}
