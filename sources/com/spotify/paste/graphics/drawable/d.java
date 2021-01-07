package com.spotify.paste.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class d extends Drawable {
    private final b a;
    private final Matrix b = new Matrix();
    private final RectF c = new RectF();
    private final Paint d = new Paint();

    static class a implements pud {
        final /* synthetic */ float a;

        a(float f) {
            this.a = f;
        }

        @Override // defpackage.pud
        public Drawable createDrawable(Bitmap bitmap) {
            return new d(bitmap, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends Drawable.ConstantState {
        final Bitmap a;
        final Paint b;
        final BitmapShader c;
        final float d;
        int e;

        b(Bitmap bitmap, float f) {
            this.a = bitmap;
            Paint paint = new Paint(3);
            this.b = paint;
            paint.setStyle(Paint.Style.FILL);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.c = bitmapShader;
            paint.setShader(bitmapShader);
            this.d = f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.e;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this.a, this.d);
        }
    }

    public d(Bitmap bitmap, float f) {
        if (bitmap != null) {
            this.a = new b(bitmap, f);
            return;
        }
        throw new NullPointerException("Bitmap cannot be null.");
    }

    public static pud a(float f) {
        return new a(f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        this.b.reset();
        this.b.setScale(((float) bounds.width()) / ((float) this.a.a.getWidth()), ((float) bounds.height()) / ((float) this.a.a.getHeight()));
        this.a.c.setLocalMatrix(this.b);
        this.d.setColor(-65536);
        this.c.set(bounds);
        RectF rectF = this.c;
        b bVar = this.a;
        float f = bVar.d;
        canvas.drawRoundRect(rectF, f, f, bVar.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.a.e = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Paint paint = this.a.b;
        if (paint.getXfermode() != null) {
            return -3;
        }
        int alpha = paint.getAlpha();
        if (alpha == 0) {
            return -2;
        }
        return (alpha != 255 || this.a.a.hasAlpha()) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return getConstantState().newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
