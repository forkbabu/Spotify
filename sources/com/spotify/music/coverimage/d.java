package com.spotify.music.coverimage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class d extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;

    d(CoverImageActivity coverImageActivity, Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.run();
    }
}
