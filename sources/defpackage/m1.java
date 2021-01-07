package defpackage;

import defpackage.s1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: m1  reason: default package */
public class m1<K, V> extends t1<K, V> implements Map<K, V> {
    s1<K, V> q;

    /* access modifiers changed from: package-private */
    /* renamed from: m1$a */
    public class a extends s1<K, V> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public void a() {
            m1.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public Object b(int i, int i2) {
            return m1.this.b[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public Map<K, V> c() {
            return m1.this;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public int d() {
            return m1.this.c;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public int e(Object obj) {
            return m1.this.f(obj);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public int f(Object obj) {
            return m1.this.h(obj);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public void g(K k, V v) {
            m1.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public void h(int i) {
            m1.this.k(i);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s1
        public V i(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = m1.this.b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    public m1() {
    }

    private s1<K, V> n() {
        if (this.q == null) {
            this.q = new a();
        }
        return this.q;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s1<K, V> n = n();
        if (n.a == null) {
            n.a = new s1.b();
        }
        return n.a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        s1<K, V> n = n();
        if (n.b == null) {
            n.b = new s1.c();
        }
        return n.b;
    }

    public boolean o(Collection<?> collection) {
        return s1.k(this, collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: m1<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        s1<K, V> n = n();
        if (n.c == null) {
            n.c = new s1.e();
        }
        return n.c;
    }

    public m1(int i) {
        super(i);
    }

    public m1(t1 t1Var) {
        if (t1Var != null) {
            j(t1Var);
        }
    }
}
