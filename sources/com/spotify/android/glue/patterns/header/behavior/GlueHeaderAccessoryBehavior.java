package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.a;
import java.util.Iterator;

public class GlueHeaderAccessoryBehavior extends ViewOffsetBehavior<View> {
    public GlueHeaderAccessoryBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof a;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        CoordinatorLayout.Behavior<?> b = ViewOffsetBehavior.b(view2);
        if (!(b instanceof HeaderBehavior)) {
            return false;
        }
        super.d(view2.getHeight() + ((HeaderBehavior) b).p());
        return true;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        int paddingTop = coordinatorLayout.getPaddingTop();
        int measuredWidth = (coordinatorLayout.getMeasuredWidth() / 2) - (view.getMeasuredWidth() / 2);
        view.layout(measuredWidth, paddingTop - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + measuredWidth, (view.getMeasuredHeight() / 2) + paddingTop);
        a(view);
        Iterator<View> it = coordinatorLayout.j(view).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (next instanceof a) {
                this.a.d(next.getMeasuredHeight() - ((a) next).getTotalScrollRange(), Integer.MAX_VALUE);
                break;
            }
        }
        View C = ((GlueHeaderLayout) coordinatorLayout).C(true);
        if (C != null) {
            CoordinatorLayout.Behavior<?> b = ViewOffsetBehavior.b(C);
            if (b instanceof HeaderBehavior) {
                super.d(C.getHeight() + ((HeaderBehavior) b).p());
            }
        }
        return true;
    }

    public GlueHeaderAccessoryBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
