package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public final class LibrarySortRowLayoutBinding {
    public final SpotifyIconView iconGridList;
    public final ImageView iconImageView;
    public final FrameLayout iconSort;
    private final ConstraintLayout rootView;
    public final TextView sortText;

    private LibrarySortRowLayoutBinding(ConstraintLayout constraintLayout, SpotifyIconView spotifyIconView, ImageView imageView, FrameLayout frameLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.iconGridList = spotifyIconView;
        this.iconImageView = imageView;
        this.iconSort = frameLayout;
        this.sortText = textView;
    }

    public static LibrarySortRowLayoutBinding bind(View view) {
        int i = R.id.icon_grid_list;
        SpotifyIconView spotifyIconView = (SpotifyIconView) view.findViewById(i);
        if (spotifyIconView != null) {
            i = R.id.icon_image_view;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.icon_sort;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = R.id.sort_text;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        return new LibrarySortRowLayoutBinding((ConstraintLayout) view, spotifyIconView, imageView, frameLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LibrarySortRowLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibrarySortRowLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_sort_row_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
