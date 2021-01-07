package com.spotify.voice.experiments.experience.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
public class h1 extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ g1 b;

    h1(g1 g1Var, Runnable runnable) {
        this.b = g1Var;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.n.removeAllListeners();
        this.a.run();
        this.b.f.start();
    }
}
