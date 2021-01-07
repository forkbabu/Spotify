package com.spotify.music.features.followfeed.views;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
public final class e implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ FollowRecsView b;
    final /* synthetic */ cmf c;

    e(ValueAnimator valueAnimator, FollowRecsView followRecsView, cmf cmf) {
        this.a = valueAnimator;
        this.b = followRecsView;
        this.c = cmf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FollowRecsView followRecsView = this.b;
        Object animatedValue = this.a.getAnimatedValue();
        if (animatedValue != null) {
            followRecsView.setHeight(((Integer) animatedValue).intValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
