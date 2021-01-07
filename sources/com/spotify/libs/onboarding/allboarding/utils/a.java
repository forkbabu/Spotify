package com.spotify.libs.onboarding.allboarding.utils;

import android.view.animation.Interpolator;

public final class a implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        double d = (double) f;
        Double.isNaN(d);
        double pow = Math.pow(2.0d, -10.0d * d);
        Double.isNaN(d);
        double d2 = (double) 0.75f;
        Double.isNaN(d2);
        return (float) ((Math.sin(((d - 0.1875d) * 6.283185307179586d) / d2) * pow) + 1.0d);
    }
}
