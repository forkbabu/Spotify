package com.spotify.encore.consumer.components.album.impl.trackrow;

public final class TrackRowAlbumFactory_Factory implements fjf<TrackRowAlbumFactory> {
    private final wlf<DefaultTrackRowAlbum> providerProvider;

    public TrackRowAlbumFactory_Factory(wlf<DefaultTrackRowAlbum> wlf) {
        this.providerProvider = wlf;
    }

    public static TrackRowAlbumFactory_Factory create(wlf<DefaultTrackRowAlbum> wlf) {
        return new TrackRowAlbumFactory_Factory(wlf);
    }

    public static TrackRowAlbumFactory newInstance(wlf<DefaultTrackRowAlbum> wlf) {
        return new TrackRowAlbumFactory(wlf);
    }

    @Override // defpackage.wlf
    public TrackRowAlbumFactory get() {
        return newInstance(this.providerProvider);
    }
}
