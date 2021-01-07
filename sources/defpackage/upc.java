package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;

/* renamed from: upc  reason: default package */
public class upc implements tpc {
    private int a = Integer.MAX_VALUE;
    private final vpc b;
    private nvd c;
    private nvd d;
    private int e;
    private int f;

    public upc(TextPaint textPaint, int i, int i2) {
        vpc vpc = new vpc(textPaint, i, i2);
        this.b = vpc;
        this.f = -14145496;
        this.e = 872415231;
        this.c = qpc.a;
        this.d = ppc.a;
    }

    public void a(Canvas canvas, Paint paint, RectF rectF, float f2, float f3) {
        paint.setColor(this.c.a(f2));
        canvas.drawRoundRect(rectF, f3, f3, paint);
        this.b.a(canvas, this.d.a(f2));
    }

    public void b() {
        this.f = -14145496;
        this.e = 872415231;
        this.c = qpc.a;
        this.d = ppc.a;
        this.b.b();
    }

    public void c(int i) {
        this.a = i;
    }

    public boolean d(String str) {
        vpc vpc = this.b;
        int length = str.length();
        int i = this.a;
        if (length > i) {
            str = str.substring(0, i);
        }
        return vpc.c(str);
    }

    public void e(Rect rect) {
        this.b.d(rect);
    }

    public void f(int i, int i2) {
        if (this.f != i || this.e != i2) {
            this.f = i;
            this.e = i2;
            this.c = ovd.d(-14145496, i);
            this.d = ovd.d(872415231, i2);
        }
    }
}
