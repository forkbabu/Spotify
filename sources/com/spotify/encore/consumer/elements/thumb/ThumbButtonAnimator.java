package com.spotify.encore.consumer.elements.thumb;

import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ThumbButtonAnimator {
    public static final ThumbButtonAnimator INSTANCE = new ThumbButtonAnimator();

    private ThumbButtonAnimator() {
    }

    private final ViewPropertyAnimator rotateAndBloat(ThumbButtonView thumbButtonView, float f, float f2, Interpolator interpolator, cmf<f> cmf) {
        ViewPropertyAnimator animate = thumbButtonView.animate();
        animate.rotationBy(f);
        animate.scaleXBy(f2);
        animate.scaleYBy(f2);
        h.d(animate, "this");
        animate.setInterpolator(interpolator);
        animate.setDuration(200);
        animate.withEndAction(new ThumbButtonAnimator$rotateAndBloat$$inlined$apply$lambda$1(f, f2, interpolator, cmf));
        h.d(animate, "this.animate().apply {\n …ction { andThen() }\n    }");
        return animate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.spotify.encore.consumer.elements.thumb.ThumbButtonAnimator */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ViewPropertyAnimator rotateAndBloat$default(ThumbButtonAnimator thumbButtonAnimator, ThumbButtonView thumbButtonView, float f, float f2, Interpolator interpolator, cmf cmf, int i, Object obj) {
        if ((i & 8) != 0) {
            cmf = ThumbButtonAnimator$rotateAndBloat$1.INSTANCE;
        }
        return thumbButtonAnimator.rotateAndBloat(thumbButtonView, f, f2, interpolator, cmf);
    }

    public final void animate(ThumbButtonView thumbButtonView) {
        h.e(thumbButtonView, "thumb");
        rotateAndBloat(thumbButtonView, -25.0f, 0.2f, ThumbButtonAnimatorKt.ACCELERATE, new ThumbButtonAnimator$animate$1(thumbButtonView));
    }
}
