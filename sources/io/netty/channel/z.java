package io.netty.channel;

import io.netty.util.concurrent.l;

/* access modifiers changed from: package-private */
public final class z extends b {
    private final i A;

    z(a0 a0Var, l lVar, String str, i iVar) {
        super(a0Var, lVar, str, iVar instanceof l, iVar instanceof r);
        if (iVar != null) {
            this.A = iVar;
            return;
        }
        throw new NullPointerException("handler");
    }

    @Override // io.netty.channel.k
    public i T() {
        return this.A;
    }
}
