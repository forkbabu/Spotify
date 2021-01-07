package com.spotify.encore.consumer.components.podcast.impl.episoderow;

public final class EpisodeRowFactory_Factory implements fjf<EpisodeRowFactory> {
    private final wlf<DefaultEpisodeRow> defaultEpisodeRowProvider;

    public EpisodeRowFactory_Factory(wlf<DefaultEpisodeRow> wlf) {
        this.defaultEpisodeRowProvider = wlf;
    }

    public static EpisodeRowFactory_Factory create(wlf<DefaultEpisodeRow> wlf) {
        return new EpisodeRowFactory_Factory(wlf);
    }

    public static EpisodeRowFactory newInstance(wlf<DefaultEpisodeRow> wlf) {
        return new EpisodeRowFactory(wlf);
    }

    @Override // defpackage.wlf
    public EpisodeRowFactory get() {
        return newInstance(this.defaultEpisodeRowProvider);
    }
}
