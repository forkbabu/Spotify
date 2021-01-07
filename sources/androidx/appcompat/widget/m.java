package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.widget.b;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class m {
    private final TextView a;
    private f0 b;
    private f0 c;
    private f0 d;
    private f0 e;
    private f0 f;
    private f0 g;
    private f0 h;
    private final n i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* access modifiers changed from: package-private */
    public class a extends p2 {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // defpackage.p2
        public void c(int i) {
        }

        @Override // defpackage.p2
        public void d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
            }
            m.this.n(this.c, typeface);
        }
    }

    m(TextView textView) {
        this.a = textView;
        this.i = new n(textView);
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable != null && f0Var != null) {
            int[] drawableState = this.a.getDrawableState();
            int i2 = g.d;
            x.n(drawable, f0Var, drawableState);
        }
    }

    private static f0 d(Context context, g gVar, int i2) {
        ColorStateList f2 = gVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.d = true;
        f0Var.a = f2;
        return f0Var;
    }

    private void x(Context context, h0 h0Var) {
        String o;
        this.j = h0Var.k(2, this.j);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 >= 28) {
            int k2 = h0Var.k(11, -1);
            this.k = k2;
            if (k2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i3 = 10;
        if (h0Var.s(10) || h0Var.s(12)) {
            this.l = null;
            if (h0Var.s(12)) {
                i3 = 12;
            }
            int i4 = this.k;
            int i5 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface j2 = h0Var.j(i3, this.j, new a(i4, i5, new WeakReference(this.a)));
                    if (j2 != null) {
                        if (i2 < 28 || this.k == -1) {
                            this.l = j2;
                        } else {
                            this.l = Typeface.create(Typeface.create(j2, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (o = h0Var.o(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(o, this.j);
                    return;
                }
                Typeface create = Typeface.create(o, 0);
                int i6 = this.k;
                if ((this.j & 2) != 0) {
                    z = true;
                }
                this.l = Typeface.create(create, i6, z);
            }
        } else if (h0Var.s(1)) {
            this.m = false;
            int k3 = h0Var.k(1, 1);
            if (k3 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (k3 == 2) {
                this.l = Typeface.SERIF;
            } else if (k3 == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.i.d();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.i.e();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.i.f();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.i.g();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.i.h();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        f0 f0Var = this.h;
        if (f0Var != null) {
            return f0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        f0 f0Var = this.h;
        if (f0Var != null) {
            return f0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.i.k();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f8, code lost:
        if (r4[2] != null) goto L_0x02fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r28, int r29) {
        /*
        // Method dump skipped, instructions count: 934
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (!b.d) {
            this.i.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Context context, int i2) {
        String o;
        ColorStateList c2;
        h0 t = h0.t(context, i2, h0.y);
        if (t.s(14)) {
            this.a.setAllCaps(t.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23 && t.s(3) && (c2 = t.c(3)) != null) {
            this.a.setTextColor(c2);
        }
        if (t.s(0) && t.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        x(context, t);
        if (i3 >= 26 && t.s(13) && (o = t.o(13)) != null) {
            this.a.setFontVariationSettings(o);
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void r(int i2, int i3, int i4, int i5) {
        this.i.m(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void s(int[] iArr, int i2) {
        this.i.n(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void t(int i2) {
        this.i.o(i2);
    }

    /* access modifiers changed from: package-private */
    public void u(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new f0();
        }
        f0 f0Var = this.h;
        f0Var.a = colorStateList;
        f0Var.d = colorStateList != null;
        this.b = f0Var;
        this.c = f0Var;
        this.d = f0Var;
        this.e = f0Var;
        this.f = f0Var;
        this.g = f0Var;
    }

    /* access modifiers changed from: package-private */
    public void v(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new f0();
        }
        f0 f0Var = this.h;
        f0Var.b = mode;
        f0Var.c = mode != null;
        this.b = f0Var;
        this.c = f0Var;
        this.d = f0Var;
        this.e = f0Var;
        this.f = f0Var;
        this.g = f0Var;
    }

    /* access modifiers changed from: package-private */
    public void w(int i2, float f2) {
        if (!b.d && !l()) {
            this.i.p(i2, f2);
        }
    }
}
