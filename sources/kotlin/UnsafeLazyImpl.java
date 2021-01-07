package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class UnsafeLazyImpl<T> implements d<T>, Serializable {
    private Object _value = e.a;
    private cmf<? extends T> initializer;

    public UnsafeLazyImpl(cmf<? extends T> cmf) {
        h.e(cmf, "initializer");
        this.initializer = cmf;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.d
    public T getValue() {
        if (this._value == e.a) {
            cmf<? extends T> cmf = this.initializer;
            h.c(cmf);
            this._value = cmf.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // java.lang.Object
    public String toString() {
        return this._value != e.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
