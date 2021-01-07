package com.spotify.encore.consumer.components.artist.impl.trackrow;

import android.app.Activity;
import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtist;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;

public final class DefaultTrackRowArtist_ViewContext_Factory implements fjf<DefaultTrackRowArtist.ViewContext> {
    private final wlf<Activity> contextProvider;
    private final wlf<CoverArtView.ViewContext> coverArtContextProvider;

    public DefaultTrackRowArtist_ViewContext_Factory(wlf<Activity> wlf, wlf<CoverArtView.ViewContext> wlf2) {
        this.contextProvider = wlf;
        this.coverArtContextProvider = wlf2;
    }

    public static DefaultTrackRowArtist_ViewContext_Factory create(wlf<Activity> wlf, wlf<CoverArtView.ViewContext> wlf2) {
        return new DefaultTrackRowArtist_ViewContext_Factory(wlf, wlf2);
    }

    public static DefaultTrackRowArtist.ViewContext newInstance(Activity activity, CoverArtView.ViewContext viewContext) {
        return new DefaultTrackRowArtist.ViewContext(activity, viewContext);
    }

    @Override // defpackage.wlf
    public DefaultTrackRowArtist.ViewContext get() {
        return newInstance(this.contextProvider.get(), this.coverArtContextProvider.get());
    }
}
