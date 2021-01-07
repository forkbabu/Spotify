package com.spotify.encore.mobile.utils.roundedcorner;

import android.view.View;

public final class RoundedCornerTreatmentKt {
    public static final RoundedCornerTreatment noCornerTreatment(View view, float f) {
        return new RoundedCornerTreatmentKt$noCornerTreatment$1(view, f, view, f);
    }

    public static final boolean shouldClipCircle(int i, int i2, float f) {
        return i == i2 && ((float) i) <= f * ((float) 2);
    }
}
