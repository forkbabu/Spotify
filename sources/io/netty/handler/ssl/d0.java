package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.util.IllegalReferenceCountException;
import io.netty.util.b;
import io.netty.util.o;

class d0 extends b implements c0 {
    private final j b;
    private final boolean c;

    public d0(j jVar, boolean z) {
        if (jVar != null) {
            this.b = jVar;
            this.c = z;
            return;
        }
        throw new NullPointerException("content");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.b
    public void a() {
        if (this.c) {
            b.b(this.b);
        }
        this.b.d();
    }

    @Override // io.netty.buffer.l
    public j content() {
        int n = n();
        if (n > 0) {
            return this.b;
        }
        throw new IllegalReferenceCountException(n);
    }

    @Override // io.netty.handler.ssl.c0
    public c0 h() {
        super.e();
        return this;
    }

    @Override // io.netty.handler.ssl.c0
    public boolean x() {
        return this.c;
    }

    @Override // io.netty.util.o
    public o z(Object obj) {
        this.b.z(obj);
        return this;
    }
}
