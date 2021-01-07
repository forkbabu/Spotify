package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.quickactions.ban.BanButton;

public final class BanButtonLayoutBinding {
    private final BanButton rootView;

    private BanButtonLayoutBinding(BanButton banButton) {
        this.rootView = banButton;
    }

    public static BanButtonLayoutBinding bind(View view) {
        if (view != null) {
            return new BanButtonLayoutBinding((BanButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public static BanButtonLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BanButtonLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ban_button_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public BanButton getRoot() {
        return this.rootView;
    }
}
