package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.h;

public final class n<T, R> implements e<R> {
    private final e<T> a;
    private final nmf<T, R> b;

    public static final class a implements Iterator<R>, zmf {
        private final Iterator<T> a;
        final /* synthetic */ n b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(n nVar) {
            this.b = nVar;
            this.a = nVar.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.b.b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.e<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: nmf<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(e<? extends T> eVar, nmf<? super T, ? extends R> nmf) {
        h.e(eVar, "sequence");
        h.e(nmf, "transformer");
        this.a = eVar;
        this.b = nmf;
    }

    @Override // kotlin.sequences.e
    public Iterator<R> iterator() {
        return new a(this);
    }
}
