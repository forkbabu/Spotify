package com.spotify.imageresolve;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import io.reactivex.z;

@CosmosService
public interface r {
    @GET("sp://image/v1/cache-status")
    z<CacheStatusResponse> a(@Body CacheStatusRequest cacheStatusRequest);
}
