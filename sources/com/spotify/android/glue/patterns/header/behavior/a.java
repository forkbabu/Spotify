package com.spotify.android.glue.patterns.header.behavior;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ HeaderBehavior a;
    public final /* synthetic */ CoordinatorLayout b;
    public final /* synthetic */ View c;

    public /* synthetic */ a(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
        this.a = headerBehavior;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.s(this.b, this.c, valueAnimator);
    }
}
