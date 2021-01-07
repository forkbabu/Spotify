package com.spotify.music.features.yourlibraryx.view.entities.swipe;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import kotlin.jvm.internal.h;

public final class a extends Drawable {
    private final Drawable a;
    private final Drawable b;

    public a(Drawable drawable, Drawable drawable2) {
        h.e(drawable, "inactiveDrawable");
        h.e(drawable2, "activeDrawable");
        this.a = drawable;
        this.b = drawable2;
    }

    public final void a(float f) {
        float f2 = (float) BitmapRenderer.ALPHA_VISIBLE;
        if (f > 1.0f) {
            f = 1.0f;
        }
        int i = (int) (f2 * f);
        this.b.setAlpha(i);
        this.a.setAlpha(BitmapRenderer.ALPHA_VISIBLE - i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.e(canvas, "c");
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        h.e(rect, "bounds");
        super.setBounds(rect);
        this.a.setBounds(rect);
        this.b.setBounds(rect);
    }
}
