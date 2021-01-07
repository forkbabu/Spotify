package com.spotify.encore.consumer.components.yourlibrary.impl.viewbindings.rows;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryRowLayoutBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.LibraryItemDescriptionView;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;
import com.spotify.encore.consumer.elements.quickactions.ActionIconUtils;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class LibraryRowBindingsKt {
    public static final ImageButton inflateAccessory(LibraryRowLayoutBinding libraryRowLayoutBinding, SpotifyIconV2 spotifyIconV2) {
        h.e(libraryRowLayoutBinding, "$this$inflateAccessory");
        h.e(spotifyIconV2, "icon");
        ViewStub viewStub = libraryRowLayoutBinding.accessory;
        h.d(viewStub, "accessory");
        viewStub.setLayoutResource(R.layout.accessory_button);
        View inflate = libraryRowLayoutBinding.accessory.inflate();
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            setAccessoryIcon(imageButton, spotifyIconV2);
            return imageButton;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    public static final ImageButton inflateAccessoryDismiss(LibraryRowLayoutBinding libraryRowLayoutBinding) {
        h.e(libraryRowLayoutBinding, "$this$inflateAccessoryDismiss");
        ImageButton inflateAccessory = inflateAccessory(libraryRowLayoutBinding, SpotifyIconV2.X);
        inflateAccessory.setVisibility(8);
        ConstraintLayout root = libraryRowLayoutBinding.getRoot();
        h.d(root, "root");
        inflateAccessory.setContentDescription(root.getResources().getString(R.string.library_row_dismiss_content_description));
        return inflateAccessory;
    }

    public static final void init(LibraryRowLayoutBinding libraryRowLayoutBinding, Picasso picasso) {
        h.e(libraryRowLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = libraryRowLayoutBinding.getRoot();
        h.d(root, "root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        libraryRowLayoutBinding.artwork.setViewContext(new ArtworkView.ViewContext(picasso));
        bvd c = dvd.c(libraryRowLayoutBinding.getRoot());
        c.g(libraryRowLayoutBinding.title, libraryRowLayoutBinding.subtitle);
        c.f(libraryRowLayoutBinding.artwork, libraryRowLayoutBinding.pinBadge);
        c.a();
    }

    public static final void renderDescription(LibraryRowLayoutBinding libraryRowLayoutBinding, LibraryItemDescription.Model model) {
        boolean z;
        CharSequence text;
        h.e(libraryRowLayoutBinding, "$this$renderDescription");
        h.e(model, "description");
        ImageView imageView = libraryRowLayoutBinding.pinBadge;
        h.d(imageView, "pinBadge");
        boolean z2 = true;
        int i = 0;
        if (imageView.getVisibility() != 0) {
            DownloadBadgeView downloadBadgeView = libraryRowLayoutBinding.downloadBadge;
            h.d(downloadBadgeView, "downloadBadge");
            if (downloadBadgeView.getVisibility() != 0) {
                z = false;
                libraryRowLayoutBinding.subtitle.render(model);
                LibraryItemDescriptionView libraryItemDescriptionView = libraryRowLayoutBinding.subtitle;
                h.d(libraryItemDescriptionView, ContextTrack.Metadata.KEY_SUBTITLE);
                LibraryItemDescriptionView libraryItemDescriptionView2 = libraryRowLayoutBinding.subtitle;
                h.d(libraryItemDescriptionView2, ContextTrack.Metadata.KEY_SUBTITLE);
                text = libraryItemDescriptionView2.getText();
                if ((text != null || e.n(text)) || !z) {
                    LibraryItemDescriptionView libraryItemDescriptionView3 = libraryRowLayoutBinding.subtitle;
                    h.d(libraryItemDescriptionView3, ContextTrack.Metadata.KEY_SUBTITLE);
                    CharSequence text2 = libraryItemDescriptionView3.getText();
                    if (text2 != null && !e.n(text2)) {
                        z2 = false;
                    }
                    if (z2 && !z) {
                        i = 8;
                    }
                } else {
                    i = 4;
                }
                libraryItemDescriptionView.setVisibility(i);
            }
        }
        z = true;
        libraryRowLayoutBinding.subtitle.render(model);
        LibraryItemDescriptionView libraryItemDescriptionView4 = libraryRowLayoutBinding.subtitle;
        h.d(libraryItemDescriptionView4, ContextTrack.Metadata.KEY_SUBTITLE);
        LibraryItemDescriptionView libraryItemDescriptionView22 = libraryRowLayoutBinding.subtitle;
        h.d(libraryItemDescriptionView22, ContextTrack.Metadata.KEY_SUBTITLE);
        text = libraryItemDescriptionView22.getText();
        if (text != null || e.n(text)) {
        }
        LibraryItemDescriptionView libraryItemDescriptionView32 = libraryRowLayoutBinding.subtitle;
        h.d(libraryItemDescriptionView32, ContextTrack.Metadata.KEY_SUBTITLE);
        CharSequence text22 = libraryItemDescriptionView32.getText();
        z2 = false;
        i = 8;
        libraryItemDescriptionView4.setVisibility(i);
    }

    public static final void setAccessoryIcon(ImageButton imageButton, SpotifyIconV2 spotifyIconV2) {
        h.e(imageButton, "$this$setAccessoryIcon");
        h.e(spotifyIconV2, "icon");
        imageButton.setImageDrawable(ActionIconUtils.getIconDrawable(imageButton.getContext(), spotifyIconV2, com.spotify.encore.consumer.elements.R.color.encore_accessory, imageButton.getResources().getDimensionPixelSize(R.dimen.library_row_accessory_size)));
    }
}
