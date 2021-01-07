package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public class Suppliers$SupplierOfInstance<T> implements Supplier<T>, Serializable {
    private static final long serialVersionUID = 0;
    final T instance;

    Suppliers$SupplierOfInstance(T t) {
        this.instance = t;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return rw.equal(this.instance, ((Suppliers$SupplierOfInstance) obj).instance);
        }
        return false;
    }

    @Override // com.google.common.base.Supplier
    public T get() {
        return this.instance;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.instance});
    }

    @Override // java.lang.Object
    public String toString() {
        return je.G0(je.V0("Suppliers.ofInstance("), this.instance, ")");
    }
}
