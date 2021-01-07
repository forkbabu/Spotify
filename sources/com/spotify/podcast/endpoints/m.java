package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.body.PodcastDecorateBody;
import io.reactivex.z;
import java.util.Map;

@CosmosService
public interface m {
    @GET("sp://core-show/unstable/decorate")
    z<Response> a(@QueryMap Map<String, String> map, @Body PodcastDecorateBody podcastDecorateBody);
}
