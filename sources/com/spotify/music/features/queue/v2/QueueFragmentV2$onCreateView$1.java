package com.spotify.music.features.queue.v2;

import com.spotify.player.model.PlayerQueue;
import io.reactivex.s;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class QueueFragmentV2$onCreateView$1 extends FunctionReferenceImpl implements nmf<s<PlayerQueue>, l> {
    QueueFragmentV2$onCreateView$1(m mVar) {
        super(1, mVar, m.class, "create", "create(Lio/reactivex/Observable;)Lcom/spotify/music/features/queue/v2/QueuePageElement;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public l invoke(s<PlayerQueue> sVar) {
        return ((m) this.receiver).b(sVar);
    }
}
