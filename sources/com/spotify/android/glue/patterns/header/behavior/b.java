package com.spotify.android.glue.patterns.header.behavior;

import android.view.animation.Interpolator;

/* access modifiers changed from: package-private */
public final class b {
    static final Interpolator a = new a();

    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
