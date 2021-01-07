package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;

public final class AccessoryButtonBinding {
    private final ImageButton rootView;

    private AccessoryButtonBinding(ImageButton imageButton) {
        this.rootView = imageButton;
    }

    public static AccessoryButtonBinding bind(View view) {
        if (view != null) {
            return new AccessoryButtonBinding((ImageButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public static AccessoryButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AccessoryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.accessory_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ImageButton getRoot() {
        return this.rootView;
    }
}
