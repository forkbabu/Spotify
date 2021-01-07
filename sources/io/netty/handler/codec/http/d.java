package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.util.internal.r;

public class d extends g implements o {
    private final j b;

    public d(j jVar) {
        if (jVar != null) {
            this.b = jVar;
            return;
        }
        throw new NullPointerException("content");
    }

    @Override // io.netty.buffer.l
    public j content() {
        return this.b;
    }

    @Override // io.netty.util.o
    public boolean d() {
        return this.b.d();
    }

    /* renamed from: g */
    public o z(Object obj) {
        this.b.z(obj);
        return this;
    }

    @Override // io.netty.util.o
    public int n() {
        return this.b.n();
    }

    public String toString() {
        return r.f(this) + "(data: " + this.b + ", decoderResult: " + a() + ')';
    }
}
