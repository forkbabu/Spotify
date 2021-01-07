package com.spotify.encore.consumer.elements.thumb;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public final class ThumbButtonAnimatorKt {
    private static final AccelerateInterpolator ACCELERATE = new AccelerateInterpolator();
    private static final float ANGLE = -25.0f;
    private static final DecelerateInterpolator DECELERATE = new DecelerateInterpolator();
    private static final long DURATION = 200;
    private static final float SCALE = 0.2f;
}
