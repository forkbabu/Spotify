package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import io.reactivex.z;

@CosmosService
public interface v {
    @GET("sp://podcast-segments/v1/decorated")
    @Headers({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    z<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse> a(@Body PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest);
}
