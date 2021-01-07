package com.spotify.voice.experiments.experience.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
public class j1 extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ GuessingGameVoiceViews b;

    j1(GuessingGameVoiceViews guessingGameVoiceViews, Runnable runnable) {
        this.b = guessingGameVoiceViews;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.q.removeAllListeners();
        this.a.run();
        this.b.p.start();
    }
}
