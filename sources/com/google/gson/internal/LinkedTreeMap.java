package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> a = new a();
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    final e<K, V> header = new e<>();
    private LinkedTreeMap<K, V>.c keySet;
    int modCount = 0;
    e<K, V> root;
    int size = 0;

    class a implements Comparator<Comparable> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends LinkedTreeMap<K, V>.d {
            a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> b;
            if (!(obj instanceof Map.Entry) || (b = LinkedTreeMap.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.f(b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends LinkedTreeMap<K, V>.d {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().o;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.d(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            e<K, V> d = linkedTreeMap.d(obj);
            if (d != null) {
                linkedTreeMap.f(d, true);
            }
            if (d != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    private abstract class d<T> implements Iterator<T> {
        e<K, V> a;
        e<K, V> b = null;
        int c;

        d() {
            this.a = LinkedTreeMap.this.header.f;
            this.c = LinkedTreeMap.this.modCount;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> a() {
            e<K, V> eVar = this.a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.modCount == this.c) {
                this.a = eVar.f;
                this.b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar != null) {
                LinkedTreeMap.this.f(eVar, true);
                this.b = null;
                this.c = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedTreeMap() {
        Comparator<Comparable> comparator2 = a;
        this.comparator = comparator2;
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.q : 0;
            int i3 = eVar3 != null ? eVar3.q : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.c;
                int i5 = eVar5 != null ? eVar5.q : 0;
                if (eVar4 != null) {
                    i = eVar4.q;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    h(eVar);
                } else {
                    i(eVar3);
                    h(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.c;
                int i7 = eVar7 != null ? eVar7.q : 0;
                if (eVar6 != null) {
                    i = eVar6.q;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    i(eVar);
                } else {
                    h(eVar2);
                    i(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.q = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.q = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    private void g(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.c = eVar2;
        }
    }

    private void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        g(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.q : 0, eVar4 != null ? eVar4.q : 0) + 1;
        eVar.q = max;
        if (eVar5 != null) {
            i = eVar5.q;
        }
        eVar3.q = Math.max(max, i) + 1;
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        g(eVar, eVar2);
        eVar2.c = eVar;
        eVar.a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.q : 0, eVar5 != null ? eVar5.q : 0) + 1;
        eVar.q = max;
        if (eVar4 != null) {
            i = eVar4.q;
        }
        eVar2.q = Math.max(max, i) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> a(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<Comparable> comparator2 = a;
        Comparator<? super K> comparator3 = this.comparator;
        e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            K k2 = comparator3 == comparator2 ? k : null;
            while (true) {
                if (k2 != null) {
                    i = k2.compareTo(eVar2.o);
                } else {
                    i = comparator3.compare(k, eVar2.o);
                }
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.b : eVar2.c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.n);
            if (i < 0) {
                eVar2.b = eVar;
            } else {
                eVar2.c = eVar;
            }
            e(eVar2, true);
        } else if (comparator3 != comparator2 || (k instanceof Comparable)) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.n);
            this.root = eVar;
        } else {
            throw new ClassCastException(je.n0(k, new StringBuilder(), " is not Comparable"));
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.internal.LinkedTreeMap.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.LinkedTreeMap$e r0 = r4.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.p
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.b(java.util.Map$Entry):com.google.gson.internal.LinkedTreeMap$e");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.n = eVar;
        eVar.f = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public void f(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i;
        if (z) {
            e<K, V> eVar3 = eVar.n;
            eVar3.f = eVar.f;
            eVar.f.n = eVar3;
        }
        e<K, V> eVar4 = eVar.b;
        e<K, V> eVar5 = eVar.c;
        e<K, V> eVar6 = eVar.a;
        int i2 = 0;
        if (eVar4 == null || eVar5 == null) {
            if (eVar4 != null) {
                g(eVar, eVar4);
                eVar.b = null;
            } else if (eVar5 != null) {
                g(eVar, eVar5);
                eVar.c = null;
            } else {
                g(eVar, null);
            }
            e(eVar6, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar4.q > eVar5.q) {
            e<K, V> eVar7 = eVar4.c;
            while (true) {
                eVar2 = eVar4;
                eVar4 = eVar7;
                if (eVar4 == null) {
                    break;
                }
                eVar7 = eVar4.c;
            }
        } else {
            e<K, V> eVar8 = eVar5.b;
            while (true) {
                eVar5 = eVar8;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.b;
            }
            eVar2 = eVar5;
        }
        f(eVar2, false);
        e<K, V> eVar9 = eVar.b;
        if (eVar9 != null) {
            i = eVar9.q;
            eVar2.b = eVar9;
            eVar9.a = eVar2;
            eVar.b = null;
        } else {
            i = 0;
        }
        e<K, V> eVar10 = eVar.c;
        if (eVar10 != null) {
            i2 = eVar10.q;
            eVar2.c = eVar10;
            eVar10.a = eVar2;
            eVar.c = null;
        }
        eVar2.q = Math.max(i, i2) + 1;
        g(eVar, eVar2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> a2 = a(k, true);
            V v2 = a2.p;
            a2.p = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        if (d2 != null) {
            return d2.p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public static final class e<K, V> implements Map.Entry<K, V> {
        e<K, V> a;
        e<K, V> b;
        e<K, V> c;
        e<K, V> f;
        e<K, V> n;
        final K o;
        V p;
        int q;

        e() {
            this.o = null;
            this.n = this;
            this.f = this;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.o;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.p;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.o;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.p;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public int hashCode() {
            K k = this.o;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.p;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.p;
            this.p = v;
            return v2;
        }

        @Override // java.lang.Object
        public String toString() {
            return ((Object) this.o) + "=" + ((Object) this.p);
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.o = k;
            this.q = 1;
            this.f = eVar2;
            this.n = eVar3;
            eVar3.f = this;
            eVar2.n = this;
        }
    }
}
