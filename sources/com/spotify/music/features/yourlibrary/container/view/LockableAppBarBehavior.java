package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.goldenpath.a;

public class LockableAppBarBehavior extends AppBarLayout.Behavior {
    private boolean r;
    private boolean[] s;
    private int t;

    public LockableAppBarBehavior() {
        this.s = new boolean[2];
    }

    public void B(boolean z) {
        this.r = z;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr, i3);
        this.t = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if ((view2 instanceof RecyclerView) && i2 == 0) {
            ((RecyclerView) view2).r(i5);
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view2, i, i2, i3, i4, i5);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public void r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        this.t = i2;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public boolean v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        boolean z = !this.r && super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        this.s[i2] = z;
        return z;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: w */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        boolean[] zArr = this.s;
        boolean z = false;
        zArr[i] = false;
        if (!zArr[0] && !zArr[1]) {
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            float f = ((float) (-(appBarLayout.getTop() - a.f(appBarLayout.getContext())))) / ((float) totalScrollRange);
            if (f != 0.0f && f != 1.0f) {
                int i2 = this.t;
                if (i2 == 0) {
                    if (f < 0.5f) {
                        z = true;
                    }
                    appBarLayout.i(z, true);
                } else if (f < 0.2f) {
                    appBarLayout.i(true, true);
                } else if (f > 0.8f) {
                    appBarLayout.i(false, true);
                } else {
                    if (i2 < 0) {
                        z = true;
                    }
                    appBarLayout.i(z, true);
                }
            }
        }
    }

    public LockableAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
