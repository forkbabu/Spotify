package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;

public final class a<T> implements e<T> {
    private final AtomicReference<e<T>> a;

    public a(e<? extends T> eVar) {
        h.e(eVar, "sequence");
        this.a = new AtomicReference<>(eVar);
    }

    @Override // kotlin.sequences.e
    public Iterator<T> iterator() {
        e<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
