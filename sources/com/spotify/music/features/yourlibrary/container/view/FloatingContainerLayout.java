package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.android.goldenpath.a;
import com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior;

public class FloatingContainerLayout extends FrameLayout implements ViewPager.i, ListenableScrollingViewBehavior.a {
    private r a;
    private int b = -1;

    public FloatingContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void d() {
        removeAllViews();
        UnmodifiableListIterator<View> listIterator = ((s) this.a).t(this.b).listIterator();
        while (listIterator.hasNext()) {
            addView(listIterator.next());
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
    }

    @Override // com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior.a
    public void b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int d = a.d(getContext());
        setPadding(0, 0, 0, (view2.getBottom() - d) - ((ViewGroup) view2).getChildAt(0).getMinimumHeight());
    }

    public void c() {
        d();
        animate().alpha(1.0f).setDuration(250);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void f(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        this.b = i;
        animate().alpha(0.0f).setDuration(250).withEndAction(new b(this));
    }

    public void setupWithFloatingViewProvider(r rVar) {
        this.a = rVar;
    }

    public void setupWithViewPager(ViewPager viewPager) {
        viewPager.setOnPageChangeListener(this);
        this.b = viewPager.getCurrentItem();
        d();
    }

    public FloatingContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
