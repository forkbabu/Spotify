package com.spotify.encore.consumer.components.viewbindings.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.viewbindings.cards.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class CardLayoutBinding {
    public final ArtworkView artwork;
    public final ConstraintLayout cardRoot;
    private final ConstraintLayout rootView;
    public final TextView title;

    private CardLayoutBinding(ConstraintLayout constraintLayout, ArtworkView artworkView, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.artwork = artworkView;
        this.cardRoot = constraintLayout2;
        this.title = textView;
    }

    public static CardLayoutBinding bind(View view) {
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) view.findViewById(i);
        if (artworkView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.title;
            TextView textView = (TextView) view.findViewById(i2);
            if (textView != null) {
                return new CardLayoutBinding(constraintLayout, artworkView, constraintLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CardLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
