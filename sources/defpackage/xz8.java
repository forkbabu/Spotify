package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: xz8  reason: default package */
final class xz8 {
    private final int a;
    private final int b;
    private final String c;

    public xz8(int i, int i2, String str) {
        h.e(str, "value");
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz8)) {
            return false;
        }
        xz8 xz8 = (xz8) obj;
        return this.a == xz8.a && this.b == xz8.b && h.a(this.c, xz8.c);
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Placeholder(start=");
        V0.append(this.a);
        V0.append(", end=");
        V0.append(this.b);
        V0.append(", value=");
        return je.I0(V0, this.c, ")");
    }
}
