package com.spotify.music.features.wrapped2020.stories.templates.playlist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class b extends AnimatorListenerAdapter {
    final /* synthetic */ PlaylistStory a;

    b(PlaylistStory playlistStory) {
        this.a = playlistStory;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        PlaylistStory.q(this.a);
    }
}
