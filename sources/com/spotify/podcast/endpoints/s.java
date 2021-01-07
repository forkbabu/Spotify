package com.spotify.podcast.endpoints;

import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$SegmentsPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import com.spotify.remoteconfig.ba;
import io.reactivex.z;

public class s {
    private final v a;
    private final ba b;

    public s(v vVar, ba baVar) {
        this.a = vVar;
        this.b = baVar;
    }

    public z<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse> a(PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest) {
        v vVar = this.a;
        PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.a aVar = (PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.a) podcastSegmentsCosmosRequest$PodcastSegmentsRequest.toBuilder();
        PodcastSegmentsCosmosRequest$SegmentsPolicy.a l = PodcastSegmentsCosmosRequest$SegmentsPolicy.l();
        l.m(this.b.a());
        l.n(this.b.b());
        aVar.o((PodcastSegmentsCosmosRequest$SegmentsPolicy) l.build());
        return vVar.a((PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) aVar.build());
    }
}
