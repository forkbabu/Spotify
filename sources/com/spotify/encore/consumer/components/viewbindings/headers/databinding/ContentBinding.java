package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkShadow;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.creator.CreatorButton;

public final class ContentBinding {
    public final ViewStub actionRowContainer;
    public final ArtworkView artwork;
    public final ArtworkShadow artworkShadow;
    public final Space artworkShadowBottomSpace;
    public final Space artworkShadowLeftSpace;
    public final Space artworkShadowRightSpace;
    public final Space artworkShadowTopSpace;
    public final Space contentBottomSpace;
    public final ConstraintLayout contentContainer;
    public final Space contentDimensionRatioSpace;
    public final CreatorButton creatorButton;
    public final TextView description;
    public final Guideline guidelineEnd;
    public final Guideline guidelineStart;
    private final ConstraintLayout rootView;
    public final TextView title;

    private ContentBinding(ConstraintLayout constraintLayout, ViewStub viewStub, ArtworkView artworkView, ArtworkShadow artworkShadow2, Space space, Space space2, Space space3, Space space4, Space space5, ConstraintLayout constraintLayout2, Space space6, CreatorButton creatorButton2, TextView textView, Guideline guideline, Guideline guideline2, TextView textView2) {
        this.rootView = constraintLayout;
        this.actionRowContainer = viewStub;
        this.artwork = artworkView;
        this.artworkShadow = artworkShadow2;
        this.artworkShadowBottomSpace = space;
        this.artworkShadowLeftSpace = space2;
        this.artworkShadowRightSpace = space3;
        this.artworkShadowTopSpace = space4;
        this.contentBottomSpace = space5;
        this.contentContainer = constraintLayout2;
        this.contentDimensionRatioSpace = space6;
        this.creatorButton = creatorButton2;
        this.description = textView;
        this.guidelineEnd = guideline;
        this.guidelineStart = guideline2;
        this.title = textView2;
    }

    public static ContentBinding bind(View view) {
        int i = R.id.action_row_container;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            i = R.id.artwork;
            ArtworkView artworkView = (ArtworkView) view.findViewById(i);
            if (artworkView != null) {
                i = R.id.artwork_shadow;
                ArtworkShadow artworkShadow2 = (ArtworkShadow) view.findViewById(i);
                if (artworkShadow2 != null) {
                    i = R.id.artwork_shadow_bottom_space;
                    Space space = (Space) view.findViewById(i);
                    if (space != null) {
                        i = R.id.artwork_shadow_left_space;
                        Space space2 = (Space) view.findViewById(i);
                        if (space2 != null) {
                            i = R.id.artwork_shadow_right_space;
                            Space space3 = (Space) view.findViewById(i);
                            if (space3 != null) {
                                i = R.id.artwork_shadow_top_space;
                                Space space4 = (Space) view.findViewById(i);
                                if (space4 != null) {
                                    i = R.id.content_bottom_space;
                                    Space space5 = (Space) view.findViewById(i);
                                    if (space5 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = R.id.content_dimension_ratio_space;
                                        Space space6 = (Space) view.findViewById(i);
                                        if (space6 != null) {
                                            i = R.id.creatorButton;
                                            CreatorButton creatorButton2 = (CreatorButton) view.findViewById(i);
                                            if (creatorButton2 != null) {
                                                i = R.id.description;
                                                TextView textView = (TextView) view.findViewById(i);
                                                if (textView != null) {
                                                    i = R.id.guideline_end;
                                                    Guideline guideline = (Guideline) view.findViewById(i);
                                                    if (guideline != null) {
                                                        i = R.id.guideline_start;
                                                        Guideline guideline2 = (Guideline) view.findViewById(i);
                                                        if (guideline2 != null) {
                                                            i = R.id.title;
                                                            TextView textView2 = (TextView) view.findViewById(i);
                                                            if (textView2 != null) {
                                                                return new ContentBinding(constraintLayout, viewStub, artworkView, artworkShadow2, space, space2, space3, space4, space5, constraintLayout, space6, creatorButton2, textView, guideline, guideline2, textView2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
