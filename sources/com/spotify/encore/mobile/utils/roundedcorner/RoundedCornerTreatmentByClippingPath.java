package com.spotify.encore.mobile.utils.roundedcorner;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.h;

public final class RoundedCornerTreatmentByClippingPath extends RoundedCornerTreatment {
    private final Path path = new Path();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerTreatmentByClippingPath(View view, float f) {
        super(view, f);
        h.e(view, "view");
        if (Build.VERSION.SDK_INT < 18) {
            view.setLayerType(1, null);
        }
    }

    private final void clipCircle(int i, int i2) {
        float f = ((float) i) / 2.0f;
        this.path.addCircle(f, ((float) i2) / 2.0f, f, Path.Direction.CW);
    }

    private final void clipRoundRect(int i, int i2) {
        this.path.addRoundRect(new RectF(0.0f, 0.0f, (float) i, (float) i2), getCornerRadius(), getCornerRadius(), Path.Direction.CW);
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onPostDraw(Canvas canvas) {
        h.e(canvas, "canvas");
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onPreDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        canvas.clipPath(this.path);
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onSizeChanged(int i, int i2) {
        this.path.reset();
        if (RoundedCornerTreatmentKt.shouldClipCircle(i, i2, getCornerRadius())) {
            clipCircle(i, i2);
        } else {
            clipRoundRect(i, i2);
        }
    }
}
