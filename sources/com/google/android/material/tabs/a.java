package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

class a implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ TabLayout.i b;

    a(TabLayout.i iVar, View view) {
        this.b = iVar;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.getVisibility() == 0) {
            TabLayout.i.f(this.b, this.a);
        }
    }
}
