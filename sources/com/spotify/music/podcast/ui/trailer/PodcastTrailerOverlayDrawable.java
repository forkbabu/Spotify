package com.spotify.music.podcast.ui.trailer;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.podcast.ui.trailer.d;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
public class PodcastTrailerOverlayDrawable extends Drawable implements Runnable, d.a {
    private e A;
    private long B = Long.MAX_VALUE;
    private int C = BitmapRenderer.ALPHA_VISIBLE;
    private int D = BitmapRenderer.ALPHA_VISIBLE;
    private int E;
    private float F;
    private long G;
    private long H;
    private final ColorFilter I;
    private final cqe J;
    private State K = State.IDLE;
    private Bitmap a;
    private int b;
    private int c;
    private final int f;
    private final Paint n = new Paint();
    private final Rect o = new Rect();
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final Paint r;
    private final BitmapShader s;
    private final Matrix t = new Matrix();
    private final RectF u = new RectF();
    private final SpotifyIconDrawable v;
    private final SpotifyIconDrawable w;
    private final d x;
    private final float y;
    private boolean z;

    public enum State {
        IDLE,
        PROGRESS
    }

    public PodcastTrailerOverlayDrawable(Bitmap bitmap, int i, int i2, int i3, SpotifyIconDrawable spotifyIconDrawable, SpotifyIconDrawable spotifyIconDrawable2, float f2, d dVar, cqe cqe) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.v = spotifyIconDrawable;
        this.w = spotifyIconDrawable2;
        this.y = f2;
        this.x = dVar;
        this.J = cqe;
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.FILL);
        Bitmap bitmap2 = this.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.s = bitmapShader;
        paint.setShader(bitmapShader);
        f();
        int round = Math.round(204.0f);
        this.I = new LightingColorFilter(Color.rgb(round, round, round), 0);
    }

    private static int c(long j, long j2, int i) {
        return Math.max(0, Math.min((((int) (j - j2)) * BitmapRenderer.ALPHA_VISIBLE) / i, (int) BitmapRenderer.ALPHA_VISIBLE));
    }

    private static int d(long j, long j2, int i) {
        return BitmapRenderer.ALPHA_VISIBLE - Math.max(0, Math.min((((int) (j - j2)) * BitmapRenderer.ALPHA_VISIBLE) / i, (int) BitmapRenderer.ALPHA_VISIBLE));
    }

    private void f() {
        int i;
        this.p.set(0.0f, 0.0f, (float) this.b, (float) this.c);
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        float f2 = (float) width;
        float f3 = (float) height;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = 0;
        if (f2 / f3 > ((float) i2) / ((float) i3)) {
            i4 = Math.round((f2 - (((float) i2) * (f3 / ((float) i3)))) / 2.0f);
            i = 0;
        } else {
            i = Math.round((f3 - (((float) i3) * (f2 / ((float) i2)))) / 2.0f);
        }
        this.o.set(i4, i, width - i4, height - i);
        float intrinsicWidth = (((float) this.b) - (((float) this.v.getIntrinsicWidth()) * 2.0f)) / 2.0f;
        this.q.set(intrinsicWidth, intrinsicWidth, ((float) this.b) - intrinsicWidth, ((float) this.c) - intrinsicWidth);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r10 = this;
            cqe r0 = r10.J
            long r0 = r0.a()
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r2 = r10.K
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r3 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.IDLE
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 255(0xff, float:3.57E-43)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != r3) goto L_0x0022
            int r2 = r10.D
            if (r2 >= r5) goto L_0x0030
            long r2 = r10.G
            int r2 = c(r0, r2, r4)
            r10.D = r2
            goto L_0x002e
        L_0x0022:
            int r2 = r10.D
            if (r2 <= 0) goto L_0x0030
            long r2 = r10.G
            int r2 = d(r0, r2, r4)
            r10.D = r2
        L_0x002e:
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r2 = r6
        L_0x0031:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r4 = r10.K
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r8 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.PROGRESS
            r9 = 300(0x12c, float:4.2E-43)
            if (r4 != r8) goto L_0x006b
            int r2 = r10.E
            if (r2 >= r5) goto L_0x0045
            long r2 = r10.H
            int r2 = c(r0, r2, r9)
            r10.E = r2
        L_0x0045:
            com.spotify.music.podcast.ui.trailer.e r2 = r10.A
            java.lang.Long r2 = r2.c()
            long r2 = r2.longValue()
            long r2 = r2 + r0
            com.spotify.music.podcast.ui.trailer.e r4 = r10.A
            java.lang.Long r4 = r4.d()
            long r4 = r4.longValue()
            long r2 = r2 - r4
            float r2 = (float) r2
            com.spotify.music.podcast.ui.trailer.e r3 = r10.A
            java.lang.Long r3 = r3.b()
            long r3 = r3.longValue()
            float r3 = (float) r3
            float r2 = r2 / r3
            r10.F = r2
            goto L_0x0077
        L_0x006b:
            int r4 = r10.E
            if (r4 <= 0) goto L_0x0078
            long r2 = r10.H
            int r2 = d(r0, r2, r9)
            r10.E = r2
        L_0x0077:
            r2 = r0
        L_0x0078:
            r4 = 16
            long r0 = r0 + r4
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r10.B
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x008d
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x008d
            r10.scheduleSelf(r10, r0)
            goto L_0x0097
        L_0x008d:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0097
            r10.unscheduleSelf(r10)
            r10.scheduleSelf(r10, r0)
        L_0x0097:
            r10.B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.g():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    @Override // com.spotify.music.podcast.ui.trailer.d.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.spotify.music.podcast.ui.trailer.e r10) {
        /*
            r9 = this;
            cqe r0 = r9.J
            long r0 = r0.a()
            java.lang.Long r2 = r10.b()
            long r2 = r2.longValue()
            r4 = 0
            r5 = 1
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0027
            java.lang.Long r2 = r10.c()
            java.lang.Long r3 = r10.b()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x004b
            java.lang.Long r2 = r10.b()
            long r2 = r2.longValue()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0045
            java.lang.Long r2 = r10.c()
            java.lang.Long r3 = r10.b()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0045
            r4 = 1
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r2 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.PROGRESS
            goto L_0x004d
        L_0x004b:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r2 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.IDLE
        L_0x004d:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r3 = r9.K
            if (r3 == r2) goto L_0x0097
            int r3 = r2.ordinal()
            if (r3 == 0) goto L_0x0066
            if (r3 == r5) goto L_0x005a
            goto L_0x0071
        L_0x005a:
            int r3 = r9.E
            int r3 = r3 * 300
            int r3 = r3 / 255
            long r3 = (long) r3
            long r3 = r0 - r3
            r9.H = r3
            goto L_0x0071
        L_0x0066:
            int r3 = r9.D
            int r3 = r3 * 200
            int r3 = r3 / 255
            long r3 = (long) r3
            long r3 = r0 - r3
            r9.G = r3
        L_0x0071:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r3 = r9.K
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0089
            if (r3 == r5) goto L_0x007c
            goto L_0x0095
        L_0x007c:
            int r3 = r9.E
            int r3 = 255 - r3
            int r3 = r3 * 300
            int r3 = r3 / 255
            long r3 = (long) r3
            long r0 = r0 - r3
            r9.H = r0
            goto L_0x0095
        L_0x0089:
            int r3 = r9.D
            int r3 = 255 - r3
            int r3 = r3 * 200
            int r3 = r3 / 255
            long r3 = (long) r3
            long r0 = r0 - r3
            r9.G = r0
        L_0x0095:
            r9.K = r2
        L_0x0097:
            r9.A = r10
            r9.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.a(com.spotify.music.podcast.ui.trailer.e):void");
    }

    /* access modifiers changed from: package-private */
    public void b(SpotifyIconDrawable spotifyIconDrawable, Canvas canvas, int i) {
        int intrinsicWidth = spotifyIconDrawable.getIntrinsicWidth();
        int intrinsicHeight = spotifyIconDrawable.getIntrinsicHeight();
        int i2 = (this.b - intrinsicWidth) / 2;
        int i3 = (this.c - intrinsicHeight) / 2;
        spotifyIconDrawable.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
        spotifyIconDrawable.setAlpha(i);
        spotifyIconDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        g();
        int i = (this.D * this.C) / BitmapRenderer.ALPHA_VISIBLE;
        if (i > 0) {
            Rect bounds = getBounds();
            this.t.reset();
            this.t.setScale(((float) bounds.width()) / ((float) this.a.getWidth()), ((float) bounds.height()) / ((float) this.a.getHeight()));
            this.s.setLocalMatrix(this.t);
            this.r.setAlpha(i);
            this.r.setColorFilter(this.I);
            this.u.set(bounds);
            RectF rectF = this.u;
            int i2 = this.f;
            canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.r);
            this.r.setColorFilter(null);
            b(this.v, canvas, i);
        }
        int i3 = (this.E * this.C) / BitmapRenderer.ALPHA_VISIBLE;
        if (i3 > 0) {
            this.n.setStyle(Paint.Style.STROKE);
            this.n.setColor(s2.h(-1, i3));
            this.n.setStrokeWidth(this.y);
            this.n.setAntiAlias(true);
            canvas.drawArc(this.q, -90.0f, this.F * 360.0f, false, this.n);
            b(this.w, canvas, i3);
        }
    }

    public void e(Bitmap bitmap) {
        if (this.a != bitmap) {
            this.a = bitmap;
            f();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b = rect.width();
        this.c = rect.height();
        f();
    }

    @Override // java.lang.Runnable
    public void run() {
        invalidateSelf();
        long j = this.B;
        if (j != Long.MAX_VALUE) {
            scheduleSelf(this, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.C = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        if (z2 && !this.z) {
            this.z = true;
            this.x.a(this);
        } else if (!z2 && this.z) {
            this.z = false;
            this.x.d(this);
        }
        return super.setVisible(z2, z3);
    }
}
