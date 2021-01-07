package defpackage;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bjf  reason: default package */
abstract class bjf<K, V, V2> implements fjf<Map<K, V2>> {
    private final Map<K, wlf<V>> a;

    /* renamed from: bjf$a */
    public static abstract class a<K, V, V2> {
        final LinkedHashMap<K, wlf<V>> a;

        a(int i) {
            this.a = cjf.c(i);
        }

        /* access modifiers changed from: package-private */
        public a<K, V, V2> a(K k, wlf<V> wlf) {
            LinkedHashMap<K, wlf<V>> linkedHashMap = this.a;
            if (k == null) {
                throw new NullPointerException("key");
            } else if (wlf != null) {
                linkedHashMap.put(k, wlf);
                return this;
            } else {
                throw new NullPointerException(ContextTrack.Metadata.KEY_PROVIDER);
            }
        }
    }

    bjf(Map<K, wlf<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, wlf<V>> a() {
        return this.a;
    }
}
