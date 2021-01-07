package com.spotify.encore.consumer.components.podcast.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.spotify.encore.consumer.components.podcast.impl.R;

public final class PlaybackProgressViewBinding {
    public final ImageView checkPlayIcon;
    public final ProgressBar playProgress;
    private final View rootView;

    private PlaybackProgressViewBinding(View view, ImageView imageView, ProgressBar progressBar) {
        this.rootView = view;
        this.checkPlayIcon = imageView;
        this.playProgress = progressBar;
    }

    public static PlaybackProgressViewBinding bind(View view) {
        int i = R.id.check_play_icon;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.play_progress;
            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
            if (progressBar != null) {
                return new PlaybackProgressViewBinding(view, imageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PlaybackProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.playback_progress_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
