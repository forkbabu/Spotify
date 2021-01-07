package com.spotify.encore.consumer.elements.downloadbutton;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public final class DrawableHandler$createSpotifyDrawableAnimator$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Drawable $drawable;

    DrawableHandler$createSpotifyDrawableAnimator$1(Drawable drawable) {
        this.$drawable = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.$drawable.invalidateSelf();
    }
}
