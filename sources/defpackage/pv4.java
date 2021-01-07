package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: pv4  reason: default package */
public class pv4 {

    /* renamed from: pv4$b */
    public static class b<T> {
        private final T a;
        private final long b;

        b(T t, long j) {
            this.a = t;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public T b() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pv4$c */
    public static class c implements Iterator<Long> {
        private long a;

        c(a aVar) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < Long.MAX_VALUE;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public Long next() {
            if (hasNext()) {
                long j = this.a;
                this.a = 1 + j;
                return Long.valueOf(j);
            }
            throw new NoSuchElementException();
        }
    }

    pv4() {
    }
}
