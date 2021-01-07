package com.spotify.voice.experiments.experience.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
public class l1 extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ k1 b;

    l1(k1 k1Var, Runnable runnable) {
        this.b = k1Var;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.n.removeAllListeners();
        this.a.run();
        this.b.f.start();
    }
}
