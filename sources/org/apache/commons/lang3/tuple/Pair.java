package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;

public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Pair pair = (Pair) obj;
        zof zof = new zof();
        zof.a(d(), pair.d(), null);
        zof.a(g(), pair.g(), null);
        return zof.b();
    }

    public abstract L d();

    @Override // java.util.Map.Entry, java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!ObjectUtils.a(getKey(), entry.getKey()) || !ObjectUtils.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract R g();

    @Override // java.util.Map.Entry
    public final L getKey() {
        return d();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return g();
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder S0 = je.S0('(');
        S0.append((Object) d());
        S0.append(',');
        S0.append((Object) g());
        S0.append(')');
        return S0.toString();
    }
}
