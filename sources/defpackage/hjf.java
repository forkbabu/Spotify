package defpackage;

import defpackage.bjf;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: hjf  reason: default package */
public final class hjf<K, V> extends bjf<K, V, V> {

    /* renamed from: hjf$b */
    public static final class b<K, V> extends bjf.a<K, V, V> {
        b(int i, a aVar) {
            super(i);
        }

        public hjf<K, V> b() {
            return new hjf<>(this.a, null);
        }

        public b<K, V> c(K k, wlf<V> wlf) {
            a(k, wlf);
            return this;
        }
    }

    static {
        gjf.a(Collections.emptyMap());
    }

    hjf(Map map, a aVar) {
        super(map);
    }

    public static <K, V> b<K, V> b(int i) {
        return new b<>(i, null);
    }

    @Override // defpackage.wlf
    public Object get() {
        LinkedHashMap c = cjf.c(a().size());
        for (Map.Entry<K, wlf<V>> entry : a().entrySet()) {
            c.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(c);
    }
}
