package com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader;

public final class YourEpisodesHeaderFactory_Factory implements fjf<YourEpisodesHeaderFactory> {
    private final wlf<DefaultYourEpisodesHeader> providerProvider;

    public YourEpisodesHeaderFactory_Factory(wlf<DefaultYourEpisodesHeader> wlf) {
        this.providerProvider = wlf;
    }

    public static YourEpisodesHeaderFactory_Factory create(wlf<DefaultYourEpisodesHeader> wlf) {
        return new YourEpisodesHeaderFactory_Factory(wlf);
    }

    public static YourEpisodesHeaderFactory newInstance(wlf<DefaultYourEpisodesHeader> wlf) {
        return new YourEpisodesHeaderFactory(wlf);
    }

    @Override // defpackage.wlf
    public YourEpisodesHeaderFactory get() {
        return newInstance(this.providerProvider);
    }
}
