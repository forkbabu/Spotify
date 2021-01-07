package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

class d extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    d(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.p0.onAnimationStart(animator);
        FloatingActionButton S = BottomAppBar.S(this.a);
        if (S != null) {
            S.setTranslationX(BottomAppBar.U(this.a));
        }
    }
}
