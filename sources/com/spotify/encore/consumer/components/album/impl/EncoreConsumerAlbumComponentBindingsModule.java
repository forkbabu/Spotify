package com.spotify.encore.consumer.components.album.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbumConfiguration;
import com.spotify.encore.consumer.components.album.impl.trackrow.TrackRowAlbumFactory;
import kotlin.jvm.internal.h;

public final class EncoreConsumerAlbumComponentBindingsModule {
    public final ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> providesTrackRowAlbumFactory(ajf<TrackRowAlbumFactory> ajf) {
        h.e(ajf, "trackRowAlbumFactoryLazy");
        TrackRowAlbumFactory trackRowAlbumFactory = ajf.get();
        h.d(trackRowAlbumFactory, "trackRowAlbumFactoryLazy.get()");
        return trackRowAlbumFactory;
    }
}
