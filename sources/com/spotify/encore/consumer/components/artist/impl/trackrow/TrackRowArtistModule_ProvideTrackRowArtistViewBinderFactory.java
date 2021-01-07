package com.spotify.encore.consumer.components.artist.impl.trackrow;

import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtist;

public final class TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory implements fjf<DefaultTrackRowArtistViewBinder> {
    private final wlf<DefaultTrackRowArtist.ViewContext> contextProvider;

    public TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory(wlf<DefaultTrackRowArtist.ViewContext> wlf) {
        this.contextProvider = wlf;
    }

    public static TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory create(wlf<DefaultTrackRowArtist.ViewContext> wlf) {
        return new TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory(wlf);
    }

    public static DefaultTrackRowArtistViewBinder provideTrackRowArtistViewBinder(DefaultTrackRowArtist.ViewContext viewContext) {
        DefaultTrackRowArtistViewBinder provideTrackRowArtistViewBinder = TrackRowArtistModule.Companion.provideTrackRowArtistViewBinder(viewContext);
        yif.g(provideTrackRowArtistViewBinder, "Cannot return null from a non-@Nullable @Provides method");
        return provideTrackRowArtistViewBinder;
    }

    @Override // defpackage.wlf
    public DefaultTrackRowArtistViewBinder get() {
        return provideTrackRowArtistViewBinder(this.contextProvider.get());
    }
}
