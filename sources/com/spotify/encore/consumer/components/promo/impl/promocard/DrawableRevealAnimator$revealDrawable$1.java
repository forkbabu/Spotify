package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
public final class DrawableRevealAnimator$revealDrawable$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ DrawableRevealAnimator this$0;

    DrawableRevealAnimator$revealDrawable$1(DrawableRevealAnimator drawableRevealAnimator) {
        this.this$0 = drawableRevealAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DrawableRevealAnimator.access$getMDrawable$p(this.this$0).invalidateSelf();
    }
}
