package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;

public final class PodcastComponentBindingsModule_ProvideEpisodeRowFactoryFactory implements fjf<ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration>> {
    private final wlf<EpisodeRowFactory> episodeRowFactoryLazyProvider;

    public PodcastComponentBindingsModule_ProvideEpisodeRowFactoryFactory(wlf<EpisodeRowFactory> wlf) {
        this.episodeRowFactoryLazyProvider = wlf;
    }

    public static PodcastComponentBindingsModule_ProvideEpisodeRowFactoryFactory create(wlf<EpisodeRowFactory> wlf) {
        return new PodcastComponentBindingsModule_ProvideEpisodeRowFactoryFactory(wlf);
    }

    public static ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> provideEpisodeRowFactory(ajf<EpisodeRowFactory> ajf) {
        ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> provideEpisodeRowFactory = PodcastComponentBindingsModule.INSTANCE.provideEpisodeRowFactory(ajf);
        yif.g(provideEpisodeRowFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideEpisodeRowFactory;
    }

    @Override // defpackage.wlf
    public ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> get() {
        return provideEpisodeRowFactory(ejf.a(this.episodeRowFactoryLazyProvider));
    }
}
