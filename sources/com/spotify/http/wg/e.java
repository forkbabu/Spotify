package com.spotify.http.wg;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;

@CosmosService
public interface e {
    @GET("sp://auth/v2/token")
    z<Response> a(@Query("renew") String str);
}
