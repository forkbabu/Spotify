package com.spotify.mobile.android.hubframework.model.immutable;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class k<K, V> {
    private Map<K, ? extends V> a;

    public k(Map<K, ? extends V> map) {
        h.e(map, "map");
        this.a = map;
    }

    public final void a(Map<K, ? extends V> map) {
        h.e(map, "otherMap");
        Map<K, ? extends V> X = d.X(this.a);
        X.putAll(map);
        this.a = X;
    }

    public final ImmutableMap<K, V> b() {
        return f91.c(this.a);
    }

    public final void c(K k, V v) {
        Map<K, ? extends V> map = this.a;
        h.e(map, "map");
        if (!rw.equal(v, map.get(k))) {
            Map<K, ? extends V> X = d.X(this.a);
            X.put(k, v);
            this.a = X;
        }
    }

    public final void d(Map<K, ? extends V> map) {
        this.a = map;
    }
}
