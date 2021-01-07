package com.spotify.music.preview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import com.spotify.music.preview.q;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class PreviewOverlayDrawable extends Drawable implements Runnable, q.b {
    private long A = Long.MAX_VALUE;
    private int B = BitmapRenderer.ALPHA_VISIBLE;
    private int C = BitmapRenderer.ALPHA_VISIBLE;
    private int D;
    private int E;
    private float F;
    private long G;
    private long H;
    private long I;
    private final ColorFilter J;
    private final cqe K;
    private final boolean L;
    private State M = State.IDLE;
    private Bitmap a;
    private int b;
    private int c;
    private final Drawable f;
    private final String n;
    private final String o;
    private final int p;
    private final Paint q = new Paint();
    private final Rect r = new Rect();
    private final RectF s = new RectF();
    private final RectF t = new RectF();
    private final SpotifyIconDrawable u;
    private final SpotifyIconDrawable v;
    private final q w;
    private final float x;
    private boolean y;
    private z z;

    /* access modifiers changed from: private */
    public enum State {
        IDLE,
        LOADING,
        PROGRESS
    }

    public PreviewOverlayDrawable(Bitmap bitmap, int i, int i2, int i3, SpotifyIconDrawable spotifyIconDrawable, SpotifyIconDrawable spotifyIconDrawable2, float f2, Drawable drawable, String str, String str2, boolean z2, q qVar, cqe cqe, boolean z3) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.u = spotifyIconDrawable;
        this.v = spotifyIconDrawable2;
        this.x = f2;
        this.f = drawable;
        this.n = str;
        this.o = str2;
        this.w = qVar;
        this.K = cqe;
        this.L = z3;
        this.p = i3;
        h();
        int round = Math.round((z2 ? 0.4f : 0.8f) * 255.0f);
        this.J = new LightingColorFilter(Color.rgb(round, round, round), 0);
    }

    private static int c(long j, long j2, int i) {
        return Math.max(0, Math.min((((int) (j - j2)) * BitmapRenderer.ALPHA_VISIBLE) / i, (int) BitmapRenderer.ALPHA_VISIBLE));
    }

    private static long d(long j, int i, int i2, int i3) {
        if (i3 > 0 && i == 0) {
            j += (long) i3;
        }
        return j - ((long) ((i * i2) / BitmapRenderer.ALPHA_VISIBLE));
    }

    private static int e(long j, long j2, int i) {
        return BitmapRenderer.ALPHA_VISIBLE - Math.max(0, Math.min((((int) (j - j2)) * BitmapRenderer.ALPHA_VISIBLE) / i, (int) BitmapRenderer.ALPHA_VISIBLE));
    }

    private static long f(long j, int i, int i2) {
        return j - ((long) (((255 - i) * i2) / BitmapRenderer.ALPHA_VISIBLE));
    }

    private void h() {
        int i;
        this.s.set(0.0f, 0.0f, (float) this.b, (float) this.c);
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
        this.r.set(i4, i, width - i4, height - i);
        float intrinsicWidth = (((float) this.b) - (((float) this.v.getIntrinsicWidth()) * 2.0f)) / 2.0f;
        this.t.set(intrinsicWidth, intrinsicWidth, ((float) this.b) - intrinsicWidth, ((float) this.c) - intrinsicWidth);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r10 = this;
            cqe r0 = r10.K
            long r0 = r0.a()
            com.spotify.music.preview.PreviewOverlayDrawable$State r2 = r10.M
            com.spotify.music.preview.PreviewOverlayDrawable$State r3 = com.spotify.music.preview.PreviewOverlayDrawable.State.IDLE
            r4 = 255(0xff, float:3.57E-43)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x0022
            int r2 = r10.C
            if (r2 >= r4) goto L_0x0030
            long r2 = r10.G
            int r2 = c(r0, r2, r7)
            r10.C = r2
            goto L_0x002e
        L_0x0022:
            int r2 = r10.C
            if (r2 <= 0) goto L_0x0030
            long r2 = r10.G
            int r2 = e(r0, r2, r7)
            r10.C = r2
        L_0x002e:
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r2 = r5
        L_0x0031:
            com.spotify.music.preview.PreviewOverlayDrawable$State r8 = r10.M
            com.spotify.music.preview.PreviewOverlayDrawable$State r9 = com.spotify.music.preview.PreviewOverlayDrawable.State.LOADING
            if (r8 != r9) goto L_0x0049
            int r2 = r10.D
            if (r2 >= r4) goto L_0x0055
            long r2 = r10.I
            int r2 = c(r0, r2, r7)
            r10.D = r2
            if (r2 <= 0) goto L_0x0046
            goto L_0x0055
        L_0x0046:
            long r2 = r10.I
            goto L_0x0056
        L_0x0049:
            int r8 = r10.D
            if (r8 <= 0) goto L_0x0056
            long r2 = r10.I
            int r2 = e(r0, r2, r7)
            r10.D = r2
        L_0x0055:
            r2 = r0
        L_0x0056:
            com.spotify.music.preview.PreviewOverlayDrawable$State r7 = r10.M
            com.spotify.music.preview.PreviewOverlayDrawable$State r8 = com.spotify.music.preview.PreviewOverlayDrawable.State.PROGRESS
            r9 = 300(0x12c, float:4.2E-43)
            if (r7 != r8) goto L_0x0090
            int r2 = r10.E
            if (r2 >= r4) goto L_0x006a
            long r2 = r10.H
            int r2 = c(r0, r2, r9)
            r10.E = r2
        L_0x006a:
            com.spotify.music.preview.z r2 = r10.z
            java.lang.Long r2 = r2.f()
            long r2 = r2.longValue()
            long r2 = r2 + r0
            com.spotify.music.preview.z r4 = r10.z
            java.lang.Long r4 = r4.i()
            long r7 = r4.longValue()
            long r2 = r2 - r7
            float r2 = (float) r2
            com.spotify.music.preview.z r3 = r10.z
            java.lang.Long r3 = r3.a()
            long r3 = r3.longValue()
            float r3 = (float) r3
            float r2 = r2 / r3
            r10.F = r2
            goto L_0x009c
        L_0x0090:
            int r4 = r10.E
            if (r4 <= 0) goto L_0x009d
            long r2 = r10.H
            int r2 = e(r0, r2, r9)
            r10.E = r2
        L_0x009c:
            r2 = r0
        L_0x009d:
            r7 = 16
            long r0 = r0 + r7
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r10.A
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x00b2
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00b2
            r10.scheduleSelf(r10, r0)
            goto L_0x00bc
        L_0x00b2:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bc
            r10.unscheduleSelf(r10)
            r10.scheduleSelf(r10, r0)
        L_0x00bc:
            r10.A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.preview.PreviewOverlayDrawable.i():void");
    }

    @Override // com.spotify.music.preview.q.b
    public void a(z zVar) {
        long a2 = this.K.a();
        State state = State.IDLE;
        if (zVar.g().equals(this.n) && ((TextUtils.isEmpty(this.o) || this.o.equals(zVar.h())) && zVar.e() && !zVar.b())) {
            state = zVar.d() ? State.LOADING : State.PROGRESS;
        }
        if (this.M != state) {
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                this.G = d(a2, this.C, 200, 0);
            } else if (ordinal == 1) {
                this.I = d(a2, this.D, 200, 500);
            } else if (ordinal == 2) {
                this.H = d(a2, this.E, 300, 0);
            }
            int ordinal2 = this.M.ordinal();
            if (ordinal2 == 0) {
                this.G = f(a2, this.C, 200);
            } else if (ordinal2 == 1) {
                this.I = f(a2, this.D, 200);
            } else if (ordinal2 == 2) {
                this.H = f(a2, this.E, 300);
            }
            this.M = state;
        }
        this.z = zVar;
        i();
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
        SpotifyIconDrawable spotifyIconDrawable;
        i();
        int i = (this.C * this.B) / BitmapRenderer.ALPHA_VISIBLE;
        if (i > 0) {
            this.q.setAlpha(i);
            if (this.L && this.u != null) {
                this.q.setColorFilter(this.J);
            }
            if (this.p > 0) {
                Path path = new Path();
                RectF rectF = this.s;
                int i2 = this.p;
                path.addRoundRect(rectF, (float) i2, (float) i2, Path.Direction.CW);
                canvas.clipPath(path);
            }
            canvas.drawBitmap(this.a, this.r, this.s, this.q);
            this.q.setColorFilter(null);
            if ((!TextUtils.isEmpty(this.n) && this.L) && (spotifyIconDrawable = this.u) != null) {
                b(spotifyIconDrawable, canvas, i);
            }
        }
        if ((this.D * this.B) / BitmapRenderer.ALPHA_VISIBLE > 0) {
            int a2 = ((((int) this.K.a()) % SnackbarUtilsKt.SNACKBAR_ACTION_DURATION) * 10000) / SnackbarUtilsKt.SNACKBAR_ACTION_DURATION;
            this.f.setBounds(0, 0, this.b, this.c);
            this.f.setAlpha(this.D);
            this.f.setLevel(a2);
            this.f.draw(canvas);
        }
        int i3 = (this.E * this.B) / BitmapRenderer.ALPHA_VISIBLE;
        if (i3 > 0) {
            this.q.setStyle(Paint.Style.STROKE);
            this.q.setColor(s2.h(-1, i3));
            this.q.setStrokeWidth(this.x);
            this.q.setAntiAlias(true);
            canvas.drawArc(this.t, -90.0f, this.F * 360.0f, false, this.q);
            b(this.v, canvas, i3);
        }
    }

    public void g(Bitmap bitmap) {
        if (this.a != bitmap) {
            this.a = bitmap;
            h();
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
        h();
    }

    @Override // java.lang.Runnable
    public void run() {
        invalidateSelf();
        long j = this.A;
        if (j != Long.MAX_VALUE) {
            scheduleSelf(this, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.B = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        if (z2 && !this.y) {
            this.y = true;
            this.w.a(this);
        } else if (!z2 && this.y) {
            this.y = false;
            this.w.d(this);
        }
        return super.setVisible(z2, z3);
    }
}
