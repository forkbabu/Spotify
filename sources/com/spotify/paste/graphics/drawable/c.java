package com.spotify.paste.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public class c extends Drawable {
    private final Drawable a;
    private final float b;
    private final Paint c;
    private final Paint d;
    private ColorStateList e;
    private ColorStateList f;
    private int g = BitmapRenderer.ALPHA_VISIBLE;
    private int h;
    private int i;

    public c(Drawable drawable, float f2) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
        }
        this.a = drawable.mutate();
        this.b = f2;
        paint2.setStyle(Paint.Style.FILL);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
    }

    private int a() {
        return (int) (((float) Math.max(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight())) / this.b);
    }

    private void g() {
        this.c.setAlpha((Color.alpha(this.h) * this.g) / BitmapRenderer.ALPHA_VISIBLE);
        this.d.setAlpha((Color.alpha(this.i) * this.g) / BitmapRenderer.ALPHA_VISIBLE);
    }

    public void b(int i2) {
        this.f = ColorStateList.valueOf(i2);
        this.d.setColor(i2);
        this.i = i2;
        g();
        invalidateSelf();
    }

    public void c(ColorStateList colorStateList) {
        this.f = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    public void d(int i2) {
        this.a.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
        float min = (float) Math.min(bounds.width(), bounds.height());
        float strokeWidth = (min / 2.0f) - (this.c.getStrokeWidth() / 2.0f);
        canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.d);
        if (this.c.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.c);
        }
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        float max = min / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        canvas.scale(max, max);
        float f2 = this.b;
        canvas.scale(f2, f2);
        canvas.translate(((float) (-intrinsicWidth)) / 2.0f, ((float) (-intrinsicHeight)) / 2.0f);
        this.a.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void e(ColorStateList colorStateList) {
        this.e = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    public void f(float f2) {
        if (f2 >= 0.0f) {
            this.c.setStrokeWidth(f2);
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Negative strokeWidth is not supported.");
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.d.getAlpha();
        char c2 = alpha == 0 ? 65534 : alpha == 255 ? (char) 65535 : 65533;
        if (c2 == 65535) {
            return -1;
        }
        if (c2 == 65533) {
            return -3;
        }
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.e) != null && colorStateList.isStateful()) || this.a.isStateful();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean state = this.a.isStateful() ? this.a.setState(iArr) | false : false;
        if (this.f != null) {
            int color = this.d.getColor();
            int colorForState = this.f.getColorForState(iArr, color);
            this.d.setColor(colorForState);
            this.i = colorForState;
            state = colorForState != color;
        }
        if (this.e != null) {
            int color2 = this.c.getColor();
            int colorForState2 = this.e.getColorForState(iArr, color2);
            this.c.setColor(colorForState2);
            this.h = colorForState2;
            state |= colorForState2 != color2;
        }
        g();
        if (!state) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.g = i2;
        g();
        this.a.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
