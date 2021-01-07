package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.headers.a;
import java.util.Iterator;
import java.util.List;

public class GlueScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private View c;

    public GlueScrollingViewBehavior() {
    }

    private static View f(List<View> list) {
        for (View view : list) {
            if (view instanceof a) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int e() {
        View view = this.c;
        if (view != null) {
            return view.getMeasuredHeight() / 2;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public View g() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return (view2 instanceof a) || (((CoordinatorLayout.e) view2.getLayoutParams()).c() instanceof GlueHeaderAccessoryBehavior);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        CoordinatorLayout.Behavior c2 = ((CoordinatorLayout.e) view2.getLayoutParams()).c();
        if (c2 instanceof HeaderBehavior) {
            if (c(coordinatorLayout)) {
                super.d(((HeaderBehavior) c2).p());
                return true;
            }
            super.d(view2.getHeight() + ((HeaderBehavior) c2).p() + e());
        }
        return true;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View f = f(coordinatorLayout.j(view));
        if (c(coordinatorLayout)) {
            View f2 = f(coordinatorLayout.j(view));
            int measuredWidth = f2 != null ? f2.getMeasuredWidth() : 0;
            if (nud.n(coordinatorLayout)) {
                int paddingLeft = coordinatorLayout.getPaddingLeft();
                int paddingTop = coordinatorLayout.getPaddingTop();
                view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
            } else {
                int paddingLeft2 = coordinatorLayout.getPaddingLeft() + measuredWidth;
                int paddingTop2 = coordinatorLayout.getPaddingTop();
                view.layout(paddingLeft2, paddingTop2, view.getMeasuredWidth() + paddingLeft2, view.getMeasuredHeight() + paddingTop2);
            }
            a(view);
            CoordinatorLayout.Behavior<?> b = ViewOffsetBehavior.b(f);
            if (b instanceof HeaderBehavior) {
                super.d(((HeaderBehavior) b).p());
            }
            return true;
        }
        super.onLayoutChild(coordinatorLayout, view, i);
        if (f != null) {
            CoordinatorLayout.Behavior<?> b2 = ViewOffsetBehavior.b(f);
            if (b2 instanceof HeaderBehavior) {
                super.d(f.getHeight() + ((HeaderBehavior) b2).p() + e());
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View view2;
        List<View> j = coordinatorLayout.j(view);
        Iterator<View> it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                view2 = null;
                break;
            }
            view2 = it.next();
            if (((CoordinatorLayout.e) view2.getLayoutParams()).c() instanceof GlueHeaderAccessoryBehavior) {
                break;
            }
        }
        this.c = view2;
        int i5 = 0;
        if (c(coordinatorLayout)) {
            View f = f(coordinatorLayout.j(view));
            if (f != null) {
                i5 = f.getMeasuredWidth();
            }
            view.measure(z42.A(((View.MeasureSpec.getSize(i) - coordinatorLayout.getPaddingLeft()) - coordinatorLayout.getPaddingRight()) - i5), z42.A((View.MeasureSpec.getSize(i3) - coordinatorLayout.getPaddingTop()) - coordinatorLayout.getPaddingBottom()));
            return true;
        }
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || j.isEmpty()) {
            return false;
        }
        View f2 = f(j);
        a aVar = (a) f2;
        if (aVar != null) {
            if (q4.m(f2)) {
                view.setFitsSystemWindows(true);
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec(size - (f2.getMeasuredHeight() - aVar.getTotalScrollRange()), i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    public GlueScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
