package com.spotify.encore.consumer.components.yourepisodes.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.yourepisodes.impl.R;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButtonView;

public final class YourEpisodesHeaderContentBinding {
    public final ConstraintLayout contentContainer;
    public final DownloadButtonView downloadButton;
    public final Guideline guideContentEnd;
    public final Guideline guideContentTop;
    private final ConstraintLayout rootView;
    public final TextView subtitle;
    public final TextView title;

    private YourEpisodesHeaderContentBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DownloadButtonView downloadButtonView, Guideline guideline, Guideline guideline2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.contentContainer = constraintLayout2;
        this.downloadButton = downloadButtonView;
        this.guideContentEnd = guideline;
        this.guideContentTop = guideline2;
        this.subtitle = textView;
        this.title = textView2;
    }

    public static YourEpisodesHeaderContentBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.download_button;
        DownloadButtonView downloadButtonView = (DownloadButtonView) view.findViewById(i);
        if (downloadButtonView != null) {
            i = R.id.guide_content_end;
            Guideline guideline = (Guideline) view.findViewById(i);
            if (guideline != null) {
                i = R.id.guide_content_top;
                Guideline guideline2 = (Guideline) view.findViewById(i);
                if (guideline2 != null) {
                    i = R.id.subtitle;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new YourEpisodesHeaderContentBinding((ConstraintLayout) view, constraintLayout, downloadButtonView, guideline, guideline2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static YourEpisodesHeaderContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static YourEpisodesHeaderContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.your_episodes_header_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
