package com.spotify.cosmos.playback;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.playback.impl.PlaybackCosmosClient;
import com.spotify.cosmos.router.RxRouter;

public final class CosmosPlaybackModule_ProvidePlaybackClientFactory implements fjf<PlaybackClient> {
    private final wlf<Cosmonaut> cosmonautProvider;
    private final wlf<RxRouter> rxRouterProvider;

    public CosmosPlaybackModule_ProvidePlaybackClientFactory(wlf<Cosmonaut> wlf, wlf<RxRouter> wlf2) {
        this.cosmonautProvider = wlf;
        this.rxRouterProvider = wlf2;
    }

    public static CosmosPlaybackModule_ProvidePlaybackClientFactory create(wlf<Cosmonaut> wlf, wlf<RxRouter> wlf2) {
        return new CosmosPlaybackModule_ProvidePlaybackClientFactory(wlf, wlf2);
    }

    public static PlaybackClient providePlaybackClient(Cosmonaut cosmonaut, RxRouter rxRouter) {
        PlaybackClient playbackClient = (PlaybackClient) cosmonaut.createCosmosService(PlaybackCosmosClient.class, rxRouter);
        yif.g(playbackClient, "Cannot return null from a non-@Nullable @Provides method");
        return playbackClient;
    }

    @Override // defpackage.wlf
    public PlaybackClient get() {
        return providePlaybackClient(this.cosmonautProvider.get(), this.rxRouterProvider.get());
    }
}
