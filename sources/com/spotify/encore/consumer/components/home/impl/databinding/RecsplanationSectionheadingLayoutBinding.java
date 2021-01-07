package com.spotify.encore.consumer.components.home.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.impl.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class RecsplanationSectionheadingLayoutBinding {
    public final ArtworkView image;
    private final ConstraintLayout rootView;
    public final TextView subtitle;
    public final LinearLayout textContainer;
    public final TextView title;

    private RecsplanationSectionheadingLayoutBinding(ConstraintLayout constraintLayout, ArtworkView artworkView, TextView textView, LinearLayout linearLayout, TextView textView2) {
        this.rootView = constraintLayout;
        this.image = artworkView;
        this.subtitle = textView;
        this.textContainer = linearLayout;
        this.title = textView2;
    }

    public static RecsplanationSectionheadingLayoutBinding bind(View view) {
        int i = R.id.image;
        ArtworkView artworkView = (ArtworkView) view.findViewById(i);
        if (artworkView != null) {
            i = R.id.subtitle;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.text_container;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        return new RecsplanationSectionheadingLayoutBinding((ConstraintLayout) view, artworkView, textView, linearLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RecsplanationSectionheadingLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RecsplanationSectionheadingLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.recsplanation_sectionheading_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
