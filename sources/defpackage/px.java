package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: px  reason: default package */
public class px {
    private static final int[] i = new int[3];
    private static final float[] j = {0.0f, 0.5f, 1.0f};
    private static final int[] k = new int[4];
    private static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    private final Paint a = new Paint();
    private final Paint b;
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g = new Path();
    private Paint h = new Paint();

    public px() {
        d(-16777216);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        int[] iArr = k;
        boolean z = f3 < 0.0f;
        Path path = this.g;
        if (z) {
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = (float) (-i2);
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = this.d;
            iArr[2] = this.e;
            iArr[3] = this.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f5 = 1.0f - (((float) i2) / width);
            float[] fArr = l;
            fArr[1] = f5;
            fArr[2] = ((1.0f - f5) / 2.0f) + f5;
            this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, this.h);
            }
            canvas.drawArc(rectF, f2, f3, true, this.b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = i;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int i2) {
        this.d = s2.h(i2, 68);
        this.e = s2.h(i2, 20);
        this.f = s2.h(i2, 0);
        this.a.setColor(this.d);
    }
}
