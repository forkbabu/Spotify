package io.netty.channel;

import io.netty.util.internal.t;
import io.netty.util.n;

public abstract class t0<I> extends m {
    private final t b = t.b(this, t0.class, "I");
    private final boolean c = true;

    protected t0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.channel.m, io.netty.channel.l
    public void S(k kVar, Object obj) {
        boolean z = true;
        try {
            if (this.b.d(obj)) {
                b(kVar, obj);
            } else {
                z = false;
                kVar.N(obj);
            }
        } finally {
            if (this.c && z) {
                n.a(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(k kVar, I i);
}
