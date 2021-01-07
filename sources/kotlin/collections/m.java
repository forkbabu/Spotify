package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;

final class m<T> extends b<T> implements RandomAccess {
    private final int a;
    private int b;
    private int c;
    private final Object[] f;

    public static final class a extends a<T> {
        private int c;
        private int f;
        final /* synthetic */ m n;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(m mVar) {
            this.n = mVar;
            this.c = mVar.d();
            this.f = mVar.b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.collections.m$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // kotlin.collections.a
        public void a() {
            if (this.c == 0) {
                b();
                return;
            }
            d(this.n.f[this.f]);
            this.f = (this.f + 1) % this.n.a;
            this.c--;
        }
    }

    public m(Object[] objArr, int i) {
        h.e(objArr, "buffer");
        this.f = objArr;
        boolean z = false;
        if (i >= 0) {
            if (i <= objArr.length ? true : z) {
                this.a = objArr.length;
                this.c = i;
                return;
            }
            StringBuilder W0 = je.W0("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            W0.append(objArr.length);
            throw new IllegalArgumentException(W0.toString().toString());
        }
        throw new IllegalArgumentException(je.p0("ring buffer filled size should not be negative but it is ", i).toString());
    }

    @Override // kotlin.collections.AbstractCollection
    public int d() {
        return this.c;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i) {
        int d = d();
        if (i >= 0 && i < d) {
            return (T) this.f[(this.b + i) % this.a];
        }
        throw new IndexOutOfBoundsException(je.s0("index: ", i, ", size: ", d));
    }

    public final void i(T t) {
        if (!(d() == this.a)) {
            this.f[(this.b + d()) % this.a] = t;
            this.c = d() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.collections.m<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final m<T> j(int i) {
        Object[] objArr;
        int i2 = this.a;
        int i3 = i2 + (i2 >> 1) + 1;
        if (i3 <= i) {
            i = i3;
        }
        if (this.b == 0) {
            objArr = Arrays.copyOf(this.f, i);
            h.d(objArr, "java.util.Arrays.copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[i]);
        }
        return new m<>(objArr, d());
    }

    public final boolean k() {
        return d() == this.a;
    }

    public final void l(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > d()) {
                z = false;
            }
            if (!z) {
                StringBuilder W0 = je.W0("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
                W0.append(d());
                throw new IllegalArgumentException(W0.toString().toString());
            } else if (i > 0) {
                int i2 = this.b;
                int i3 = this.a;
                int i4 = (i2 + i) % i3;
                if (i2 > i4) {
                    d.h(this.f, null, i2, i3);
                    d.h(this.f, null, 0, i4);
                } else {
                    d.h(this.f, null, i2, i4);
                }
                this.b = i4;
                this.c = d() - i;
            }
        } else {
            throw new IllegalArgumentException(je.p0("n shouldn't be negative but it is ", i).toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.collections.m<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[d()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: T[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        h.e(tArr, "array");
        if (tArr.length < d()) {
            tArr = (T[]) Arrays.copyOf(tArr, d());
            h.d(tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int d = d();
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        while (i3 < d && i < this.a) {
            tArr[i3] = this.f[i];
            i3++;
            i++;
        }
        while (i3 < d) {
            tArr[i3] = this.f[i2];
            i3++;
            i2++;
        }
        if (tArr.length > d()) {
            tArr[d()] = null;
        }
        return tArr;
    }
}
