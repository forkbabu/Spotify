package com.spotify.music.libs.podcast.loader;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
public interface i {
    @SUB("sp://core-collection/unstable/{username}/list/episodes/offline")
    s<ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse> a(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @GET("sp://core-collection/unstable/{username}/list/episodes/all")
    z<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse> b(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @GET("sp://core-collection/unstable/{username}/list/episodes/offline")
    z<ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse> c(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @SUB("sp://core-collection/unstable/{username}/list/episodes/all")
    s<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse> d(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @GET("sp://core-collection/unstable/{username}/list/episodes/union")
    z<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse> e(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @SUB("sp://core-collection/unstable/{username}/list/episodes/union")
    s<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse> f(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);
}
