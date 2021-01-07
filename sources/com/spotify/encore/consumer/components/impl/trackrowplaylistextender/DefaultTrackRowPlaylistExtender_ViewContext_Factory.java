package com.spotify.encore.consumer.components.impl.trackrowplaylistextender;

import androidx.fragment.app.c;
import com.spotify.encore.consumer.components.impl.trackrowplaylistextender.DefaultTrackRowPlaylistExtender;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class DefaultTrackRowPlaylistExtender_ViewContext_Factory implements fjf<DefaultTrackRowPlaylistExtender.ViewContext> {
    private final wlf<ArtworkView.ViewContext> artworkContextProvider;
    private final wlf<c> contextProvider;

    public DefaultTrackRowPlaylistExtender_ViewContext_Factory(wlf<c> wlf, wlf<ArtworkView.ViewContext> wlf2) {
        this.contextProvider = wlf;
        this.artworkContextProvider = wlf2;
    }

    public static DefaultTrackRowPlaylistExtender_ViewContext_Factory create(wlf<c> wlf, wlf<ArtworkView.ViewContext> wlf2) {
        return new DefaultTrackRowPlaylistExtender_ViewContext_Factory(wlf, wlf2);
    }

    public static DefaultTrackRowPlaylistExtender.ViewContext newInstance(c cVar, ArtworkView.ViewContext viewContext) {
        return new DefaultTrackRowPlaylistExtender.ViewContext(cVar, viewContext);
    }

    @Override // defpackage.wlf
    public DefaultTrackRowPlaylistExtender.ViewContext get() {
        return newInstance(this.contextProvider.get(), this.artworkContextProvider.get());
    }
}
