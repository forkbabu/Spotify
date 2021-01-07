package io.netty.buffer;

import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

final class c0 extends x<ByteBuffer> {
    private static final Recycler<c0> D = new a();
    private long C;

    static class a extends Recycler<c0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.Recycler
        public c0 k(Recycler.e<c0> eVar) {
            return new c0(eVar, 0, null);
        }
    }

    c0(Recycler.e eVar, int i, a aVar) {
        super(eVar, i);
    }

    private int H2(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        t2();
        o2(i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (z) {
            byteBuffer = E2();
        } else {
            byteBuffer = this.w.duplicate();
        }
        int i3 = this.x + i;
        byteBuffer.clear().position(i3).limit(i3 + i2);
        return gatheringByteChannel.write(byteBuffer);
    }

    static c0 I2(int i) {
        c0 j = D.j();
        j.G2(i);
        return j;
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        throw new UnsupportedOperationException("direct buffer");
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        long j = this.C + ((long) i);
        int i4 = t0.b;
        t2();
        o2(i, i3);
        if (i3 != 0) {
            PlatformDependent.f(bArr, i2, j, (long) i3);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // io.netty.buffer.x
    public void C2(t<ByteBuffer> tVar, long j, int i, int i2, int i3, w wVar) {
        super.C2(tVar, j, i, i2, i3, wVar);
        this.C = PlatformDependent.h(this.w) + ((long) this.x);
    }

    /* access modifiers changed from: package-private */
    @Override // io.netty.buffer.x
    public void D2(t<ByteBuffer> tVar, int i) {
        super.D2(tVar, i);
        this.C = PlatformDependent.h(this.w) + ((long) this.x);
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.x
    public ByteBuffer F2(ByteBuffer byteBuffer) {
        return byteBuffer.duplicate();
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        t2();
        o2(i, i2);
        int i3 = this.x + i;
        return (ByteBuffer) E2().clear().position(i3).limit(i3 + i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j G1(int i, int i2) {
        long j = this.C + ((long) i);
        int i3 = t0.b;
        if (i2 != 0) {
            t2();
            o2(i, i2);
            PlatformDependent.d0(j, (long) i2, (byte) 0);
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        throw new UnsupportedOperationException("direct buffer");
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return true;
    }

    @Override // io.netty.buffer.j
    public long N0() {
        t2();
        return this.C;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        t2();
        o2(i, i2);
        int i3 = this.x + i;
        return ((ByteBuffer) this.w.duplicate().position(i3).limit(i3 + i2)).slice();
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return 1;
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return H2(i, gatheringByteChannel, i2, false);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        return new ByteBuffer[]{P0(i, i2)};
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        int i2 = t0.b;
        return PlatformDependent.m(this.C + ((long) i));
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        t0.a(this, this.C + ((long) i), i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        p2(i);
        int H2 = H2(this.a, gatheringByteChannel, i, true);
        this.a += H2;
        return H2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return t0.d(this.C + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return t0.f(this.C + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return t0.h(this.C + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return t0.j(this.C + ((long) i));
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        t0.b(this, this.C + ((long) i), i, byteBuffer);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        return t0.l(this.C + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        byte b = (byte) i2;
        int i3 = t0.b;
        PlatformDependent.U(this.C + ((long) i), (byte) b);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        t0.p(this.C + ((long) i), i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        t0.c(this, this.C + ((long) i), i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        t0.r(this.C + ((long) i), j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        t0.t(this.C + ((long) i), i2);
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        t2();
        o2(i, i2);
        ByteBuffer E2 = E2();
        int i3 = this.x + i;
        E2.clear().position(i3).limit(i3 + i2);
        try {
            return scatteringByteChannel.read(E2);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public i0 x2() {
        if (PlatformDependent.H()) {
            return new u0(this);
        }
        return new i0(this);
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        t0.n(this, this.C + ((long) i), i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        t0.o(this, this.C + ((long) i), i, byteBuffer);
        return this;
    }
}
