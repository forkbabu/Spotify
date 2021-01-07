package com.spotify.android.glue.patterns.contextmenu.glue;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

public class StretchingGradientDrawable extends Drawable {
    private final LinearGradient a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private int e;
    private int f;
    private float g;
    private final Matrix h = new Matrix();

    public StretchingGradientDrawable(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, i, i2, Shader.TileMode.CLAMP);
        this.a = linearGradient;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setShader(linearGradient);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setColor(i2);
        Paint paint3 = new Paint();
        this.d = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(0);
        this.f = 0;
    }

    private void g() {
        this.h.setScale((float) getBounds().width(), (float) (this.e + this.f));
        this.a.setLocalMatrix(this.h);
        invalidateSelf();
    }

    public float a() {
        return ((float) this.d.getAlpha()) / 255.0f;
    }

    public int b() {
        return this.e + this.f;
    }

    public float c() {
        return this.g;
    }

    public void d(float f2) {
        this.d.setAlpha((int) (f2 * 255.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (float) bounds.width(), (float) bounds.height(), this.d);
        canvas.translate(0.0f, this.g);
        canvas.drawRect(0.0f, 0.0f, (float) bounds.width(), (float) bounds.height(), this.b);
        canvas.restore();
    }

    public void e(int i) {
        this.f = i;
        g();
    }

    public void f(float f2) {
        this.g = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Keep
    public void setGradientHeight(int i) {
        this.e = i;
        g();
    }
}
