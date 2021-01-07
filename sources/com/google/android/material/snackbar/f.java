package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

class f implements ValueAnimator.AnimatorUpdateListener {
    private int a;
    final /* synthetic */ int b;
    final /* synthetic */ BaseTransientBottomBar c;

    f(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.c = baseTransientBottomBar;
        this.b = i;
        this.a = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.e()) {
            q4.A(this.c.c, intValue - this.a);
        } else {
            this.c.c.setTranslationY((float) intValue);
        }
        this.a = intValue;
    }
}
