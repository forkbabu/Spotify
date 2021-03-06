package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: o94  reason: default package */
public class o94 {
    private Shader a;
    private Bitmap b;
    private RectF c = new RectF();

    private void g(Rect rect) {
        float f;
        float f2;
        if (this.b != null && this.a != null) {
            float width = (float) rect.width();
            float height = (float) rect.height();
            float width2 = (float) this.b.getWidth();
            float height2 = (float) this.b.getHeight();
            float max = Math.max(width / width2, height / height2);
            float f3 = width2 * max;
            float f4 = height2 * max;
            float f5 = 0.0f;
            if (f3 > width) {
                f2 = (width - f3) / 2.0f;
            } else if (f4 > height) {
                f = (height - f4) / 2.0f;
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.postScale(max, max);
                matrix.postTranslate(f5, f);
                this.a.setLocalMatrix(matrix);
            } else {
                f2 = 0.0f;
            }
            f5 = f2;
            f = 0.0f;
            Matrix matrix2 = new Matrix();
            matrix2.reset();
            matrix2.postScale(max, max);
            matrix2.postTranslate(f5, f);
            this.a.setLocalMatrix(matrix2);
        }
    }

    public void a(Canvas canvas, Paint paint, float f, float f2) {
        paint.setAlpha((int) (f * 255.0f));
        paint.setShader(this.a);
        canvas.drawRoundRect(this.c, f2, f2, paint);
        paint.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
        paint.setShader(null);
    }

    public Bitmap b() {
        return this.b;
    }

    public boolean c() {
        return this.b != null;
    }

    public void d() {
        this.b = null;
        this.a = null;
    }

    public void e(Bitmap bitmap, Rect rect) {
        this.b = bitmap;
        Bitmap bitmap2 = this.b;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.a = new BitmapShader(bitmap2, tileMode, tileMode);
        g(rect);
    }

    public void f(Rect rect) {
        this.c = new RectF(rect);
        g(rect);
    }
}
