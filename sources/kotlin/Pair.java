package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public final A a() {
        return this.first;
    }

    public final B b() {
        return this.second;
    }

    public final A c() {
        return this.first;
    }

    public final B d() {
        return this.second;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return h.a(this.first, pair.first) && h.a(this.second, pair.second);
    }

    @Override // java.lang.Object
    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.second;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder S0 = je.S0('(');
        S0.append((Object) this.first);
        S0.append(", ");
        S0.append((Object) this.second);
        S0.append(')');
        return S0.toString();
    }
}
