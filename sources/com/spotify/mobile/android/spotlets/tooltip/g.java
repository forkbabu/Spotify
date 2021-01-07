package com.spotify.mobile.android.spotlets.tooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.tooltip.TooltipContainer;

class g extends AnimatorListenerAdapter {
    final /* synthetic */ e a;

    g(e eVar) {
        this.a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.a.b != null) {
            TooltipContainer.c cVar = (TooltipContainer.c) this.a.b;
            TooltipContainer.c(TooltipContainer.this, null);
            TooltipContainer.d(TooltipContainer.this).setHidden(true);
            TooltipContainer.d(TooltipContainer.this).setAnimationListener(null);
        }
        if (this.a.w.isPresent()) {
            ((uu1) this.a.w.get()).f(this.a.x);
            this.a.w = Optional.absent();
        }
    }
}
