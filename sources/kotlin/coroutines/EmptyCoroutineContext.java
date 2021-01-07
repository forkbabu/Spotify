package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.c;
import kotlin.jvm.internal.h;

public final class EmptyCoroutineContext implements c, Serializable {
    public static final EmptyCoroutineContext a = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // kotlin.coroutines.c
    public <E extends c.a> E c(c.b<E> bVar) {
        h.e(bVar, "key");
        return null;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
