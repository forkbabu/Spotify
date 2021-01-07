package com.spotify.music.features.findfriends.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PulldownContainer extends LinearLayout implements i4 {
    private View a;
    private h4 b;
    private int c;
    private int f;
    private int n;
    private ValueAnimator o;

    public PulldownContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h4 h4Var = new h4(this);
        this.b = h4Var;
        h4Var.j(true);
    }

    private void a(int i, int i2) {
        b();
        if (this.a.getTop() != i) {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.a.getTop(), i);
            this.o = ofInt;
            ofInt.addUpdateListener(new a(this));
            this.o.setDuration((long) i2);
            this.o.start();
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
    }

    private void d(int i) {
        int i2;
        View view = null;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            view = getChildAt(i3);
            view.offsetTopAndBottom(i);
        }
        if (!(view == null || view.getPaddingBottom() == (i2 = this.n))) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2);
        }
    }

    public /* synthetic */ void c(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.a.getTop();
        this.n = this.a.getTop() + this.f;
        d(intValue);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.a;
        if (view == null) {
            view = getChildAt(0);
        }
        this.a = view;
        int i5 = this.f;
        if (i5 == 0) {
            i5 = view.getMeasuredHeight();
        }
        this.f = i5;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        int i6 = marginLayoutParams.topMargin;
        int i7 = this.f;
        if (i6 != (-i7)) {
            marginLayoutParams.topMargin = -i7;
            this.a.setLayoutParams(marginLayoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        d((this.n - this.f) - this.a.getTop());
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
            if (((LinearLayoutManager) layoutManager).U1() == 0) {
                this.c = i2;
                int i5 = i2 - iArr[1];
                if (i2 > 0) {
                    i4 = Math.min(i5, this.a.getTop() + this.f);
                } else {
                    i4 = Math.max(i5, this.a.getTop());
                }
                iArr[1] = iArr[1] + i4;
                d(-i4);
                this.n = this.a.getTop() + this.f;
            }
        }
        if (i2 != iArr[1]) {
            this.b.c(i, i2, iArr, null, i3);
        }
        if (i3 != 1 || iArr[1] != 0) {
            return;
        }
        if ((i2 < 0 && this.a.getTop() == 0) || (i2 > 0 && this.a.getTop() == (-this.f))) {
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
        this.b.k(i, i2);
        return true;
    }

    @Override // defpackage.i4
    public void onStopNestedScroll(View view, int i) {
        this.b.l(i);
        int i2 = this.f;
        float f2 = ((float) (-this.a.getTop())) / ((float) i2);
        int i3 = this.c;
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

    public PulldownContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h4 h4Var = new h4(this);
        this.b = h4Var;
        h4Var.j(true);
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onStopNestedScroll(View view) {
        this.b.l(0);
    }
}