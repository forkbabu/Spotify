package com.spotify.encore.consumer.elements.creator;

import com.spotify.encore.consumer.elements.creator.CreatorButton;
import com.squareup.picasso.Picasso;

public final class CreatorButton_ViewContext_Factory implements fjf<CreatorButton.ViewContext> {
    private final wlf<Picasso> picassoProvider;

    public CreatorButton_ViewContext_Factory(wlf<Picasso> wlf) {
        this.picassoProvider = wlf;
    }

    public static CreatorButton_ViewContext_Factory create(wlf<Picasso> wlf) {
        return new CreatorButton_ViewContext_Factory(wlf);
    }

    public static CreatorButton.ViewContext newInstance(Picasso picasso) {
        return new CreatorButton.ViewContext(picasso);
    }

    @Override // defpackage.wlf
    public CreatorButton.ViewContext get() {
        return newInstance(this.picassoProvider.get());
    }
}
