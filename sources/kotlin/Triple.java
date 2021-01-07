package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public final A a() {
        return this.first;
    }

    public final B b() {
        return this.second;
    }

    public final C c() {
        return this.third;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return h.a(this.first, triple.first) && h.a(this.second, triple.second) && h.a(this.third, triple.third);
    }

    @Override // java.lang.Object
    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.third;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder S0 = je.S0('(');
        S0.append((Object) this.first);
        S0.append(", ");
        S0.append((Object) this.second);
        S0.append(", ");
        S0.append((Object) this.third);
        S0.append(')');
        return S0.toString();
    }
}
