package io.netty.buffer;

import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

class a0 extends x<byte[]> {
    private static final Recycler<a0> C = new a();

    static class a extends Recycler<a0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.Recycler
        public a0 k(Recycler.e<a0> eVar) {
            return new a0(eVar, 0);
        }
    }

    a0(Recycler.e<? extends a0> eVar, int i) {
        super(eVar, i);
    }

    private int H2(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        t2();
        o2(i, i2);
        int i3 = this.x + i;
        if (z) {
            byteBuffer = E2();
        } else {
            byteBuffer = ByteBuffer.wrap((byte[]) this.w);
        }
        return gatheringByteChannel.write((ByteBuffer) byteBuffer.clear().position(i3).limit(i3 + i2));
    }

    static a0 I2(int i) {
        a0 j = C.j();
        j.G2(i);
        return j;
    }

    @Override // io.netty.buffer.j
    public final byte[] A() {
        t2();
        return (byte[]) this.w;
    }

    @Override // io.netty.buffer.j
    public final j B1(int i, byte[] bArr, int i2, int i3) {
        r2(i, i3, i2, bArr.length);
        System.arraycopy(bArr, i2, this.w, this.x + i, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public final boolean E0() {
        return true;
    }

    @Override // io.netty.buffer.j
    public final boolean F0() {
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.x
    public ByteBuffer F2(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // io.netty.buffer.j
    public final ByteBuffer G0(int i, int i2) {
        t2();
        o2(i, i2);
        int i3 = this.x + i;
        return (ByteBuffer) E2().clear().position(i3).limit(i3 + i2);
    }

    @Override // io.netty.buffer.j
    public final int I() {
        return this.x;
    }

    @Override // io.netty.buffer.j
    public final boolean I0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public final long N0() {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.j
    public final ByteBuffer P0(int i, int i2) {
        t2();
        o2(i, i2);
        return ByteBuffer.wrap((byte[]) this.w, this.x + i, i2).slice();
    }

    @Override // io.netty.buffer.j
    public final int Q0() {
        return 1;
    }

    @Override // io.netty.buffer.j
    public final int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return H2(i, gatheringByteChannel, i2, false);
    }

    @Override // io.netty.buffer.j
    public final ByteBuffer[] W0(int i, int i2) {
        return new ByteBuffer[]{P0(i, i2)};
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        return ((byte[]) this.w)[this.x + i];
    }

    @Override // io.netty.buffer.j
    public final j d0(int i, j jVar, int i2, int i3) {
        n2(i, i3, i2, jVar.J());
        if (jVar.F0()) {
            PlatformDependent.f((byte[]) this.w, this.x + i, ((long) i2) + jVar.N0(), (long) i3);
        } else if (jVar.E0()) {
            k0(i, jVar.A(), jVar.I() + i2, i3);
        } else {
            jVar.B1(i2, (byte[]) this.w, this.x + i, i3);
        }
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int d1(GatheringByteChannel gatheringByteChannel, int i) {
        p2(i);
        int H2 = H2(this.a, gatheringByteChannel, i, true);
        this.a += H2;
        return H2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return s.a((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return s.b((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return s.c((byte[]) this.w, this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        byte[] bArr = (byte[]) this.w;
        int i2 = this.x + i;
        return (short) ((bArr[i2] << 8) | (bArr[i2 + 1] & 255));
    }

    @Override // io.netty.buffer.j
    public final j h0(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        byteBuffer.put((byte[]) this.w, this.x + i, byteBuffer.remaining());
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        byte[] bArr = (byte[]) this.w;
        int i2 = this.x + i;
        return (short) ((bArr[i2] & 255) | (bArr[i2 + 1] << 8));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        ((byte[]) this.w)[this.x + i] = (byte) i2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        s.d((byte[]) this.w, this.x + i, i2);
    }

    @Override // io.netty.buffer.j
    public final j k0(int i, byte[] bArr, int i2, int i3) {
        n2(i, i3, i2, bArr.length);
        System.arraycopy(this.w, this.x + i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        s.e((byte[]) this.w, this.x + i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        byte[] bArr = (byte[]) this.w;
        int i3 = this.x + i;
        bArr[i3] = (byte) (i2 >>> 8);
        bArr[i3 + 1] = (byte) i2;
    }

    @Override // io.netty.buffer.j
    public final int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        t2();
        o2(i, i2);
        int i3 = this.x + i;
        try {
            return scatteringByteChannel.read((ByteBuffer) E2().clear().position(i3).limit(i3 + i2));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    @Override // io.netty.buffer.j
    public final j y1(int i, j jVar, int i2, int i3) {
        r2(i, i3, i2, jVar.J());
        if (jVar.F0()) {
            PlatformDependent.e(jVar.N0() + ((long) i2), (byte[]) this.w, this.x + i, (long) i3);
        } else if (jVar.E0()) {
            B1(i, jVar.A(), jVar.I() + i2, i3);
        } else {
            jVar.k0(i2, (byte[]) this.w, this.x + i, i3);
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public final j z1(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        byteBuffer.get((byte[]) this.w, this.x + i, remaining);
        return this;
    }
}
