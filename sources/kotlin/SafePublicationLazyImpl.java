package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class SafePublicationLazyImpl<T> implements d<T>, Serializable {
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f1final;
    private volatile cmf<? extends T> initializer;

    public SafePublicationLazyImpl(cmf<? extends T> cmf) {
        h.e(cmf, "initializer");
        this.initializer = cmf;
        e eVar = e.a;
        this._value = eVar;
        this.f1final = eVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.d
    public T getValue() {
        T t = (T) this._value;
        e eVar = e.a;
        if (t != eVar) {
            return t;
        }
        cmf<? extends T> cmf = this.initializer;
        if (cmf != null) {
            T t2 = (T) cmf.invoke();
            if (a.compareAndSet(this, eVar, t2)) {
                this.initializer = null;
                return t2;
            }
        }
        return (T) this._value;
    }

    @Override // java.lang.Object
    public String toString() {
        return this._value != e.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
