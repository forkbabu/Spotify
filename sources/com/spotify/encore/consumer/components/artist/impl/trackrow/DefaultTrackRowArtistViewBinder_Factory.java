package com.spotify.encore.consumer.components.artist.impl.trackrow;

import android.content.Context;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;

public final class DefaultTrackRowArtistViewBinder_Factory implements fjf<DefaultTrackRowArtistViewBinder> {
    private final wlf<Context> contextProvider;
    private final wlf<CoverArtView.ViewContext> coverArtContextProvider;

    public DefaultTrackRowArtistViewBinder_Factory(wlf<Context> wlf, wlf<CoverArtView.ViewContext> wlf2) {
        this.contextProvider = wlf;
        this.coverArtContextProvider = wlf2;
    }

    public static DefaultTrackRowArtistViewBinder_Factory create(wlf<Context> wlf, wlf<CoverArtView.ViewContext> wlf2) {
        return new DefaultTrackRowArtistViewBinder_Factory(wlf, wlf2);
    }

    public static DefaultTrackRowArtistViewBinder newInstance(Context context, CoverArtView.ViewContext viewContext) {
        return new DefaultTrackRowArtistViewBinder(context, viewContext);
    }

    @Override // defpackage.wlf
    public DefaultTrackRowArtistViewBinder get() {
        return newInstance(this.contextProvider.get(), this.coverArtContextProvider.get());
    }
}
