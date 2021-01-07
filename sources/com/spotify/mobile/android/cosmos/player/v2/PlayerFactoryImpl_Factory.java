package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerV2Endpoint;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public final class PlayerFactoryImpl_Factory implements fjf<PlayerFactoryImpl> {
    private final wlf<cqe> clockProvider;
    private final wlf<ObjectMapper> objectMapperProvider;
    private final wlf<PlayerStateCompat> playerStateCompatProvider;
    private final wlf<PlayerV2Endpoint> playerV2EndpointProvider;
    private final wlf<FireAndForgetResolver> resolverProvider;
    private final wlf<String> versionNameProvider;

    public PlayerFactoryImpl_Factory(wlf<String> wlf, wlf<ObjectMapper> wlf2, wlf<PlayerStateCompat> wlf3, wlf<FireAndForgetResolver> wlf4, wlf<PlayerV2Endpoint> wlf5, wlf<cqe> wlf6) {
        this.versionNameProvider = wlf;
        this.objectMapperProvider = wlf2;
        this.playerStateCompatProvider = wlf3;
        this.resolverProvider = wlf4;
        this.playerV2EndpointProvider = wlf5;
        this.clockProvider = wlf6;
    }

    public static PlayerFactoryImpl_Factory create(wlf<String> wlf, wlf<ObjectMapper> wlf2, wlf<PlayerStateCompat> wlf3, wlf<FireAndForgetResolver> wlf4, wlf<PlayerV2Endpoint> wlf5, wlf<cqe> wlf6) {
        return new PlayerFactoryImpl_Factory(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    public static PlayerFactoryImpl newInstance(String str, ObjectMapper objectMapper, wlf<PlayerStateCompat> wlf, FireAndForgetResolver fireAndForgetResolver, PlayerV2Endpoint playerV2Endpoint, cqe cqe) {
        return new PlayerFactoryImpl(str, objectMapper, wlf, fireAndForgetResolver, playerV2Endpoint, cqe);
    }

    @Override // defpackage.wlf
    public PlayerFactoryImpl get() {
        return newInstance(this.versionNameProvider.get(), this.objectMapperProvider.get(), this.playerStateCompatProvider, this.resolverProvider.get(), this.playerV2EndpointProvider.get(), this.clockProvider.get());
    }
}
