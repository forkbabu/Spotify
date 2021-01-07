package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

public class GlueFastScrollerBehavior extends ViewOffsetBehavior<RecyclerViewFastScroller> {
    public GlueFastScrollerBehavior() {
    }

    private static RecyclerView e(CoordinatorLayout coordinatorLayout, RecyclerViewFastScroller recyclerViewFastScroller) {
        RecyclerView recyclerView = null;
        for (View view : coordinatorLayout.j(recyclerViewFastScroller)) {
            if (view instanceof RecyclerView) {
                recyclerView = (RecyclerView) view;
            }
        }
        return recyclerView;
    }

    public boolean f(View view) {
        return view instanceof RecyclerView;
    }

    public boolean g(RecyclerViewFastScroller recyclerViewFastScroller, View view) {
        recyclerViewFastScroller.offsetTopAndBottom(view.getTop() - recyclerViewFastScroller.getTop());
        recyclerViewFastScroller.k();
        return true;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, RecyclerViewFastScroller recyclerViewFastScroller) {
        RecyclerView e = e(coordinatorLayout, recyclerViewFastScroller);
        if (e == null) {
            return false;
        }
        recyclerViewFastScroller.measure(z42.B(), z42.A(e.getMeasuredHeight()));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        return f(view2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return g((RecyclerViewFastScroller) view, view2);
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        super.onLayoutChild(coordinatorLayout, recyclerViewFastScroller, i);
        RecyclerView e = e(coordinatorLayout, recyclerViewFastScroller);
        if (e == null) {
            return false;
        }
        if (nud.n(coordinatorLayout)) {
            recyclerViewFastScroller.layout(e.getLeft(), e.getTop(), recyclerViewFastScroller.getMeasuredWidth() + e.getLeft(), e.getBottom());
        } else {
            recyclerViewFastScroller.layout(e.getRight() - recyclerViewFastScroller.getMeasuredWidth(), e.getTop(), e.getRight(), e.getBottom());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return h(coordinatorLayout, (RecyclerViewFastScroller) view);
    }

    public GlueFastScrollerBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
