package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.quickactions.hide.HideButton;

public final class HideButtonLayoutBinding {
    private final HideButton rootView;

    private HideButtonLayoutBinding(HideButton hideButton) {
        this.rootView = hideButton;
    }

    public static HideButtonLayoutBinding bind(View view) {
        if (view != null) {
            return new HideButtonLayoutBinding((HideButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public static HideButtonLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HideButtonLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.hide_button_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public HideButton getRoot() {
        return this.rootView;
    }
}
