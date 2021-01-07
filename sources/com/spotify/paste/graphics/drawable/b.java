package com.spotify.paste.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class b extends Drawable {
    private final Bitmap a;
    private final Paint b;
    private final BitmapShader c;
    private final Matrix d = new Matrix();
    private final float e;

    public b(Bitmap bitmap, float f) {
        if (bitmap != null) {
            this.e = f;
            this.a = bitmap;
            Paint paint = new Paint(1);
            this.b = paint;
            paint.setStyle(Paint.Style.FILL);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.c = bitmapShader;
            paint.setShader(bitmapShader);
            return;
        }
        throw new NullPointerException("Bitmap cannot be null.");
    }

    public static pud a() {
        return new a(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float min = ((float) Math.min(bounds.width(), bounds.height())) / 2.0f;
        this.d.reset();
        this.d.postTranslate(-exactCenterX, -exactCenterY);
        this.c.setLocalMatrix(this.d);
        canvas.save();
        canvas.translate(exactCenterX, exactCenterY);
        float f = this.e;
        if (f != 1.0f) {
            canvas.scale(f, f);
        }
        canvas.drawCircle(0.0f, 0.0f, min, this.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Paint paint = this.b;
        if (paint.getXfermode() != null) {
            return -3;
        }
        int alpha = paint.getAlpha();
        if (alpha == 0) {
            return -2;
        }
        return (alpha != 255 || this.a.hasAlpha()) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
