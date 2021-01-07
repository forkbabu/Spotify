package com.spotify.encore.consumer.components.artist.impl;

import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.components.artist.impl.trackrow.TrackRowArtistFactory;

public final class EncoreConsumerArtistComponentBindingsModule_ProvideTrackRowArtistFactoryFactory implements fjf<ComponentFactory<TrackRowArtist, ComponentConfiguration>> {
    private final EncoreConsumerArtistComponentBindingsModule module;
    private final wlf<TrackRowArtistFactory> trackRowArtistFactoryLazyProvider;

    public EncoreConsumerArtistComponentBindingsModule_ProvideTrackRowArtistFactoryFactory(EncoreConsumerArtistComponentBindingsModule encoreConsumerArtistComponentBindingsModule, wlf<TrackRowArtistFactory> wlf) {
        this.module = encoreConsumerArtistComponentBindingsModule;
        this.trackRowArtistFactoryLazyProvider = wlf;
    }

    public static EncoreConsumerArtistComponentBindingsModule_ProvideTrackRowArtistFactoryFactory create(EncoreConsumerArtistComponentBindingsModule encoreConsumerArtistComponentBindingsModule, wlf<TrackRowArtistFactory> wlf) {
        return new EncoreConsumerArtistComponentBindingsModule_ProvideTrackRowArtistFactoryFactory(encoreConsumerArtistComponentBindingsModule, wlf);
    }

    public static ComponentFactory<TrackRowArtist, ComponentConfiguration> provideTrackRowArtistFactory(EncoreConsumerArtistComponentBindingsModule encoreConsumerArtistComponentBindingsModule, ajf<TrackRowArtistFactory> ajf) {
        ComponentFactory<TrackRowArtist, ComponentConfiguration> provideTrackRowArtistFactory = encoreConsumerArtistComponentBindingsModule.provideTrackRowArtistFactory(ajf);
        yif.g(provideTrackRowArtistFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideTrackRowArtistFactory;
    }

    @Override // defpackage.wlf
    public ComponentFactory<TrackRowArtist, ComponentConfiguration> get() {
        return provideTrackRowArtistFactory(this.module, ejf.a(this.trackRowArtistFactoryLazyProvider));
    }
}
