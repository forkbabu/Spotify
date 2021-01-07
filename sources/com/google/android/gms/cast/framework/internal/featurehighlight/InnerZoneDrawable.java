package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

class InnerZoneDrawable extends Drawable {
    private float a;
    private float b;
    private float c;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.c <= 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, this.a * 0.0f, null);
            return;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.c = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.a = f;
        invalidateSelf();
    }
}
