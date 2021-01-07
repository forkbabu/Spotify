package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class i6 implements Iterator<Map.Entry<K, V>> {
    private int a = -1;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ c6 f;

    i6(c6 c6Var, b6 b6Var) {
        this.f = c6Var;
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
                c6 c6Var = this.f;
                int i = this.a;
                this.a = i - 1;
                Object unused = c6Var.k(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
