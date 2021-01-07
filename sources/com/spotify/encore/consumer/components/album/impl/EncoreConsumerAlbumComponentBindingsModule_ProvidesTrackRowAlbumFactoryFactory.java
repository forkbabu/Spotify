package com.spotify.encore.consumer.components.album.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbumConfiguration;
import com.spotify.encore.consumer.components.album.impl.trackrow.TrackRowAlbumFactory;

public final class EncoreConsumerAlbumComponentBindingsModule_ProvidesTrackRowAlbumFactoryFactory implements fjf<ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration>> {
    private final EncoreConsumerAlbumComponentBindingsModule module;
    private final wlf<TrackRowAlbumFactory> trackRowAlbumFactoryLazyProvider;

    public EncoreConsumerAlbumComponentBindingsModule_ProvidesTrackRowAlbumFactoryFactory(EncoreConsumerAlbumComponentBindingsModule encoreConsumerAlbumComponentBindingsModule, wlf<TrackRowAlbumFactory> wlf) {
        this.module = encoreConsumerAlbumComponentBindingsModule;
        this.trackRowAlbumFactoryLazyProvider = wlf;
    }

    public static EncoreConsumerAlbumComponentBindingsModule_ProvidesTrackRowAlbumFactoryFactory create(EncoreConsumerAlbumComponentBindingsModule encoreConsumerAlbumComponentBindingsModule, wlf<TrackRowAlbumFactory> wlf) {
        return new EncoreConsumerAlbumComponentBindingsModule_ProvidesTrackRowAlbumFactoryFactory(encoreConsumerAlbumComponentBindingsModule, wlf);
    }

    public static ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> providesTrackRowAlbumFactory(EncoreConsumerAlbumComponentBindingsModule encoreConsumerAlbumComponentBindingsModule, ajf<TrackRowAlbumFactory> ajf) {
        ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> providesTrackRowAlbumFactory = encoreConsumerAlbumComponentBindingsModule.providesTrackRowAlbumFactory(ajf);
        yif.g(providesTrackRowAlbumFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesTrackRowAlbumFactory;
    }

    @Override // defpackage.wlf
    public ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> get() {
        return providesTrackRowAlbumFactory(this.module, ejf.a(this.trackRowAlbumFactoryLazyProvider));
    }
}
