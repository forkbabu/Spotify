package com.google.common.base;

/* access modifiers changed from: package-private */
public class Suppliers$NonSerializableMemoizingSupplier<T> implements Supplier<T> {
    volatile Supplier<T> delegate;
    volatile boolean initialized;
    T value;

    Suppliers$NonSerializableMemoizingSupplier(Supplier<T> supplier) {
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
                    this.delegate = null;
                    return t;
                }
            }
        }
        return this.value;
    }

    public String toString() {
        Object obj = this.delegate;
        StringBuilder V0 = je.V0("Suppliers.memoize(");
        if (obj == null) {
            obj = je.G0(je.V0("<supplier that returned "), this.value, ">");
        }
        return je.G0(V0, obj, ")");
    }
}
