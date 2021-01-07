package com.spotify.player.queue;

import com.google.common.collect.ImmutableList;
import com.spotify.paste.widgets.b;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.esperanto.proto.EsQueue$Queue;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.proto.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EsperantoPlayerQueueInteractor$playerQueueFlowable$1 extends FunctionReferenceImpl implements nmf<EsQueue$Queue, PlayerQueue> {
    public static final EsperantoPlayerQueueInteractor$playerQueueFlowable$1 a = new EsperantoPlayerQueueInteractor$playerQueueFlowable$1();

    EsperantoPlayerQueueInteractor$playerQueueFlowable$1() {
        super(1, d.class, "playerQueueFromProto", "playerQueueFromProto(Lcom/spotify/player/esperanto/proto/EsQueue$Queue;)Lcom/spotify/player/model/PlayerQueue;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public PlayerQueue invoke(EsQueue$Queue esQueue$Queue) {
        EsQueue$Queue esQueue$Queue2 = esQueue$Queue;
        h.e(esQueue$Queue2, "p1");
        h.e(esQueue$Queue2, "protoQueue");
        PlayerQueue.Builder builder = PlayerQueue.builder();
        builder.revision(String.valueOf(esQueue$Queue2.n()));
        if (esQueue$Queue2.p()) {
            EsProvidedTrack$ProvidedTrack o = esQueue$Queue2.o();
            h.d(o, "protoQueue.track");
            builder.track(b.b(o));
        }
        if (esQueue$Queue2.h() > 0) {
            List<EsProvidedTrack$ProvidedTrack> i = esQueue$Queue2.i();
            h.d(i, "protoQueue.nextTracksList");
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(i, 10));
            Iterator<T> it = i.iterator();
            while (it.hasNext()) {
                arrayList.add(b.b(it.next()));
            }
            builder.nextTracks(ImmutableList.copyOf((Collection) arrayList));
        }
        if (esQueue$Queue2.l() > 0) {
            List<EsProvidedTrack$ProvidedTrack> m = esQueue$Queue2.m();
            h.d(m, "protoQueue.prevTracksList");
            ArrayList arrayList2 = new ArrayList(kotlin.collections.d.e(m, 10));
            Iterator<T> it2 = m.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b.b(it2.next()));
            }
            builder.prevTracks(ImmutableList.copyOf((Collection) arrayList2));
        }
        PlayerQueue build = builder.build();
        h.d(build, "PlayerQueue.builder().ap…)\n        }\n    }.build()");
        return build;
    }
}
