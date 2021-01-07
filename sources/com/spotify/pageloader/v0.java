package com.spotify.pageloader;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class v0 extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    v0(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
    }
}
