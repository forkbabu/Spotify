package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import org.apache.commons.lang3.ObjectUtils;

public abstract class Triple<L, M, R> implements Comparable<Triple<L, M, R>>, Serializable {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Triple triple = (Triple) obj;
        zof zof = new zof();
        zof.a(d(), triple.d(), null);
        zof.a(g(), triple.g(), null);
        zof.a(h(), triple.h(), null);
        return zof.b();
    }

    public abstract L d();

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        if (!ObjectUtils.a(d(), triple.d()) || !ObjectUtils.a(g(), triple.g()) || !ObjectUtils.a(h(), triple.h())) {
            return false;
        }
        return true;
    }

    public abstract M g();

    public abstract R h();

    @Override // java.lang.Object
    public int hashCode() {
        int i = 0;
        int hashCode = (d() == null ? 0 : d().hashCode()) ^ (g() == null ? 0 : g().hashCode());
        if (h() != null) {
            i = h().hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder S0 = je.S0('(');
        S0.append((Object) d());
        S0.append(',');
        S0.append((Object) g());
        S0.append(',');
        S0.append((Object) h());
        S0.append(')');
        return S0.toString();
    }
}
