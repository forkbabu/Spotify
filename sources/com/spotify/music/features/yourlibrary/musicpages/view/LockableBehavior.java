package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class LockableBehavior extends AppBarLayout.Behavior {
    private boolean r;

    public LockableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void B(boolean z) {
        this.r = z;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return !this.r && super.onStartNestedScroll(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public boolean v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return !this.r && super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
