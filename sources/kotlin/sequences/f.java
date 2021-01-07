package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class f<T> extends g<T> implements Iterator<T>, a<kotlin.f>, zmf {
    private int a;
    private T b;
    private a<? super kotlin.f> c;

    private final Throwable d() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder V0 = je.V0("Unexpected state of the iterator: ");
        V0.append(this.a);
        return new IllegalStateException(V0.toString());
    }

    @Override // kotlin.coroutines.a
    public void a(Object obj) {
        yif.W(obj);
        this.a = 4;
    }

    @Override // kotlin.sequences.g
    public Object b(T t, a<? super kotlin.f> aVar) {
        this.b = t;
        this.a = 3;
        this.c = aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        h.e(aVar, "frame");
        return coroutineSingletons;
    }

    public final void e(a<? super kotlin.f> aVar) {
        this.c = aVar;
    }

    @Override // kotlin.coroutines.a
    public c getContext() {
        return EmptyCoroutineContext.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.a;
            Iterator it = null;
            if (i != 0) {
                if (i == 1) {
                    h.c(null);
                    if (it.hasNext()) {
                        this.a = 2;
                        return true;
                    }
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
            }
            this.a = 5;
            a<? super kotlin.f> aVar = this.c;
            h.c(aVar);
            this.c = null;
            aVar.a(kotlin.f.a);
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.a;
        if (i != 0 && i != 1) {
            Iterator it = null;
            if (i == 2) {
                this.a = 1;
                h.c(null);
                return (T) it.next();
            } else if (i == 3) {
                this.a = 0;
                T t = this.b;
                this.b = null;
                return t;
            } else {
                throw d();
            }
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
