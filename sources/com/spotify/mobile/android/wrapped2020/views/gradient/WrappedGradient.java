package com.spotify.mobile.android.wrapped2020.views.gradient;

public enum WrappedGradient {
    GRADIENT_1,
    GRADIENT_2;
    
    private final float[] offsets = {0.0f, 0.166f, 0.333f, 0.5f, 0.666f, 0.873f, 1.0f};

    private WrappedGradient() {
    }

    public final float[] d() {
        return this.offsets;
    }
}
