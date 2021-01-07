package com.spotify.paste.graphics.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class CardAccessoryDrawable extends Drawable {
    private final Paint a = new Paint(1);
    private final float b;
    private final float c;
    private final int d;
    private final float e;
    private final int f;
    private final SpotifyIconDrawable g;
    private final int h;
    private final SpotifyIconV2 i;
    private final Size j;
    private final float k;
    private final float l;

    public enum Size {
        TINY(7, 10, 7),
        SMALL(10, 10, 7),
        MEDIUM(12, 12, 7);
        
        private final int mCardPaddingDp;
        private final int mIconSizeDp;
        private final int mInnerCircleRadiusDp;

        private Size(int i, int i2, int i3) {
            this.mInnerCircleRadiusDp = i;
            this.mIconSizeDp = i2;
            this.mCardPaddingDp = i3;
        }
    }

    private CardAccessoryDrawable(Context context, int i2, SpotifyIconV2 spotifyIconV2, Size size, float f2, float f3) {
        float g2 = (float) nud.g((float) (size.mInnerCircleRadiusDp + 1), context.getResources());
        this.c = g2;
        this.b = (float) nud.g((float) size.mInnerCircleRadiusDp, context.getResources());
        this.d = i2;
        float g3 = (float) nud.g((float) size.mIconSizeDp, context.getResources());
        g3 = Math.round(g3) % 2 != 0 ? g3 + 1.0f : g3;
        this.e = g3;
        int i3 = (int) (g2 * 2.0f);
        this.h = i3;
        this.i = spotifyIconV2;
        this.j = size;
        setBounds(0, 0, i3, i3);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, g3);
        this.g = spotifyIconDrawable;
        spotifyIconDrawable.r(-1);
        spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
        this.k = f2;
        this.l = f3;
        this.f = nud.g((float) size.mCardPaddingDp, context.getResources());
    }

    public static CardAccessoryDrawable a(Context context, int i2, Size size, SpotifyIconV2 spotifyIconV2) {
        return new CardAccessoryDrawable(context, i2, spotifyIconV2, size, 1.0f, spotifyIconV2 == SpotifyIconV2.STAR_ALT ? 0.95f : 1.0f);
    }

    public int b() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.a.setColor(855638016);
        float f2 = this.c;
        canvas.drawCircle(f2, f2, f2, this.a);
        this.a.setColor(this.d);
        float f3 = this.c;
        canvas.drawCircle(f3, f3, this.b, this.a);
        canvas.save();
        float f4 = (((float) this.h) - this.e) / 2.0f;
        canvas.translate(this.k * f4, f4 * this.l);
        this.g.draw(canvas);
        canvas.restore();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAccessoryDrawable)) {
            return false;
        }
        CardAccessoryDrawable cardAccessoryDrawable = (CardAccessoryDrawable) obj;
        return this.d == cardAccessoryDrawable.d && this.i == cardAccessoryDrawable.i && this.j == cardAccessoryDrawable.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = this.i.hashCode();
        return this.j.hashCode() + ((hashCode + (this.d * 31)) * 31);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
