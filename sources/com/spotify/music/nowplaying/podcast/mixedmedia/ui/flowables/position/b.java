package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import android.animation.ValueAnimator;
import defpackage.j1c;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ PlaybackPositionFlowableHelperImpl a;

    b(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl, j1c.b.C0628b bVar, int i) {
        this.a = playbackPositionFlowableHelperImpl;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y1c e = PlaybackPositionFlowableHelperImpl.e(this.a);
        h.d(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            e.onNext(new j1c.b.C0628b(((Integer) animatedValue).intValue(), true));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
