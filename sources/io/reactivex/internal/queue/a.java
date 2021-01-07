package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.i;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a<T> implements i<T> {
    static final int r = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object s = new Object();
    final AtomicLong a;
    int b;
    long c;
    final int f;
    AtomicReferenceArray<Object> n;
    final int o;
    AtomicReferenceArray<Object> p;
    final AtomicLong q = new AtomicLong();

    public a(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        int M = yif.M(Math.max(8, i));
        int i2 = M - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(M + 1);
        this.n = atomicReferenceArray;
        this.f = i2;
        this.b = Math.min(M / 4, r);
        this.p = atomicReferenceArray;
        this.o = i2;
        this.c = (long) (i2 - 1);
        atomicLong.lazySet(0);
    }

    public boolean a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.n;
        long j = this.a.get();
        int i = this.f;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, t2);
            atomicReferenceArray.lazySet(i2, t);
            this.a.lazySet(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.n = atomicReferenceArray2;
        int i3 = ((int) j) & i;
        atomicReferenceArray2.lazySet(i3 + 1, t2);
        atomicReferenceArray2.lazySet(i3, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, s);
        this.a.lazySet(j2);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return this.a.get() == this.q.get();
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.n;
            long j = this.a.get();
            int i = this.f;
            int i2 = ((int) j) & i;
            if (j < this.c) {
                atomicReferenceArray.lazySet(i2, t);
                this.a.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.b) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.c = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.a.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.a.lazySet(j3);
                return true;
            }
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.n = atomicReferenceArray2;
            this.c = (((long) i) + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, s);
            this.a.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.i, io.reactivex.internal.fuseable.j
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.p;
        long j = this.q.get();
        int i = this.o;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == s;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            this.q.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, null);
            this.p = atomicReferenceArray2;
            T t2 = (T) atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, null);
                this.q.lazySet(j + 1);
            }
            return t2;
        }
    }
}
