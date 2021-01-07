package com.spotify.music.nowplaying.podcast.mixedmedia.api;

import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$DecoratedSegment;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$EpisodeSegments;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.music.nowplaying.podcast.mixedmedia.mappers.ResponseToTrackListItemModelKt;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.b;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.c;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class PodcastSegmentsRepositoryImpl$responseToModelMapperProvider$1 extends Lambda implements nmf<a, nmf<? super PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, ? extends c>> {
    final /* synthetic */ PodcastSegmentsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PodcastSegmentsRepositoryImpl$responseToModelMapperProvider$1(PodcastSegmentsRepositoryImpl podcastSegmentsRepositoryImpl) {
        super(1);
        this.this$0 = podcastSegmentsRepositoryImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public nmf<? super PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, ? extends c> invoke(a aVar) {
        final a aVar2 = aVar;
        h.e(aVar2, "episodeUri");
        return new nmf<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, c>() {
            /* class com.spotify.music.nowplaying.podcast.mixedmedia.api.PodcastSegmentsRepositoryImpl$responseToModelMapperProvider$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public c invoke(PodcastSegmentsCosmosResponse$PodcastSegmentsResponse podcastSegmentsCosmosResponse$PodcastSegmentsResponse) {
                PodcastSegmentsCosmosResponse$PodcastSegmentsResponse podcastSegmentsCosmosResponse$PodcastSegmentsResponse2 = podcastSegmentsCosmosResponse$PodcastSegmentsResponse;
                h.e(podcastSegmentsCosmosResponse$PodcastSegmentsResponse2, "response");
                a aVar = aVar2;
                List<PodcastSegmentsCosmosResponse$EpisodeSegments> h = podcastSegmentsCosmosResponse$PodcastSegmentsResponse2.h();
                h.d(h, "response.episodeSegmentsList");
                Object j = d.j(h);
                h.d(j, "response.episodeSegmentsList.first()");
                List<PodcastSegmentsCosmosResponse$DecoratedSegment> m = ((PodcastSegmentsCosmosResponse$EpisodeSegments) j).m();
                h.d(m, "response.episodeSegmentsList.first().segmentsList");
                Object j2 = d.j(m);
                h.d(j2, "response.episodeSegments…st().segmentsList.first()");
                EpisodeMetadata$ProtoEpisodeMetadata k = ((PodcastSegmentsCosmosResponse$DecoratedSegment) j2).k();
                h.d(k, "response.episodeSegments…t.first().episodeMetadata");
                String s = k.s();
                h.d(s, "response.episodeSegments…st().episodeMetadata.name");
                List<b> a = ResponseToTrackListItemModelKt.a(aVar2, podcastSegmentsCosmosResponse$PodcastSegmentsResponse2);
                PodcastSegmentsRepositoryImpl$responseToModelMapperProvider$1.this.this$0.getClass();
                List<PodcastSegmentsCosmosResponse$EpisodeSegments> h2 = podcastSegmentsCosmosResponse$PodcastSegmentsResponse2.h();
                boolean z = false;
                if (!h2.isEmpty()) {
                    PodcastSegmentsCosmosResponse$EpisodeSegments podcastSegmentsCosmosResponse$EpisodeSegments = h2.get(0);
                    h.d(podcastSegmentsCosmosResponse$EpisodeSegments, "this[0]");
                    if (podcastSegmentsCosmosResponse$EpisodeSegments.getCanUpsell()) {
                        z = true;
                    }
                }
                return new c(aVar, s, a, z);
            }
        };
    }
}
