package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: a74  reason: default package */
public class a74 {
    private float a;
    private final Rect b = new Rect();
    private final Paint c = new Paint(1);
    private boolean d;
    private Bitmap e;
    private Shader f;
    private final RectF g = new RectF();
    private final Matrix h = new Matrix();

    public void a(Canvas canvas, float f2) {
        if (this.e != null && this.f != null) {
            this.c.setAlpha((int) (f2 * 255.0f));
            if (!(this.e == null || this.f == null)) {
                this.h.setScale(this.g.width() / ((float) this.e.getWidth()), this.g.height() / ((float) this.e.getHeight()));
                this.f.setLocalMatrix(this.h);
                this.c.setShader(this.f);
            }
            canvas.save();
            PointF d2 = y64.d(this.b, this.d);
            canvas.translate(d2.x, d2.y);
            canvas.rotate(y64.b(this.d));
            RectF rectF = this.g;
            float f3 = this.a;
            canvas.drawRoundRect(rectF, f3, f3, this.c);
            canvas.restore();
        }
    }

    public boolean b() {
        return this.e != null;
    }

    public void c() {
        this.e = null;
        this.f = null;
        this.c.setShader(null);
    }

    public void d(int i) {
        this.c.setAlpha(i);
    }

    public void e(Bitmap bitmap) {
        this.e = bitmap;
        Bitmap bitmap2 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f = new BitmapShader(bitmap2, tileMode, tileMode);
    }

    public void f(Rect rect) {
        this.b.set(rect);
        float a2 = y64.a(this.b);
        this.g.set(0.0f, 0.0f, a2, a2);
    }

    public void g(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public void h(float f2) {
        this.a = f2;
    }

    public void i(boolean z) {
        this.d = z;
    }
}
