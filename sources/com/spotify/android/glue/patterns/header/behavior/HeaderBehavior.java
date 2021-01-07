package com.spotify.android.glue.patterns.header.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.d;
import com.spotify.android.glue.patterns.header.headers.a;

public abstract class HeaderBehavior<T extends View & com.spotify.android.glue.patterns.header.headers.a> extends DraggableViewOffsetBehavior<T> {
    private final d h = new d();
    private ValueAnimator i;
    int j;
    private float k = -2.14748365E9f;
    private int l;
    private boolean m;

    class a implements d.b {
        final /* synthetic */ CoordinatorLayout a;
        final /* synthetic */ View b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.a = coordinatorLayout;
            this.b = view;
        }
    }

    public HeaderBehavior() {
    }

    private void m(CoordinatorLayout coordinatorLayout, T t, int i2) {
        t.setAlpha(1.0f);
        T t2 = t;
        int min = Math.min(-i2, t2.getTotalScrollRange());
        float totalScrollRange = ((float) min) / ((float) t2.getTotalScrollRange());
        if (!c(coordinatorLayout)) {
            w(coordinatorLayout, totalScrollRange);
            ((com.spotify.android.glue.patterns.header.headers.v2.a) t).a(min, totalScrollRange);
        }
    }

    private void n() {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
    }

    private boolean r(CoordinatorLayout coordinatorLayout, T t, int i2) {
        int h2 = h(coordinatorLayout, t);
        int i3 = i(coordinatorLayout, t);
        int p = p();
        return p < h2 || p > i3 || p == nud.d(h2, i3, i2);
    }

    private int t(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) {
        int d = nud.d(i3, i4, i2);
        if (c(coordinatorLayout)) {
            this.m = d > 0;
        }
        if (r(coordinatorLayout, t, i2)) {
            return 0;
        }
        int p = p();
        super.d(d);
        m(coordinatorLayout, t, d);
        coordinatorLayout.f(t);
        return p - d;
    }

    /* access modifiers changed from: private */
    public void u(CoordinatorLayout coordinatorLayout, T t, int i2) {
        t(coordinatorLayout, t, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public boolean e(CoordinatorLayout coordinatorLayout, T t) {
        return !q() && f.a(coordinatorLayout).b();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public boolean g(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, float f) {
        return this.h.b(t, p(), i2, i3, f, new a(coordinatorLayout, t));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public int h(CoordinatorLayout coordinatorLayout, T t) {
        if (c(coordinatorLayout)) {
            return 0;
        }
        return (-t.getTotalScrollRange()) - this.j;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public int i(CoordinatorLayout coordinatorLayout, T t) {
        g gVar = this.a;
        if (gVar == null) {
            return 0;
        }
        gVar.d(-t.getTotalScrollRange(), 0);
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public int j(CoordinatorLayout coordinatorLayout, T t) {
        if (c(coordinatorLayout)) {
            return t.getMeasuredHeight() - coordinatorLayout.getMeasuredHeight();
        }
        return t.getTotalScrollRange() + this.j;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public int k(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) {
        return t(coordinatorLayout, t, p() - i2, i3, i4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.spotify.android.glue.patterns.header.behavior.HeaderBehavior<T extends android.view.View & com.spotify.android.glue.patterns.header.headers.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public void o(CoordinatorLayout coordinatorLayout, com.spotify.android.glue.patterns.header.headers.a aVar, boolean z) {
        if (p() > (-aVar.getTotalScrollRange()) - this.j) {
            if (z) {
                n();
                ValueAnimator valueAnimator = new ValueAnimator();
                this.i = valueAnimator;
                valueAnimator.setInterpolator(b.a);
                this.i.addUpdateListener(new a(this, coordinatorLayout, (View) aVar));
                this.i.setIntValues(p(), -aVar.getTotalScrollRange());
                this.i.start();
                return;
            }
            n();
            u(coordinatorLayout, (View) aVar, (-aVar.getTotalScrollRange()) - this.j);
        }
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, T t, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h.c();
        }
        return super.onInterceptTouchEvent(coordinatorLayout, t, motionEvent);
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i2) {
        super.onLayoutChild(coordinatorLayout, t, i2);
        T t2 = t;
        this.a.d(-t2.getTotalScrollRange(), 0);
        if (this.k != -2.14748365E9f) {
            this.a.c((int) (((float) ((-t2.getTotalScrollRange()) - this.j)) * this.k));
        }
        m(coordinatorLayout, t, p());
        this.l = t2.getTotalScrollRange();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
        View B = ((GlueHeaderLayout) coordinatorLayout).B();
        if (B != null) {
            coordinatorLayout.r(B, i2, i3, z42.B(), i5);
            int measuredHeight = B.getMeasuredHeight() / 2;
            if (t instanceof com.spotify.android.glue.patterns.prettylist.a) {
                ((com.spotify.android.glue.patterns.prettylist.a) t).setCoordinatorAccessoryOffset(measuredHeight);
            }
        }
        if (B != null) {
            this.j = B.getMeasuredHeight() / 2;
        } else {
            if (t instanceof com.spotify.android.glue.patterns.prettylist.a) {
                ((com.spotify.android.glue.patterns.prettylist.a) t).setCoordinatorAccessoryOffset(0);
            }
            this.j = 0;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
        if (i3 >= 0 || !q()) {
            iArr[1] = k(coordinatorLayout, t, i3, h(coordinatorLayout, t), i(coordinatorLayout, t));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6) {
        if (i5 < 0) {
            k(coordinatorLayout, t, i5, h(coordinatorLayout, t), i(coordinatorLayout, t));
        }
        boolean z = false;
        boolean z2 = i5 < 0;
        boolean z3 = i5 > 0;
        boolean r = r(coordinatorLayout, t, p() - i5);
        if ((z2 && r) || z3) {
            q4.U(view, 1);
        }
        if (c(coordinatorLayout)) {
            if (i5 >= 0) {
                z = true;
            }
            this.m = z;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            super.onRestoreInstanceState(coordinatorLayout, t, cVar.getSuperState());
            this.m = cVar.c();
            this.k = cVar.b();
            return;
        }
        this.k = -2.14748365E9f;
        super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
        if (!c(coordinatorLayout)) {
            this.m = q();
        }
        return c.a(super.onSaveInstanceState(coordinatorLayout, t), p(), (float) t.getTotalScrollRange(), this.m);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
        this.k = -2.14748365E9f;
        return (i2 & 2) != 0;
    }

    public int p() {
        g gVar = this.a;
        if (gVar != null) {
            return gVar.a();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean q() {
        return p() <= (-this.l) - this.j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void s(CoordinatorLayout coordinatorLayout, View view, ValueAnimator valueAnimator) {
        u(coordinatorLayout, view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.android.glue.patterns.header.behavior.HeaderBehavior<T extends android.view.View & com.spotify.android.glue.patterns.header.headers.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public void v(CoordinatorLayout coordinatorLayout, com.spotify.android.glue.patterns.header.headers.a aVar, boolean z) {
        if (p() < 0) {
            if (z) {
                n();
                ValueAnimator valueAnimator = new ValueAnimator();
                this.i = valueAnimator;
                valueAnimator.setInterpolator(b.a);
                this.i.addUpdateListener(new a(this, coordinatorLayout, (View) aVar));
                this.i.setIntValues(p(), 0);
                this.i.start();
                return;
            }
            n();
            u(coordinatorLayout, (View) aVar, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void w(CoordinatorLayout coordinatorLayout, float f) {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
