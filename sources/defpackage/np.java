package defpackage;

import android.text.Layout;
import com.google.android.exoplayer2.util.g;

/* access modifiers changed from: package-private */
/* renamed from: np  reason: default package */
public final class np {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private float k;
    private String l;
    private Layout.Alignment m;

    public np a(np npVar) {
        if (npVar != null) {
            if (!this.c && npVar.c) {
                int i2 = npVar.b;
                g.m(true);
                this.b = i2;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = npVar.h;
            }
            if (this.i == -1) {
                this.i = npVar.i;
            }
            if (this.a == null) {
                this.a = npVar.a;
            }
            if (this.f == -1) {
                this.f = npVar.f;
            }
            if (this.g == -1) {
                this.g = npVar.g;
            }
            if (this.m == null) {
                this.m = npVar.m;
            }
            if (this.j == -1) {
                this.j = npVar.j;
                this.k = npVar.k;
            }
            if (!this.e && npVar.e) {
                this.d = npVar.d;
                this.e = true;
            }
        }
        return this;
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public int h() {
        int i2 = this.h;
        if (i2 == -1 && this.i == -1) {
            return -1;
        }
        int i3 = 0;
        int i4 = i2 == 1 ? 1 : 0;
        if (this.i == 1) {
            i3 = 2;
        }
        return i4 | i3;
    }

    public Layout.Alignment i() {
        return this.m;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.c;
    }

    public boolean l() {
        return this.f == 1;
    }

    public boolean m() {
        return this.g == 1;
    }

    public np n(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    public np o(boolean z) {
        g.m(true);
        this.h = z ? 1 : 0;
        return this;
    }

    public np p(int i2) {
        g.m(true);
        this.b = i2;
        this.c = true;
        return this;
    }

    public np q(String str) {
        g.m(true);
        this.a = str;
        return this;
    }

    public np r(float f2) {
        this.k = f2;
        return this;
    }

    public np s(int i2) {
        this.j = i2;
        return this;
    }

    public np t(String str) {
        this.l = str;
        return this;
    }

    public np u(boolean z) {
        g.m(true);
        this.i = z ? 1 : 0;
        return this;
    }

    public np v(boolean z) {
        g.m(true);
        this.f = z ? 1 : 0;
        return this;
    }

    public np w(Layout.Alignment alignment) {
        this.m = alignment;
        return this;
    }

    public np x(boolean z) {
        g.m(true);
        this.g = z ? 1 : 0;
        return this;
    }
}
