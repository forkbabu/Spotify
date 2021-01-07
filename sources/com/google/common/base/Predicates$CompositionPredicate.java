package com.google.common.base;

import java.io.Serializable;

/* access modifiers changed from: package-private */
public class Predicates$CompositionPredicate<A, B> implements Predicate<A>, Serializable {
    private static final long serialVersionUID = 0;
    final Function<A, ? extends B> f;
    final Predicate<B> p;

    Predicates$CompositionPredicate(Predicate predicate, Function function, Predicates$1 predicates$1) {
        predicate.getClass();
        this.p = predicate;
        function.getClass();
        this.f = function;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.common.base.Predicate<B> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Predicate
    public boolean apply(A a) {
        return this.p.apply(this.f.apply(a));
    }

    @Override // com.google.common.base.Predicate, java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Predicates$CompositionPredicate)) {
            return false;
        }
        Predicates$CompositionPredicate predicates$CompositionPredicate = (Predicates$CompositionPredicate) obj;
        if (!this.f.equals(predicates$CompositionPredicate.f) || !this.p.equals(predicates$CompositionPredicate.p)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.f.hashCode() ^ this.p.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        return this.p + "(" + this.f + ")";
    }
}
