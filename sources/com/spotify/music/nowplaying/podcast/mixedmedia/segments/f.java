package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.nowplaying.podcast.mixedmedia.segments.TrackListStateFlowableHelperImpl;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import io.reactivex.functions.l;
import java.util.Map;
import kotlin.jvm.internal.h;

final class f<T, R> implements l<Map<String, CollectionStateProvider.a>, TrackListStateFlowableHelperImpl.a> {
    final /* synthetic */ a.C0316a a;

    f(a.C0316a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public TrackListStateFlowableHelperImpl.a apply(Map<String, CollectionStateProvider.a> map) {
        Map<String, CollectionStateProvider.a> map2 = map;
        h.e(map2, "it");
        a.C0316a aVar = this.a;
        h.d(aVar, "context");
        return new TrackListStateFlowableHelperImpl.a(map2, aVar);
    }
}
