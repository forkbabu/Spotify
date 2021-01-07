package com.spotify.encore.consumer.elements.thumb;

import android.view.animation.Interpolator;

final class ThumbButtonAnimator$rotateAndBloat$$inlined$apply$lambda$1 implements Runnable {
    final /* synthetic */ cmf $andThen$inlined;
    final /* synthetic */ float $byAngle$inlined;
    final /* synthetic */ float $byScale$inlined;
    final /* synthetic */ Interpolator $interpolator$inlined;

    ThumbButtonAnimator$rotateAndBloat$$inlined$apply$lambda$1(float f, float f2, Interpolator interpolator, cmf cmf) {
        this.$byAngle$inlined = f;
        this.$byScale$inlined = f2;
        this.$interpolator$inlined = interpolator;
        this.$andThen$inlined = cmf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$andThen$inlined.invoke();
    }
}
