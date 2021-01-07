package com.spotify.paste.spotifyicon;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

public final class SpotifyIconDrawable extends Drawable {
    private SpotifyIconV2 a;
    private float b;
    private SpotifyIconV2.b c;
    private boolean d;
    private int e;
    private int f;
    private final Paint g;
    private Path h;
    private ColorStateList i;
    private final Rect j;
    private final float[] k;
    private float l;
    private float m;
    private final c n;
    private final d o;
    private final b p;
    private e q;
    private float r;
    private LayoutDirectionOverride s;

    public enum LayoutDirectionOverride {
        DEVICE,
        LTR,
        RTL
    }

    private class b implements e {
        b(a aVar) {
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public int a() {
            return SpotifyIconDrawable.this.j.height();
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public void b(Canvas canvas) {
            int save = canvas.save();
            SpotifyIconDrawable.this.getBounds();
            SpotifyIconDrawable.this.getClass();
            canvas.translate((float) (-SpotifyIconDrawable.this.j.left), ((float) SpotifyIconDrawable.this.j.height()) + ((float) (-SpotifyIconDrawable.this.j.bottom)));
            if (SpotifyIconDrawable.this.d) {
                canvas.drawPath(SpotifyIconDrawable.this.h, SpotifyIconDrawable.this.g);
            } else {
                canvas.drawText(SpotifyIconDrawable.this.p(), 0, 1, 0.0f, 0.0f, SpotifyIconDrawable.this.g);
            }
            canvas.restoreToCount(save);
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public int c() {
            return SpotifyIconDrawable.this.j.width();
        }
    }

    private class c implements e {
        c(a aVar) {
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public int a() {
            return (int) Math.ceil((double) SpotifyIconDrawable.this.l);
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public void b(Canvas canvas) {
            float f;
            int save = canvas.save();
            Rect bounds = SpotifyIconDrawable.this.getBounds();
            SpotifyIconDrawable.this.getClass();
            canvas.translate((float) bounds.centerX(), (float) bounds.centerY());
            SpotifyIconDrawable.this.getClass();
            canvas.rotate(0.0f);
            canvas.translate(0.0f, -SpotifyIconDrawable.this.m);
            float f2 = SpotifyIconDrawable.this.k[0];
            float f3 = SpotifyIconDrawable.this.l;
            if (f2 / f3 > ((float) bounds.width()) / ((float) bounds.height())) {
                f = f2 / ((float) bounds.width());
            } else {
                f = f3 / ((float) bounds.height());
            }
            if (!SpotifyIconDrawable.this.k() || !SpotifyIconDrawable.this.c.c()) {
                canvas.scale(f, f);
            } else {
                canvas.scale(-f, f);
            }
            canvas.translate((-f2) / 2.0f, (-f3) / 2.0f);
            SpotifyIconDrawable.this.getClass();
            if (SpotifyIconDrawable.this.d) {
                canvas.drawPath(SpotifyIconDrawable.this.h, SpotifyIconDrawable.this.g);
            } else {
                canvas.drawText(SpotifyIconDrawable.this.p(), 0, 1, 0.0f, 0.0f, SpotifyIconDrawable.this.g);
            }
            canvas.restoreToCount(save);
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public int c() {
            return (int) Math.ceil((double) SpotifyIconDrawable.this.k[0]);
        }
    }

    private class d implements e {
        private int a;
        private int b;
        private int c;
        private int d;

        d(a aVar) {
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public int a() {
            return SpotifyIconDrawable.this.j.height() + this.b + this.d;
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public void b(Canvas canvas) {
            int save = canvas.save();
            SpotifyIconDrawable.this.getBounds();
            SpotifyIconDrawable.this.getClass();
            canvas.translate((float) (this.a - SpotifyIconDrawable.this.j.left), ((float) this.b) + SpotifyIconDrawable.this.l);
            if (SpotifyIconDrawable.this.d) {
                canvas.drawPath(SpotifyIconDrawable.this.h, SpotifyIconDrawable.this.g);
            } else {
                canvas.drawText(SpotifyIconDrawable.this.p(), 0, 1, 0.0f, 0.0f, SpotifyIconDrawable.this.g);
            }
            canvas.restoreToCount(save);
        }

        @Override // com.spotify.paste.spotifyicon.SpotifyIconDrawable.e
        public int c() {
            return (SpotifyIconDrawable.this.j.right - SpotifyIconDrawable.this.j.left) + this.a + this.c;
        }

        /* access modifiers changed from: package-private */
        public void d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    private interface e {
        int a();

        void b(Canvas canvas);

        int c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public SpotifyIconDrawable(Context context, SpotifyIcon spotifyIcon, float f2) {
        this(context, spotifyIcon.g(), f2);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ADD_TO_PLAYLIST;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean k() {
        LayoutDirectionOverride layoutDirectionOverride = this.s;
        if (layoutDirectionOverride == LayoutDirectionOverride.RTL) {
            return true;
        }
        if (layoutDirectionOverride == LayoutDirectionOverride.DEVICE && androidx.core.graphics.drawable.a.b(this) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String p() {
        if (this.c.c()) {
            return this.c.a();
        }
        return k() ? this.c.b() : this.c.a();
    }

    private void x() {
        this.g.setAlpha((Color.alpha(this.e) * this.f) / BitmapRenderer.ALPHA_VISIBLE);
    }

    private void y() {
        this.c = this.a.d(Math.round(this.b / this.r));
    }

    private void z() {
        this.g.getTextBounds(this.c.a(), 0, 1, this.j);
        this.g.getTextWidths(this.c.a(), 0, 1, this.k);
        float f2 = this.b;
        this.m = -1.0064484f * f2;
        this.l = f2 * 1.0233134f;
        if (this.d) {
            this.h.reset();
            this.g.getTextPath(this.c.a(), 0, 1, 0.0f, 0.0f, this.h);
            this.h.close();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.q.b(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.q.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.q.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Paint paint = this.g;
        if (paint.getXfermode() != null) {
            return -3;
        }
        int alpha = paint.getAlpha();
        if (alpha == 0) {
            return -2;
        }
        return alpha == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.i != null;
    }

    public void l() {
        this.q = this.p;
        invalidateSelf();
    }

    public void m(int i2, int i3, int i4, int i5) {
        this.o.d(i2, i3, i4, i5);
        this.q = this.o;
        invalidateSelf();
    }

    public String n() {
        return p();
    }

    public SpotifyIconV2 o() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.i;
        if (colorStateList == null) {
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, this.e);
        this.e = colorForState;
        this.g.setColor(colorForState);
        x();
        invalidateSelf();
        return true;
    }

    public float q() {
        return this.b;
    }

    public void r(int i2) {
        this.i = null;
        this.e = i2;
        this.g.setColor(i2);
        x();
        invalidateSelf();
    }

    public void s(ColorStateList colorStateList) {
        this.i = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f = i2;
        x();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z) {
        if (!z) {
            this.h = null;
        } else if (!this.d) {
            this.h = new Path();
        }
        this.d = z;
        z();
        invalidateSelf();
    }

    public void u(SpotifyIconV2 spotifyIconV2) {
        this.a = spotifyIconV2;
        y();
        z();
        invalidateSelf();
    }

    public void v(float f2, float f3, float f4, int i2) {
        this.g.setShadowLayer(f2, f3, f4, i2);
        invalidateSelf();
    }

    public void w(float f2) {
        this.b = f2;
        this.g.setTextSize(f2);
        y();
        z();
        invalidateSelf();
    }

    @Deprecated
    public SpotifyIconDrawable(Context context, SpotifyIcon spotifyIcon) {
        this(context, spotifyIcon, (float) nud.g((float) spotifyIcon.d(), context.getResources()));
    }

    public SpotifyIconDrawable(Context context, SpotifyIconV2 spotifyIconV2, float f2) {
        this.e = -1;
        this.f = BitmapRenderer.ALPHA_VISIBLE;
        this.j = new Rect();
        this.k = new float[1];
        c cVar = new c(null);
        this.n = cVar;
        this.o = new d(null);
        this.p = new b(null);
        this.q = cVar;
        this.s = LayoutDirectionOverride.DEVICE;
        this.a = spotifyIconV2;
        this.b = f2;
        this.r = context.getResources().getDisplayMetrics().density;
        y();
        Typeface e2 = i2.e(context, C0707R.font.spoticon);
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(this.e);
        paint.setTypeface(e2);
        paint.setTextSize(f2);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        z();
    }
}
