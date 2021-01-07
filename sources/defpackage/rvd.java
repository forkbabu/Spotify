package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* renamed from: rvd  reason: default package */
public class rvd {
    private final Button a;
    private int b = -1;
    private int c;
    private int d;
    private final b e = new b(null);
    private final b f = new b(null);
    private final svd g;

    /* access modifiers changed from: private */
    /* renamed from: rvd$b */
    public static class b {
        boolean a;
        int b;
        ColorStateList c;

        b(a aVar) {
        }
    }

    public rvd(Button button, tvd tvd) {
        this.a = button;
        this.g = new svd(button.getContext());
    }

    private void g() {
        boolean z;
        b bVar = this.f;
        boolean z2 = false;
        boolean z3 = bVar.b != 0;
        b bVar2 = this.e;
        int i = bVar2.b;
        if (i != 0) {
            int i2 = uvd.a;
            z = true;
        } else {
            z = false;
        }
        bVar2.a = z;
        bVar.a = z3 || z;
        if (bVar2.a) {
            bVar2.c = this.g.a(i);
            a();
        }
        if (this.f.a) {
            if (s2.c(this.e.b) > 0.5d) {
                z2 = true;
            }
            b bVar3 = this.f;
            int i3 = bVar3.b;
            if (i3 != 0) {
                bVar3.c = this.g.a(i3);
            } else if (z2) {
                bVar3.c = this.g.a(this.d);
            } else {
                bVar3.c = this.g.a(this.c);
            }
            b bVar4 = this.f;
            if (bVar4.a) {
                this.a.setTextColor(bVar4.c);
            }
        }
    }

    public void a() {
        Drawable background;
        if (this.e.a && (background = this.a.getBackground()) != null) {
            qvd.a(background, this.e.c, this.a.getDrawableState());
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, lvd.b, i, 0);
        try {
            this.d = obtainStyledAttributes.getColor(2, -16777216);
            this.c = obtainStyledAttributes.getColor(3, -1);
            this.b = obtainStyledAttributes.getResourceId(0, -1);
            if (obtainStyledAttributes.hasValue(4)) {
                this.f.b = obtainStyledAttributes.getColor(4, -65281);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.e.b = obtainStyledAttributes.getColor(1, -65281);
            }
            g();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void c() {
        this.b = -1;
        g();
    }

    public void d(int i) {
        this.b = i;
        g();
    }

    public void e(int i) {
        this.e.b = i;
        g();
    }

    public void f(int i) {
        this.f.b = i;
        g();
    }
}
