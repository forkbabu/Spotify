package com.spotify.encore.consumer.components.artist.impl.trackrow;

import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import kotlin.jvm.internal.h;

public final class TrackRowArtistFactory implements ComponentFactory<TrackRowArtist, ComponentConfiguration> {
    private final wlf<DefaultTrackRowArtist> defaultTrackRowArtist;

    public TrackRowArtistFactory(wlf<DefaultTrackRowArtist> wlf) {
        h.e(wlf, "defaultTrackRowArtist");
        this.defaultTrackRowArtist = wlf;
    }

    @Override // com.spotify.encore.ComponentFactory
    public TrackRowArtist make(ComponentConfiguration componentConfiguration) {
        DefaultTrackRowArtist defaultTrackRowArtist2 = this.defaultTrackRowArtist.get();
        h.d(defaultTrackRowArtist2, "defaultTrackRowArtist.get()");
        return defaultTrackRowArtist2;
    }

    @Override // com.spotify.encore.ComponentFactory
    public TrackRowArtist make() {
        return make((ComponentConfiguration) null);
    }
}
