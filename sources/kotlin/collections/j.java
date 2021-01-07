package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.h;

public final class j<T> implements Iterator<h<? extends T>>, zmf {
    private int a;
    private final Iterator<T> b;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Iterator<? extends T> it) {
        h.e(it, "iterator");
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 0) {
            return new h(i, this.b.next());
        }
        d.L();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
