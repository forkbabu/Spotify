package com.spotify.music.features.playlistentity.story.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class t0 extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    t0(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
