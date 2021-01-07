package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class n0<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public n0(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.a.next();
        return next.getValue() instanceof k0 ? new l0(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
