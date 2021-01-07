package com.spotify.music.nowplaying.podcast.mixedmedia.api;

import com.spotify.cosmos.util.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.proto.TrackDecorationPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$SegmentsPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$TrackDecorationPolicy;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class PodcastSegmentsRepositoryImpl$basePodcastSegmentsRequestBuilder$1 extends Lambda implements nmf<a, PodcastSegmentsCosmosRequest$PodcastSegmentsRequest> {
    public static final PodcastSegmentsRepositoryImpl$basePodcastSegmentsRequestBuilder$1 a = new PodcastSegmentsRepositoryImpl$basePodcastSegmentsRequestBuilder$1();

    PodcastSegmentsRepositoryImpl$basePodcastSegmentsRequestBuilder$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public PodcastSegmentsCosmosRequest$PodcastSegmentsRequest invoke(a aVar) {
        a aVar2 = aVar;
        h.e(aVar2, "podcastSegmentsUri");
        PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a m = PodcastSegmentsCosmosRequest$TrackDecorationPolicy.m();
        m.o((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setName(true).setLink(true).build());
        m.n((ArtistDecorationPolicy) ArtistDecorationPolicy.newBuilder().setName(true).setLink(true).build());
        m.m((AlbumDecorationPolicy) AlbumDecorationPolicy.newBuilder().setCovers(true).build());
        PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a l = PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.l();
        l.m((EpisodeDecorationPolicy) EpisodeDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).build());
        l.n((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).build());
        PodcastSegmentsCosmosRequest$SegmentsPolicy.a l2 = PodcastSegmentsCosmosRequest$SegmentsPolicy.l();
        l2.m(false);
        l2.n(true);
        PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.a n = PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.n();
        n.m(aVar2.a());
        n.p(m);
        n.n(l);
        n.o((PodcastSegmentsCosmosRequest$SegmentsPolicy) l2.build());
        return (PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) n.build();
    }
}
