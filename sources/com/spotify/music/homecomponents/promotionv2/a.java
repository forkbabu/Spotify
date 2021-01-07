package com.spotify.music.homecomponents.promotionv2;

import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ g a;

    public /* synthetic */ a(g gVar) {
        this.a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(valueAnimator);
    }
}
