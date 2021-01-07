package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adjust.sdk.Constants;

/* access modifiers changed from: package-private */
public abstract class DraggableViewOffsetBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private boolean c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    public DraggableViewOffsetBehavior() {
    }

    private void f() {
        this.c = false;
        this.d = -1;
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(CoordinatorLayout coordinatorLayout, V v) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean g(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f2);

    /* access modifiers changed from: protected */
    public int h(CoordinatorLayout coordinatorLayout, V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: protected */
    public int i(CoordinatorLayout coordinatorLayout, V v) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int j(CoordinatorLayout coordinatorLayout, V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: protected */
    public abstract int k(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.c
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L_0x0054
            if (r0 == r2) goto L_0x0050
            if (r0 == r1) goto L_0x002d
            r5 = 3
            if (r0 == r5) goto L_0x0050
            goto L_0x007f
        L_0x002d:
            int r5 = r4.d
            r6 = -1
            if (r5 != r6) goto L_0x0033
            goto L_0x007f
        L_0x0033:
            int r5 = r7.findPointerIndex(r5)
            if (r5 != r6) goto L_0x003a
            goto L_0x007f
        L_0x003a:
            float r5 = r7.getY(r5)
            int r5 = (int) r5
            int r6 = r4.e
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f
            if (r6 <= r0) goto L_0x007f
            r4.c = r2
            r4.e = r5
            goto L_0x007f
        L_0x0050:
            r4.f()
            goto L_0x007f
        L_0x0054:
            r0 = 0
            r4.c = r0
            float r1 = r7.getX()
            int r1 = (int) r1
            float r2 = r7.getY()
            int r2 = (int) r2
            boolean r3 = r4.e(r5, r6)
            if (r3 == 0) goto L_0x007f
            boolean r5 = r5.o(r6, r1, r2)
            if (r5 == 0) goto L_0x007f
            r4.e = r2
            int r5 = r7.getPointerId(r0)
            r4.d = r5
            android.view.VelocityTracker r5 = r4.g
            if (r5 != 0) goto L_0x007f
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.g = r5
        L_0x007f:
            android.view.VelocityTracker r5 = r4.g
            if (r5 == 0) goto L_0x0086
            r5.addMovement(r7)
        L_0x0086:
            boolean r5 = r4.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int y = (int) motionEvent.getY();
            if (!coordinatorLayout.o(v, (int) motionEvent.getX(), y) || !e(coordinatorLayout, v)) {
                return false;
            }
            this.e = y;
            this.d = motionEvent.getPointerId(0);
            if (this.g == null) {
                this.g = VelocityTracker.obtain();
            }
        } else if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                this.g.computeCurrentVelocity(Constants.ONE_SECOND);
                g(coordinatorLayout, v, -j(coordinatorLayout, v), 0, this.g.getYVelocity(this.d));
            }
            f();
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.d);
            if (findPointerIndex == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int i2 = this.e - y2;
            if (!this.c && Math.abs(i2) > (i = this.f)) {
                this.c = true;
                i2 = i2 > 0 ? i2 - i : i2 + i;
            }
            if (this.c) {
                this.e = y2;
                k(coordinatorLayout, v, i2, h(coordinatorLayout, v), i(coordinatorLayout, v));
            }
        } else if (actionMasked == 3) {
            f();
        }
        VelocityTracker velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return true;
    }

    public DraggableViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
