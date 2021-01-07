package com.spotify.encore.consumer.components.home.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class HomeCardLayoutBinding {
    public final TextView accessory;
    public final ConstraintLayout homeCardRootView;
    public final ArtworkView image;
    private final ConstraintLayout rootView;
    public final TextView subTitle;
    public final TextView title;

    private HomeCardLayoutBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ArtworkView artworkView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.accessory = textView;
        this.homeCardRootView = constraintLayout2;
        this.image = artworkView;
        this.subTitle = textView2;
        this.title = textView3;
    }

    public static HomeCardLayoutBinding bind(View view) {
        int i = R.id.accessory;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.image;
            ArtworkView artworkView = (ArtworkView) view.findViewById(i);
            if (artworkView != null) {
                i = R.id.sub_title;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) view.findViewById(i);
                    if (textView3 != null) {
                        return new HomeCardLayoutBinding(constraintLayout, textView, constraintLayout, artworkView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HomeCardLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HomeCardLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.home_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
