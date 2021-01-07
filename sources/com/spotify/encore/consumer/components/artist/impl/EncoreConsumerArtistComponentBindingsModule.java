package com.spotify.encore.consumer.components.artist.impl;

import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.components.artist.impl.trackrow.TrackRowArtistFactory;
import kotlin.jvm.internal.h;

public final class EncoreConsumerArtistComponentBindingsModule {
    public final ComponentFactory<TrackRowArtist, ComponentConfiguration> provideTrackRowArtistFactory(ajf<TrackRowArtistFactory> ajf) {
        h.e(ajf, "trackRowArtistFactoryLazy");
        TrackRowArtistFactory trackRowArtistFactory = ajf.get();
        h.d(trackRowArtistFactory, "trackRowArtistFactoryLazy.get()");
        return trackRowArtistFactory;
    }
}
