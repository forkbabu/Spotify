package io.netty.channel;

import io.netty.channel.d;
import io.netty.channel.i;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.util.concurrent.ConcurrentMap;

@i.a
public abstract class n<C extends d> extends m {
    private static final b c = c.b(n.class.getName());
    private final ConcurrentMap<k, Boolean> b = PlatformDependent.P();

    static {
        int i = c.b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.netty.channel.n<C extends io.netty.channel.d> */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean c(k kVar) {
        if (this.b.putIfAbsent(kVar, Boolean.TRUE) != null) {
            return false;
        }
        try {
            b(kVar.h());
        } catch (Throwable th) {
            e(kVar);
            throw th;
        }
        e(kVar);
        return true;
    }

    private void e(k kVar) {
        try {
            t o = kVar.o();
            if (o.H1(this) != null) {
                o.s1(this);
            }
        } finally {
            this.b.remove(kVar);
        }
    }

    @Override // io.netty.channel.j, io.netty.channel.i
    public void D(k kVar) {
        if (kVar.h().g0()) {
            c(kVar);
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public final void F(k kVar) {
        if (c(kVar)) {
            kVar.o().m();
        } else {
            kVar.m();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(C c2);

    @Override // io.netty.channel.m, io.netty.channel.j, io.netty.channel.i, io.netty.channel.l
    public void d(k kVar, Throwable th) {
        b bVar = c;
        StringBuilder V0 = je.V0("Failed to initialize a channel. Closing: ");
        V0.append(kVar.h());
        bVar.j(V0.toString(), th);
        kVar.close();
    }
}
