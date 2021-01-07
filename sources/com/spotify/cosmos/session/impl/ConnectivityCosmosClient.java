package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import io.reactivex.a;

@CosmosService
public interface ConnectivityCosmosClient {
    @PUT("sp://connectivity-manager/v1/connection-type")
    a setConnectivity(@Body SetConnectivityRequest setConnectivityRequest);
}
