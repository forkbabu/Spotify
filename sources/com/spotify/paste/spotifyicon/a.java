package com.spotify.paste.spotifyicon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;

public class a extends Drawable {
    private final float a;
    private final SpotifyIconDrawable b;
    private final int c;
    private final Paint d = new Paint(1);

    public a(Context context, SpotifyIconV2 spotifyIconV2, float f, float f2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
        this.b = spotifyIconDrawable;
        spotifyIconDrawable.r(i2);
        this.a = f2;
        this.c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        this.d.setColor(this.c);
        canvas.drawCircle(exactCenterX, exactCenterY, this.a / 2.0f, this.d);
        canvas.save();
        canvas.translate(exactCenterX - (((float) this.b.getIntrinsicWidth()) / 2.0f), exactCenterY - (((float) this.b.getIntrinsicHeight()) / 2.0f));
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        SpotifyIconDrawable spotifyIconDrawable = this.b;
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
