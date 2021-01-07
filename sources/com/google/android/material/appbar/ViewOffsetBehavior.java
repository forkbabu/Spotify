package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* access modifiers changed from: package-private */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private f a;
    private int b = 0;

    public ViewOffsetBehavior() {
    }

    public int a() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.q(v, i);
    }

    public boolean c(int i) {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.e(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new f(v);
        }
        this.a.d();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.e(i2);
        this.b = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
