package com.spotify.encore.consumer.components.podcast.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header.EpisodeRowHeaderView;

public final class ContinueListeningEpisodeRowBinding {
    public final View gap;
    public final EpisodeRowHeaderView header;
    public final ImageView primaryActionButton;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowRoot;
    public final ConstraintLayout topContainer;

    private ContinueListeningEpisodeRowBinding(ConstraintLayout constraintLayout, View view, EpisodeRowHeaderView episodeRowHeaderView, ImageView imageView, ProgressBar progressBar, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.gap = view;
        this.header = episodeRowHeaderView;
        this.primaryActionButton = imageView;
        this.progress = progressBar;
        this.rowRoot = constraintLayout2;
        this.topContainer = constraintLayout3;
    }

    public static ContinueListeningEpisodeRowBinding bind(View view) {
        int i = R.id.gap;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = R.id.header;
            EpisodeRowHeaderView episodeRowHeaderView = (EpisodeRowHeaderView) view.findViewById(i);
            if (episodeRowHeaderView != null) {
                i = R.id.primary_action_button;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                    if (progressBar != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.top_container;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(i);
                        if (constraintLayout2 != null) {
                            return new ContinueListeningEpisodeRowBinding(constraintLayout, findViewById, episodeRowHeaderView, imageView, progressBar, constraintLayout, constraintLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ContinueListeningEpisodeRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ContinueListeningEpisodeRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.continue_listening_episode_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
