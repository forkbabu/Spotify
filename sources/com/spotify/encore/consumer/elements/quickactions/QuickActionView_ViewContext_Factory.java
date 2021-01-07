package com.spotify.encore.consumer.elements.quickactions;

import com.spotify.encore.consumer.elements.quickactions.QuickActionView;
import com.squareup.picasso.Picasso;

public final class QuickActionView_ViewContext_Factory implements fjf<QuickActionView.ViewContext> {
    private final wlf<Picasso> picassoProvider;

    public QuickActionView_ViewContext_Factory(wlf<Picasso> wlf) {
        this.picassoProvider = wlf;
    }

    public static QuickActionView_ViewContext_Factory create(wlf<Picasso> wlf) {
        return new QuickActionView_ViewContext_Factory(wlf);
    }

    public static QuickActionView.ViewContext newInstance(Picasso picasso) {
        return new QuickActionView.ViewContext(picasso);
    }

    @Override // defpackage.wlf
    public QuickActionView.ViewContext get() {
        return newInstance(this.picassoProvider.get());
    }
}
