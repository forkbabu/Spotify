package com.spotify.music.features.findfriends.view;

import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PulldownContainer a;

    public /* synthetic */ a(PulldownContainer pulldownContainer) {
        this.a = pulldownContainer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c(valueAnimator);
    }
}
