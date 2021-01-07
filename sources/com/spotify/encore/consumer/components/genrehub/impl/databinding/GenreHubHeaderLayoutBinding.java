package com.spotify.encore.consumer.components.genrehub.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.genrehub.impl.R;

public final class GenreHubHeaderLayoutBinding {
    public final ConstraintLayout contentContainer;
    public final Guideline guideContentEnd;
    public final Guideline guideContentStart;
    public final Guideline guideContentTop;
    private final ConstraintLayout rootView;
    public final TextView title;

    private GenreHubHeaderLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView) {
        this.rootView = constraintLayout;
        this.contentContainer = constraintLayout2;
        this.guideContentEnd = guideline;
        this.guideContentStart = guideline2;
        this.guideContentTop = guideline3;
        this.title = textView;
    }

    public static GenreHubHeaderLayoutBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.guide_content_end;
        Guideline guideline = (Guideline) view.findViewById(i);
        if (guideline != null) {
            i = R.id.guide_content_start;
            Guideline guideline2 = (Guideline) view.findViewById(i);
            if (guideline2 != null) {
                i = R.id.guide_content_top;
                Guideline guideline3 = (Guideline) view.findViewById(i);
                if (guideline3 != null) {
                    i = R.id.title;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        return new GenreHubHeaderLayoutBinding((ConstraintLayout) view, constraintLayout, guideline, guideline2, guideline3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GenreHubHeaderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GenreHubHeaderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.genre_hub_header_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
