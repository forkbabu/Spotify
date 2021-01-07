package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.policy.Policy;
import io.reactivex.z;
import java.util.Map;

@CosmosService
interface j0 {
    @GET("sp://core-show/unstable/unfinished/episodes")
    z<Response> a(@QueryMap Map<String, String> map);

    @GET("sp://core-show/unstable/unfinished/episodes")
    z<Response> b(@QueryMap Map<String, String> map, @Body Policy policy);
}
