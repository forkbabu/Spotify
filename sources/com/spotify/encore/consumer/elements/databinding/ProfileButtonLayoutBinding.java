package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.quickactions.profile.ProfileButton;

public final class ProfileButtonLayoutBinding {
    private final ProfileButton rootView;

    private ProfileButtonLayoutBinding(ProfileButton profileButton) {
        this.rootView = profileButton;
    }

    public static ProfileButtonLayoutBinding bind(View view) {
        if (view != null) {
            return new ProfileButtonLayoutBinding((ProfileButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ProfileButtonLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProfileButtonLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.profile_button_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ProfileButton getRoot() {
        return this.rootView;
    }
}
