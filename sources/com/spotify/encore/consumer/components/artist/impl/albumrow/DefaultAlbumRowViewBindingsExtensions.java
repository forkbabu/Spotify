package com.spotify.encore.consumer.components.artist.impl.albumrow;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.artist.impl.databinding.AlbumRowArtistLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.quickactions.QuickActionView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class DefaultAlbumRowViewBindingsExtensions {
    public static final void init(AlbumRowArtistLayoutBinding albumRowArtistLayoutBinding, Picasso picasso) {
        h.e(albumRowArtistLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = albumRowArtistLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        albumRowArtistLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        albumRowArtistLayoutBinding.quickAction.setViewContext(new QuickActionView.ViewContext(picasso));
        bvd c = dvd.c(albumRowArtistLayoutBinding.getRoot());
        c.g(albumRowArtistLayoutBinding.title, albumRowArtistLayoutBinding.subtitle);
        c.f(albumRowArtistLayoutBinding.artwork);
        c.a();
    }
}
