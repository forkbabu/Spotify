package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.LibraryItemDescriptionView;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;

public final class LibraryCardLayoutBinding {
    public final ArtworkView artwork;
    public final ConstraintLayout cardRoot;
    public final DownloadBadgeView downloadBadge;
    public final ImageView pinBadge;
    private final ConstraintLayout rootView;
    public final LibraryItemDescriptionView subtitle;
    public final TextView title;

    private LibraryCardLayoutBinding(ConstraintLayout constraintLayout, ArtworkView artworkView, ConstraintLayout constraintLayout2, DownloadBadgeView downloadBadgeView, ImageView imageView, LibraryItemDescriptionView libraryItemDescriptionView, TextView textView) {
        this.rootView = constraintLayout;
        this.artwork = artworkView;
        this.cardRoot = constraintLayout2;
        this.downloadBadge = downloadBadgeView;
        this.pinBadge = imageView;
        this.subtitle = libraryItemDescriptionView;
        this.title = textView;
    }

    public static LibraryCardLayoutBinding bind(View view) {
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) view.findViewById(i);
        if (artworkView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.download_badge;
            DownloadBadgeView downloadBadgeView = (DownloadBadgeView) view.findViewById(i);
            if (downloadBadgeView != null) {
                i = R.id.pin_badge;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = R.id.subtitle;
                    LibraryItemDescriptionView libraryItemDescriptionView = (LibraryItemDescriptionView) view.findViewById(i);
                    if (libraryItemDescriptionView != null) {
                        i = R.id.title;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            return new LibraryCardLayoutBinding(constraintLayout, artworkView, constraintLayout, downloadBadgeView, imageView, libraryItemDescriptionView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LibraryCardLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibraryCardLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
