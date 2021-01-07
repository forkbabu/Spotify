package com.spotify.music.features.followfeed.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.h;

public final class f extends AnimatorListenerAdapter {
    final /* synthetic */ cmf a;

    f(FollowRecsView followRecsView, cmf cmf) {
        this.a = cmf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        h.e(animator, "animation");
        this.a.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h.e(animator, "animation");
        this.a.invoke();
    }
}
