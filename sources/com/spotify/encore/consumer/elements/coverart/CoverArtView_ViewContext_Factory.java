package com.spotify.encore.consumer.elements.coverart;

import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import com.squareup.picasso.Picasso;

public final class CoverArtView_ViewContext_Factory implements fjf<CoverArtView.ViewContext> {
    private final wlf<Picasso> picassoProvider;

    public CoverArtView_ViewContext_Factory(wlf<Picasso> wlf) {
        this.picassoProvider = wlf;
    }

    public static CoverArtView_ViewContext_Factory create(wlf<Picasso> wlf) {
        return new CoverArtView_ViewContext_Factory(wlf);
    }

    public static CoverArtView.ViewContext newInstance(Picasso picasso) {
        return new CoverArtView.ViewContext(picasso);
    }

    @Override // defpackage.wlf
    public CoverArtView.ViewContext get() {
        return newInstance(this.picassoProvider.get());
    }
}
