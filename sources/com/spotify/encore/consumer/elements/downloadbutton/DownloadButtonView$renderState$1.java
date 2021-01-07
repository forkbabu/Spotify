package com.spotify.encore.consumer.elements.downloadbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class DownloadButtonView$renderState$1 extends AnimatorListenerAdapter {
    final /* synthetic */ DownloadState $newState;
    final /* synthetic */ DownloadButtonView this$0;

    DownloadButtonView$renderState$1(DownloadButtonView downloadButtonView, DownloadState downloadState) {
        this.this$0 = downloadButtonView;
        this.$newState = downloadState;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.this$0.setDrawable(this.$newState);
    }
}
