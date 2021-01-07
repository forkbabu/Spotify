package com.spotify.mobile.android.ui.view;

import android.view.View;
import android.view.ViewGroup;

class z implements ViewGroup.OnHierarchyChangeListener {
    z(WindowInsetsFrameLayout windowInsetsFrameLayout) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        q4.F(view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
    }
}
