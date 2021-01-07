package com.spotify.libs.connect.volume;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import io.reactivex.a;

@CosmosService
public interface f {
    @POST("sp://connect/v1/volume")
    a a(@Body int i);
}
