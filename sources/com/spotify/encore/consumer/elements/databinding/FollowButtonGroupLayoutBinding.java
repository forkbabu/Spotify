package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.follow.FollowButtonView;

public final class FollowButtonGroupLayoutBinding {
    public final FollowButtonView followButtonGroupButton;
    public final ProgressBar followButtonGroupProgress;
    private final ConstraintLayout rootView;

    private FollowButtonGroupLayoutBinding(ConstraintLayout constraintLayout, FollowButtonView followButtonView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.followButtonGroupButton = followButtonView;
        this.followButtonGroupProgress = progressBar;
    }

    public static FollowButtonGroupLayoutBinding bind(View view) {
        int i = R.id.follow_button_group_button;
        FollowButtonView followButtonView = (FollowButtonView) view.findViewById(i);
        if (followButtonView != null) {
            i = R.id.follow_button_group_progress;
            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
            if (progressBar != null) {
                return new FollowButtonGroupLayoutBinding((ConstraintLayout) view, followButtonView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FollowButtonGroupLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FollowButtonGroupLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.follow_button_group_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
