package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;

final class u0 extends g {
    u0(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public int c2(a aVar, int i) {
        return PlatformDependent.p(aVar.N0() + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public long d2(a aVar, int i) {
        return PlatformDependent.s(aVar.N0() + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public short e2(a aVar, int i) {
        return PlatformDependent.u(aVar.N0() + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public void f2(a aVar, int i, int i2) {
        PlatformDependent.W(aVar.N0() + ((long) i), i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public void g2(a aVar, int i, long j) {
        PlatformDependent.Y(aVar.N0() + ((long) i), j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.g
    public void h2(a aVar, int i, short s) {
        PlatformDependent.a0(aVar.N0() + ((long) i), s);
    }
}
