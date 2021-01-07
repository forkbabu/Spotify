package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.heart.HeartButton;

public final class HeartButtonLayoutBinding {
    private final HeartButton rootView;

    private HeartButtonLayoutBinding(HeartButton heartButton) {
        this.rootView = heartButton;
    }

    public static HeartButtonLayoutBinding bind(View view) {
        if (view != null) {
            return new HeartButtonLayoutBinding((HeartButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public static HeartButtonLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeartButtonLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.heart_button_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public HeartButton getRoot() {
        return this.rootView;
    }
}
