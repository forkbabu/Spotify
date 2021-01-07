package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.k3;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class b extends yx implements androidx.core.graphics.drawable.b, Drawable.Callback, h.b {
    private static final int[] Q0 = {16842910};
    private static final ShapeDrawable R0 = new ShapeDrawable(new OvalShape());
    private int A0;
    private boolean B0;
    private int C0;
    private int D0 = BitmapRenderer.ALPHA_VISIBLE;
    private ColorFilter E0;
    private PorterDuffColorFilter F0;
    private ColorStateList G0;
    private ColorStateList H;
    private PorterDuff.Mode H0 = PorterDuff.Mode.SRC_IN;
    private ColorStateList I;
    private int[] I0;
    private float J;
    private boolean J0;
    private float K = -1.0f;
    private ColorStateList K0;
    private ColorStateList L;
    private WeakReference<a> L0 = new WeakReference<>(null);
    private float M;
    private TextUtils.TruncateAt M0;
    private ColorStateList N;
    private boolean N0;
    private CharSequence O;
    private int O0;
    private boolean P;
    private boolean P0;
    private Drawable Q;
    private ColorStateList R;
    private float S;
    private boolean T;
    private boolean U;
    private Drawable V;
    private Drawable W;
    private ColorStateList X;
    private float Y;
    private CharSequence Z;
    private boolean a0;
    private boolean b0;
    private Drawable c0;
    private ColorStateList d0;
    private xw e0;
    private xw f0;
    private float g0;
    private float h0;
    private float i0;
    private float j0;
    private float k0;
    private float l0;
    private float m0;
    private float n0;
    private final Context o0;
    private final Paint p0 = new Paint(1);
    private final Paint.FontMetrics q0 = new Paint.FontMetrics();
    private final RectF r0 = new RectF();
    private final PointF s0 = new PointF();
    private final Path t0 = new Path();
    private final h u0;
    private int v0;
    private int w0;
    private int x0;
    private int y0;
    private int z0;

    public interface a {
        void a();
    }

    private b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C(context);
        this.o0 = context;
        h hVar = new h(this);
        this.u0 = hVar;
        this.O = "";
        hVar.d().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q0;
        setState(iArr);
        C1(iArr);
        this.N0 = true;
        if (ox.a) {
            R0.setTint(-1);
        }
    }

    private static boolean L0(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean M0(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean O0(int[] r9, int[] r10) {
        /*
        // Method dump skipped, instructions count: 347
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.b.O0(int[], int[]):boolean");
    }

    private void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.g(drawable, androidx.core.graphics.drawable.a.b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.V) {
                if (drawable.isStateful()) {
                    drawable.setState(this.I0);
                }
                androidx.core.graphics.drawable.a.i(drawable, this.X);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.Q;
            if (drawable == drawable2 && this.T) {
                androidx.core.graphics.drawable.a.i(drawable2, this.R);
            }
        }
    }

    private void Y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (e2() || d2()) {
            float f = this.g0 + this.h0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.S;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.S;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.S;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void a0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f2()) {
            float f = this.n0 + this.m0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.Y;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.Y;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.Y;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void b0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f2()) {
            float f = this.n0 + this.m0 + this.Y + this.l0 + this.k0;
            if (androidx.core.graphics.drawable.a.b(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public static b d0(Context context, AttributeSet attributeSet, int i, int i2) {
        b bVar = new b(context, attributeSet, i, i2);
        TypedArray f = j.f(bVar.o0, attributeSet, pw.h, i, i2, new int[0]);
        bVar.P0 = f.hasValue(36);
        ColorStateList a2 = jx.a(bVar.o0, f, 23);
        if (bVar.H != a2) {
            bVar.H = a2;
            bVar.onStateChange(bVar.getState());
        }
        bVar.X0(jx.a(bVar.o0, f, 10));
        bVar.l1(f.getDimension(18, 0.0f));
        if (f.hasValue(11)) {
            bVar.Z0(f.getDimension(11, 0.0f));
        }
        bVar.p1(jx.a(bVar.o0, f, 21));
        bVar.r1(f.getDimension(22, 0.0f));
        bVar.P1(jx.a(bVar.o0, f, 35));
        bVar.U1(f.getText(4));
        bVar.V1(jx.d(bVar.o0, f, 0));
        int i3 = f.getInt(2, 0);
        if (i3 == 1) {
            bVar.M0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            bVar.M0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            bVar.M0 = TextUtils.TruncateAt.END;
        }
        bVar.k1(f.getBoolean(17, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            bVar.k1(f.getBoolean(14, false));
        }
        bVar.d1(jx.c(bVar.o0, f, 13));
        if (f.hasValue(16)) {
            bVar.h1(jx.a(bVar.o0, f, 16));
        }
        bVar.f1(f.getDimension(15, 0.0f));
        bVar.F1(f.getBoolean(30, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            bVar.F1(f.getBoolean(25, false));
        }
        bVar.t1(jx.c(bVar.o0, f, 24));
        bVar.D1(jx.a(bVar.o0, f, 29));
        bVar.y1(f.getDimension(27, 0.0f));
        bVar.P0(f.getBoolean(5, false));
        bVar.W0(f.getBoolean(9, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            bVar.W0(f.getBoolean(7, false));
        }
        bVar.R0(jx.c(bVar.o0, f, 6));
        if (f.hasValue(8)) {
            bVar.T0(jx.a(bVar.o0, f, 8));
        }
        bVar.e0 = xw.a(bVar.o0, f, 38);
        bVar.f0 = xw.a(bVar.o0, f, 32);
        bVar.n1(f.getDimension(20, 0.0f));
        bVar.M1(f.getDimension(34, 0.0f));
        bVar.K1(f.getDimension(33, 0.0f));
        bVar.Z1(f.getDimension(40, 0.0f));
        bVar.X1(f.getDimension(39, 0.0f));
        bVar.A1(f.getDimension(28, 0.0f));
        bVar.v1(f.getDimension(26, 0.0f));
        bVar.b1(f.getDimension(12, 0.0f));
        bVar.O0 = f.getDimensionPixelSize(3, Integer.MAX_VALUE);
        f.recycle();
        return bVar;
    }

    private boolean d2() {
        return this.b0 && this.c0 != null && this.B0;
    }

    private boolean e2() {
        return this.P && this.Q != null;
    }

    private boolean f2() {
        return this.U && this.V != null;
    }

    private void g2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float A0() {
        return this.h0;
    }

    public void A1(float f) {
        if (this.l0 != f) {
            this.l0 = f;
            invalidateSelf();
            if (f2()) {
                N0();
            }
        }
    }

    public ColorStateList B0() {
        return this.N;
    }

    public void B1(int i) {
        A1(this.o0.getResources().getDimension(i));
    }

    public xw C0() {
        return this.e0;
    }

    public boolean C1(int[] iArr) {
        if (Arrays.equals(this.I0, iArr)) {
            return false;
        }
        this.I0 = iArr;
        if (f2()) {
            return O0(getState(), iArr);
        }
        return false;
    }

    public CharSequence D0() {
        return this.O;
    }

    public void D1(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (f2()) {
                androidx.core.graphics.drawable.a.i(this.V, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public kx E0() {
        return this.u0.c();
    }

    public void E1(int i) {
        D1(i0.a(this.o0, i));
    }

    public float F0() {
        return this.k0;
    }

    public void F1(boolean z) {
        if (this.U != z) {
            boolean f2 = f2();
            this.U = z;
            boolean f22 = f2();
            if (f2 != f22) {
                if (f22) {
                    X(this.V);
                } else {
                    g2(this.V);
                }
                invalidateSelf();
                N0();
            }
        }
    }

    public float G0() {
        return this.j0;
    }

    public void G1(a aVar) {
        this.L0 = new WeakReference<>(aVar);
    }

    public boolean H0() {
        return this.J0;
    }

    public void H1(TextUtils.TruncateAt truncateAt) {
        this.M0 = truncateAt;
    }

    public boolean I0() {
        return this.a0;
    }

    public void I1(xw xwVar) {
        this.f0 = xwVar;
    }

    public boolean J0() {
        return M0(this.V);
    }

    public void J1(int i) {
        this.f0 = xw.b(this.o0, i);
    }

    public boolean K0() {
        return this.U;
    }

    public void K1(float f) {
        if (this.i0 != f) {
            float Z2 = Z();
            this.i0 = f;
            float Z3 = Z();
            invalidateSelf();
            if (Z2 != Z3) {
                N0();
            }
        }
    }

    public void L1(int i) {
        K1(this.o0.getResources().getDimension(i));
    }

    public void M1(float f) {
        if (this.h0 != f) {
            float Z2 = Z();
            this.h0 = f;
            float Z3 = Z();
            invalidateSelf();
            if (Z2 != Z3) {
                N0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void N0() {
        a aVar = this.L0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void N1(int i) {
        M1(this.o0.getResources().getDimension(i));
    }

    public void O1(int i) {
        this.O0 = i;
    }

    public void P0(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            float Z2 = Z();
            if (!z && this.B0) {
                this.B0 = false;
            }
            float Z3 = Z();
            invalidateSelf();
            if (Z2 != Z3) {
                N0();
            }
        }
    }

    public void P1(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            this.K0 = this.J0 ? ox.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void Q0(int i) {
        P0(this.o0.getResources().getBoolean(i));
    }

    public void Q1(int i) {
        P1(i0.a(this.o0, i));
    }

    public void R0(Drawable drawable) {
        if (this.c0 != drawable) {
            float Z2 = Z();
            this.c0 = drawable;
            float Z3 = Z();
            g2(this.c0);
            X(this.c0);
            invalidateSelf();
            if (Z2 != Z3) {
                N0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R1(boolean z) {
        this.N0 = z;
    }

    public void S0(int i) {
        R0(i0.b(this.o0, i));
    }

    public void S1(xw xwVar) {
        this.e0 = xwVar;
    }

    public void T0(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (this.b0 && this.c0 != null && this.a0) {
                androidx.core.graphics.drawable.a.i(this.c0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void T1(int i) {
        this.e0 = xw.b(this.o0, i);
    }

    public void U0(int i) {
        T0(i0.a(this.o0, i));
    }

    public void U1(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.O, charSequence)) {
            this.O = charSequence;
            this.u0.g(true);
            invalidateSelf();
            N0();
        }
    }

    public void V0(int i) {
        W0(this.o0.getResources().getBoolean(i));
    }

    public void V1(kx kxVar) {
        this.u0.f(kxVar, this.o0);
    }

    public void W0(boolean z) {
        if (this.b0 != z) {
            boolean d2 = d2();
            this.b0 = z;
            boolean d22 = d2();
            if (d2 != d22) {
                if (d22) {
                    X(this.c0);
                } else {
                    g2(this.c0);
                }
                invalidateSelf();
                N0();
            }
        }
    }

    public void W1(int i) {
        this.u0.f(new kx(this.o0, i), this.o0);
    }

    public void X0(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            onStateChange(getState());
        }
    }

    public void X1(float f) {
        if (this.k0 != f) {
            this.k0 = f;
            invalidateSelf();
            N0();
        }
    }

    public void Y0(int i) {
        X0(i0.a(this.o0, i));
    }

    public void Y1(int i) {
        X1(this.o0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    public float Z() {
        if (e2() || d2()) {
            return this.h0 + this.S + this.i0;
        }
        return 0.0f;
    }

    @Deprecated
    public void Z0(float f) {
        if (this.K != f) {
            this.K = f;
            setShapeAppearanceModel(w().o(f));
        }
    }

    public void Z1(float f) {
        if (this.j0 != f) {
            this.j0 = f;
            invalidateSelf();
            N0();
        }
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        N0();
        invalidateSelf();
    }

    @Deprecated
    public void a1(int i) {
        Z0(this.o0.getResources().getDimension(i));
    }

    public void a2(int i) {
        Z1(this.o0.getResources().getDimension(i));
    }

    public void b1(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidateSelf();
            N0();
        }
    }

    public void b2(boolean z) {
        if (this.J0 != z) {
            this.J0 = z;
            this.K0 = z ? ox.c(this.N) : null;
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: package-private */
    public float c0() {
        if (f2()) {
            return this.l0 + this.Y + this.m0;
        }
        return 0.0f;
    }

    public void c1(int i) {
        b1(this.o0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    public boolean c2() {
        return this.N0;
    }

    public void d1(Drawable drawable) {
        Drawable drawable2 = this.Q;
        Drawable drawable3 = null;
        Drawable k = drawable2 != null ? androidx.core.graphics.drawable.a.k(drawable2) : null;
        if (k != drawable) {
            float Z2 = Z();
            if (drawable != null) {
                drawable3 = androidx.core.graphics.drawable.a.l(drawable).mutate();
            }
            this.Q = drawable3;
            float Z3 = Z();
            g2(k);
            if (e2()) {
                X(this.Q);
            }
            invalidateSelf();
            if (Z2 != Z3) {
                N0();
            }
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.D0) != 0) {
            if (i < 255) {
                float f = (float) bounds.left;
                float f2 = (float) bounds.top;
                float f3 = (float) bounds.right;
                float f4 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i4 = canvas.saveLayerAlpha(f, f2, f3, f4, i);
                } else {
                    i4 = canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
                }
                i2 = i4;
            } else {
                i2 = 0;
            }
            if (!this.P0) {
                this.p0.setColor(this.v0);
                this.p0.setStyle(Paint.Style.FILL);
                this.r0.set(bounds);
                canvas.drawRoundRect(this.r0, h0(), h0(), this.p0);
            }
            if (!this.P0) {
                this.p0.setColor(this.w0);
                this.p0.setStyle(Paint.Style.FILL);
                Paint paint = this.p0;
                ColorFilter colorFilter = this.E0;
                if (colorFilter == null) {
                    colorFilter = this.F0;
                }
                paint.setColorFilter(colorFilter);
                this.r0.set(bounds);
                canvas.drawRoundRect(this.r0, h0(), h0(), this.p0);
            }
            if (this.P0) {
                super.draw(canvas);
            }
            if (this.M > 0.0f && !this.P0) {
                this.p0.setColor(this.y0);
                this.p0.setStyle(Paint.Style.STROKE);
                if (!this.P0) {
                    Paint paint2 = this.p0;
                    ColorFilter colorFilter2 = this.E0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.F0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.r0;
                float f5 = this.M / 2.0f;
                rectF.set(((float) bounds.left) + f5, ((float) bounds.top) + f5, ((float) bounds.right) - f5, ((float) bounds.bottom) - f5);
                float f6 = this.K - (this.M / 2.0f);
                canvas.drawRoundRect(this.r0, f6, f6, this.p0);
            }
            this.p0.setColor(this.z0);
            this.p0.setStyle(Paint.Style.FILL);
            this.r0.set(bounds);
            if (!this.P0) {
                canvas.drawRoundRect(this.r0, h0(), h0(), this.p0);
            } else {
                g(new RectF(bounds), this.t0);
                l(canvas, this.p0, this.t0, p());
            }
            if (e2()) {
                Y(bounds, this.r0);
                RectF rectF2 = this.r0;
                float f7 = rectF2.left;
                float f8 = rectF2.top;
                canvas.translate(f7, f8);
                this.Q.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
                this.Q.draw(canvas);
                canvas.translate(-f7, -f8);
            }
            if (d2()) {
                Y(bounds, this.r0);
                RectF rectF3 = this.r0;
                float f9 = rectF3.left;
                float f10 = rectF3.top;
                canvas.translate(f9, f10);
                this.c0.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
                this.c0.draw(canvas);
                canvas.translate(-f9, -f10);
            }
            if (this.N0 && this.O != null) {
                PointF pointF = this.s0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.O != null) {
                    float Z2 = this.g0 + Z() + this.j0;
                    if (androidx.core.graphics.drawable.a.b(this) == 0) {
                        pointF.x = ((float) bounds.left) + Z2;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - Z2;
                        align = Paint.Align.RIGHT;
                    }
                    this.u0.d().getFontMetrics(this.q0);
                    Paint.FontMetrics fontMetrics = this.q0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.r0;
                rectF4.setEmpty();
                if (this.O != null) {
                    float Z3 = this.g0 + Z() + this.j0;
                    float c02 = this.n0 + c0() + this.k0;
                    if (androidx.core.graphics.drawable.a.b(this) == 0) {
                        rectF4.left = ((float) bounds.left) + Z3;
                        rectF4.right = ((float) bounds.right) - c02;
                    } else {
                        rectF4.left = ((float) bounds.left) + c02;
                        rectF4.right = ((float) bounds.right) - Z3;
                    }
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                if (this.u0.c() != null) {
                    this.u0.d().drawableState = getState();
                    this.u0.h(this.o0);
                }
                this.u0.d().setTextAlign(align);
                boolean z = Math.round(this.u0.e(this.O.toString())) > Math.round(this.r0.width());
                if (z) {
                    int save = canvas.save();
                    canvas.clipRect(this.r0);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence = this.O;
                if (z && this.M0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.u0.d(), this.r0.width(), this.M0);
                }
                int length = charSequence.length();
                PointF pointF2 = this.s0;
                canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.u0.d());
                if (z) {
                    canvas.restoreToCount(i3);
                }
            }
            if (f2()) {
                a0(bounds, this.r0);
                RectF rectF5 = this.r0;
                float f11 = rectF5.left;
                float f12 = rectF5.top;
                canvas.translate(f11, f12);
                this.V.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
                if (ox.a) {
                    this.W.setBounds(this.V.getBounds());
                    this.W.jumpToCurrentState();
                    this.W.draw(canvas);
                } else {
                    this.V.draw(canvas);
                }
                canvas.translate(-f11, -f12);
            }
            if (this.D0 < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public Drawable e0() {
        return this.c0;
    }

    public void e1(int i) {
        d1(i0.b(this.o0, i));
    }

    public ColorStateList f0() {
        return this.d0;
    }

    public void f1(float f) {
        if (this.S != f) {
            float Z2 = Z();
            this.S = f;
            float Z3 = Z();
            invalidateSelf();
            if (Z2 != Z3) {
                N0();
            }
        }
    }

    public ColorStateList g0() {
        return this.I;
    }

    public void g1(int i) {
        f1(this.o0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.u0.e(this.O.toString()) + this.g0 + Z() + this.j0 + this.k0 + c0() + this.n0), this.O0);
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.K);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        }
        outline.setAlpha(((float) this.D0) / 255.0f);
    }

    public float h0() {
        return this.P0 ? z() : this.K;
    }

    public void h1(ColorStateList colorStateList) {
        this.T = true;
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (e2()) {
                androidx.core.graphics.drawable.a.i(this.Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float i0() {
        return this.n0;
    }

    public void i1(int i) {
        h1(i0.a(this.o0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (L0(this.H) || L0(this.I) || L0(this.L)) {
            return true;
        }
        if (this.J0 && L0(this.K0)) {
            return true;
        }
        kx c = this.u0.c();
        if ((c == null || (colorStateList = c.b) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        if ((this.b0 && this.c0 != null && this.a0) || M0(this.Q) || M0(this.c0) || L0(this.G0)) {
            return true;
        }
        return false;
    }

    public Drawable j0() {
        Drawable drawable = this.Q;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.k(drawable);
        }
        return null;
    }

    public void j1(int i) {
        k1(this.o0.getResources().getBoolean(i));
    }

    public float k0() {
        return this.S;
    }

    public void k1(boolean z) {
        if (this.P != z) {
            boolean e2 = e2();
            this.P = z;
            boolean e22 = e2();
            if (e2 != e22) {
                if (e22) {
                    X(this.Q);
                } else {
                    g2(this.Q);
                }
                invalidateSelf();
                N0();
            }
        }
    }

    public ColorStateList l0() {
        return this.R;
    }

    public void l1(float f) {
        if (this.J != f) {
            this.J = f;
            invalidateSelf();
            N0();
        }
    }

    public float m0() {
        return this.J;
    }

    public void m1(int i) {
        l1(this.o0.getResources().getDimension(i));
    }

    public float n0() {
        return this.g0;
    }

    public void n1(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            invalidateSelf();
            N0();
        }
    }

    public ColorStateList o0() {
        return this.L;
    }

    public void o1(int i) {
        n1(this.o0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (e2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.Q, i);
        }
        if (d2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.c0, i);
        }
        if (f2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.g(this.V, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (e2()) {
            onLevelChange |= this.Q.setLevel(i);
        }
        if (d2()) {
            onLevelChange |= this.c0.setLevel(i);
        }
        if (f2()) {
            onLevelChange |= this.V.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        if (this.P0) {
            super.onStateChange(iArr);
        }
        return O0(iArr, this.I0);
    }

    public float p0() {
        return this.M;
    }

    public void p1(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.P0) {
                S(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public Drawable q0() {
        Drawable drawable = this.V;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.k(drawable);
        }
        return null;
    }

    public void q1(int i) {
        p1(i0.a(this.o0, i));
    }

    public CharSequence r0() {
        return this.Z;
    }

    public void r1(float f) {
        if (this.M != f) {
            this.M = f;
            this.p0.setStrokeWidth(f);
            if (this.P0) {
                T(f);
            }
            invalidateSelf();
        }
    }

    public float s0() {
        return this.m0;
    }

    public void s1(int i) {
        r1(this.o0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.E0 != colorFilter) {
            this.E0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            this.F0 = rw.u(this, this.G0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (e2()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (d2()) {
            visible |= this.c0.setVisible(z, z2);
        }
        if (f2()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t0() {
        return this.Y;
    }

    public void t1(Drawable drawable) {
        Drawable q02 = q0();
        if (q02 != drawable) {
            float c02 = c0();
            this.V = drawable != null ? androidx.core.graphics.drawable.a.l(drawable).mutate() : null;
            if (ox.a) {
                this.W = new RippleDrawable(ox.c(this.N), this.V, R0);
            }
            float c03 = c0();
            g2(q02);
            if (f2()) {
                X(this.V);
            }
            invalidateSelf();
            if (c02 != c03) {
                N0();
            }
        }
    }

    public float u0() {
        return this.l0;
    }

    public void u1(CharSequence charSequence) {
        if (this.Z != charSequence) {
            int i = k3.i;
            this.Z = new k3.a().a().a(charSequence);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public ColorStateList v0() {
        return this.X;
    }

    public void v1(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            if (f2()) {
                N0();
            }
        }
    }

    public void w0(RectF rectF) {
        b0(getBounds(), rectF);
    }

    public void w1(int i) {
        v1(this.o0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt x0() {
        return this.M0;
    }

    public void x1(int i) {
        t1(i0.b(this.o0, i));
    }

    public xw y0() {
        return this.f0;
    }

    public void y1(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            if (f2()) {
                N0();
            }
        }
    }

    public float z0() {
        return this.i0;
    }

    public void z1(int i) {
        y1(this.o0.getResources().getDimension(i));
    }
}
