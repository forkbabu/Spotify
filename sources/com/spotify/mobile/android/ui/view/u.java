package com.spotify.mobile.android.ui.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class u extends Drawable {
    private final Paint a;
    private final Paint b;

    public u(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(i2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth((float) i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.left;
        int i2 = bounds.right;
        float f = ((float) (i + i2)) / 2.0f;
        float f2 = ((float) (bounds.top + bounds.bottom)) / 2.0f;
        float f3 = ((float) (i2 - i)) / 2.0f;
        canvas.drawCircle(f, f2, f3, this.a);
        canvas.drawCircle(f, f2, f3, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
