package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class a {
    private static final boolean s = (Build.VERSION.SDK_INT >= 21);
    private final MaterialButton a;
    private dy b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    a(MaterialButton materialButton, dy dyVar) {
        this.a = materialButton;
        this.b = dyVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private yx d(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (s) {
            return (yx) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z);
        }
        return (yx) this.r.getDrawable(!z ? 1 : 0);
    }

    private yx k() {
        return d(true);
    }

    private void z() {
        yx c2 = c();
        yx k2 = k();
        if (c2 != null) {
            c2.R((float) this.h, this.k);
            if (k2 != null) {
                k2.Q((float) this.h, this.n ? rw.m(this.a, C0707R.attr.colorSurface) : 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.g;
    }

    public gy b() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (gy) this.r.getDrawable(2);
        }
        return (gy) this.r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public yx c() {
        return d(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList e() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public dy f() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList g() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList i() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode j() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(android.content.res.TypedArray r24) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.a.n(android.content.res.TypedArray):void");
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z) {
        this.q = z;
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        if (!this.p || this.g != i2) {
            this.g = i2;
            this.p = true;
            s(this.b.o((float) i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void r(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = s;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(ox.c(colorStateList));
            } else if (!z && (this.a.getBackground() instanceof nx)) {
                ((nx) this.a.getBackground()).setTintList(ox.c(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(dy dyVar) {
        this.b = dyVar;
        if (c() != null) {
            c().setShapeAppearanceModel(dyVar);
        }
        if (k() != null) {
            k().setShapeAppearanceModel(dyVar);
        }
        if (b() != null) {
            b().setShapeAppearanceModel(dyVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(boolean z) {
        this.n = z;
        z();
    }

    /* access modifiers changed from: package-private */
    public void u(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int i2) {
        if (this.h != i2) {
            this.h = i2;
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (c() != null) {
                androidx.core.graphics.drawable.a.i(c(), this.j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (c() != null && this.i != null) {
                androidx.core.graphics.drawable.a.j(c(), this.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i2, int i3) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i3 - this.d, i2 - this.f);
        }
    }
}
