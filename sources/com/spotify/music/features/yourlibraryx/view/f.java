package com.spotify.music.features.yourlibraryx.view;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.h;

public final class f<T> extends b<T> {
    private final List<T>[] a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends T>... listArr) {
        h.e(listArr, "lists");
        this.a = listArr;
    }

    @Override // kotlin.collections.AbstractCollection
    public int d() {
        int i = 0;
        for (List<T> list : this.a) {
            i += list.size();
        }
        return i;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i) {
        List<T>[] listArr = this.a;
        int i2 = i;
        for (List<T> list : listArr) {
            if (list.size() > i2) {
                return list.get(i2);
            }
            i2 -= list.size();
        }
        throw new IndexOutOfBoundsException(je.p0("Invalid index, ", i));
    }
}
