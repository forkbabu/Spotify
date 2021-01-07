package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;

final class v0 extends g {
    v0(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public int c2(a aVar, int i) {
        return PlatformDependent.q(aVar.A(), aVar.I() + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public long d2(a aVar, int i) {
        return PlatformDependent.t(aVar.A(), aVar.I() + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public short e2(a aVar, int i) {
        return PlatformDependent.v(aVar.A(), aVar.I() + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public void f2(a aVar, int i, int i2) {
        PlatformDependent.X(aVar.A(), aVar.I() + i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public void g2(a aVar, int i, long j) {
        PlatformDependent.Z(aVar.A(), aVar.I() + i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public void h2(a aVar, int i, short s) {
        PlatformDependent.b0(aVar.A(), aVar.I() + i, s);
    }
}
