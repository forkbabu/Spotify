package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;

public class PremiumPageSettingsBehavior extends CoordinatorLayout.Behavior<View> {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (view2 instanceof RecyclerView) {
            int computeVerticalScrollOffset = ((RecyclerView) view2).computeVerticalScrollOffset();
            int l = (nud.l(view2.getContext(), C0707R.attr.actionBarSize) / 2) + a.d(view2.getContext());
            view.setAlpha(1.0f - (((float) Math.min(computeVerticalScrollOffset, l)) / ((float) l)));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return view3 instanceof RecyclerView;
    }
}
