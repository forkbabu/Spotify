package com.spotify.encore.consumer.components.promo.impl.promocard.renders;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class BitmapRenderer {
    public static final int ALPHA_VISIBLE = 255;
    public static final Companion Companion = new Companion(null);
    private Bitmap bitmap;
    private Shader bitmapShader;
    private RectF boundsF;

    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final Matrix newCenterCropMatrix(float f, float f2, float f3, float f4) {
            float f5;
            float max = Math.max(f3 / f, f4 / f2);
            float f6 = f * max;
            float f7 = f2 * max;
            float f8 = 0.0f;
            if (f6 > f3) {
                f8 = (f3 - f6) / 2.0f;
            } else if (f7 > f4) {
                f5 = (f4 - f7) / 2.0f;
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.postScale(max, max);
                matrix.postTranslate(f8, f5);
                return matrix;
            }
            f5 = 0.0f;
            Matrix matrix2 = new Matrix();
            matrix2.reset();
            matrix2.postScale(max, max);
            matrix2.postTranslate(f8, f5);
            return matrix2;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private final void updateImageShaderMatrix(Rect rect) {
        if (this.bitmap != null && this.bitmapShader != null) {
            Bitmap bitmap2 = this.bitmap;
            h.c(bitmap2);
            float width = (float) bitmap2.getWidth();
            Bitmap bitmap3 = this.bitmap;
            h.c(bitmap3);
            float height = (float) bitmap3.getHeight();
            Matrix newCenterCropMatrix = Companion.newCenterCropMatrix(width, height, (float) rect.width(), (float) rect.height());
            Shader shader = this.bitmapShader;
            h.c(shader);
            shader.setLocalMatrix(newCenterCropMatrix);
        }
    }

    public final void draw(Canvas canvas, Paint paint, float f) {
        h.e(canvas, "canvas");
        h.e(paint, "paint");
        paint.setAlpha((int) (f * ((float) ALPHA_VISIBLE)));
        paint.setShader(this.bitmapShader);
        RectF rectF = this.boundsF;
        h.c(rectF);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(ALPHA_VISIBLE);
    }

    public final boolean hasBitmap() {
        return this.bitmap != null;
    }

    public final void reset() {
        this.bitmap = null;
        this.bitmapShader = null;
    }

    public final void setBitmap(Bitmap bitmap2, Rect rect) {
        h.e(bitmap2, "bitmap");
        h.e(rect, "bounds");
        this.bitmap = bitmap2;
        Bitmap bitmap3 = this.bitmap;
        h.c(bitmap3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        updateImageShaderMatrix(rect);
    }

    public final void updateBounds(Rect rect) {
        h.e(rect, "bounds");
        this.boundsF = new RectF(rect);
        updateImageShaderMatrix(rect);
    }
}
