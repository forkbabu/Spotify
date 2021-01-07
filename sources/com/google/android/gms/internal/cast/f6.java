package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class f6<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public f6(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.a.next();
        return next.getValue() instanceof b6 ? new c6(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
