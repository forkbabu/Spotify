package defpackage;

import defpackage.c1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b1  reason: default package */
public class b1<K, V> extends c1<K, V> {
    private HashMap<K, c1.c<K, V>> n = new HashMap<>();

    public boolean contains(K k) {
        return this.n.containsKey(k);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.c1
    public c1.c<K, V> d(K k) {
        return this.n.get(k);
    }

    @Override // defpackage.c1
    public V i(K k, V v) {
        c1.c<K, V> cVar = this.n.get(k);
        if (cVar != null) {
            return cVar.b;
        }
        this.n.put(k, h(k, v));
        return null;
    }

    @Override // defpackage.c1
    public V j(K k) {
        V v = (V) super.j(k);
        this.n.remove(k);
        return v;
    }

    public Map.Entry<K, V> k(K k) {
        if (this.n.containsKey(k)) {
            return this.n.get(k).f;
        }
        return null;
    }
}
