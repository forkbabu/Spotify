package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

final class x7 implements Iterator<Map.Entry<K, V>> {
    private int a = -1;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ r7 f;

    x7(r7 r7Var, q7 q7Var) {
        this.f = r7Var;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.f.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a + 1 < this.f.b.size() || (!this.f.c.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.f.b.size()) {
            return (Map.Entry) this.f.b.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b) {
            this.b = false;
            this.f.n();
            if (this.a < this.f.b.size()) {
                r7 r7Var = this.f;
                int i = this.a;
                this.a = i - 1;
                Object unused = r7Var.i(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
