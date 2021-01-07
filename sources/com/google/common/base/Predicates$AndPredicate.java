package com.google.common.base;

import java.io.Serializable;
import java.util.List;

/* access modifiers changed from: package-private */
public class Predicates$AndPredicate<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = 0;
    private final List<? extends Predicate<? super T>> components;

    Predicates$AndPredicate(List list, Predicates$1 predicates$1) {
        this.components = list;
    }

    @Override // com.google.common.base.Predicate
    public boolean apply(T t) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!((Predicate) this.components.get(i)).apply(t)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.base.Predicate, java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof Predicates$AndPredicate) {
            return this.components.equals(((Predicates$AndPredicate) obj).components);
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    @Override // java.lang.Object
    public String toString() {
        List<? extends Predicate<? super T>> list = this.components;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and");
        sb.append('(');
        boolean z = true;
        for (T t : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append((Object) t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
