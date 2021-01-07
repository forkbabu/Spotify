package com.spotify.cosmos.remoteconfig;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.remoteconfig.client.cosmos.CoreConfigurationRequest;
import io.reactivex.a;

@CosmosService
public interface RemoteConfigCosmosEndpoint {
    @DELETE("sp://remote-config/v1/clear")
    a clearCoreConfiguration();

    @POST("sp://remote-config/v1/inject/bootstrap")
    a injectBootstrap(@Body CoreConfigurationRequest coreConfigurationRequest);

    @POST("sp://remote-config/v1/inject/next_session")
    a injectNextSession(@Body CoreConfigurationRequest coreConfigurationRequest);
}
