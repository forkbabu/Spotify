package com.spotify.encore.consumer.components.artist.impl.trackrow;

public final class TrackRowArtistFactory_Factory implements fjf<TrackRowArtistFactory> {
    private final wlf<DefaultTrackRowArtist> defaultTrackRowArtistProvider;

    public TrackRowArtistFactory_Factory(wlf<DefaultTrackRowArtist> wlf) {
        this.defaultTrackRowArtistProvider = wlf;
    }

    public static TrackRowArtistFactory_Factory create(wlf<DefaultTrackRowArtist> wlf) {
        return new TrackRowArtistFactory_Factory(wlf);
    }

    public static TrackRowArtistFactory newInstance(wlf<DefaultTrackRowArtist> wlf) {
        return new TrackRowArtistFactory(wlf);
    }

    @Override // defpackage.wlf
    public TrackRowArtistFactory get() {
        return newInstance(this.defaultTrackRowArtistProvider);
    }
}
