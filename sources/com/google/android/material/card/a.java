package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.spotify.music.C0707R;
import defpackage.dy;

class a {
    private static final int[] t = {16842912};
    private static final double u = Math.cos(Math.toRadians(45.0d));
    private final MaterialCardView a;
    private final Rect b = new Rect();
    private final yx c;
    private final yx d;
    private final int e;
    private final int f;
    private int g;
    private Drawable h;
    private Drawable i;
    private ColorStateList j;
    private ColorStateList k;
    private dy l;
    private ColorStateList m;
    private Drawable n;
    private LayerDrawable o;
    private yx p;
    private yx q;
    private boolean r = false;
    private boolean s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.card.a$a  reason: collision with other inner class name */
    public class C0104a extends InsetDrawable {
        C0104a(a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.Drawable, android.graphics.drawable.DrawableWrapper
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i2, int i3) {
        this.a = materialCardView;
        yx yxVar = new yx(materialCardView.getContext(), attributeSet, i2, i3);
        this.c = yxVar;
        yxVar.C(materialCardView.getContext());
        yxVar.N(-12303292);
        dy w = yxVar.w();
        w.getClass();
        dy.b bVar = new dy.b(w);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, pw.g, i2, C0707R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            bVar.o(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new yx();
        I(bVar.m());
        Resources resources = materialCardView.getResources();
        this.e = resources.getDimensionPixelSize(C0707R.dimen.mtrl_card_checked_icon_margin);
        this.f = resources.getDimensionPixelSize(C0707R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    private boolean M() {
        return this.a.getPreventCornerOverlap() && !e();
    }

    private boolean N() {
        return this.a.getPreventCornerOverlap() && e() && this.a.getUseCompatPadding();
    }

    private void S() {
        Drawable drawable;
        if (!ox.a || (drawable = this.n) == null) {
            yx yxVar = this.p;
            if (yxVar != null) {
                yxVar.H(this.j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.j);
    }

    private float a() {
        return Math.max(Math.max(b(this.l.j(), this.c.z()), b(this.l.l(), this.c.A())), Math.max(b(this.l.f(), this.c.o()), b(this.l.d(), this.c.n())));
    }

    private float b(ux uxVar, float f2) {
        if (uxVar instanceof cy) {
            double d2 = (double) f2;
            Double.isNaN(d2);
            return (float) ((1.0d - u) * d2);
        } else if (uxVar instanceof vx) {
            return f2 / 2.0f;
        } else {
            return 0.0f;
        }
    }

    private float c() {
        return this.a.getMaxCardElevation() + (N() ? a() : 0.0f);
    }

    private float d() {
        return (this.a.getMaxCardElevation() * 1.5f) + (N() ? a() : 0.0f);
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.c.E();
    }

    private Drawable l() {
        RippleDrawable rippleDrawable;
        if (this.n == null) {
            if (ox.a) {
                this.q = new yx(this.l);
                rippleDrawable = new RippleDrawable(this.j, null, this.q);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                yx yxVar = new yx(this.l);
                this.p = yxVar;
                yxVar.H(this.j);
                stateListDrawable.addState(new int[]{16842919}, this.p);
                rippleDrawable = stateListDrawable;
            }
            this.n = rippleDrawable;
        }
        if (this.o == null) {
            StateListDrawable stateListDrawable2 = new StateListDrawable();
            Drawable drawable = this.i;
            if (drawable != null) {
                stateListDrawable2.addState(t, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, stateListDrawable2});
            this.o = layerDrawable;
            layerDrawable.setId(2, C0707R.id.mtrl_card_checked_layer_id);
        }
        return this.o;
    }

    private Drawable u(Drawable drawable) {
        int i2;
        int i3;
        if ((Build.VERSION.SDK_INT < 21) || this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) d());
            i3 = (int) Math.ceil((double) c());
            i2 = ceil;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return new C0104a(this, drawable, i3, i2, i3, i2);
    }

    /* access modifiers changed from: package-private */
    public void A(ColorStateList colorStateList) {
        this.c.H(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        yx yxVar = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        yxVar.H(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void C(boolean z) {
        this.s = z;
    }

    /* access modifiers changed from: package-private */
    public void D(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable l2 = androidx.core.graphics.drawable.a.l(drawable.mutate());
            this.i = l2;
            androidx.core.graphics.drawable.a.i(l2, this.k);
        }
        if (this.o != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                stateListDrawable.addState(t, drawable2);
            }
            this.o.setDrawableByLayerId(C0707R.id.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(ColorStateList colorStateList) {
        this.k = colorStateList;
        Drawable drawable = this.i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(float f2) {
        I(this.l.o(f2));
        this.h.invalidateSelf();
        if (N() || M()) {
            P();
        }
        if (N()) {
            R();
        }
    }

    /* access modifiers changed from: package-private */
    public void G(float f2) {
        this.c.I(f2);
        yx yxVar = this.d;
        if (yxVar != null) {
            yxVar.I(f2);
        }
        yx yxVar2 = this.q;
        if (yxVar2 != null) {
            yxVar2.I(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void H(ColorStateList colorStateList) {
        this.j = colorStateList;
        S();
    }

    /* access modifiers changed from: package-private */
    public void I(dy dyVar) {
        this.l = dyVar;
        this.c.setShapeAppearanceModel(dyVar);
        yx yxVar = this.c;
        yxVar.M(!yxVar.E());
        yx yxVar2 = this.d;
        if (yxVar2 != null) {
            yxVar2.setShapeAppearanceModel(dyVar);
        }
        yx yxVar3 = this.q;
        if (yxVar3 != null) {
            yxVar3.setShapeAppearanceModel(dyVar);
        }
        yx yxVar4 = this.p;
        if (yxVar4 != null) {
            yxVar4.setShapeAppearanceModel(dyVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            T();
        }
    }

    /* access modifiers changed from: package-private */
    public void K(int i2) {
        if (i2 != this.g) {
            this.g = i2;
            T();
        }
    }

    /* access modifiers changed from: package-private */
    public void L(int i2, int i3, int i4, int i5) {
        this.b.set(i2, i3, i4, i5);
        P();
    }

    /* access modifiers changed from: package-private */
    public void O() {
        Drawable drawable = this.h;
        Drawable l2 = this.a.isClickable() ? l() : this.d;
        this.h = l2;
        if (drawable == l2) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || !(this.a.getForeground() instanceof InsetDrawable)) {
            this.a.setForeground(u(l2));
        } else {
            ((InsetDrawable) this.a.getForeground()).setDrawable(l2);
        }
    }

    /* access modifiers changed from: package-private */
    public void P() {
        float f2 = 0.0f;
        float a2 = M() || N() ? a() : 0.0f;
        if (this.a.getPreventCornerOverlap() && (Build.VERSION.SDK_INT < 21 || this.a.getUseCompatPadding())) {
            double d2 = 1.0d - u;
            double cardViewRadius = (double) this.a.getCardViewRadius();
            Double.isNaN(cardViewRadius);
            Double.isNaN(cardViewRadius);
            f2 = (float) (d2 * cardViewRadius);
        }
        int i2 = (int) (a2 - f2);
        MaterialCardView materialCardView = this.a;
        Rect rect = this.b;
        materialCardView.n(rect.left + i2, rect.top + i2, rect.right + i2, rect.bottom + i2);
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        this.c.G(this.a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!this.r) {
            this.a.setBackgroundInternal(u(this.c));
        }
        this.a.setForeground(u(this.h));
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.d.R((float) this.g, this.m);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Drawable drawable = this.n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            this.n.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            this.n.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public yx g() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.c.r();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList i() {
        return this.d.r();
    }

    /* access modifiers changed from: package-private */
    public Drawable j() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList k() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        return this.c.z();
    }

    /* access modifiers changed from: package-private */
    public float n() {
        return this.c.s();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList o() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public dy p() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        ColorStateList colorStateList = this.m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList r() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public Rect t() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public void x(TypedArray typedArray) {
        ColorStateList a2 = jx.a(this.a.getContext(), typedArray, 8);
        this.m = a2;
        if (a2 == null) {
            this.m = ColorStateList.valueOf(-1);
        }
        this.g = typedArray.getDimensionPixelSize(9, 0);
        boolean z = typedArray.getBoolean(0, false);
        this.s = z;
        this.a.setLongClickable(z);
        this.k = jx.a(this.a.getContext(), typedArray, 3);
        D(jx.c(this.a.getContext(), typedArray, 2));
        ColorStateList a3 = jx.a(this.a.getContext(), typedArray, 4);
        this.j = a3;
        if (a3 == null) {
            this.j = ColorStateList.valueOf(rw.m(this.a, C0707R.attr.colorControlHighlight));
        }
        ColorStateList a4 = jx.a(this.a.getContext(), typedArray, 1);
        yx yxVar = this.d;
        if (a4 == null) {
            a4 = ColorStateList.valueOf(0);
        }
        yxVar.H(a4);
        S();
        this.c.G(this.a.getCardElevation());
        T();
        this.a.setBackgroundInternal(u(this.c));
        Drawable l2 = this.a.isClickable() ? l() : this.d;
        this.h = l2;
        this.a.setForeground(u(l2));
    }

    /* access modifiers changed from: package-private */
    public void y(int i2, int i3) {
        int i4;
        int i5;
        if (this.o != null) {
            int i6 = this.e;
            int i7 = this.f;
            int i8 = (i2 - i6) - i7;
            int i9 = (i3 - i6) - i7;
            if ((Build.VERSION.SDK_INT < 21) || this.a.getUseCompatPadding()) {
                i9 -= (int) Math.ceil((double) (d() * 2.0f));
                i8 -= (int) Math.ceil((double) (c() * 2.0f));
            }
            int i10 = this.e;
            if (q4.o(this.a) == 1) {
                i4 = i8;
                i5 = i10;
            } else {
                i5 = i8;
                i4 = i10;
            }
            this.o.setLayerInset(2, i5, this.e, i4, i9);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z) {
        this.r = z;
    }
}
