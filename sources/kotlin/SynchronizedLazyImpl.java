package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class SynchronizedLazyImpl<T> implements d<T>, Serializable {
    private volatile Object _value = e.a;
    private cmf<? extends T> initializer;
    private final Object lock = this;

    public SynchronizedLazyImpl(cmf cmf, Object obj, int i) {
        int i2 = i & 2;
        h.e(cmf, "initializer");
        this.initializer = cmf;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.d
    public T getValue() {
        T t;
        T t2 = (T) this._value;
        e eVar = e.a;
        if (t2 != eVar) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == eVar) {
                cmf<? extends T> cmf = this.initializer;
                h.c(cmf);
                t = (T) cmf.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    @Override // java.lang.Object
    public String toString() {
        return this._value != e.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
