package com.spotify.encore.consumer.components.promo.impl.promocard.renders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.content.a;
import com.spotify.encore.consumer.components.promo.impl.R;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class GradientRenderer {
    public static final Companion Companion = new Companion(null);
    private static final float GRADIENT_END_POSITION = 1.0f;
    private static final float GRADIENT_START_POSITION = 0.3f;
    private RectF boundsF;
    private final Paint gradientPaint;
    private final Shader gradientShader;
    private final Paint overlayPaint;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public GradientRenderer(Context context) {
        h.e(context, "context");
        Paint paint = new Paint(1);
        this.gradientPaint = paint;
        Paint paint2 = new Paint(1);
        this.overlayPaint = paint2;
        int b = a.b(context, R.color.home_promotion_background_gradient_start);
        int b2 = a.b(context, R.color.home_promotion_background_gradient_end);
        int b3 = a.b(context, R.color.home_promotion_background_overlay);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) GRADIENT_END_POSITION, new int[]{b, b2}, new float[]{GRADIENT_START_POSITION, GRADIENT_END_POSITION}, Shader.TileMode.CLAMP);
        this.gradientShader = linearGradient;
        paint.setShader(linearGradient);
        paint2.setColorFilter(new PorterDuffColorFilter(b3, PorterDuff.Mode.SRC_IN));
    }

    public final void draw(Canvas canvas, Paint paint, float f) {
        h.e(canvas, "canvas");
        h.e(paint, "paint");
        paint.setAlpha((int) (f * ((float) BitmapRenderer.ALPHA_VISIBLE)));
        paint.setShader(this.gradientShader);
        RectF rectF = this.boundsF;
        if (rectF != null) {
            canvas.drawRect(rectF, this.overlayPaint);
            RectF rectF2 = this.boundsF;
            if (rectF2 != null) {
                canvas.drawRect(rectF2, this.gradientPaint);
            } else {
                h.k("boundsF");
                throw null;
            }
        } else {
            h.k("boundsF");
            throw null;
        }
    }

    public final void updateBounds(Rect rect) {
        this.boundsF = new RectF(rect);
    }

    public final void updateMatrix(Matrix matrix) {
        this.gradientShader.setLocalMatrix(matrix);
    }
}
