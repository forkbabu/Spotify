package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter {
    final /* synthetic */ cmf a;

    c(cmf cmf) {
        this.a = cmf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.invoke();
    }
}
