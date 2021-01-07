package com.spotify.cosmos.remoteconfig;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.remoteconfig.client.cosmos.CoreConfigurationRequest;
import com.spotify.remoteconfig.client.cosmos.c;
import io.reactivex.a;

public class RemoteConfigurationCosmosIntegration implements c {
    private final RemoteConfigCosmosEndpoint mCosmosEndpoint;

    public RemoteConfigurationCosmosIntegration(Cosmonaut cosmonaut) {
        this((RemoteConfigCosmosEndpoint) cosmonaut.createCosmosService(RemoteConfigCosmosEndpoint.class));
    }

    @Override // com.spotify.remoteconfig.client.cosmos.c
    public a clearStorage() {
        Logger.b("Telling core to clear remote config values", new Object[0]);
        return this.mCosmosEndpoint.clearCoreConfiguration();
    }

    @Override // com.spotify.remoteconfig.client.cosmos.c
    public a injectForBootstrap(CoreConfigurationRequest coreConfigurationRequest) {
        Logger.b("Sending fetched remote config configuration for Bootstrap %s into core using Cosmos", coreConfigurationRequest.a());
        return this.mCosmosEndpoint.injectBootstrap(coreConfigurationRequest);
    }

    @Override // com.spotify.remoteconfig.client.cosmos.c
    public a injectForNextSession(CoreConfigurationRequest coreConfigurationRequest) {
        Logger.b("Sending fetched remote config configuration %s into core using Cosmos", coreConfigurationRequest.a());
        return this.mCosmosEndpoint.injectNextSession(coreConfigurationRequest);
    }

    public RemoteConfigurationCosmosIntegration(Cosmonaut cosmonaut, RxRouter rxRouter) {
        this((RemoteConfigCosmosEndpoint) cosmonaut.createCosmosService(RemoteConfigCosmosEndpoint.class, rxRouter));
    }

    private RemoteConfigurationCosmosIntegration(RemoteConfigCosmosEndpoint remoteConfigCosmosEndpoint) {
        this.mCosmosEndpoint = remoteConfigCosmosEndpoint;
    }
}
