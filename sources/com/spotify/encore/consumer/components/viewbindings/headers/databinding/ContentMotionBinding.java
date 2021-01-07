package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.creator.CreatorButton;

public final class ContentMotionBinding {
    public final ViewStub actionRowContainer;
    public final ArtworkView artwork;
    public final Space contentRatioSpace;
    public final CreatorButton creatorButton;
    public final Guideline guidelineEnd;
    public final Guideline guidelineStart;
    private final View rootView;
    public final TextView title;

    private ContentMotionBinding(View view, ViewStub viewStub, ArtworkView artworkView, Space space, CreatorButton creatorButton2, Guideline guideline, Guideline guideline2, TextView textView) {
        this.rootView = view;
        this.actionRowContainer = viewStub;
        this.artwork = artworkView;
        this.contentRatioSpace = space;
        this.creatorButton = creatorButton2;
        this.guidelineEnd = guideline;
        this.guidelineStart = guideline2;
        this.title = textView;
    }

    public static ContentMotionBinding bind(View view) {
        int i = R.id.action_row_container;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            i = R.id.artwork;
            ArtworkView artworkView = (ArtworkView) view.findViewById(i);
            if (artworkView != null) {
                i = R.id.content_ratio_space;
                Space space = (Space) view.findViewById(i);
                if (space != null) {
                    i = R.id.creatorButton;
                    CreatorButton creatorButton2 = (CreatorButton) view.findViewById(i);
                    if (creatorButton2 != null) {
                        i = R.id.guideline_end;
                        Guideline guideline = (Guideline) view.findViewById(i);
                        if (guideline != null) {
                            i = R.id.guideline_start;
                            Guideline guideline2 = (Guideline) view.findViewById(i);
                            if (guideline2 != null) {
                                i = R.id.title;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    return new ContentMotionBinding(view, viewStub, artworkView, space, creatorButton2, guideline, guideline2, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ContentMotionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.content_motion, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
