package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.DaggerArtistEncoreConsumerComponent;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerTrackRowArtistExtensions {
    public static final ComponentFactory<TrackRowArtist, ComponentConfiguration> trackRowArtistFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$trackRowArtistFactory");
        return DaggerArtistEncoreConsumerComponent.factory().create(rows.getActivity(), rows.getPicasso()).trackRowArtistFactory();
    }
}
