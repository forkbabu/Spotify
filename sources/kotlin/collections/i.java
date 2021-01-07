package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.h;

public final class i<T> implements Iterable<h<? extends T>>, zmf {
    private final cmf<Iterator<T>> a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: cmf<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(cmf<? extends Iterator<? extends T>> cmf) {
        h.e(cmf, "iteratorFactory");
        this.a = cmf;
    }

    @Override // java.lang.Iterable
    public Iterator<h<T>> iterator() {
        return new j(this.a.invoke());
    }
}
