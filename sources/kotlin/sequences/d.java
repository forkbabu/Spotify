package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d<T> implements e<T> {
    private final cmf<T> a;
    private final nmf<T, T> b;

    public static final class a implements Iterator<T>, zmf {
        private T a;
        private int b = -2;
        final /* synthetic */ d c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.c = dVar;
        }

        private final void a() {
            T t;
            if (this.b == -2) {
                t = (T) this.c.a.invoke();
            } else {
                nmf nmf = this.c.b;
                T t2 = this.a;
                h.c(t2);
                t = (T) nmf.invoke(t2);
            }
            this.a = t;
            this.b = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b < 0) {
                a();
            }
            if (this.b != 0) {
                T t = this.a;
                if (t != null) {
                    this.b = -1;
                    return t;
                }
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: cmf<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nmf<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(cmf<? extends T> cmf, nmf<? super T, ? extends T> nmf) {
        h.e(cmf, "getInitialValue");
        h.e(nmf, "getNextValue");
        this.a = cmf;
        this.b = nmf;
    }

    @Override // kotlin.sequences.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
