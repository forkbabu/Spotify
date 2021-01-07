package com.spotify.cosmos.clienttoken;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.clienttoken.model.ClientTokenResponse;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface ClientTokenEndpoint {
    @SUB("sp://client-token/v1/encrypted-token")
    s<String> encryptedClientToken();

    @GET("sp://client-token/v1/token")
    z<ClientTokenResponse> getToken();

    @GET("sp://client-token/v1/{state}")
    z<Response> setState(@Path("state") String str);
}
