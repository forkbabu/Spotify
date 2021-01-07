package com.spotify.music.playlist.extender;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class j0 extends AnimatorListenerAdapter {
    j0() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        animator.setStartDelay(300);
        animator.start();
    }
}
