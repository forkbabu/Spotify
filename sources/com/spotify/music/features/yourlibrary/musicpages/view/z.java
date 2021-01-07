package com.spotify.music.features.yourlibrary.musicpages.view;

import android.animation.ValueAnimator;

public final /* synthetic */ class z implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PulldownContainer a;

    public /* synthetic */ z(PulldownContainer pulldownContainer) {
        this.a = pulldownContainer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.d(valueAnimator);
    }
}
