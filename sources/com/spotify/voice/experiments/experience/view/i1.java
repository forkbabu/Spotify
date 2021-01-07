package com.spotify.voice.experiments.experience.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class i1 extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    i1(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.setAlpha(0.0f);
    }
}
