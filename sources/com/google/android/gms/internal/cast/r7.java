package com.google.android.gms.internal.cast;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class r7<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int p = 0;
    private final int a;
    private List<u7> b = Collections.emptyList();
    private Map<K, V> c = Collections.emptyMap();
    private boolean f;
    private volatile w7 n;
    private Map<K, V> o = Collections.emptyMap();

    r7(int i, q7 q7Var) {
        this.a = i;
    }

    private final int b(K k) {
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
    public final V i(int i) {
        n();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.b.add(new u7(this, it.next()));
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

    public final boolean a() {
        return this.f;
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

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.cast.r7<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.c.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        n();
        int b2 = b(k);
        if (b2 >= 0) {
            return (V) this.b.get(b2).setValue(v);
        }
        n();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(b2 + 1);
        if (i >= this.a) {
            return o().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            u7 remove = this.b.remove(i2 - 1);
            o().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.b.add(i, new u7(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.n == null) {
            this.n = new w7(this, null);
        }
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return super.equals(obj);
        }
        r7 r7Var = (r7) obj;
        int size = size();
        if (size != r7Var.size()) {
            return false;
        }
        int l = l();
        if (l != r7Var.l()) {
            return entrySet().equals(r7Var.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!h(i).equals(r7Var.h(i))) {
                return false;
            }
        }
        if (l != size) {
            return this.c.equals(r7Var.c);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.cast.r7<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        return b2 >= 0 ? (V) this.b.get(b2).getValue() : this.c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public int hashCode() {
        int l = l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    public void k() {
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

    public final int l() {
        return this.b.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        if (this.c.isEmpty()) {
            return t7.a();
        }
        return this.c.entrySet();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.cast.r7<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int b2 = b(comparable);
        if (b2 >= 0) {
            return (V) i(b2);
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
