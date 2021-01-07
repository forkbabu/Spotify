package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

class c implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar a;

    c(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
