package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import defpackage.ix;

public final class a {
    private static final boolean Z = (Build.VERSION.SDK_INT < 18);
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private final TextPaint I;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private ColorStateList O;
    private float P;
    private float Q;
    private float R;
    private ColorStateList S;
    private StaticLayout T;
    private float U;
    private float V;
    private float W;
    private CharSequence X;
    private int Y = 1;
    private final View a;
    private boolean b;
    private float c;
    private final Rect d;
    private final Rect e;
    private final RectF f;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private ix v;
    private ix w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0109a implements ix.a {
        C0109a() {
        }

        @Override // defpackage.ix.a
        public void a(Typeface typeface) {
            a.this.D(typeface);
        }
    }

    class b implements ix.a {
        b() {
        }

        @Override // defpackage.ix.a
        public void a(Typeface typeface) {
            a.this.K(typeface);
        }
    }

    public a(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.H = textPaint;
        this.I = new TextPaint(textPaint);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    private void M(float f2) {
        e(f2);
        boolean z2 = Z && this.D != 1.0f;
        this.A = z2;
        if (z2 && this.B == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.y)) {
            d(0.0f);
            int width = this.T.getWidth();
            int height = this.T.getHeight();
            if (width > 0 && height > 0) {
                this.B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.T.draw(new Canvas(this.B));
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
        View view = this.a;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), (int) ((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), (int) ((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), (int) ((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    private boolean c(CharSequence charSequence) {
        boolean z2 = true;
        if (q4.o(this.a) != 1) {
            z2 = false;
        }
        return (z2 ? o3.d : o3.c).a(charSequence, 0, charSequence.length());
    }

    private void d(float f2) {
        this.f.left = u((float) this.d.left, (float) this.e.left, f2, this.J);
        this.f.top = u(this.m, this.n, f2, this.J);
        this.f.right = u((float) this.d.right, (float) this.e.right, f2, this.J);
        this.f.bottom = u((float) this.d.bottom, (float) this.e.bottom, f2, this.J);
        this.q = u(this.o, this.p, f2, this.J);
        this.r = u(this.m, this.n, f2, this.J);
        M(u(this.i, this.j, f2, this.K));
        TimeInterpolator timeInterpolator = qw.b;
        this.U = 1.0f - u(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.a;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
        this.V = u(1.0f, 0.0f, f2, timeInterpolator);
        this.a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        if (colorStateList != colorStateList2) {
            this.H.setColor(a(n(colorStateList2), m(), f2));
        } else {
            this.H.setColor(m());
        }
        this.H.setShadowLayer(u(this.P, this.L, f2, null), u(this.Q, this.M, f2, null), u(this.R, this.N, f2, null), a(n(this.S), n(this.O), f2));
        this.a.postInvalidateOnAnimation();
    }

    private void e(float f2) {
        float f3;
        boolean z2;
        StaticLayout staticLayout;
        if (this.x != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.d.width();
            int i2 = 1;
            if (Math.abs(f2 - this.j) < 0.001f) {
                f3 = this.j;
                this.D = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f2 - f4) < 0.001f) {
                    this.D = 1.0f;
                } else {
                    this.D = f2 / this.i;
                }
                float f5 = this.j / this.i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
            }
            if (width > 0.0f) {
                z2 = this.E != f3 || this.G || z2;
                this.E = f3;
                this.G = false;
            }
            if (this.y == null || z2) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.u);
                this.H.setLinearText(this.D != 1.0f);
                boolean c2 = c(this.x);
                this.z = c2;
                int i3 = this.Y;
                if (i3 > 1 && !c2 && !this.A) {
                    i2 = i3;
                }
                try {
                    StaticLayoutBuilderCompat b2 = StaticLayoutBuilderCompat.b(this.x, this.H, (int) width);
                    b2.d(TextUtils.TruncateAt.END);
                    b2.f(c2);
                    b2.c(Layout.Alignment.ALIGN_NORMAL);
                    b2.e(false);
                    b2.g(i2);
                    staticLayout = b2.a();
                } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e2) {
                    Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.T = staticLayout;
                this.y = staticLayout.getText();
            }
        }
    }

    private void f() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private int n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private static float u(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        TimeInterpolator timeInterpolator2 = qw.a;
        return je.a(f3, f2, f4, f2);
    }

    private static boolean x(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public void A(int i2) {
        kx kxVar = new kx(this.a.getContext(), i2);
        ColorStateList colorStateList = kxVar.b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f2 = kxVar.a;
        if (f2 != 0.0f) {
            this.j = f2;
        }
        ColorStateList colorStateList2 = kxVar.f;
        if (colorStateList2 != null) {
            this.O = colorStateList2;
        }
        this.M = kxVar.g;
        this.N = kxVar.h;
        this.L = kxVar.i;
        ix ixVar = this.w;
        if (ixVar != null) {
            ixVar.c();
        }
        this.w = new ix(new C0109a(), kxVar.e());
        kxVar.f(this.a.getContext(), this.w);
        w();
    }

    public void B(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            w();
        }
    }

    public void C(int i2) {
        if (this.h != i2) {
            this.h = i2;
            w();
        }
    }

    public void D(Typeface typeface) {
        boolean z2;
        ix ixVar = this.w;
        if (ixVar != null) {
            ixVar.c();
        }
        if (this.s != typeface) {
            this.s = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            w();
        }
    }

    public void E(int i2, int i3, int i4, int i5) {
        if (!x(this.d, i2, i3, i4, i5)) {
            this.d.set(i2, i3, i4, i5);
            this.G = true;
            v();
        }
    }

    public void F(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (!x(this.d, i2, i3, i4, i5)) {
            this.d.set(i2, i3, i4, i5);
            this.G = true;
            v();
        }
    }

    public void G(int i2) {
        kx kxVar = new kx(this.a.getContext(), i2);
        ColorStateList colorStateList = kxVar.b;
        if (colorStateList != null) {
            this.k = colorStateList;
        }
        float f2 = kxVar.a;
        if (f2 != 0.0f) {
            this.i = f2;
        }
        ColorStateList colorStateList2 = kxVar.f;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = kxVar.g;
        this.R = kxVar.h;
        this.P = kxVar.i;
        ix ixVar = this.v;
        if (ixVar != null) {
            ixVar.c();
        }
        this.v = new ix(new b(), kxVar.e());
        kxVar.f(this.a.getContext(), this.v);
        w();
    }

    public void H(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            w();
        }
    }

    public void I(int i2) {
        if (this.g != i2) {
            this.g = i2;
            w();
        }
    }

    public void J(float f2) {
        if (this.i != f2) {
            this.i = f2;
            w();
        }
    }

    public void K(Typeface typeface) {
        boolean z2;
        ix ixVar = this.v;
        if (ixVar != null) {
            ixVar.c();
        }
        if (this.t != typeface) {
            this.t = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            w();
        }
    }

    public void L(float f2) {
        float e2 = e2.e(f2, 0.0f, 1.0f);
        if (e2 != this.c) {
            this.c = e2;
            d(e2);
        }
    }

    public void N(int i2) {
        if (i2 != this.Y) {
            this.Y = i2;
            f();
            w();
        }
    }

    public void O(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        w();
    }

    public final boolean P(int[] iArr) {
        ColorStateList colorStateList;
        this.F = iArr;
        ColorStateList colorStateList2 = this.l;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful()))) {
            return false;
        }
        w();
        return true;
    }

    public void Q(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            f();
            w();
        }
    }

    public void R(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        w();
    }

    public void S(Typeface typeface) {
        boolean z2;
        ix ixVar = this.w;
        if (ixVar != null) {
            ixVar.c();
        }
        boolean z3 = false;
        if (this.s != typeface) {
            this.s = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        ix ixVar2 = this.v;
        if (ixVar2 != null) {
            ixVar2.c();
        }
        if (this.t != typeface) {
            this.t = typeface;
            z3 = true;
        }
        if (z2 || z3) {
            w();
        }
    }

    public float b() {
        if (this.x == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.I;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        TextPaint textPaint2 = this.I;
        CharSequence charSequence = this.x;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public void g(Canvas canvas) {
        int save = canvas.save();
        if (this.y != null && this.b) {
            float lineLeft = (this.T.getLineLeft(0) + this.q) - (this.W * 2.0f);
            this.H.setTextSize(this.E);
            float f2 = this.q;
            float f3 = this.r;
            boolean z2 = true;
            boolean z3 = this.A && this.B != null;
            float f4 = this.D;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (z3) {
                canvas.drawBitmap(this.B, f2, f3, this.C);
                canvas.restoreToCount(save);
                return;
            }
            if (this.Y <= 1 || this.z || this.A) {
                z2 = false;
            }
            if (z2) {
                int alpha = this.H.getAlpha();
                canvas.translate(lineLeft, f3);
                float f5 = (float) alpha;
                this.H.setAlpha((int) (this.V * f5));
                this.T.draw(canvas);
                this.H.setAlpha((int) (this.U * f5));
                int lineBaseline = this.T.getLineBaseline(0);
                CharSequence charSequence = this.X;
                float f6 = (float) lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, this.H);
                String trim = this.X.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                this.H.setAlpha(alpha);
                canvas.drawText(trim, 0, Math.min(this.T.getLineEnd(0), trim.length()), 0.0f, f6, (Paint) this.H);
            } else {
                canvas.translate(f2, f3);
                this.T.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void h(RectF rectF, int i2, int i3) {
        float f2;
        float f3;
        int i4;
        float b2;
        float f4;
        float b3;
        int i5;
        boolean c2 = c(this.x);
        this.z = c2;
        if (i3 == 17 || (i3 & 7) == 1) {
            f4 = ((float) i2) / 2.0f;
            b3 = b() / 2.0f;
        } else {
            if ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) {
                if (c2) {
                    i5 = this.e.left;
                } else {
                    f4 = (float) this.e.right;
                    b3 = b();
                }
            } else if (c2) {
                f4 = (float) this.e.right;
                b3 = b();
            } else {
                i5 = this.e.left;
            }
            f2 = (float) i5;
            rectF.left = f2;
            Rect rect = this.e;
            rectF.top = (float) rect.top;
            if (i3 != 17 || (i3 & 7) == 1) {
                f3 = (((float) i2) / 2.0f) + (b() / 2.0f);
            } else {
                if ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) {
                    if (this.z) {
                        b2 = b();
                        f3 = b2 + f2;
                    } else {
                        i4 = rect.right;
                    }
                } else if (this.z) {
                    i4 = rect.right;
                } else {
                    b2 = b();
                    f3 = b2 + f2;
                }
                f3 = (float) i4;
            }
            rectF.right = f3;
            rectF.bottom = k() + ((float) this.e.top);
        }
        f2 = f4 - b3;
        rectF.left = f2;
        Rect rect2 = this.e;
        rectF.top = (float) rect2.top;
        if (i3 != 17) {
        }
        f3 = (((float) i2) / 2.0f) + (b() / 2.0f);
        rectF.right = f3;
        rectF.bottom = k() + ((float) this.e.top);
    }

    public ColorStateList i() {
        return this.l;
    }

    public int j() {
        return this.h;
    }

    public float k() {
        TextPaint textPaint = this.I;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        return -this.I.ascent();
    }

    public Typeface l() {
        Typeface typeface = this.s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int m() {
        return n(this.l);
    }

    public int o() {
        return this.g;
    }

    public float p() {
        TextPaint textPaint = this.I;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
        return -this.I.ascent();
    }

    public Typeface q() {
        Typeface typeface = this.t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float r() {
        return this.c;
    }

    public int s() {
        return this.Y;
    }

    public CharSequence t() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void w() {
        StaticLayout staticLayout;
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            float f2 = this.E;
            e(this.j);
            CharSequence charSequence = this.y;
            if (!(charSequence == null || (staticLayout = this.T) == null)) {
                this.X = TextUtils.ellipsize(charSequence, this.H, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.X;
            float f3 = 0.0f;
            float measureText = charSequence2 != null ? this.H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
            int h2 = e2.h(this.h, this.z ? 1 : 0);
            int i2 = h2 & 112;
            if (i2 == 48) {
                this.n = (float) this.e.top;
            } else if (i2 != 80) {
                this.n = ((float) this.e.centerY()) - ((this.H.descent() - this.H.ascent()) / 2.0f);
            } else {
                this.n = this.H.ascent() + ((float) this.e.bottom);
            }
            int i3 = h2 & 8388615;
            if (i3 == 1) {
                this.p = ((float) this.e.centerX()) - (measureText / 2.0f);
            } else if (i3 != 5) {
                this.p = (float) this.e.left;
            } else {
                this.p = ((float) this.e.right) - measureText;
            }
            e(this.i);
            StaticLayout staticLayout2 = this.T;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            CharSequence charSequence3 = this.y;
            float measureText2 = charSequence3 != null ? this.H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            StaticLayout staticLayout3 = this.T;
            if (staticLayout3 != null && this.Y > 1 && !this.z) {
                measureText2 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.T;
            if (staticLayout4 != null) {
                f3 = staticLayout4.getLineLeft(0);
            }
            this.W = f3;
            int h3 = e2.h(this.g, this.z ? 1 : 0);
            int i4 = h3 & 112;
            if (i4 == 48) {
                this.m = (float) this.d.top;
            } else if (i4 != 80) {
                this.m = ((float) this.d.centerY()) - (height / 2.0f);
            } else {
                this.m = this.H.descent() + (((float) this.d.bottom) - height);
            }
            int i5 = h3 & 8388615;
            if (i5 == 1) {
                this.o = ((float) this.d.centerX()) - (measureText2 / 2.0f);
            } else if (i5 != 5) {
                this.o = (float) this.d.left;
            } else {
                this.o = ((float) this.d.right) - measureText2;
            }
            f();
            M(f2);
            d(this.c);
        }
    }

    public void y(int i2, int i3, int i4, int i5) {
        if (!x(this.e, i2, i3, i4, i5)) {
            this.e.set(i2, i3, i4, i5);
            this.G = true;
            v();
        }
    }

    public void z(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (!x(this.e, i2, i3, i4, i5)) {
            this.e.set(i2, i3, i4, i5);
            this.G = true;
            v();
        }
    }
}
