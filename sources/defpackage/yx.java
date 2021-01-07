package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;
import defpackage.ey;
import defpackage.fy;
import java.util.BitSet;

/* renamed from: yx  reason: default package */
public class yx extends Drawable implements androidx.core.graphics.drawable.b, gy {
    private static final String F = yx.class.getSimpleName();
    private static final Paint G = new Paint(1);
    private final ey A;
    private PorterDuffColorFilter B;
    private PorterDuffColorFilter C;
    private final RectF D;
    private boolean E;
    private b a;
    private final fy.g[] b;
    private final fy.g[] c;
    private final BitSet f;
    private boolean n;
    private final Matrix o;
    private final Path p;
    private final Path q;
    private final RectF r;
    private final RectF s;
    private final Region t;
    private final Region u;
    private dy v;
    private final Paint w;
    private final Paint x;
    private final px y;
    private final ey.a z;

    /* access modifiers changed from: package-private */
    /* renamed from: yx$a */
    public class a implements ey.a {
        a() {
        }
    }

    /* synthetic */ yx(b bVar, a aVar) {
        this(bVar);
    }

    private boolean B() {
        Paint.Style style = this.a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.x.getStrokeWidth() > 0.0f;
    }

    private boolean U(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.a.d == null || color2 == (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.w.getColor())))) {
            z2 = false;
        } else {
            this.w.setColor(colorForState2);
            z2 = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.x.getColor())))) {
            return z2;
        }
        this.x.setColor(colorForState);
        return true;
    }

    private boolean V() {
        PorterDuffColorFilter porterDuffColorFilter = this.B;
        PorterDuffColorFilter porterDuffColorFilter2 = this.C;
        b bVar = this.a;
        this.B = h(bVar.g, bVar.h, this.w, true);
        b bVar2 = this.a;
        this.C = h(bVar2.f, bVar2.h, this.x, false);
        b bVar3 = this.a;
        if (bVar3.u) {
            this.y.d(bVar3.g.getColorForState(getState(), 0));
        }
        if (!e2.g(porterDuffColorFilter, this.B) || !e2.g(porterDuffColorFilter2, this.C)) {
            return true;
        }
        return false;
    }

    private void W() {
        b bVar = this.a;
        float f2 = bVar.o + bVar.p;
        bVar.r = (int) Math.ceil((double) (0.75f * f2));
        this.a.s = (int) Math.ceil((double) (f2 * 0.25f));
        V();
        super.invalidateSelf();
    }

    private void f(RectF rectF, Path path) {
        g(rectF, path);
        if (this.a.j != 1.0f) {
            this.o.reset();
            Matrix matrix = this.o;
            float f2 = this.a.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.o);
        }
        path.computeBounds(this.D, true);
    }

    private PorterDuffColorFilter h(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        int color;
        int i;
        if (colorStateList == null || mode == null) {
            return (!z2 || (i = i((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = i(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private int i(int i) {
        b bVar = this.a;
        float f2 = bVar.o + bVar.p + bVar.n;
        ex exVar = bVar.b;
        return exVar != null ? exVar.a(i, f2) : i;
    }

    public static yx j(Context context, float f2) {
        int t2 = rw.t(context, C0707R.attr.colorSurface, yx.class.getSimpleName());
        yx yxVar = new yx();
        yxVar.a.b = new ex(context);
        yxVar.W();
        yxVar.H(ColorStateList.valueOf(t2));
        b bVar = yxVar.a;
        if (bVar.o != f2) {
            bVar.o = f2;
            yxVar.W();
        }
        return yxVar;
    }

    private void k(Canvas canvas) {
        this.f.cardinality();
        if (this.a.s != 0) {
            canvas.drawPath(this.p, this.y.c());
        }
        for (int i = 0; i < 4; i++) {
            fy.g gVar = this.b[i];
            px pxVar = this.y;
            int i2 = this.a.r;
            Matrix matrix = fy.g.a;
            gVar.a(matrix, pxVar, i2, canvas);
            this.c[i].a(matrix, this.y, this.a.r, canvas);
        }
        if (this.E) {
            int t2 = t();
            int u2 = u();
            canvas.translate((float) (-t2), (float) (-u2));
            canvas.drawPath(this.p, G);
            canvas.translate((float) t2, (float) u2);
        }
    }

    private void m(Canvas canvas, Paint paint, Path path, dy dyVar, RectF rectF) {
        if (dyVar.n(rectF)) {
            float a2 = dyVar.f.a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private float x() {
        if (B()) {
            return this.x.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float A() {
        return this.a.a.f.a(p());
    }

    public void C(Context context) {
        this.a.b = new ex(context);
        W();
    }

    public boolean D() {
        ex exVar = this.a.b;
        return exVar != null && exVar.b();
    }

    public boolean E() {
        return this.a.a.n(p());
    }

    public void F(float f2) {
        this.a.a = this.a.a.o(f2);
        invalidateSelf();
    }

    public void G(float f2) {
        b bVar = this.a;
        if (bVar.o != f2) {
            bVar.o = f2;
            W();
        }
    }

    public void H(ColorStateList colorStateList) {
        b bVar = this.a;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void I(float f2) {
        b bVar = this.a;
        if (bVar.k != f2) {
            bVar.k = f2;
            this.n = true;
            invalidateSelf();
        }
    }

    public void J(int i, int i2, int i3, int i4) {
        b bVar = this.a;
        if (bVar.i == null) {
            bVar.i = new Rect();
        }
        this.a.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void K(Paint.Style style) {
        this.a.v = style;
        super.invalidateSelf();
    }

    public void L(float f2) {
        b bVar = this.a;
        if (bVar.n != f2) {
            bVar.n = f2;
            W();
        }
    }

    public void M(boolean z2) {
        this.E = z2;
    }

    public void N(int i) {
        this.y.d(i);
        this.a.u = false;
        super.invalidateSelf();
    }

    public void O(int i) {
        b bVar = this.a;
        if (bVar.t != i) {
            bVar.t = i;
            super.invalidateSelf();
        }
    }

    public void P(int i) {
        b bVar = this.a;
        if (bVar.q != i) {
            bVar.q = i;
            super.invalidateSelf();
        }
    }

    public void Q(float f2, int i) {
        this.a.l = f2;
        invalidateSelf();
        S(ColorStateList.valueOf(i));
    }

    public void R(float f2, ColorStateList colorStateList) {
        this.a.l = f2;
        invalidateSelf();
        S(colorStateList);
    }

    public void S(ColorStateList colorStateList) {
        b bVar = this.a;
        if (bVar.e != colorStateList) {
            bVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void T(float f2) {
        this.a.l = f2;
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        if ((r2 < 21 || (!E() && !r10.p.isConvex() && r2 < 29)) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d5  */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
        // Method dump skipped, instructions count: 519
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void g(RectF rectF, Path path) {
        ey eyVar = this.A;
        b bVar = this.a;
        eyVar.b(bVar.a, bVar.k, rectF, this.z, path);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.a.q != 2) {
            if (E()) {
                outline.setRoundRect(getBounds(), z() * this.a.k);
                return;
            }
            f(p(), this.p);
            if (this.p.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.p);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.t.set(getBounds());
        f(p(), this.p);
        this.u.setPath(this.p, this.t);
        this.t.op(this.u, Region.Op.DIFFERENCE);
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.n = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.d) != null && colorStateList4.isStateful())));
    }

    /* access modifiers changed from: protected */
    public void l(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m(canvas, paint, path, this.a.a, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new b(this.a);
        return this;
    }

    public float n() {
        return this.a.a.h.a(p());
    }

    public float o() {
        return this.a.a.g.a(p());
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.n = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        boolean z2 = U(iArr) || V();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public RectF p() {
        this.r.set(getBounds());
        return this.r;
    }

    public float q() {
        return this.a.o;
    }

    public ColorStateList r() {
        return this.a.d;
    }

    public float s() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.a;
        if (bVar.m != i) {
            bVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // defpackage.gy
    public void setShapeAppearanceModel(dy dyVar) {
        this.a.a = dyVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        V();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.a;
        if (bVar.h != mode) {
            bVar.h = mode;
            V();
            super.invalidateSelf();
        }
    }

    public int t() {
        b bVar = this.a;
        double d = (double) bVar.s;
        double sin = Math.sin(Math.toRadians((double) bVar.t));
        Double.isNaN(d);
        return (int) (sin * d);
    }

    public int u() {
        b bVar = this.a;
        double d = (double) bVar.s;
        double cos = Math.cos(Math.toRadians((double) bVar.t));
        Double.isNaN(d);
        return (int) (cos * d);
    }

    public int v() {
        return this.a.r;
    }

    public dy w() {
        return this.a.a;
    }

    public ColorStateList y() {
        return this.a.g;
    }

    public float z() {
        return this.a.a.e.a(p());
    }

    public yx() {
        this(new dy());
    }

    public yx(dy dyVar) {
        this(new b(dyVar, null));
    }

    private yx(b bVar) {
        this.b = new fy.g[4];
        this.c = new fy.g[4];
        this.f = new BitSet(8);
        this.o = new Matrix();
        this.p = new Path();
        this.q = new Path();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new Region();
        this.u = new Region();
        Paint paint = new Paint(1);
        this.w = paint;
        Paint paint2 = new Paint(1);
        this.x = paint2;
        this.y = new px();
        this.A = new ey();
        this.D = new RectF();
        this.E = true;
        this.a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = G;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        V();
        U(getState());
        this.z = new a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yx$b */
    public static final class b extends Drawable.ConstantState {
        public dy a;
        public ex b;
        public ColorFilter c;
        public ColorStateList d = null;
        public ColorStateList e = null;
        public ColorStateList f = null;
        public ColorStateList g = null;
        public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
        public Rect i = null;
        public float j = 1.0f;
        public float k = 1.0f;
        public float l;
        public int m = BitmapRenderer.ALPHA_VISIBLE;
        public float n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public b(dy dyVar, ex exVar) {
            this.a = dyVar;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            yx yxVar = new yx(this, null);
            yxVar.n = true;
            return yxVar;
        }

        public b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.l = bVar.l;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.h = bVar.h;
            this.g = bVar.g;
            this.m = bVar.m;
            this.j = bVar.j;
            this.s = bVar.s;
            this.q = bVar.q;
            this.u = bVar.u;
            this.k = bVar.k;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f = bVar.f;
            this.v = bVar.v;
            if (bVar.i != null) {
                this.i = new Rect(bVar.i);
            }
        }
    }

    public yx(Context context, AttributeSet attributeSet, int i, int i2) {
        this(dy.c(context, attributeSet, i, i2, new rx((float) 0)).m());
    }
}
