package com.spotify.encore.consumer.components.viewbindings.cards;

import com.spotify.encore.consumer.components.viewbindings.cards.databinding.CardLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class CardViewBindingsExtensions {
    public static final void init(CardLayoutBinding cardLayoutBinding, Picasso picasso) {
        h.e(cardLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        cardLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bvd b = dvd.b(cardLayoutBinding.getRoot());
        b.g(cardLayoutBinding.title);
        b.f(cardLayoutBinding.artwork);
        b.a();
    }
}
