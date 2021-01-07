package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter {
    final /* synthetic */ cmf a;

    d(cmf cmf) {
        this.a = cmf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.invoke();
    }
}
