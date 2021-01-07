package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.backbutton.BackButtonView;

public final class HeaderMotionLayoutBinding {
    public final AppBarLayout appBarLayout;
    public final BackButtonView backButton;
    public final MotionLayout motionContainer;
    private final AppBarLayout rootView;
    public final Toolbar toolbar;

    private HeaderMotionLayoutBinding(AppBarLayout appBarLayout2, AppBarLayout appBarLayout3, BackButtonView backButtonView, MotionLayout motionLayout, Toolbar toolbar2) {
        this.rootView = appBarLayout2;
        this.appBarLayout = appBarLayout3;
        this.backButton = backButtonView;
        this.motionContainer = motionLayout;
        this.toolbar = toolbar2;
    }

    public static HeaderMotionLayoutBinding bind(View view) {
        AppBarLayout appBarLayout2 = (AppBarLayout) view;
        int i = R.id.back_button;
        BackButtonView backButtonView = (BackButtonView) view.findViewById(i);
        if (backButtonView != null) {
            i = R.id.motion_container;
            MotionLayout motionLayout = (MotionLayout) view.findViewById(i);
            if (motionLayout != null) {
                i = R.id.toolbar;
                Toolbar toolbar2 = (Toolbar) view.findViewById(i);
                if (toolbar2 != null) {
                    return new HeaderMotionLayoutBinding((AppBarLayout) view, appBarLayout2, backButtonView, motionLayout, toolbar2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HeaderMotionLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeaderMotionLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.header_motion_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public AppBarLayout getRoot() {
        return this.rootView;
    }
}
