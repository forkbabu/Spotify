package com.spotify.music.features.yourlibrary.musicpages.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.Assertion;

public class PulldownContainer extends FrameLayout implements i4 {
    private View a;
    private RecyclerView b;
    private h4 c;
    private int f;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private ValueAnimator r;

    public PulldownContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h4 h4Var = new h4(this);
        this.c = h4Var;
        h4Var.j(true);
    }

    private void a(int i, int i2) {
        b();
        if (this.a.getTop() != i) {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.a.getTop(), i);
            this.r = ofInt;
            ofInt.addUpdateListener(new z(this));
            this.r.setDuration((long) i2);
            this.r.start();
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
    }

    private void f(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).offsetTopAndBottom(i);
        }
        post(new y(this));
    }

    /* access modifiers changed from: private */
    public void g() {
        int i;
        int childCount = getChildCount();
        if (childCount != 0 && this.p != (i = this.o)) {
            this.p = i;
            View childAt = getChildAt(childCount - 1);
            childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), this.o);
        }
    }

    public void c(int i) {
        a(0, i);
    }

    public /* synthetic */ void d(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.a.getTop();
        this.o = this.a.getTop() + this.n;
        f(intValue);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a;
        if (view == null) {
            view = getChildAt(0);
        }
        this.a = view;
        f((this.o - this.n) - view.getTop());
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.a;
        if (view == null) {
            view = getChildAt(0);
        }
        this.a = view;
        int i3 = this.n;
        if (i3 == 0) {
            i3 = view.getMeasuredHeight();
        }
        this.n = i3;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        int i4 = marginLayoutParams.topMargin;
        int i5 = this.n;
        if (i4 != (-i5)) {
            marginLayoutParams.topMargin = -i5;
            this.a.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.i4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        b();
        if (view instanceof RecyclerView) {
            RecyclerView.m layoutManager = ((RecyclerView) view).getLayoutManager();
            layoutManager.getClass();
            if (((LinearLayoutManager) layoutManager).U1() == 0 && !this.q) {
                this.f = i2;
                int i5 = i2 - iArr[1];
                if (i2 > 0) {
                    i4 = Math.min(i5, this.a.getTop() + this.n);
                } else {
                    i4 = Math.max(i5, this.a.getTop());
                }
                iArr[1] = iArr[1] + i4;
                f(-i4);
                this.o = this.a.getTop() + this.n;
            }
        }
        if (i2 != iArr[1]) {
            this.c.c(i, i2, iArr, null, i3);
        }
        if (i3 != 1 || iArr[1] != 0) {
            return;
        }
        if ((i2 < 0 && this.a.getTop() == 0) || (i2 > 0 && this.a.getTop() == (-this.n))) {
            q4.U(view, 1);
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.i4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onNestedScrollAccepted(View view, View view2, int i) {
    }

    @Override // defpackage.i4
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return false;
    }

    @Override // defpackage.i4
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        b();
        this.c.k(i, i2);
        return true;
    }

    @Override // defpackage.i4
    public void onStopNestedScroll(View view, int i) {
        this.c.l(i);
        int i2 = this.n;
        float f2 = ((float) (-this.a.getTop())) / ((float) i2);
        int i3 = this.f;
        boolean z = true;
        if (i3 != 0 ? f2 >= 0.2f && (f2 > 0.8f || i3 >= 0) : f2 >= 0.5f) {
            z = false;
        }
        if (!z) {
            f2 = 1.0f - f2;
        }
        int i4 = (int) (f2 * 200.0f);
        if (z) {
            a(0, i4);
        } else {
            a(-i2, i4);
        }
    }

    public void setPulldownLock(boolean z) {
        this.q = z;
        if (!z) {
            if (this.b == null) {
                int i = 1;
                while (true) {
                    if (i >= getChildCount()) {
                        Assertion.g("RecyclerView was not found!");
                        break;
                    }
                    View childAt = getChildAt(i);
                    if (childAt instanceof RecyclerView) {
                        this.b = (RecyclerView) childAt;
                        break;
                    }
                    i++;
                }
            }
            RecyclerView.m layoutManager = this.b.getLayoutManager();
            layoutManager.getClass();
            if (((LinearLayoutManager) layoutManager).U1() != 0) {
                a(-this.n, 0);
            }
            this.o = this.a.getTop() + this.n;
            g();
        }
    }

    public PulldownContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h4 h4Var = new h4(this);
        this.c = h4Var;
        h4Var.j(true);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onStopNestedScroll(View view) {
        this.c.l(0);
    }
}
