package android.support.wearable.complications.rendering;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.rendering.ComplicationStyle;
import android.text.Layout;
import android.text.TextPaint;

class f {
    b A = null;
    private TextPaint B = null;
    private TextPaint C = null;
    private ComplicationStyle D;
    private ComplicationStyle E;
    private a F;
    private final Context a;
    private ComplicationData b;
    private final Rect c = new Rect();
    private CharSequence d = "";
    private boolean e;
    private boolean f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private final h l = new h();
    private final h m = new h();
    private final h n = new h();
    private final i o = new i();
    private final i p = new i();
    private final Rect q = new Rect();
    private final RectF r = new RectF();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    private final RectF y = new RectF();
    b z = null;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    /* access modifiers changed from: package-private */
    public static class b {
        final TextPaint a;
        final TextPaint b;
        final Paint c;
        final Paint d;
        final Paint e;
        final Paint f;
        final Paint g;
        final ComplicationStyle h;
        final boolean i;
        final boolean j;
        final boolean k;
        final ColorFilter l;

        b(ComplicationStyle complicationStyle, boolean z, boolean z2, boolean z3) {
            ColorFilter colorFilter;
            this.h = complicationStyle;
            this.i = z;
            this.j = z2;
            this.k = z3;
            boolean z4 = !z || !z2;
            if (z2) {
                ComplicationStyle.Builder builder = new ComplicationStyle.Builder(complicationStyle);
                if (complicationStyle.b() != -16777216) {
                    builder.b(0);
                }
                builder.q(-1);
                builder.t(-1);
                builder.m(-1);
                if (!(complicationStyle.d() == -16777216 || complicationStyle.d() == 0)) {
                    builder.e(-1);
                }
                builder.n(-1);
                if (complicationStyle.o() != -16777216) {
                    builder.p(0);
                }
                complicationStyle = builder.a();
            }
            TextPaint textPaint = new TextPaint();
            this.a = textPaint;
            textPaint.setColor(complicationStyle.p());
            textPaint.setAntiAlias(z4);
            textPaint.setTypeface(complicationStyle.r());
            textPaint.setTextSize((float) complicationStyle.q());
            textPaint.setAntiAlias(z4);
            if (z4) {
                colorFilter = new PorterDuffColorFilter(complicationStyle.l(), PorterDuff.Mode.SRC_IN);
            } else {
                int l2 = complicationStyle.l();
                colorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(l2), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.green(l2), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.blue(l2), 0.0f, 0.0f, 0.0f, 255.0f, -32385.0f}));
            }
            this.l = colorFilter;
            TextPaint textPaint2 = new TextPaint();
            this.b = textPaint2;
            textPaint2.setColor(complicationStyle.s());
            textPaint2.setAntiAlias(z4);
            textPaint2.setTypeface(complicationStyle.u());
            textPaint2.setTextSize((float) complicationStyle.t());
            textPaint2.setAntiAlias(z4);
            Paint paint = new Paint();
            this.c = paint;
            paint.setColor(complicationStyle.m());
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(z4);
            paint.setStrokeWidth((float) complicationStyle.n());
            Paint paint2 = new Paint();
            this.d = paint2;
            paint2.setColor(complicationStyle.o());
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(z4);
            paint2.setStrokeWidth((float) complicationStyle.n());
            Paint paint3 = new Paint();
            this.e = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setColor(complicationStyle.d());
            if (complicationStyle.h() == 2) {
                paint3.setPathEffect(new DashPathEffect(new float[]{(float) complicationStyle.f(), (float) complicationStyle.e()}, 0.0f));
            }
            if (complicationStyle.h() == 0) {
                paint3.setAlpha(0);
            }
            paint3.setStrokeWidth((float) complicationStyle.i());
            paint3.setAntiAlias(z4);
            Paint paint4 = new Paint();
            this.f = paint4;
            paint4.setColor(complicationStyle.b());
            paint4.setAntiAlias(z4);
            Paint paint5 = new Paint();
            this.g = paint5;
            paint5.setColor(complicationStyle.k());
            paint5.setAntiAlias(z4);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.i && this.k;
        }
    }

    public f(Context context, ComplicationStyle complicationStyle, ComplicationStyle complicationStyle2) {
        this.a = context;
        s(complicationStyle, complicationStyle2);
    }

    static void c(f fVar) {
        a aVar = fVar.F;
        if (aVar != null) {
            ComplicationDrawable.this.invalidateSelf();
        }
    }

    private void i() {
        u uVar;
        Layout.Alignment alignment;
        if (this.b != null && !this.c.isEmpty()) {
            this.q.set(0, 0, this.c.width(), this.c.height());
            this.r.set(0.0f, 0.0f, (float) this.c.width(), (float) this.c.height());
            switch (this.b.getType()) {
                case 3:
                case 9:
                    uVar = new x();
                    break;
                case 4:
                    uVar = new v();
                    break;
                case 5:
                    if (this.e) {
                        if (this.b.o() != null) {
                            uVar = new x();
                            break;
                        } else {
                            uVar = new s();
                            break;
                        }
                    } else {
                        uVar = new w();
                        break;
                    }
                case 6:
                    uVar = new s();
                    break;
                case 7:
                    uVar = new y();
                    break;
                case 8:
                    uVar = new t();
                    break;
                default:
                    uVar = new u();
                    break;
            }
            int width = this.c.width();
            int height = this.c.height();
            ComplicationData complicationData = this.b;
            uVar.u(width);
            uVar.t(height);
            uVar.s(complicationData);
            uVar.k(this.x);
            this.y.set(this.x);
            uVar.c(this.s);
            uVar.r(this.t);
            uVar.d(this.u);
            if (this.b.getType() == 4) {
                alignment = uVar.e();
                uVar.f(this.v);
                this.o.c(alignment);
                this.o.d(uVar.g());
                uVar.i(this.w);
                this.p.c(uVar.h());
                this.p.d(uVar.j());
            } else {
                alignment = uVar.l();
                uVar.m(this.v);
                this.o.c(alignment);
                this.o.d(uVar.n());
                uVar.p(this.w);
                this.p.c(uVar.o());
                this.p.d(uVar.q());
            }
            if (alignment != Layout.Alignment.ALIGN_CENTER) {
                float height2 = ((float) this.c.height()) * 0.1f;
                this.o.h(height2 / ((float) this.v.width()), 0.0f, 0.0f, 0.0f);
                this.p.h(height2 / ((float) this.v.width()), 0.0f, 0.0f, 0.0f);
            } else {
                this.o.h(0.0f, 0.0f, 0.0f, 0.0f);
                this.p.h(0.0f, 0.0f, 0.0f, 0.0f);
            }
            Rect rect = new Rect();
            rect.set(this.q);
            double max = (double) ((float) Math.max(k(this.D), k(this.E)));
            Double.isNaN(max);
            Double.isNaN(max);
            Double.isNaN(max);
            int ceil = (int) Math.ceil((Math.sqrt(2.0d) - 1.0d) * max);
            rect.inset(ceil, ceil);
            if (!this.v.intersect(rect)) {
                this.v.setEmpty();
            }
            if (!this.w.intersect(rect)) {
                this.w.setEmpty();
            }
            if (!this.s.isEmpty()) {
                Rect rect2 = this.s;
                q.i(rect2, rect2, 1.0f);
                q.a(this.s, rect);
            }
            if (!this.t.isEmpty()) {
                Rect rect3 = this.t;
                q.i(rect3, rect3, 0.95f);
                if (this.b.h() == 2) {
                    q.a(this.t, rect);
                }
            }
            if (!this.u.isEmpty()) {
                Rect rect4 = this.u;
                q.i(rect4, rect4, 1.0f);
            }
        }
    }

    private int k(ComplicationStyle complicationStyle) {
        if (this.c.isEmpty()) {
            return 0;
        }
        return Math.min(Math.min(this.c.height(), this.c.width()) / 2, complicationStyle.g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
        if (r6.i == null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016b, code lost:
        if (r6.j == null) goto L_0x01aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(android.graphics.Canvas r7, long r8, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 698
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.rendering.f.j(android.graphics.Canvas, long, boolean, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public ComplicationData l() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public int m(ComplicationStyle complicationStyle, Rect rect) {
        if (this.c.isEmpty()) {
            return 0;
        }
        return Math.max(k(complicationStyle) - Math.min(Math.min(rect.left, this.c.width() - rect.right), Math.min(rect.top, this.c.height() - rect.bottom)), 0);
    }

    public boolean n(Rect rect) {
        boolean z2 = (this.c.width() == rect.width() && this.c.height() == rect.height()) ? false : true;
        this.c.set(rect);
        if (z2) {
            i();
        }
        return z2;
    }

    public void o(ComplicationData complicationData) {
        Icon icon;
        Icon icon2;
        Icon icon3;
        Icon icon4;
        a aVar;
        if (!g.a(this.b, complicationData)) {
            Icon icon5 = null;
            if (complicationData == null) {
                this.b = null;
                return;
            }
            boolean z2 = false;
            boolean z3 = true;
            if (complicationData.getType() != 10) {
                this.b = complicationData;
                this.f = false;
            } else if (!this.f) {
                this.f = true;
                ComplicationData.b bVar = new ComplicationData.b(3);
                bVar.f(ComplicationText.a(this.d));
                this.b = bVar.c();
            } else {
                return;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            this.g = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.h = null;
            ComplicationData complicationData2 = this.b;
            if (complicationData2 != null) {
                icon5 = complicationData2.g();
                icon4 = this.b.e();
                icon3 = this.b.f();
                icon2 = this.b.q();
                icon = this.b.i();
            } else {
                icon4 = null;
                icon3 = null;
                icon2 = null;
                icon = null;
            }
            if (icon5 != null) {
                icon5.loadDrawableAsync(this.a, new a(this), handler);
                z2 = true;
            }
            if (icon4 != null) {
                icon4.loadDrawableAsync(this.a, new b(this), handler);
                z2 = true;
            }
            if (icon2 != null) {
                icon2.loadDrawableAsync(this.a, new c(this), handler);
                z2 = true;
            }
            if (icon3 != null) {
                icon3.loadDrawableAsync(this.a, new d(this), handler);
                z2 = true;
            }
            if (icon != null) {
                icon.loadDrawableAsync(this.a, new e(this), handler);
            } else {
                z3 = z2;
            }
            if (!z3 && (aVar = this.F) != null) {
                ComplicationDrawable.this.invalidateSelf();
            }
            i();
        }
    }

    public void p(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.d = charSequence.subSequence(0, charSequence.length());
        if (this.f) {
            this.f = false;
            o(new ComplicationData.b(10).c());
        }
    }

    public void q(a aVar) {
        this.F = aVar;
    }

    public void r(boolean z2) {
        if (this.e != z2) {
            this.e = z2;
            i();
        }
    }

    public void s(ComplicationStyle complicationStyle, ComplicationStyle complicationStyle2) {
        this.D = complicationStyle;
        this.E = complicationStyle2;
        this.z = new b(complicationStyle, false, false, false);
        this.A = new b(complicationStyle2, true, false, false);
        i();
    }
}
