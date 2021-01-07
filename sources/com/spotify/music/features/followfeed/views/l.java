package com.spotify.music.features.followfeed.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.h;

public final class l extends AnimatorListenerAdapter {
    final /* synthetic */ FooterView a;

    l(FooterView footerView) {
        this.a = footerView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h.e(animator, "animation");
        this.a.t.invoke(Boolean.valueOf(this.a.o));
        this.a.n = false;
    }
}
