package com.spotify.encore.consumer.components.album.impl.trackrow;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbumConfiguration;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class TrackRowAlbumFactory implements ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> {
    private final wlf<DefaultTrackRowAlbum> provider;

    public TrackRowAlbumFactory(wlf<DefaultTrackRowAlbum> wlf) {
        h.e(wlf, ContextTrack.Metadata.KEY_PROVIDER);
        this.provider = wlf;
    }

    @Override // com.spotify.encore.ComponentFactory
    public TrackRowAlbum make() {
        return (TrackRowAlbum) ComponentFactory.DefaultImpls.make(this);
    }

    public TrackRowAlbum make(TrackRowAlbumConfiguration trackRowAlbumConfiguration) {
        if (trackRowAlbumConfiguration instanceof TrackRowAlbumConfiguration.DefaultTrackRowAlbumConfiguration) {
            DefaultTrackRowAlbum defaultTrackRowAlbum = this.provider.get();
            h.d(defaultTrackRowAlbum, "provider.get()");
            return defaultTrackRowAlbum;
        }
        DefaultTrackRowAlbum defaultTrackRowAlbum2 = this.provider.get();
        h.d(defaultTrackRowAlbum2, "provider.get()");
        return defaultTrackRowAlbum2;
    }
}
