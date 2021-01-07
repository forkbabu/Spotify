package com.google.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class a0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int o = 0;
    private final int a;
    private List<a0<K, V>.b> b = Collections.emptyList();
    private Map<K, V> c = Collections.emptyMap();
    private boolean f;
    private volatile a0<K, V>.d n;

    /* access modifiers changed from: private */
    public static class a {
        private static final Iterator<Object> a = new C0139a();
        private static final Iterable<Object> b = new b();

        /* renamed from: com.google.protobuf.a0$a$a  reason: collision with other inner class name */
        static class C0139a implements Iterator<Object> {
            C0139a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return a.a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) b;
        }
    }

    /* access modifiers changed from: private */
    public class c implements Iterator<Map.Entry<K, V>> {
        private int a = -1;
        private boolean b;
        private Iterator<Map.Entry<K, V>> c;

        c(z zVar) {
        }

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Iterator<java.util.Map$Entry<K, V>>, java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> */
        private Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = a0.this.c.entrySet().iterator();
            }
            return (Iterator<Map.Entry<K, V>>) this.c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a + 1 < a0.this.b.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            if (i < a0.this.b.size()) {
                return (Map.Entry) a0.this.b.get(this.a);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.b) {
                this.b = false;
                a0.this.g();
                if (this.a < a0.this.b.size()) {
                    a0 a0Var = a0.this;
                    int i = this.a;
                    this.a = i - 1;
                    a0Var.o(i);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* access modifiers changed from: private */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        d(z zVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.google.protobuf.a0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            a0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            a0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.size();
        }
    }

    a0(int i, z zVar) {
        this.a = i;
    }

    private int f(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.b.get(size).d());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.b.get(i2).d());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g() {
        if (this.f) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> k() {
        g();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private V o(int i) {
        g();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = k().entrySet().iterator();
            this.b.add(new b(this, it.next()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.a0<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.n == null) {
            this.n = new d(null);
        }
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        int size = size();
        if (size != a0Var.size()) {
            return false;
        }
        int i = i();
        if (i != a0Var.i()) {
            return ((AbstractSet) entrySet()).equals(a0Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!h(i2).equals(a0Var.h(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.c.equals(a0Var.c);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.a0<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        return f2 >= 0 ? (V) this.b.get(f2).getValue() : this.c.get(comparable);
    }

    public Map.Entry<K, V> h(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public int hashCode() {
        int i = i();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.b.get(i3).hashCode();
        }
        return this.c.size() > 0 ? i2 + this.c.hashCode() : i2;
    }

    public int i() {
        return this.b.size();
    }

    public Iterable<Map.Entry<K, V>> j() {
        if (this.c.isEmpty()) {
            return a.b();
        }
        return this.c.entrySet();
    }

    public boolean l() {
        return this.f;
    }

    public void m() {
        Map<K, V> map;
        if (!this.f) {
            if (this.c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.c);
            }
            this.c = map;
            this.f = true;
        }
    }

    /* renamed from: n */
    public V put(K k, V v) {
        g();
        int f2 = f(k);
        if (f2 >= 0) {
            return (V) this.b.get(f2).setValue(v);
        }
        g();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(f2 + 1);
        if (i >= this.a) {
            return k().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            a0<K, V>.b remove = this.b.remove(i2 - 1);
            k().put((K) remove.d(), (V) remove.getValue());
        }
        this.b.add(i, new b(k, v));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.a0<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return (V) o(f2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c.size() + this.b.size();
    }

    /* access modifiers changed from: private */
    public class b implements Map.Entry<K, V>, Comparable<a0<K, V>.b> {
        private final K a;
        private V b;

        b(a0 a0Var, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            a0.this = a0Var;
            this.a = entry.getKey();
            this.b = value;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(a0<K, V>.b bVar) {
            return this.a.compareTo(bVar.a);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [K, K extends java.lang.Comparable<K>] */
        public K d() {
            return this.a;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.a;
            Object key = entry.getKey();
            if (k == null) {
                z = key == null;
            } else {
                z = k.equals(key);
            }
            if (z) {
                V v = this.b;
                Object value = entry.getValue();
                if (v == null) {
                    z2 = value == null;
                } else {
                    z2 = v.equals(value);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public int hashCode() {
            K k = this.a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            a0.this.g();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        @Override // java.lang.Object
        public String toString() {
            return ((Object) this.a) + "=" + ((Object) this.b);
        }

        b(K k, V v) {
            this.a = k;
            this.b = v;
        }
    }
}
