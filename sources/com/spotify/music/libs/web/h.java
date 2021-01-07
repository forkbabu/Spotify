package com.spotify.music.libs.web;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.z;

@CosmosService
public interface h {
    @GET("sp://auth/v2/web_token")
    z<RxWebToken.TokenResponse> a(@Query("uri") String str);
}
