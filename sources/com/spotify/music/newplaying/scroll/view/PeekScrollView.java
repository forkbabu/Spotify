package com.spotify.music.newplaying.scroll.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.b;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.m;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.f;

public class PeekScrollView extends ScrollView implements j {
    private int a;
    private int b;
    private ViewGroup c;
    private ViewGroup f;
    private TouchBlockingFrameLayout n;
    private k o;
    private final Set<a> p;
    private g<l> q;
    private g<Boolean> r;

    interface a {
        void a(int i, int i2);
    }

    public PeekScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void b(View view, int i) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i2 = -i;
            if (marginLayoutParams.topMargin != i2) {
                marginLayoutParams.topMargin = i2;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private void c(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view.getId() == C0707R.id.root_container) {
            this.f = (ViewGroup) view;
            this.c = (ViewGroup) view.findViewById(C0707R.id.fullscreen_container);
            this.n = (TouchBlockingFrameLayout) view.findViewById(C0707R.id.touch_blocking_container);
            super.addView(view, i, layoutParams);
        } else if (this.c.getChildCount() == 0) {
            this.c.addView(view, 0, layoutParams);
        } else if (this.n.getChildCount() == 0) {
            this.n.addView(view, 0, layoutParams);
            b(this.n, this.a);
        } else {
            this.f.addView(view, i - 1, layoutParams);
        }
    }

    public void a(a aVar) {
        this.p.add(aVar);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view, -1, layoutParams);
    }

    public g<Boolean> d() {
        return this.r;
    }

    public g<f> e() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.n;
        g<f> Y0 = n50.a(touchBlockingFrameLayout).Y0(BackpressureStrategy.DROP);
        f fVar = new f(touchBlockingFrameLayout);
        m mVar = Functions.f;
        return Y0.z(fVar, mVar, Functions.c).z(Functions.f(), mVar, new g(touchBlockingFrameLayout));
    }

    public void f(a aVar) {
        Set<a> set = this.p;
        aVar.getClass();
        set.remove(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        int i;
        if (this.a == 0) {
            return super.fitSystemWindows(rect);
        }
        if (getFitsSystemWindows()) {
            boolean fitSystemWindows = super.fitSystemWindows(rect);
            if (!fitSystemWindows && (i = rect.bottom) > 0) {
                b(this.n, this.a + i);
            }
            return fitSystemWindows;
        }
        int i2 = rect.bottom;
        if (i2 > 0) {
            b(this.n, this.a + i2);
        }
        return super.fitSystemWindows(rect);
    }

    public g<l> g() {
        return this.q;
    }

    public void h() {
        int min = Math.min(Math.min(this.n.getHeight() - this.a, getHeight() - this.a), this.b);
        ((i) this.o).getClass();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollY", min);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(ta0.d);
        ofInt.start();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        for (a aVar : this.p) {
            aVar.a(i2, i4);
        }
    }

    public void setPeekHeight(int i) {
        MoreObjects.checkArgument(i >= 0, "PeekHeight must be >=0");
        this.a = i;
        b(this.n, i);
    }

    public void setScrollAnimation(k kVar) {
        this.o = kVar;
    }

    public PeekScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new i();
        this.p = new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(C0707R.dimen.tap_to_scroll_distance));
        boolean z = false;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        MoreObjects.checkArgument(dimensionPixelSize >= 0 ? true : z, "PeekHeight must be >=0");
        this.a = dimensionPixelSize;
        LayoutInflater.from(context).inflate(C0707R.layout.peek_scroll_view, this);
        this.q = g.p(new c(this), BackpressureStrategy.LATEST).V(1).r0();
        this.r = g().O(b.a).c0(new c(new a(this))).s().V(1).r0();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c(view, i, layoutParams);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view) {
        c(view, -1, null);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        c(view, i, null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).width = i;
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).height = i2;
        c(view, -1, generateDefaultLayoutParams);
    }
}
