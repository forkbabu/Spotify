package io.netty.handler.codec;

import io.netty.handler.codec.g;
import io.netty.util.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class e<K, V, T extends g<K, V, T>> implements g<K, V, T> {
    private final b<K, V>[] a;
    protected final b<K, V> b;
    private final byte c;
    private final j<V> f;
    private final d<K> n;
    private final k<K> o;
    int p;

    private final class c implements Iterator<Map.Entry<K, V>> {
        private b<K, V> a;

        c(a aVar) {
            this.a = e.this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.o != e.this.b;
        }

        @Override // java.util.Iterator
        public Object next() {
            b<K, V> bVar = this.a.o;
            this.a = bVar;
            if (bVar != e.this.b) {
                return bVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("read-only iterator");
        }
    }

    public interface d<K> {
        public static final d a = new a();

        static class a implements d {
            a() {
            }

            @Override // io.netty.handler.codec.e.d
            public void a(Object obj) {
                if (obj == null) {
                    throw new NullPointerException("name");
                }
            }
        }

        void a(K k);
    }

    public e(k<K> kVar, j<V> jVar, d<K> dVar) {
        if (jVar != null) {
            this.f = jVar;
            if (dVar != null) {
                this.n = dVar;
                if (kVar != null) {
                    this.o = kVar;
                    int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(2, Math.min(16, 128)) - 1));
                    this.a = new b[numberOfLeadingZeros];
                    this.c = (byte) (numberOfLeadingZeros - 1);
                    this.b = new b<>();
                    return;
                }
                throw new NullPointerException("nameHashingStrategy");
            }
            throw new NullPointerException("nameValidator");
        }
        throw new NullPointerException("valueConverter");
    }

    private void d(int i, int i2, K k, V v) {
        b<K, V>[] bVarArr = this.a;
        bVarArr[i2] = new b<>(i, k, v, bVarArr[i2], this.b);
        this.p++;
    }

    private V l(int i, int i2, K k) {
        b<K, V> bVar = this.a[i2];
        V v = null;
        if (bVar == null) {
            return null;
        }
        for (b<K, V> bVar2 = bVar.f; bVar2 != null; bVar2 = bVar.f) {
            if (bVar2.a != i || !this.o.b(k, bVar2.b)) {
                bVar = bVar2;
            } else {
                v = bVar2.c;
                bVar.f = bVar2.f;
                b<K, V> bVar3 = bVar2.n;
                bVar3.o = bVar2.o;
                bVar2.o.n = bVar3;
                this.p--;
            }
        }
        b<K, V> bVar4 = this.a[i2];
        if (bVar4.a == i && this.o.b(k, bVar4.b)) {
            if (v == null) {
                v = bVar4.c;
            }
            this.a[i2] = bVar4.f;
            b<K, V> bVar5 = bVar4.n;
            bVar5.o = bVar4.o;
            bVar4.o.n = bVar5;
            this.p--;
        }
        return v;
    }

    public T c(K k, V v) {
        this.n.a(k);
        if (v != null) {
            int a2 = this.o.a(k);
            d(a2, this.c & a2, k, v);
            return this;
        }
        throw new NullPointerException("value");
    }

    public T e(K k, Object obj) {
        j<V> jVar = this.f;
        if (obj != null) {
            return c(k, jVar.a(obj));
        }
        throw new NullPointerException("value");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return h((g) obj, k.a);
    }

    public final boolean f(K k, V v, k<? super V> kVar) {
        if (k != null) {
            int a2 = this.o.a(k);
            for (b<K, V> bVar = this.a[this.c & a2]; bVar != null; bVar = bVar.f) {
                if (bVar.a == a2 && this.o.b(k, bVar.b) && kVar.b(v, bVar.c)) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("name");
    }

    public final boolean h(g<K, V, ?> gVar, k<V> kVar) {
        if (gVar.size() != this.p) {
            return false;
        }
        if (this == gVar) {
            return true;
        }
        for (K k : k()) {
            List<V> r0 = gVar.r0(k);
            List<V> r02 = r0(k);
            if (r0.size() != r02.size()) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i < r0.size()) {
                    if (!kVar.b(r0.get(i), r02.get(i))) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return j(k.a);
    }

    public V i(K k) {
        if (k != null) {
            int a2 = this.o.a(k);
            V v = null;
            for (b<K, V> bVar = this.a[this.c & a2]; bVar != null; bVar = bVar.f) {
                if (bVar.a == a2 && this.o.b(k, bVar.b)) {
                    v = bVar.c;
                }
            }
            return v;
        }
        throw new NullPointerException("name");
    }

    public boolean isEmpty() {
        b<K, V> bVar = this.b;
        return bVar == bVar.o;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new c(null);
    }

    public final int j(k<V> kVar) {
        int i = -1028477387;
        for (K k : k()) {
            int a2 = this.o.a(k) + (i * 31);
            List<V> r0 = r0(k);
            for (int i2 = 0; i2 < r0.size(); i2++) {
                a2 = (a2 * 31) + kVar.a(r0.get(i2));
            }
            i = a2;
        }
        return i;
    }

    public Set<K> k() {
        b<K, V> bVar = this.b;
        if (bVar == bVar.o) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.p);
        for (b<K, V> bVar2 = this.b.o; bVar2 != this.b; bVar2 = bVar2.o) {
            linkedHashSet.add(bVar2.b);
        }
        return linkedHashSet;
    }

    public T n(K k, V v) {
        this.n.a(k);
        int a2 = this.o.a(k);
        int i = this.c & a2;
        l(a2, i, k);
        d(a2, i, k, v);
        return this;
    }

    public T o(K k, Iterable<?> iterable) {
        Object next;
        this.n.a(k);
        int a2 = this.o.a(k);
        int i = this.c & a2;
        l(a2, i, k);
        Iterator<?> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            d(a2, i, k, this.f.a(next));
        }
        return this;
    }

    @Override // io.netty.handler.codec.g
    public List<V> r0(K k) {
        if (k != null) {
            LinkedList linkedList = new LinkedList();
            int a2 = this.o.a(k);
            for (b<K, V> bVar = this.a[this.c & a2]; bVar != null; bVar = bVar.f) {
                if (bVar.a == a2 && this.o.b(k, bVar.b)) {
                    linkedList.addFirst(bVar.c);
                }
            }
            return linkedList;
        }
        throw new NullPointerException("name");
    }

    public boolean remove(K k) {
        int a2 = this.o.a(k);
        int i = this.c & a2;
        if (k != null) {
            return l(a2, i, k) != null;
        }
        throw new NullPointerException("name");
    }

    @Override // io.netty.handler.codec.g
    public int size() {
        return this.p;
    }

    public T t(K k, Object obj) {
        if (obj != null) {
            V a2 = this.f.a(obj);
            yif.i(a2, "convertedValue");
            n(k, a2);
            return this;
        }
        throw new NullPointerException("value");
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        String str = "";
        for (K k : k()) {
            List<V> r0 = r0(k);
            int i = 0;
            while (i < r0.size()) {
                sb.append(str);
                sb.append((Object) k);
                sb.append(": ");
                sb.append((Object) r0.get(i));
                i++;
                str = ", ";
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public j<V> u() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public static class b<K, V> implements Map.Entry<K, V> {
        protected final int a;
        protected final K b;
        protected V c;
        protected b<K, V> f;
        protected b<K, V> n;
        protected b<K, V> o;

        b(int i, K k, V v, b<K, V> bVar, b<K, V> bVar2) {
            this.a = i;
            this.b = k;
            this.c = v;
            this.f = bVar;
            this.o = bVar2;
            b<K, V> bVar3 = bVar2.n;
            this.n = bVar3;
            bVar3.o = this;
            this.o.n = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v != null) {
                V v2 = this.c;
                this.c = v;
                return v2;
            }
            throw new NullPointerException("value");
        }

        @Override // java.lang.Object
        public final String toString() {
            return this.b.toString() + '=' + this.c.toString();
        }

        b() {
            this.a = -1;
            this.b = null;
            this.o = this;
            this.n = this;
        }
    }
}
