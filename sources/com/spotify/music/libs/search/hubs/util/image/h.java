package com.spotify.music.libs.search.hubs.util.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class h extends Drawable {
    private final int a;
    private final int b;
    private final Paint c = new Paint(1);
    private final RectF d = new RectF();

    public h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.c.setColor(this.b);
        this.d.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        RectF rectF = this.d;
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
