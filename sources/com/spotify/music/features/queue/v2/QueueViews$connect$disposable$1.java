package com.spotify.music.features.queue.v2;

import com.spotify.music.features.queue.v2.d;
import com.spotify.music.features.queue.v2.o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class QueueViews$connect$disposable$1 extends FunctionReferenceImpl implements nmf<o.a, d.c> {
    QueueViews$connect$disposable$1(QueueViews queueViews) {
        super(1, queueViews, QueueViews.class, "toQueueEvent", "toQueueEvent(Lcom/spotify/music/features/queue/v2/QueueTrackAdapter$TrackMoved;)Lcom/spotify/music/features/queue/v2/QueueEvent$TrackMoved;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public d.c invoke(o.a aVar) {
        o.a aVar2 = aVar;
        h.e(aVar2, "p1");
        ((QueueViews) this.receiver).getClass();
        return new d.c(aVar2.a(), aVar2.b());
    }
}
