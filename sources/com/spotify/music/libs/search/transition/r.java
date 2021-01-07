package com.spotify.music.libs.search.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
public class r extends AnimatorListenerAdapter {
    final /* synthetic */ q a;

    r(q qVar) {
        this.a = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        q.f(this.a);
    }
}
