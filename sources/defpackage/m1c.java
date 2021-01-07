package defpackage;

import defpackage.j1c;
import kotlin.jvm.internal.h;

/* renamed from: m1c  reason: default package */
public final class m1c {
    private final j1c.a a;
    private final j1c.a.AbstractC0624a.C0625a b;
    private final double c;

    public m1c(j1c.a aVar, j1c.a.AbstractC0624a.C0625a aVar2, double d) {
        h.e(aVar, "originalSize");
        h.e(aVar2, "adjustedSize");
        this.a = aVar;
        this.b = aVar2;
        this.c = d;
    }

    public final j1c.a.AbstractC0624a.C0625a a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1c)) {
            return false;
        }
        m1c m1c = (m1c) obj;
        return h.a(this.a, m1c.a) && h.a(this.b, m1c.b) && Double.compare(this.c, m1c.c) == 0;
    }

    public int hashCode() {
        j1c.a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        j1c.a.AbstractC0624a.C0625a aVar2 = this.b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return ((hashCode + i) * 31) + Double.doubleToLongBits(this.c);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SizeAndCoefficient(originalSize=");
        V0.append(this.a);
        V0.append(", adjustedSize=");
        V0.append(this.b);
        V0.append(", coefficient=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
