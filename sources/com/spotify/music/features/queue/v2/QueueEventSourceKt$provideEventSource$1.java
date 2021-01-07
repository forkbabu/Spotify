package com.spotify.music.features.queue.v2;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.queue.v2.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class QueueEventSourceKt$provideEventSource$1 extends FunctionReferenceImpl implements nmf<PlayerQueue, d> {
    public static final QueueEventSourceKt$provideEventSource$1 a = new QueueEventSourceKt$provideEventSource$1();

    QueueEventSourceKt$provideEventSource$1() {
        super(1, g.class, "toQueueEvent", "toQueueEvent(Lcom/spotify/player/model/PlayerQueue;)Lcom/spotify/music/features/queue/v2/QueueEvent;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public d invoke(PlayerQueue playerQueue) {
        PlayerQueue playerQueue2 = playerQueue;
        h.e(playerQueue2, "p1");
        String revision = playerQueue2.revision();
        h.d(revision, "revision()");
        ImmutableList<ContextTrack> nextTracks = playerQueue2.nextTracks();
        h.d(nextTracks, "nextTracks()");
        ImmutableList<ContextTrack> prevTracks = playerQueue2.prevTracks();
        h.d(prevTracks, "prevTracks()");
        return new d.b(revision, nextTracks, prevTracks);
    }
}
