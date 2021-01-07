package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class HorizontalFadingEdgeLayout$addGradients$1 extends Lambda implements tmf<Float, Float, Float, int[], LinearGradient> {
    public static final HorizontalFadingEdgeLayout$addGradients$1 a = new HorizontalFadingEdgeLayout$addGradients$1();

    HorizontalFadingEdgeLayout$addGradients$1() {
        super(4);
    }

    public final LinearGradient a(float f, float f2, float f3, int[] iArr) {
        h.e(iArr, "colours");
        return new LinearGradient(f, f2, f3, f2, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }
}
