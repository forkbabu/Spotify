package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.c;
import com.spotify.music.nowplaying.podcast.mixedmedia.segments.TrackListStateFlowableHelperImpl;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EnhancedTrackListModelFlowableHelperImpl$flowable$1 extends Lambda implements rmf<TrackListStateFlowableHelperImpl.b, f, a> {
    public static final EnhancedTrackListModelFlowableHelperImpl$flowable$1 a = new EnhancedTrackListModelFlowableHelperImpl$flowable$1();

    EnhancedTrackListModelFlowableHelperImpl$flowable$1() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public a invoke(TrackListStateFlowableHelperImpl.b bVar, f fVar) {
        TrackListStateFlowableHelperImpl.b bVar2 = bVar;
        f fVar2 = fVar;
        h.e(bVar2, "trackListState");
        TrackListStateFlowableHelperImpl.a a2 = bVar2.a();
        Map<String, CollectionStateProvider.a> a3 = a2.a();
        c c = a2.b().c();
        boolean a4 = bVar2.b().a();
        h.d(fVar2, "currentSegment");
        return new a(c, a4, fVar2, a3);
    }
}
