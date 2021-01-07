package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class DrawableRevealAnimator {
    public static final Companion Companion = new Companion(null);
    private static final int TRANSITION_DURATION = 400;
    private ValueAnimator animator;
    private final Drawable mDrawable;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DrawableRevealAnimator(Drawable drawable) {
        h.e(drawable, "mDrawable");
        this.mDrawable = drawable;
    }

    public final void cancelAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            h.c(valueAnimator);
            valueAnimator.cancel();
            this.animator = null;
        }
    }

    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    public final void revealDrawable(boolean z) {
        cancelAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = ofFloat;
        h.d(ofFloat, "animator");
        ofFloat.setDuration((long) 400);
        ofFloat.setInterpolator(ta0.b);
        ofFloat.addUpdateListener(new DrawableRevealAnimator$revealDrawable$1(this));
        if (z) {
            ofFloat.start();
        } else {
            ofFloat.end();
        }
        this.mDrawable.invalidateSelf();
    }
}
