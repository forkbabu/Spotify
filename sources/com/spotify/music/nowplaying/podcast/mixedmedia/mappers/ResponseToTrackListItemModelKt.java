package com.spotify.music.nowplaying.podcast.mixedmedia.mappers;

import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$EpisodeSegments;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.b;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class ResponseToTrackListItemModelKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static final List<b> a(a aVar, PodcastSegmentsCosmosResponse$PodcastSegmentsResponse podcastSegmentsCosmosResponse$PodcastSegmentsResponse) {
        List<? extends b> list;
        T t;
        h.e(aVar, "episodeUri");
        h.e(podcastSegmentsCosmosResponse$PodcastSegmentsResponse, "response");
        List<PodcastSegmentsCosmosResponse$EpisodeSegments> h = podcastSegmentsCosmosResponse$PodcastSegmentsResponse.h();
        h.d(h, "response\n        .episodeSegmentsList");
        Iterator<T> it = h.iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (h.a(aVar.a(), t2 != null ? t2.l() : null)) {
                break;
            }
        }
        ResponseToTrackListItemModelKt$responseToTrackListItemModel$2 responseToTrackListItemModelKt$responseToTrackListItemModel$2 = new ResponseToTrackListItemModelKt$responseToTrackListItemModel$2(aVar);
        h.e(responseToTrackListItemModelKt$responseToTrackListItemModel$2, "fn");
        if (t != null) {
            list = responseToTrackListItemModelKt$responseToTrackListItemModel$2.invoke(t);
        }
        h.e(ResponseToTrackListItemModelKt$responseToTrackListItemModel$3.a, "fn");
        if (list == null) {
            list = EmptyList.a;
        }
        return (List) list;
    }
}
