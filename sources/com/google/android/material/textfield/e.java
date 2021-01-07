package com.google.android.material.textfield;

import android.animation.ValueAnimator;

class e implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ a a;

    e(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setScaleX(floatValue);
        this.a.c.setScaleY(floatValue);
    }
}
