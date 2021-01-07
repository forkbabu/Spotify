package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.h;

public final class m<T> implements e<T>, b<T> {
    private final e<T> a;
    private final int b;

    public static final class a implements Iterator<T>, zmf {
        private int a;
        private final Iterator<T> b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(m mVar) {
            this.a = mVar.b;
            this.b = mVar.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0 && this.b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.a;
            if (i != 0) {
                this.a = i - 1;
                return this.b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.e<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(e<? extends T> eVar, int i) {
        h.e(eVar, "sequence");
        this.a = eVar;
        this.b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // kotlin.sequences.b
    public e<T> a(int i) {
        return i >= this.b ? this : new m(this.a, i);
    }

    @Override // kotlin.sequences.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
