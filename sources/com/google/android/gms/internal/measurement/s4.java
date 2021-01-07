package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class s4<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public s4(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.a.next();
        return next.getValue() instanceof o4 ? new p4(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
