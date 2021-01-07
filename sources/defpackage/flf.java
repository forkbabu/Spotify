package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX WARN: Incorrect class signature, class is equals to this class: <E:Ljava/lang/Object;>Lflf<TE;>; */
/* renamed from: flf  reason: default package */
public abstract class flf<E> extends AbstractQueue {
    protected final long a;
    protected final E[] b;

    public flf(int i) {
        int L = yif.L(i);
        this.a = (long) (L - 1);
        this.b = (E[]) new Object[((rlf.a * 2) + (L << slf.a))];
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (((glf) this).poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
