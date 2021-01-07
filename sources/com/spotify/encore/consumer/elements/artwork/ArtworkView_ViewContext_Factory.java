package com.spotify.encore.consumer.elements.artwork;

import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;

public final class ArtworkView_ViewContext_Factory implements fjf<ArtworkView.ViewContext> {
    private final wlf<Picasso> picassoProvider;

    public ArtworkView_ViewContext_Factory(wlf<Picasso> wlf) {
        this.picassoProvider = wlf;
    }

    public static ArtworkView_ViewContext_Factory create(wlf<Picasso> wlf) {
        return new ArtworkView_ViewContext_Factory(wlf);
    }

    public static ArtworkView.ViewContext newInstance(Picasso picasso) {
        return new ArtworkView.ViewContext(picasso);
    }

    @Override // defpackage.wlf
    public ArtworkView.ViewContext get() {
        return newInstance(this.picassoProvider.get());
    }
}
