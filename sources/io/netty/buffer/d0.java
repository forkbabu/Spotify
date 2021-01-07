package io.netty.buffer;

import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;

final class d0 extends a0 {
    private static final Recycler<d0> D = new a();

    static class a extends Recycler<d0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.Recycler
        public d0 k(Recycler.e<d0> eVar) {
            return new d0(eVar, 0, null);
        }
    }

    d0(Recycler.e eVar, int i, a aVar) {
        super(eVar, i);
    }

    static d0 J2(int i) {
        d0 j = D.j();
        j.G2(i);
        return j;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j G1(int i, int i2) {
        if (PlatformDependent.J() >= 7) {
            t2();
            o2(i, i2);
            byte[] bArr = (byte[]) this.w;
            int i3 = this.x + i;
            int i4 = t0.b;
            if (i2 != 0) {
                PlatformDependent.e0(bArr, i3, (long) i2, (byte) 0);
            }
            return this;
        }
        super.G1(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public byte c2(int i) {
        int i2 = this.x + i;
        int i3 = t0.b;
        return PlatformDependent.n((byte[]) this.w, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public int d2(int i) {
        return t0.e((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public int e2(int i) {
        return t0.g((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public long f2(int i) {
        return t0.i((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public short g2(int i) {
        return t0.k((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public short h2(int i) {
        return t0.m((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public void i2(int i, int i2) {
        int i3 = this.x + i;
        int i4 = t0.b;
        PlatformDependent.V((byte[]) this.w, i3, (byte) i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public void j2(int i, int i2) {
        t0.q((byte[]) this.w, this.x + i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public void k2(int i, long j) {
        t0.s((byte[]) this.w, this.x + i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a0, io.netty.buffer.a
    public void l2(int i, int i2) {
        t0.u((byte[]) this.w, this.x + i, i2);
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
