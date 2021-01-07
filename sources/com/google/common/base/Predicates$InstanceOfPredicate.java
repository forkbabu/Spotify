package com.google.common.base;

import java.io.Serializable;

/* access modifiers changed from: package-private */
public class Predicates$InstanceOfPredicate implements Predicate<Object>, Serializable {
    private static final long serialVersionUID = 0;
    private final Class<?> clazz;

    Predicates$InstanceOfPredicate(Class cls, Predicates$1 predicates$1) {
        cls.getClass();
        this.clazz = cls;
    }

    @Override // com.google.common.base.Predicate
    public boolean apply(Object obj) {
        return this.clazz.isInstance(obj);
    }

    @Override // com.google.common.base.Predicate, java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Predicates$InstanceOfPredicate) || this.clazz != ((Predicates$InstanceOfPredicate) obj).clazz) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.clazz.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        return je.l0(this.clazz, je.V0("Predicates.instanceOf("), ")");
    }
}
