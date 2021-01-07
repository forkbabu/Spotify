package com.google.android.gms.internal.recaptcha;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class u1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int p = 0;
    private final int a;
    private List<x1> b = Collections.emptyList();
    private Map<K, V> c = Collections.emptyMap();
    private boolean f;
    private volatile z1 n;
    private Map<K, V> o = Collections.emptyMap();

    u1(int i, t1 t1Var) {
        this.a = i;
    }

    private final int a(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.b.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.b.get(i2).getKey());
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
    public final V k(int i) {
        n();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.b.add(new x1(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void n() {
        if (this.f) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> o() {
        n();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.o = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        n();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.recaptcha.u1<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k, V v) {
        n();
        int a2 = a(k);
        if (a2 >= 0) {
            return (V) this.b.get(a2).setValue(v);
        }
        n();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(a2 + 1);
        if (i >= this.a) {
            return o().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            x1 remove = this.b.remove(i2 - 1);
            o().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.b.add(i, new x1(this, k, v));
        return null;
    }

    public void e() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f) {
            if (this.c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.c);
            }
            this.c = map;
            if (this.o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.o);
            }
            this.o = map2;
            this.f = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.n == null) {
            this.n = new z1(this, null);
        }
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return super.equals(obj);
        }
        u1 u1Var = (u1) obj;
        int size = size();
        if (size != u1Var.size()) {
            return false;
        }
        int j = j();
        if (j != u1Var.j()) {
            return ((AbstractSet) entrySet()).equals(u1Var.entrySet());
        }
        for (int i = 0; i < j; i++) {
            if (!h(i).equals(u1Var.h(i))) {
                return false;
            }
        }
        if (j != size) {
            return this.c.equals(u1Var.c);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.recaptcha.u1<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? (V) this.b.get(a2).getValue() : this.c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public int hashCode() {
        int j = j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    public final boolean i() {
        return this.f;
    }

    public final int j() {
        return this.b.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        if (this.c.isEmpty()) {
            return w1.a();
        }
        return this.c.entrySet();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.recaptcha.u1<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) k(a2);
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
}
