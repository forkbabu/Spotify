package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.j1c;

public final class c extends AnimatorListenerAdapter {
    final /* synthetic */ PlaybackPositionFlowableHelperImpl a;

    c(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl, j1c.b.C0628b bVar, int i) {
        this.a = playbackPositionFlowableHelperImpl;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        PlaybackPositionFlowableHelperImpl.g(this.a, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        PlaybackPositionFlowableHelperImpl.g(this.a, false);
    }
}
