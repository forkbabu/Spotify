package com.spotify.music.features.wrapped2020.stories.templates.genrelust;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e extends AnimatorListenerAdapter {
    final /* synthetic */ cmf a;

    e(cmf cmf) {
        this.a = cmf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.invoke();
    }
}
