package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: z64  reason: default package */
public class z64 {
    private final Paint a = new Paint(1);
    private final RectF b = new RectF();
    private final Path c = new Path();
    private final Matrix d;
    private float e;
    private int f = -16777216;
    private int g = -16777216;

    public z64(Context context) {
        Matrix matrix = new Matrix();
        this.d = matrix;
        matrix.postRotate(25.0f);
        this.e = (float) nud.g(4.0f, context.getResources());
    }

    public void a(Canvas canvas) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, this.f, this.g, Shader.TileMode.CLAMP);
        linearGradient.setLocalMatrix(this.d);
        this.a.setShader(linearGradient);
        canvas.clipPath(this.c);
        RectF rectF = this.b;
        float f2 = this.e;
        canvas.drawRoundRect(rectF, f2, f2, this.a);
    }

    public void b(int i) {
        this.a.setAlpha(i);
    }

    public void c(Rect rect) {
        this.b.set(rect);
        Path path = this.c;
        RectF rectF = this.b;
        float f2 = this.e;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        this.d.setScale(this.b.width(), this.b.height());
    }

    public void d(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void e(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public void f(float f2) {
        this.e = f2;
        this.c.addRoundRect(this.b, f2, f2, Path.Direction.CW);
    }
}
