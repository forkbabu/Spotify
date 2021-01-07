package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class a<T> implements Iterator<T>, zmf {
    private State a = State.NotReady;
    private T b;

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void b() {
        this.a = State.Done;
    }

    /* access modifiers changed from: protected */
    public final void d(T t) {
        this.b = t;
        this.a = State.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.a;
        State state2 = State.Failed;
        if (state != state2) {
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.a = state2;
                a();
                if (this.a == State.Ready) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.a = State.NotReady;
            return this.b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
