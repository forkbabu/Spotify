package com.spotify.android.glue.patterns.contextmenu.glue;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
public class p extends AnimatorListenerAdapter {
    final /* synthetic */ o a;

    p(o oVar) {
        this.a = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.e.setProgressBarVisibility(8);
    }
}
