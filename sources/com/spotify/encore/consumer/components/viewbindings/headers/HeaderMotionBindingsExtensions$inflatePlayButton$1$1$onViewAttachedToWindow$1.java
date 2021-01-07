package com.spotify.encore.consumer.components.viewbindings.headers;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class HeaderMotionBindingsExtensions$inflatePlayButton$1$1$onViewAttachedToWindow$1 implements m4 {
    final /* synthetic */ CoordinatorLayout $parent;
    final /* synthetic */ HeaderMotionBindingsExtensions$inflatePlayButton$1$1 this$0;

    HeaderMotionBindingsExtensions$inflatePlayButton$1$1$onViewAttachedToWindow$1(HeaderMotionBindingsExtensions$inflatePlayButton$1$1 headerMotionBindingsExtensions$inflatePlayButton$1$1, CoordinatorLayout coordinatorLayout) {
        this.this$0 = headerMotionBindingsExtensions$inflatePlayButton$1$1;
        this.$parent = coordinatorLayout;
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        ViewGroup.LayoutParams layoutParams = this.this$0.$playButton.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.Behavior c = ((CoordinatorLayout.e) layoutParams).c();
            if (c != null) {
                return c.onApplyWindowInsets(this.$parent, this.this$0.$playButton, b5Var);
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }
}
