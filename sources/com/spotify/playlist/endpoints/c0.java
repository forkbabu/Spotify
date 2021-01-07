package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;

@CosmosService
public interface c0 {
    @GET("sp://session/v1")
    z<Response> a();
}
