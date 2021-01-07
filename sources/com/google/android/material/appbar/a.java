package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
public class a implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ yx a;

    a(AppBarLayout appBarLayout, yx yxVar) {
        this.a = yxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.G(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
