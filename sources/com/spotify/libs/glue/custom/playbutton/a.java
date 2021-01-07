package com.spotify.libs.glue.custom.playbutton;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class a extends Drawable {
    private final com.spotify.paste.spotifyicon.a a;
    private final com.spotify.paste.spotifyicon.a b;
    private final Paint c;
    private final int d;
    private final int e;
    private final float f;
    private boolean g;

    public a(com.spotify.paste.spotifyicon.a aVar, com.spotify.paste.spotifyicon.a aVar2, Paint paint, int i, int i2, float f2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = paint;
        this.d = i;
        this.e = i2;
        this.f = f2;
    }

    public void a(boolean z) {
        this.g = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        float intrinsicWidth = ((float) this.a.getIntrinsicWidth()) / 2.0f;
        float intrinsicHeight = ((float) this.a.getIntrinsicHeight()) / 2.0f;
        canvas.save();
        canvas.translate(exactCenterX - intrinsicWidth, exactCenterY - intrinsicHeight);
        this.a.draw(canvas);
        canvas.restore();
        if (this.g) {
            float intrinsicWidth2 = ((float) this.b.getIntrinsicWidth()) / 2.0f;
            float intrinsicHeight2 = ((float) this.b.getIntrinsicHeight()) / 2.0f;
            int i = this.d;
            float f2 = ((exactCenterX + intrinsicWidth) - intrinsicWidth2) + ((float) i);
            float f3 = ((exactCenterY + intrinsicHeight) - intrinsicHeight2) + ((float) i);
            this.c.setColor(0);
            this.c.setShadowLayer(this.f, 0.0f, 0.0f, this.e);
            canvas.drawCircle(f2, f3, intrinsicWidth2, this.c);
            canvas.translate(f2 - intrinsicWidth2, f3 - intrinsicHeight2);
            this.b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((this.d + ((int) this.f)) * 2) + this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((this.d + ((int) this.f)) * 2) + this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        com.spotify.paste.spotifyicon.a aVar = this.a;
        aVar.setBounds(0, 0, aVar.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        com.spotify.paste.spotifyicon.a aVar2 = this.b;
        aVar2.setBounds(0, 0, aVar2.getIntrinsicWidth(), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.c.setAlpha(i);
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
