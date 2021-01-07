package com.spotify.remoteconfig.client.cosmos;

import io.reactivex.a;

public interface c {
    a clearStorage();

    a injectForBootstrap(CoreConfigurationRequest coreConfigurationRequest);

    a injectForNextSession(CoreConfigurationRequest coreConfigurationRequest);
}
