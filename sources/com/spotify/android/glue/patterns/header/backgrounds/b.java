package com.spotify.android.glue.patterns.header.backgrounds;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

class b {
    private final int a;
    private LinearGradient b;
    private final Paint c = new Paint(1);
    private final Paint d;
    private int e;
    private int f;
    private int g = BitmapRenderer.ALPHA_VISIBLE;
    private int h;

    b(Context context) {
        Paint paint = new Paint();
        this.d = paint;
        int h2 = nud.h(context, C0707R.attr.pasteColorBackground);
        paint.setColor(h2);
        this.a = h2;
    }

    public void a(Canvas canvas) {
        if (this.b != null) {
            int save = canvas.save();
            canvas.drawRect(0.0f, 0.0f, (float) this.f, (float) this.e, this.d);
            canvas.restoreToCount(save);
        }
    }

    public void b(Canvas canvas) {
        if (this.b != null) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.h));
            canvas.drawRect(0.0f, 0.0f, (float) this.f, (float) this.e, this.c);
            canvas.restoreToCount(save);
        }
    }

    public void c(int i, int i2) {
        this.f = i;
        if (this.e != i2) {
            this.e = i2;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.e, 0, this.a, Shader.TileMode.CLAMP);
            this.b = linearGradient;
            this.c.setShader(linearGradient);
        }
    }

    public void d(int i) {
        this.d.setColor(ovd.a(i, 0.4f));
        this.d.setAlpha(this.g);
    }

    /* access modifiers changed from: package-private */
    public void e(int i) {
        this.g = i;
        this.d.setAlpha(i);
    }

    public void f(int i) {
        this.h = i;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.c.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
    }
}
