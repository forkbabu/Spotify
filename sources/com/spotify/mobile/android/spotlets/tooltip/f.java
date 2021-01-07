package com.spotify.mobile.android.spotlets.tooltip;

import android.animation.ValueAnimator;

class f implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ e a;

    f(e eVar) {
        this.a = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e.a(this.a, floatValue);
        e.b(this.a, floatValue);
        this.a.invalidate();
    }
}
