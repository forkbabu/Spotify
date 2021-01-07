package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    private int a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View a;
        final /* synthetic */ int b;
        final /* synthetic */ fx c;

        a(View view, int i, fx fxVar) {
            this.a = view;
            this.b = i;
            this.c = fxVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                fx fxVar = this.c;
                expandableBehavior.c((View) fxVar, this.a, fxVar.d(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean b(boolean z) {
        if (z) {
            int i = this.a;
            return i == 0 || i == 2;
        } else if (this.a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean c(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        fx fxVar = (fx) view2;
        if (!b(fxVar.d())) {
            return false;
        }
        this.a = fxVar.d() ? 1 : 2;
        return c((View) fxVar, view, fxVar.d(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        fx fxVar;
        if (!q4.w(view)) {
            List<View> j = coordinatorLayout.j(view);
            int size = j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    fxVar = null;
                    break;
                }
                View view2 = j.get(i2);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    fxVar = (fx) view2;
                    break;
                }
                i2++;
            }
            if (fxVar != null && b(fxVar.d())) {
                int i3 = fxVar.d() ? 1 : 2;
                this.a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, fxVar));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
