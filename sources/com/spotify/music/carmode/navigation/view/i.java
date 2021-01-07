package com.spotify.music.carmode.navigation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.h;

public final class i implements Animator.AnimatorListener {
    final /* synthetic */ AnimatorSet a;
    final /* synthetic */ PulsatingView b;

    i(AnimatorSet animatorSet, PulsatingView pulsatingView, Animator animator, Animator animator2) {
        this.a = animatorSet;
        this.b = pulsatingView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        h.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h.e(animator, "animator");
        if (!(this.b.p)) {
            PulsatingView pulsatingView = this.b;
            AnimatorSet clone = this.a.clone();
            clone.start();
            pulsatingView.o = clone;
            return;
        }
        this.b.n.clear();
        this.b.postInvalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        h.e(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        h.e(animator, "animator");
    }
}
