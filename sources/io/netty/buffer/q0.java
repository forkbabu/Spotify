package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;

final class q0 extends n0 {
    q0(k kVar, int i, int i2) {
        super(kVar, i, i2);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        t2();
        o2(i, 4);
        t0.q(this.u, i, i2);
        return this;
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        t2();
        o2(i, 8);
        t0.s(this.u, i, j);
        return this;
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        t2();
        o2(i, 2);
        t0.u(this.u, i, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j G1(int i, int i2) {
        if (PlatformDependent.J() >= 7) {
            t2();
            o2(i, i2);
            byte[] bArr = this.u;
            int i3 = t0.b;
            if (i2 != 0) {
                PlatformDependent.e0(bArr, i, (long) i2, (byte) 0);
            }
            return this;
        }
        super.G1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        t2();
        o2(i, 1);
        byte[] bArr = this.u;
        int i2 = t0.b;
        return PlatformDependent.n(bArr, i);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        t2();
        o2(i, 4);
        return t0.e(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public byte c2(int i) {
        byte[] bArr = this.u;
        int i2 = t0.b;
        return PlatformDependent.n(bArr, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public int d2(int i) {
        return t0.e(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public int e2(int i) {
        return t0.g(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public long f2(int i) {
        return t0.i(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public short g2(int i) {
        return t0.k(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public short h2(int i) {
        return t0.m(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public void i2(int i, int i2) {
        byte[] bArr = this.u;
        int i3 = t0.b;
        PlatformDependent.V(bArr, i, (byte) i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public void j2(int i, int i2) {
        t0.q(this.u, i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public void k2(int i, long j) {
        t0.s(this.u, i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.n0, io.netty.buffer.a
    public void l2(int i, int i2) {
        t0.u(this.u, i, i2);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        t2();
        o2(i, 4);
        return t0.g(this.u, i);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        t2();
        o2(i, 8);
        return t0.i(this.u, i);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        t2();
        o2(i, 2);
        return t0.k(this.u, i);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        t2();
        o2(i, 2);
        return t0.m(this.u, i);
    }

    @Override // io.netty.buffer.n0, io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        t2();
        o2(i, 1);
        byte[] bArr = this.u;
        int i3 = t0.b;
        PlatformDependent.V(bArr, i, (byte) i2);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    @Deprecated
    public i0 x2() {
        if (PlatformDependent.H()) {
            return new v0(this);
        }
        return new i0(this);
    }
}
