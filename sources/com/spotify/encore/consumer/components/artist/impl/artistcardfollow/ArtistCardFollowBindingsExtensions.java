package com.spotify.encore.consumer.components.artist.impl.artistcardfollow;

import com.spotify.encore.consumer.components.artist.impl.databinding.ArtistCardFollowLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class ArtistCardFollowBindingsExtensions {
    public static final void init(ArtistCardFollowLayoutBinding artistCardFollowLayoutBinding, Picasso picasso) {
        h.e(artistCardFollowLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        artistCardFollowLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bvd b = dvd.b(artistCardFollowLayoutBinding.getRoot());
        b.g(artistCardFollowLayoutBinding.title);
        b.f(artistCardFollowLayoutBinding.artwork);
        b.a();
    }
}
