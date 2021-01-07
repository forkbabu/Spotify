package com.google.common.base;

import java.io.Serializable;

/* access modifiers changed from: package-private */
public class Suppliers$MemoizingSupplier<T> implements Supplier<T>, Serializable {
    private static final long serialVersionUID = 0;
    final Supplier<T> delegate;
    volatile transient boolean initialized;
    transient T value;

    Suppliers$MemoizingSupplier(Supplier<T> supplier) {
        supplier.getClass();
        this.delegate = supplier;
    }

    @Override // com.google.common.base.Supplier
    public T get() {
        if (!this.initialized) {
            synchronized (this) {
                if (!this.initialized) {
                    T t = this.delegate.get();
                    this.value = t;
                    this.initialized = true;
                    return t;
                }
            }
        }
        return this.value;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.G0(je.V0("Suppliers.memoize("), this.initialized ? je.G0(je.V0("<supplier that returned "), this.value, ">") : this.delegate, ")");
    }
}
