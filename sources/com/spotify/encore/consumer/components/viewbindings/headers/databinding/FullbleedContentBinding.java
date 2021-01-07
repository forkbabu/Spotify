package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class FullbleedContentBinding {
    public final View actionRowBackground;
    public final ViewStub actionRowContainer;
    public final ArtworkView artwork;
    public final View backgroundGradient;
    public final MotionLayout contentContainer;
    public final Space contentDimensionRatioSpace;
    public final Guideline guideContentEnd;
    public final Guideline guideContentStart;
    private final MotionLayout rootView;
    public final TextView title;
    public final View titleGradient;

    private FullbleedContentBinding(MotionLayout motionLayout, View view, ViewStub viewStub, ArtworkView artworkView, View view2, MotionLayout motionLayout2, Space space, Guideline guideline, Guideline guideline2, TextView textView, View view3) {
        this.rootView = motionLayout;
        this.actionRowBackground = view;
        this.actionRowContainer = viewStub;
        this.artwork = artworkView;
        this.backgroundGradient = view2;
        this.contentContainer = motionLayout2;
        this.contentDimensionRatioSpace = space;
        this.guideContentEnd = guideline;
        this.guideContentStart = guideline2;
        this.title = textView;
        this.titleGradient = view3;
    }

    public static FullbleedContentBinding bind(View view) {
        View findViewById;
        View findViewById2;
        int i = R.id.action_row_background;
        View findViewById3 = view.findViewById(i);
        if (findViewById3 != null) {
            i = R.id.action_row_container;
            ViewStub viewStub = (ViewStub) view.findViewById(i);
            if (viewStub != null) {
                i = R.id.artwork;
                ArtworkView artworkView = (ArtworkView) view.findViewById(i);
                if (!(artworkView == null || (findViewById = view.findViewById((i = R.id.background_gradient))) == null)) {
                    MotionLayout motionLayout = (MotionLayout) view;
                    i = R.id.content_dimension_ratio_space;
                    Space space = (Space) view.findViewById(i);
                    if (space != null) {
                        i = R.id.guide_content_end;
                        Guideline guideline = (Guideline) view.findViewById(i);
                        if (guideline != null) {
                            i = R.id.guide_content_start;
                            Guideline guideline2 = (Guideline) view.findViewById(i);
                            if (guideline2 != null) {
                                i = R.id.title;
                                TextView textView = (TextView) view.findViewById(i);
                                if (!(textView == null || (findViewById2 = view.findViewById((i = R.id.title_gradient))) == null)) {
                                    return new FullbleedContentBinding(motionLayout, findViewById3, viewStub, artworkView, findViewById, motionLayout, space, guideline, guideline2, textView, findViewById2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FullbleedContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FullbleedContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fullbleed_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MotionLayout getRoot() {
        return this.rootView;
    }
}
