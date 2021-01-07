package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.u;

public class LegacyHeaderBehavior extends HeaderBehavior<PrettyHeaderView> {
    private float n = -1.0f;

    public LegacyHeaderBehavior() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.android.glue.patterns.header.behavior.HeaderBehavior, com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public boolean e(CoordinatorLayout coordinatorLayout, View view) {
        return !c(coordinatorLayout) && super.e(coordinatorLayout, (PrettyHeaderView) view);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.HeaderBehavior, com.spotify.android.glue.patterns.header.behavior.DraggableViewOffsetBehavior
    public int i(CoordinatorLayout coordinatorLayout, View view) {
        PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
        if (c(coordinatorLayout)) {
            return 0;
        }
        super.i(coordinatorLayout, prettyHeaderView);
        return 0;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.HeaderBehavior, com.spotify.android.glue.patterns.header.behavior.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
        if (c(coordinatorLayout)) {
            if (nud.n(coordinatorLayout)) {
                int measuredWidth = (coordinatorLayout.getMeasuredWidth() - q4.q(prettyHeaderView)) - prettyHeaderView.getMeasuredWidth();
                int paddingTop = coordinatorLayout.getPaddingTop();
                prettyHeaderView.layout(measuredWidth, paddingTop, prettyHeaderView.getMeasuredWidth() + measuredWidth, prettyHeaderView.getMeasuredHeight() + paddingTop);
            } else {
                int r = q4.r(prettyHeaderView);
                int paddingTop2 = coordinatorLayout.getPaddingTop();
                prettyHeaderView.layout(r, paddingTop2, prettyHeaderView.getMeasuredWidth() + r, prettyHeaderView.getMeasuredHeight() + paddingTop2);
            }
            if (this.a == null) {
                this.a = new g(prettyHeaderView);
            }
            this.a.b();
            int i2 = this.b;
            if (i2 != 0) {
                this.a.c(i2);
                this.b = 0;
            }
            this.a.d(0, 0);
            return true;
        }
        super.onLayoutChild(coordinatorLayout, prettyHeaderView, i);
        return true;
    }

    @Override // com.spotify.android.glue.patterns.header.behavior.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
        if (c(coordinatorLayout)) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i3);
            int paddingLeft = (size - coordinatorLayout.getPaddingLeft()) - coordinatorLayout.getPaddingRight();
            prettyHeaderView.setMinHeight((size2 - coordinatorLayout.getPaddingTop()) - coordinatorLayout.getPaddingBottom());
            prettyHeaderView.measure(z42.A(paddingLeft / 3), z42.A(size2));
            this.j = 0;
            return true;
        }
        super.onMeasureChild(coordinatorLayout, prettyHeaderView, i, i2, i3, i4);
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.HeaderBehavior
    public void w(CoordinatorLayout coordinatorLayout, float f) {
        u toolbarUpdater = ((GlueHeaderLayout) coordinatorLayout).getToolbarUpdater();
        if (toolbarUpdater != null) {
            float max = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
            if (Math.abs(this.n - max) >= 0.01f) {
                this.n = max;
                toolbarUpdater.o(max);
            }
        }
    }

    public LegacyHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
