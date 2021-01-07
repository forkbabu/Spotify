package com.spotify.music.features.followfeed.views;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
public final class k implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ FooterView a;

    k(FooterView footerView) {
        this.a = footerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FooterView footerView = this.a;
        ValueAnimator valueAnimator2 = footerView.s;
        Object animatedValue = valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null;
        if (animatedValue != null) {
            FooterView.d(footerView, ((Integer) animatedValue).intValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
