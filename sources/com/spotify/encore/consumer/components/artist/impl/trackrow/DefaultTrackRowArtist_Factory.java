package com.spotify.encore.consumer.components.artist.impl.trackrow;

public final class DefaultTrackRowArtist_Factory implements fjf<DefaultTrackRowArtist> {
    private final wlf<DefaultTrackRowArtistViewBinder> trackRowArtistViewBinderProvider;

    public DefaultTrackRowArtist_Factory(wlf<DefaultTrackRowArtistViewBinder> wlf) {
        this.trackRowArtistViewBinderProvider = wlf;
    }

    public static DefaultTrackRowArtist_Factory create(wlf<DefaultTrackRowArtistViewBinder> wlf) {
        return new DefaultTrackRowArtist_Factory(wlf);
    }

    public static DefaultTrackRowArtist newInstance(DefaultTrackRowArtistViewBinder defaultTrackRowArtistViewBinder) {
        return new DefaultTrackRowArtist(defaultTrackRowArtistViewBinder);
    }

    @Override // defpackage.wlf
    public DefaultTrackRowArtist get() {
        return newInstance(this.trackRowArtistViewBinderProvider.get());
    }
}
