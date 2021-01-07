package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.LibraryItemDescriptionView;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.badge.download.DownloadBadgeView;

public final class LibraryRowLayoutBinding {
    public final ViewStub accessory;
    public final FrameLayout accessoryContainer;
    public final ArtworkView artwork;
    public final DownloadBadgeView downloadBadge;
    public final ImageView pinBadge;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowRoot;
    public final LibraryItemDescriptionView subtitle;
    public final TextView title;

    private LibraryRowLayoutBinding(ConstraintLayout constraintLayout, ViewStub viewStub, FrameLayout frameLayout, ArtworkView artworkView, DownloadBadgeView downloadBadgeView, ImageView imageView, ConstraintLayout constraintLayout2, LibraryItemDescriptionView libraryItemDescriptionView, TextView textView) {
        this.rootView = constraintLayout;
        this.accessory = viewStub;
        this.accessoryContainer = frameLayout;
        this.artwork = artworkView;
        this.downloadBadge = downloadBadgeView;
        this.pinBadge = imageView;
        this.rowRoot = constraintLayout2;
        this.subtitle = libraryItemDescriptionView;
        this.title = textView;
    }

    public static LibraryRowLayoutBinding bind(View view) {
        int i = R.id.accessory;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            i = R.id.accessory_container;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                i = R.id.artwork;
                ArtworkView artworkView = (ArtworkView) view.findViewById(i);
                if (artworkView != null) {
                    i = R.id.download_badge;
                    DownloadBadgeView downloadBadgeView = (DownloadBadgeView) view.findViewById(i);
                    if (downloadBadgeView != null) {
                        i = R.id.pin_badge;
                        ImageView imageView = (ImageView) view.findViewById(i);
                        if (imageView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R.id.subtitle;
                            LibraryItemDescriptionView libraryItemDescriptionView = (LibraryItemDescriptionView) view.findViewById(i);
                            if (libraryItemDescriptionView != null) {
                                i = R.id.title;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    return new LibraryRowLayoutBinding(constraintLayout, viewStub, frameLayout, artworkView, downloadBadgeView, imageView, constraintLayout, libraryItemDescriptionView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LibraryRowLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibraryRowLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_row_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
