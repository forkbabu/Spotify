package com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.cards;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.c;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryCardLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.LibraryItemDescriptionView;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class LibraryCardBindingsKt {
    private static final float TITLE_LINE_HEIGHT_DP = 16.0f;

    public static final void center(LibraryCardLayoutBinding libraryCardLayoutBinding) {
        h.e(libraryCardLayoutBinding, "$this$center");
        TextView textView = libraryCardLayoutBinding.title;
        h.d(textView, "title");
        textView.setGravity(17);
        LibraryItemDescriptionView libraryItemDescriptionView = libraryCardLayoutBinding.subtitle;
        h.d(libraryItemDescriptionView, ContextTrack.Metadata.KEY_SUBTITLE);
        libraryItemDescriptionView.setGravity(17);
    }

    public static final void init(LibraryCardLayoutBinding libraryCardLayoutBinding, Picasso picasso) {
        h.e(libraryCardLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = libraryCardLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        libraryCardLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bvd b = dvd.b(libraryCardLayoutBinding.getRoot());
        b.g(libraryCardLayoutBinding.title);
        b.g(libraryCardLayoutBinding.subtitle);
        b.f(libraryCardLayoutBinding.artwork, libraryCardLayoutBinding.pinBadge);
        b.a();
        TextView textView = libraryCardLayoutBinding.title;
        ConstraintLayout root2 = libraryCardLayoutBinding.getRoot();
        h.d(root2, "root");
        c.k(textView, nud.g(TITLE_LINE_HEIGHT_DP, root2.getResources()));
    }

    public static final void renderDescription(LibraryCardLayoutBinding libraryCardLayoutBinding, LibraryItemDescription.Model model) {
        h.e(libraryCardLayoutBinding, "$this$renderDescription");
        h.e(model, "description");
        libraryCardLayoutBinding.subtitle.render(model);
        LibraryItemDescriptionView libraryItemDescriptionView = libraryCardLayoutBinding.subtitle;
        h.d(libraryItemDescriptionView, ContextTrack.Metadata.KEY_SUBTITLE);
        LibraryItemDescriptionView libraryItemDescriptionView2 = libraryCardLayoutBinding.subtitle;
        h.d(libraryItemDescriptionView2, ContextTrack.Metadata.KEY_SUBTITLE);
        CharSequence text = libraryItemDescriptionView2.getText();
        int i = 0;
        if (text == null || e.n(text)) {
            i = 4;
        }
        libraryItemDescriptionView.setVisibility(i);
    }
}
