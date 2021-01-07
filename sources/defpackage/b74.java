package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: b74  reason: default package */
public class b74 {
    private float a;
    private final Rect b = new Rect();
    private final Paint c = new Paint(1);
    private boolean d;
    private Bitmap e;

    public void a(Canvas canvas, float f) {
        this.c.setAlpha((int) (f * 255.0f));
        float a2 = y64.a(this.b);
        RectF rectF = new RectF(0.0f, 0.0f, a2, a2);
        if (this.e == null) {
            float width = (rectF.width() * 0.029411765f) + (rectF.width() * 0.029411765f);
            int ceil = (int) Math.ceil((double) (rectF.width() + (2.0f * width)));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            paint.setShadowLayer(rectF.width() * 0.029411765f, 0.0f, rectF.width() * 0.029411765f, 1426063360);
            this.e = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.e);
            canvas2.save();
            canvas2.translate(width, width);
            float f2 = this.a;
            canvas2.drawRoundRect(rectF, f2, f2, paint);
            canvas2.restore();
        }
        float width2 = (rectF.width() * 0.029411765f) + (rectF.width() * 0.029411765f);
        PointF d2 = y64.d(this.b, this.d);
        canvas.save();
        canvas.translate(d2.x, d2.y);
        canvas.rotate(y64.b(this.d));
        float f3 = -width2;
        canvas.drawBitmap(this.e, f3, f3, this.c);
        canvas.restore();
    }

    public void b(int i) {
        this.c.setAlpha(i);
    }

    public void c(Rect rect) {
        this.b.set(rect);
    }

    public void d(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public void e(float f) {
        this.a = f;
        this.e = null;
    }

    public void f(boolean z) {
        this.d = z;
    }
}
