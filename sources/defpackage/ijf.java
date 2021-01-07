package defpackage;

import defpackage.bjf;
import java.util.Map;

/* renamed from: ijf  reason: default package */
public final class ijf<K, V> extends bjf<K, V, wlf<V>> implements ajf<Map<K, wlf<V>>> {

    /* renamed from: ijf$b */
    public static final class b<K, V> extends bjf.a<K, V, wlf<V>> {
        b(int i, a aVar) {
            super(i);
        }

        public ijf<K, V> b() {
            return new ijf<>(this.a, null);
        }

        public b<K, V> c(K k, wlf<V> wlf) {
            a(k, wlf);
            return this;
        }
    }

    ijf(Map map, a aVar) {
        super(map);
    }

    public static <K, V> b<K, V> b(int i) {
        return new b<>(i, null);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a();
    }
}
