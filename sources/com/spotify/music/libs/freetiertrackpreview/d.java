package com.spotify.music.libs.freetiertrackpreview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class d extends Drawable {
    private final SpotifyIconDrawable a;
    private final Paint b = new Paint(1);
    private final Paint c = new Paint(1);
    private final Context d;
    private final float e;
    private final int f;

    public d(Context context, float f2, float f3, int i, int i2) {
        h.e(context, "mContext");
        this.d = context;
        this.e = f3;
        this.f = i;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SHUFFLE, f2);
        this.a = spotifyIconDrawable;
        spotifyIconDrawable.r(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.e(canvas, "canvas");
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setColor(a.b(this.d, R.color.gray_70));
        this.c.setStrokeWidth(this.d.getResources().getDimension(C0707R.dimen.shuffle_badge_stroke_width));
        canvas.drawCircle(exactCenterX, exactCenterY, this.e / 2.0f, this.c);
        this.b.setColor(this.f);
        canvas.drawCircle(exactCenterX, exactCenterY, this.e / 2.0f, this.b);
        canvas.save();
        canvas.translate(exactCenterX - (((float) this.a.getIntrinsicWidth()) / 2.0f), exactCenterY - (((float) this.a.getIntrinsicHeight()) / 2.0f));
        this.a.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        h.e(rect, "bounds");
        super.onBoundsChange(rect);
        SpotifyIconDrawable spotifyIconDrawable = this.a;
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
    }
}
