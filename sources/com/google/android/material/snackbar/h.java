package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

class h implements ValueAnimator.AnimatorUpdateListener {
    private int a = 0;
    final /* synthetic */ BaseTransientBottomBar b;

    h(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.e()) {
            q4.A(this.b.c, intValue - this.a);
        } else {
            this.b.c.setTranslationY((float) intValue);
        }
        this.a = intValue;
    }
}
