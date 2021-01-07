package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.player.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.segments.TrackListStateFlowableHelperImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TrackListStateFlowableHelperImpl$flowable$1 extends FunctionReferenceImpl implements rmf<TrackListStateFlowableHelperImpl.a, e, TrackListStateFlowableHelperImpl.b> {
    public static final TrackListStateFlowableHelperImpl$flowable$1 a = new TrackListStateFlowableHelperImpl$flowable$1();

    TrackListStateFlowableHelperImpl$flowable$1() {
        super(2, TrackListStateFlowableHelperImpl.b.class, "<init>", "<init>(Lcom/spotify/music/nowplaying/podcast/mixedmedia/segments/TrackListStateFlowableHelperImpl$CollectionStateAndTimeLineContext;Lcom/spotify/music/nowplaying/podcast/mixedmedia/player/PodcastMixedMediaTrackListPlayerState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public TrackListStateFlowableHelperImpl.b invoke(TrackListStateFlowableHelperImpl.a aVar, e eVar) {
        TrackListStateFlowableHelperImpl.a aVar2 = aVar;
        e eVar2 = eVar;
        h.e(aVar2, "p1");
        h.e(eVar2, "p2");
        return new TrackListStateFlowableHelperImpl.b(aVar2, eVar2);
    }
}
