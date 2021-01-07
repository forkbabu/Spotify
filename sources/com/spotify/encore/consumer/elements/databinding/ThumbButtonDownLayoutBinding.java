package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.thumb.ThumbButtonView;

public final class ThumbButtonDownLayoutBinding {
    private final ThumbButtonView rootView;

    private ThumbButtonDownLayoutBinding(ThumbButtonView thumbButtonView) {
        this.rootView = thumbButtonView;
    }

    public static ThumbButtonDownLayoutBinding bind(View view) {
        if (view != null) {
            return new ThumbButtonDownLayoutBinding((ThumbButtonView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ThumbButtonDownLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ThumbButtonDownLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.thumb_button_down_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ThumbButtonView getRoot() {
        return this.rootView;
    }
}
