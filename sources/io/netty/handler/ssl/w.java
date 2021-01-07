package io.netty.handler.ssl;

import io.netty.buffer.k;
import io.netty.util.n;
import java.util.Set;

public final class w extends ReferenceCountedOpenSslEngine {
    w(u uVar, k kVar, String str, int i) {
        super(uVar, kVar, str, i, false);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        super.finalize();
        Set<String> set = q.c;
        if (n() > 0) {
            n.b(this);
        }
    }
}
