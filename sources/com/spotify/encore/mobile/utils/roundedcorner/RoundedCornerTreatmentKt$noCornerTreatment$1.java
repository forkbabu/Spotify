package com.spotify.encore.mobile.utils.roundedcorner;

import android.graphics.Canvas;
import android.view.View;
import kotlin.jvm.internal.h;

public final class RoundedCornerTreatmentKt$noCornerTreatment$1 extends RoundedCornerTreatment {
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RoundedCornerTreatmentKt$noCornerTreatment$1(View view, float f, View view2, float f2) {
        super(view2, f2);
        this.$view = view;
        this.$cornerRadius = f;
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onPostDraw(Canvas canvas) {
        h.e(canvas, "canvas");
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onPreDraw(Canvas canvas) {
        h.e(canvas, "canvas");
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onSizeChanged(int i, int i2) {
    }
}
