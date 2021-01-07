package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.playbutton.PlayButtonView;

public final class PlayButtonBinding {
    public final PlayButtonView headerPlayButton;
    private final PlayButtonView rootView;

    private PlayButtonBinding(PlayButtonView playButtonView, PlayButtonView playButtonView2) {
        this.rootView = playButtonView;
        this.headerPlayButton = playButtonView2;
    }

    public static PlayButtonBinding bind(View view) {
        if (view != null) {
            PlayButtonView playButtonView = (PlayButtonView) view;
            return new PlayButtonBinding(playButtonView, playButtonView);
        }
        throw new NullPointerException("rootView");
    }

    public static PlayButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlayButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.play_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public PlayButtonView getRoot() {
        return this.rootView;
    }
}
