package com.spotify.music.features.yourlibraryx.view;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.h;

public final class m<T> extends b<T> {
    private final int a;
    private final jnf b;
    private final List<T> c;
    private final T f;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(int i, jnf jnf, List<? extends T> list, T t) {
        h.e(jnf, "range");
        h.e(list, "items");
        this.a = i;
        this.b = jnf;
        this.c = list;
        this.f = t;
    }

    @Override // kotlin.collections.AbstractCollection
    public int d() {
        return this.a;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i) {
        return this.b.i(i) ? this.c.get(i - this.b.d()) : this.f;
    }
}
