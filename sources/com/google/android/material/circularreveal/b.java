package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.circularreveal.c;

public class b {
    public static final int j;
    private final a a;
    private final View b;
    private final Path c = new Path();
    private final Paint d = new Paint(7);
    private final Paint e;
    private c.e f;
    private Drawable g;
    private boolean h;
    private boolean i;

    public interface a {
        void e(Canvas canvas);

        boolean i();
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            j = 2;
        } else if (i2 >= 18) {
            j = 1;
        } else {
            j = 0;
        }
    }

    public b(a aVar) {
        this.a = aVar;
        View view = (View) aVar;
        this.b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    private float f(c.e eVar) {
        return hx.b(eVar.a, eVar.b, 0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.c$e r0 = r4.f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            float r0 = r0.c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            int r3 = com.google.android.material.circularreveal.b.j
            if (r3 != 0) goto L_0x0024
            if (r0 != 0) goto L_0x0023
            boolean r0 = r4.i
            if (r0 == 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            return r1
        L_0x0024:
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.l():boolean");
    }

    private boolean m() {
        return !this.h && Color.alpha(this.e.getColor()) != 0;
    }

    public void a() {
        if (j == 0) {
            this.h = true;
            this.i = false;
            this.b.buildDrawingCache();
            Bitmap drawingCache = this.b.getDrawingCache();
            if (!(drawingCache != null || this.b.getWidth() == 0 || this.b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap.Config.ARGB_8888);
                this.b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.h = false;
            this.i = true;
        }
    }

    public void b() {
        if (j == 0) {
            this.i = false;
            this.b.destroyDrawingCache();
            this.d.setShader(null);
            this.b.invalidate();
        }
    }

    public void c(Canvas canvas) {
        boolean z = true;
        if (l()) {
            int i2 = j;
            if (i2 == 0) {
                c.e eVar = this.f;
                canvas.drawCircle(eVar.a, eVar.b, eVar.c, this.d);
                if (m()) {
                    c.e eVar2 = this.f;
                    canvas.drawCircle(eVar2.a, eVar2.b, eVar2.c, this.e);
                }
            } else if (i2 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.c);
                this.a.e(canvas);
                if (m()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight(), this.e);
                }
                canvas.restoreToCount(save);
            } else if (i2 == 2) {
                this.a.e(canvas);
                if (m()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight(), this.e);
                }
            } else {
                throw new IllegalStateException(je.p0("Unsupported strategy ", i2));
            }
        } else {
            this.a.e(canvas);
            if (m()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight(), this.e);
            }
        }
        if (this.h || this.g == null || this.f == null) {
            z = false;
        }
        if (z) {
            Rect bounds = this.g.getBounds();
            float width = this.f.a - (((float) bounds.width()) / 2.0f);
            float height = this.f.b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public Drawable d() {
        return this.g;
    }

    public int e() {
        return this.e.getColor();
    }

    public c.e g() {
        c.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar.a, eVar.b, eVar.c);
        if (eVar2.c == Float.MAX_VALUE) {
            eVar2.c = f(eVar2);
        }
        return eVar2;
    }

    public boolean h() {
        return this.a.i() && !l();
    }

    public void i(Drawable drawable) {
        this.g = drawable;
        this.b.invalidate();
    }

    public void j(int i2) {
        this.e.setColor(i2);
        this.b.invalidate();
    }

    public void k(c.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            c.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new c.e(eVar.a, eVar.b, eVar.c);
            } else {
                float f2 = eVar.a;
                float f3 = eVar.b;
                float f4 = eVar.c;
                eVar2.a = f2;
                eVar2.b = f3;
                eVar2.c = f4;
            }
            if (eVar.c + 1.0E-4f >= f(eVar)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        if (j == 1) {
            this.c.rewind();
            c.e eVar3 = this.f;
            if (eVar3 != null) {
                this.c.addCircle(eVar3.a, eVar3.b, eVar3.c, Path.Direction.CW);
            }
        }
        this.b.invalidate();
    }
}
