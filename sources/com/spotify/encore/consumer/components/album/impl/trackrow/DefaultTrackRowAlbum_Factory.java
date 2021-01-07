package com.spotify.encore.consumer.components.album.impl.trackrow;

public final class DefaultTrackRowAlbum_Factory implements fjf<DefaultTrackRowAlbum> {
    private final wlf<DefaultTrackRowAlbumViewBinder> viewBinderProvider;

    public DefaultTrackRowAlbum_Factory(wlf<DefaultTrackRowAlbumViewBinder> wlf) {
        this.viewBinderProvider = wlf;
    }

    public static DefaultTrackRowAlbum_Factory create(wlf<DefaultTrackRowAlbumViewBinder> wlf) {
        return new DefaultTrackRowAlbum_Factory(wlf);
    }

    public static DefaultTrackRowAlbum newInstance(DefaultTrackRowAlbumViewBinder defaultTrackRowAlbumViewBinder) {
        return new DefaultTrackRowAlbum(defaultTrackRowAlbumViewBinder);
    }

    @Override // defpackage.wlf
    public DefaultTrackRowAlbum get() {
        return newInstance(this.viewBinderProvider.get());
    }
}
