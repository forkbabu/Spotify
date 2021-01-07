package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
public class e {
    private final View a;
    private final g b;
    private int c = -1;
    private f0 d;
    private f0 e;
    private f0 f;

    e(View view) {
        this.a = view;
        this.b = g.b();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.d != null) {
                if (this.f == null) {
                    this.f = new f0();
                }
                f0 f0Var = this.f;
                PorterDuff.Mode mode = null;
                f0Var.a = null;
                f0Var.d = false;
                f0Var.b = null;
                f0Var.c = false;
                ColorStateList i2 = q4.i(this.a);
                if (i2 != null) {
                    f0Var.d = true;
                    f0Var.a = i2;
                }
                View view = this.a;
                if (i >= 21) {
                    mode = view.getBackgroundTintMode();
                } else if (view instanceof p4) {
                    mode = ((p4) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    f0Var.c = true;
                    f0Var.b = mode;
                }
                if (f0Var.d || f0Var.c) {
                    int[] drawableState = this.a.getDrawableState();
                    int i3 = g.d;
                    x.n(background, f0Var, drawableState);
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            f0 f0Var2 = this.e;
            if (f0Var2 != null) {
                int[] drawableState2 = this.a.getDrawableState();
                int i4 = g.d;
                x.n(background, f0Var2, drawableState2);
                return;
            }
            f0 f0Var3 = this.d;
            if (f0Var3 != null) {
                int[] drawableState3 = this.a.getDrawableState();
                int i5 = g.d;
                x.n(background, f0Var3, drawableState3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            return f0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            return f0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void d(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = h0.B;
        boolean z = false;
        h0 v = h0.v(context, attributeSet, iArr, i, 0);
        View view = this.a;
        q4.H(view, view.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            if (v.s(0)) {
                this.c = v.n(0, -1);
                ColorStateList f2 = this.b.f(this.a.getContext(), this.c);
                if (f2 != null) {
                    g(f2);
                }
            }
            if (v.s(1)) {
                q4.L(this.a, v.c(1));
            }
            if (v.s(2)) {
                View view2 = this.a;
                PorterDuff.Mode d2 = q.d(v.k(2, -1), null);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    view2.setBackgroundTintMode(d2);
                    if (i2 == 21) {
                        Drawable background = view2.getBackground();
                        if (!(view2.getBackgroundTintList() == null && view2.getBackgroundTintMode() == null)) {
                            z = true;
                        }
                        if (background != null && z) {
                            if (background.isStateful()) {
                                background.setState(view2.getDrawableState());
                            }
                            view2.setBackground(background);
                        }
                    }
                } else if (view2 instanceof p4) {
                    ((p4) view2).setSupportBackgroundTintMode(d2);
                }
            }
        } finally {
            v.w();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.c = -1;
        g(null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(int i) {
        this.c = i;
        g gVar = this.b;
        g(gVar != null ? gVar.f(this.a.getContext(), i) : null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new f0();
            }
            f0 f0Var = this.d;
            f0Var.a = colorStateList;
            f0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new f0();
        }
        f0 f0Var = this.e;
        f0Var.a = colorStateList;
        f0Var.d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new f0();
        }
        f0 f0Var = this.e;
        f0Var.b = mode;
        f0Var.c = true;
        a();
    }
}
