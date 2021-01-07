package io.netty.buffer;

import io.netty.util.Recycler;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

final class b0 extends d {
    private static final Recycler<b0> w = new a();
    int v;

    static class a extends Recycler<b0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.Recycler
        public b0 k(Recycler.e<b0> eVar) {
            return new b0(eVar, null);
        }
    }

    b0(Recycler.e eVar, a aVar) {
        super(eVar);
    }

    static b0 E2(a aVar, j jVar, int i, int i2) {
        f.A2(i, i2, aVar);
        return F2(aVar, jVar, i, i2);
    }

    private static b0 F2(a aVar, j jVar, int i, int i2) {
        b0 j = w.j();
        j.C2(aVar, jVar, 0, i2, i2);
        j.s2();
        j.v = i;
        return j;
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        o2(i, i3);
        D2().B1(i + this.v, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        o2(i, 4);
        D2().D1(i + this.v, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        o2(i, 8);
        D2().E1(i + this.v, j);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        o2(i, 2);
        D2().F1(i + this.v, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        return D2().I() + this.v;
    }

    @Override // io.netty.buffer.j
    public int J() {
        return M0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j K1(int i, int i2) {
        o2(i, i2);
        return D2().K1(i + this.v, i2);
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    @Override // io.netty.buffer.j
    public long N0() {
        return D2().N0() + ((long) this.v);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j O() {
        j K1 = D2().K1(this.v, M0());
        K1.C1(this.a, this.b);
        return K1;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        o2(i, i2);
        return D2().P0(i + this.v, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        o2(i, 1);
        return D2().S(i + this.v);
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        o2(i, i2);
        return D2().T(i + this.v, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        o2(i, 4);
        return D2().T1(i + this.v);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        o2(i, i2);
        return D2().W0(i + this.v, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        return D2().c2(i + this.v);
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        o2(i, i3);
        D2().d0(i + this.v, jVar, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return D2().d2(i + this.v);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return D2().e2(i + this.v);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return D2().f2(i + this.v);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return D2().g2(i + this.v);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        o2(i, byteBuffer.remaining());
        D2().h0(i + this.v, byteBuffer);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        return D2().h2(i + this.v);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        D2().i2(i + this.v, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        D2().j2(i + this.v, i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        o2(i, i3);
        D2().k0(i + this.v, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        D2().k2(i + this.v, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        D2().l2(i + this.v, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        o2(i, 4);
        return D2().m0(i + this.v);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        o2(i, 8);
        return D2().o0(i + this.v);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        o2(i, 2);
        return D2().q0(i + this.v);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        o2(i, 2);
        return D2().s0(i + this.v);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j v1(int i, int i2) {
        o2(i, i2);
        return F2(D2(), this, i + this.v, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        o2(i, 1);
        D2().w1(i + this.v, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        o2(i, i2);
        return D2().x1(i + this.v, scatteringByteChannel, i2);
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        o2(i, i3);
        D2().y1(i + this.v, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        o2(i, byteBuffer.remaining());
        D2().z1(i + this.v, byteBuffer);
        return this;
    }
}
