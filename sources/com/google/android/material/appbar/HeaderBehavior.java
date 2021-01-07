package com.google.android.material.appbar;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* access modifiers changed from: package-private */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private Runnable c;
    OverScroller d;
    private boolean e;
    private int f = -1;
    private int g;
    private int h = -1;
    private VelocityTracker i;

    /* JADX WARN: Field signature parse error: b */
    private class a implements Runnable {
        private final CoordinatorLayout a;
        private final View b;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.google.android.material.appbar.HeaderBehavior */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.google.android.material.appbar.HeaderBehavior */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.b != null && (overScroller = HeaderBehavior.this.d) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.j(this.a, this.b, headerBehavior.d.getCurrY());
                    View view = this.b;
                    int i = q4.g;
                    int i2 = Build.VERSION.SDK_INT;
                    view.postOnAnimation(this);
                    return;
                }
                HeaderBehavior.this.h(this.a, this.b);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* access modifiers changed from: package-private */
    public boolean d(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int e(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int f(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return a();
    }

    /* access modifiers changed from: package-private */
    public void h(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    public final int i(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return k(coordinatorLayout, v, g() - i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public int j(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return k(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public int k(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        int f2;
        int a2 = a();
        if (i3 == 0 || a2 < i3 || a2 > i4 || a2 == (f2 = e2.f(i2, i3, i4))) {
            return 0;
        }
        c(f2);
        return a2 - f2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i2 = this.f;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.g) > this.h) {
                this.g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = d(v) && coordinatorLayout.o(v, x, y2);
            this.e = z;
            if (z) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
