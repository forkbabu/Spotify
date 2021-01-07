package com.spotify.music.features.yourlibrary.musicpages.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* access modifiers changed from: package-private */
public final class l0 extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    l0(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        super.onAnimationEnd(animator);
    }
}
