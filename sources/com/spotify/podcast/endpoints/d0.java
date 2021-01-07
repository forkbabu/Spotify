package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.policy.shows.ShowsPolicy$Policy;
import io.reactivex.s;
import java.util.Map;

@CosmosService
public interface d0 {
    @SUB("sp://core-collection/unstable/{username}/list/shows/all")
    s<Response> a(@Path("username") String str, @QueryMap Map<String, String> map, @Body ShowsPolicy$Policy showsPolicy$Policy);

    @SUB("sp://core-collection/unstable/{username}/list/shows/all")
    s<Response> b(@Path("username") String str, @QueryMap Map<String, String> map);
}
