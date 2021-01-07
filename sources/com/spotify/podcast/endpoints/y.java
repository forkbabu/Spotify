package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import io.reactivex.s;
import java.util.Map;

@CosmosService
interface y {
    @SUB("sp://core-show/v1/shows/{uri}")
    s<Response> a(@Path("uri") String str, @QueryMap Map<String, String> map, @Body ShowPolicy showPolicy);

    @SUB("sp://core-show/v1/shows/{uri}")
    s<Response> b(@Path("uri") String str, @QueryMap Map<String, String> map);
}
