package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* access modifiers changed from: package-private */
public class f {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    f(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a2 = c.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = a.l(a2).mutate();
            if (this.d) {
                a.i(mutate, this.b);
            }
            if (this.e) {
                a.j(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = c.a(this.a)) == null) ? i : i + a2.getIntrinsicWidth();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = defpackage.h0.m
            r8 = 0
            androidx.appcompat.widget.h0 r0 = androidx.appcompat.widget.h0.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            defpackage.q4.H(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x008e }
            if (r11 == 0) goto L_0x0038
            int r11 = r0.n(r10, r8)     // Catch:{ all -> 0x008e }
            if (r11 == 0) goto L_0x0038
            android.widget.CompoundButton r1 = r9.a     // Catch:{ NotFoundException -> 0x0038 }
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x0038 }
            android.graphics.drawable.Drawable r11 = defpackage.i0.b(r2, r11)     // Catch:{ NotFoundException -> 0x0038 }
            r1.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            if (r10 != 0) goto L_0x0054
            boolean r10 = r0.s(r8)
            if (r10 == 0) goto L_0x0054
            int r10 = r0.n(r8, r8)
            if (r10 == 0) goto L_0x0054
            android.widget.CompoundButton r11 = r9.a
            android.content.Context r1 = r11.getContext()
            android.graphics.drawable.Drawable r10 = defpackage.i0.b(r1, r10)
            r11.setButtonDrawable(r10)
        L_0x0054:
            r10 = 2
            boolean r11 = r0.s(r10)
            if (r11 == 0) goto L_0x0064
            android.widget.CompoundButton r11 = r9.a
            android.content.res.ColorStateList r10 = r0.c(r10)
            androidx.core.widget.c.f(r11, r10)
        L_0x0064:
            r10 = 3
            boolean r11 = r0.s(r10)
            if (r11 == 0) goto L_0x008a
            android.widget.CompoundButton r11 = r9.a
            r1 = -1
            int r10 = r0.k(r10, r1)
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.q.d(r10, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0081
            r11.setButtonTintMode(r10)
            goto L_0x008a
        L_0x0081:
            boolean r1 = r11 instanceof androidx.core.widget.f
            if (r1 == 0) goto L_0x008a
            androidx.core.widget.f r11 = (androidx.core.widget.f) r11
            r11.setSupportButtonTintMode(r10)
        L_0x008a:
            r0.w()
            return
        L_0x008e:
            r10 = move-exception
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
