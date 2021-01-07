package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    final Rect c = new Rect();
    final Rect d = new Rect();
    private int e = 0;
    private int f;

    public HeaderScrollingViewBehavior() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View d2 = d(coordinatorLayout.j(view));
        if (d2 != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, d2.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((d2.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
            b5 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && q4.m(coordinatorLayout) && !q4.m(view)) {
                rect.left = lastWindowInsets.h() + rect.left;
                rect.right -= lastWindowInsets.i();
            }
            Rect rect2 = this.d;
            int i2 = eVar.c;
            int i3 = i2 == 0 ? 8388659 : i2;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 17) {
                Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
            } else {
                Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2);
            }
            int e2 = e(d2);
            view.layout(rect2.left, rect2.top - e2, rect2.right, rect2.bottom - e2);
            this.e = rect2.top - d2.getBottom();
            return;
        }
        coordinatorLayout.q(view, i);
        this.e = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View d(List<View> list);

    /* access modifiers changed from: package-private */
    public final int e(View view) {
        if (this.f == 0) {
            return 0;
        }
        float f2 = f(view);
        int i = this.f;
        return e2.f((int) (f2 * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    public float f(View view) {
        return 1.0f;
    }

    public final int g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public int h(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.e;
    }

    public final void j(int i) {
        this.f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View d2;
        b5 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (d2 = d(coordinatorLayout.j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (q4.m(d2) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size = lastWindowInsets.g() + lastWindowInsets.j() + size;
        }
        coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + h(d2)) - d2.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
