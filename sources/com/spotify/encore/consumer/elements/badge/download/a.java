package com.spotify.encore.consumer.elements.badge.download;

import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DownloadBadgeDrawable a;

    public /* synthetic */ a(DownloadBadgeDrawable downloadBadgeDrawable) {
        this.a = downloadBadgeDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidateSelf();
    }
}
