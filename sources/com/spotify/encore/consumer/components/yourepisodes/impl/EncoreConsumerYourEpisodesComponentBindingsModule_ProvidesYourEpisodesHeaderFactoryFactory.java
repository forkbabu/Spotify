package com.spotify.encore.consumer.components.yourepisodes.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.YourEpisodesHeaderFactory;

public final class EncoreConsumerYourEpisodesComponentBindingsModule_ProvidesYourEpisodesHeaderFactoryFactory implements fjf<ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration>> {
    private final EncoreConsumerYourEpisodesComponentBindingsModule module;
    private final wlf<YourEpisodesHeaderFactory> yourEpisodesHeaderFactoryProvider;

    public EncoreConsumerYourEpisodesComponentBindingsModule_ProvidesYourEpisodesHeaderFactoryFactory(EncoreConsumerYourEpisodesComponentBindingsModule encoreConsumerYourEpisodesComponentBindingsModule, wlf<YourEpisodesHeaderFactory> wlf) {
        this.module = encoreConsumerYourEpisodesComponentBindingsModule;
        this.yourEpisodesHeaderFactoryProvider = wlf;
    }

    public static EncoreConsumerYourEpisodesComponentBindingsModule_ProvidesYourEpisodesHeaderFactoryFactory create(EncoreConsumerYourEpisodesComponentBindingsModule encoreConsumerYourEpisodesComponentBindingsModule, wlf<YourEpisodesHeaderFactory> wlf) {
        return new EncoreConsumerYourEpisodesComponentBindingsModule_ProvidesYourEpisodesHeaderFactoryFactory(encoreConsumerYourEpisodesComponentBindingsModule, wlf);
    }

    public static ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> providesYourEpisodesHeaderFactory(EncoreConsumerYourEpisodesComponentBindingsModule encoreConsumerYourEpisodesComponentBindingsModule, ajf<YourEpisodesHeaderFactory> ajf) {
        ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> providesYourEpisodesHeaderFactory = encoreConsumerYourEpisodesComponentBindingsModule.providesYourEpisodesHeaderFactory(ajf);
        yif.g(providesYourEpisodesHeaderFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesYourEpisodesHeaderFactory;
    }

    @Override // defpackage.wlf
    public ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> get() {
        return providesYourEpisodesHeaderFactory(this.module, ejf.a(this.yourEpisodesHeaderFactoryProvider));
    }
}
