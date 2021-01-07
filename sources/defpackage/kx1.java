package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: kx1  reason: default package */
public final class kx1 {
    private final int a;
    private final jx1 b;
    private final ex1 c;

    public kx1(int i, jx1 jx1, ex1 ex1) {
        h.e(jx1, "duration");
        h.e(ex1, "shareButtonBehavior");
        this.a = i;
        this.b = jx1;
        this.c = ex1;
    }

    public final jx1 a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final ex1 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx1)) {
            return false;
        }
        kx1 kx1 = (kx1) obj;
        return this.a == kx1.a && h.a(this.b, kx1.b) && h.a(this.c, kx1.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        jx1 jx1 = this.b;
        int i2 = 0;
        int hashCode = (i + (jx1 != null ? jx1.hashCode() : 0)) * 31;
        ex1 ex1 = this.c;
        if (ex1 != null) {
            i2 = ex1.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("StoryInfo(index=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append(", shareButtonBehavior=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
