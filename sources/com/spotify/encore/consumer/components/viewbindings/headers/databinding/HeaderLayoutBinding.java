package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.backbutton.BackButtonView;

public final class HeaderLayoutBinding {
    public final AppBarLayout appBarLayout;
    public final BackButtonView backButton;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ViewStub contentContainer;
    private final AppBarLayout rootView;
    public final Toolbar toolbar;

    private HeaderLayoutBinding(AppBarLayout appBarLayout2, AppBarLayout appBarLayout3, BackButtonView backButtonView, CollapsingToolbarLayout collapsingToolbarLayout, ViewStub viewStub, Toolbar toolbar2) {
        this.rootView = appBarLayout2;
        this.appBarLayout = appBarLayout3;
        this.backButton = backButtonView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.contentContainer = viewStub;
        this.toolbar = toolbar2;
    }

    public static HeaderLayoutBinding bind(View view) {
        AppBarLayout appBarLayout2 = (AppBarLayout) view;
        int i = R.id.back_button;
        BackButtonView backButtonView = (BackButtonView) view.findViewById(i);
        if (backButtonView != null) {
            i = R.id.collapsing_toolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(i);
            if (collapsingToolbarLayout != null) {
                i = R.id.content_container;
                ViewStub viewStub = (ViewStub) view.findViewById(i);
                if (viewStub != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar2 = (Toolbar) view.findViewById(i);
                    if (toolbar2 != null) {
                        return new HeaderLayoutBinding((AppBarLayout) view, appBarLayout2, backButtonView, collapsingToolbarLayout, viewStub, toolbar2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static HeaderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HeaderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.header_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public AppBarLayout getRoot() {
        return this.rootView;
    }
}
