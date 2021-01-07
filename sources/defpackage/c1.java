package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: c1  reason: default package */
public class c1<K, V> implements Iterable<Map.Entry<K, V>> {
    c<K, V> a;
    private c<K, V> b;
    private WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    private int f = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: c1$a */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c1.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c1.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1$b */
    public static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c1.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c1.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1$c */
    public static class c<K, V> implements Map.Entry<K, V> {
        final K a;
        final V b;
        c<K, V> c;
        c<K, V> f;

        c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.a.equals(cVar.a) || !this.b.equals(cVar.b)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        @Override // java.lang.Object
        public String toString() {
            return ((Object) this.a) + "=" + ((Object) this.b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1$d */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        private c<K, V> a;
        private boolean b = true;

        d() {
        }

        @Override // defpackage.c1.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f;
                this.a = cVar3;
                this.b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.b) {
                c<K, V> cVar = this.a;
                if (cVar == null || cVar.c == null) {
                    return false;
                }
                return true;
            } else if (c1.this.a != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.b) {
                this.b = false;
                this.a = c1.this.a;
            } else {
                c<K, V> cVar = this.a;
                this.a = cVar != null ? cVar.c : null;
            }
            return this.a;
        }
    }

    /* renamed from: c1$e */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        c<K, V> a;
        c<K, V> b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        @Override // defpackage.c1.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar3 = this.a;
            if (cVar3 == cVar) {
                this.a = b(cVar3);
            }
            c<K, V> cVar4 = this.b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.b = cVar2;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            this.b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1$f */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public c<K, V> d(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.b, this.a);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c1<K, V>.d e() {
        c1<K, V>.d dVar = new d();
        this.c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((defpackage.c1.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof defpackage.c1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            c1 r7 = (defpackage.c1) r7
            int r1 = r6.f
            int r3 = r7.f
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            c1$e r3 = (defpackage.c1.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            c1$e r4 = (defpackage.c1.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            c1$e r7 = (defpackage.c1.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1.equals(java.lang.Object):boolean");
    }

    public Map.Entry<K, V> f() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public c<K, V> h(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.f = cVar2;
        this.b = cVar;
        return cVar;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public V i(K k, V v) {
        c<K, V> d2 = d(k);
        if (d2 != null) {
            return d2.b;
        }
        h(k, v);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k) {
        c<K, V> d2 = d(k);
        if (d2 == null) {
            return null;
        }
        this.f--;
        if (!this.c.isEmpty()) {
            for (f<K, V> fVar : this.c.keySet()) {
                fVar.a(d2);
            }
        }
        c<K, V> cVar = d2.f;
        if (cVar != null) {
            cVar.c = d2.c;
        } else {
            this.a = d2.c;
        }
        c<K, V> cVar2 = d2.c;
        if (cVar2 != null) {
            cVar2.f = cVar;
        } else {
            this.b = cVar;
        }
        d2.c = null;
        d2.f = null;
        return d2.b;
    }

    public int size() {
        return this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                V0.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    V0.append(", ");
                }
            } else {
                V0.append("]");
                return V0.toString();
            }
        }
    }
}
