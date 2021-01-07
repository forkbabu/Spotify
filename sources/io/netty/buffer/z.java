package io.netty.buffer;

import io.netty.util.Recycler;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

final class z extends x<ByteBuffer> {
    private static final Recycler<z> C = new a();

    static class a extends Recycler<z> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.Recycler
        public z k(Recycler.e<z> eVar) {
            return new z(eVar, 0, null);
        }
    }

    z(Recycler.e eVar, int i, a aVar) {
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

    private void I2(int i, byte[] bArr, int i2, int i3, boolean z) {
        ByteBuffer byteBuffer;
        n2(i, i3, i2, bArr.length);
        if (z) {
            byteBuffer = E2();
        } else {
            byteBuffer = this.w.duplicate();
        }
        int i4 = this.x + i;
        byteBuffer.clear().position(i4).limit(i4 + i3);
        byteBuffer.get(bArr, i2, i3);
    }

    static z J2(int i) {
        z j = C.j();
        j.G2(i);
        return j;
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        throw new UnsupportedOperationException("direct buffer");
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        r2(i, i3, i2, bArr.length);
        ByteBuffer E2 = E2();
        int i4 = this.x + i;
        E2.clear().position(i4).limit(i4 + i3);
        E2.put(bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return false;
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
        throw new UnsupportedOperationException();
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
        return this.w.get(this.x + i);
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        n2(i, i3, i2, jVar.J());
        if (jVar.E0()) {
            k0(i, jVar.A(), jVar.I() + i2, i3);
        } else if (jVar.Q0() > 0) {
            ByteBuffer[] W0 = jVar.W0(i2, i3);
            for (ByteBuffer byteBuffer : W0) {
                int remaining = byteBuffer.remaining();
                h0(i, byteBuffer);
                i += remaining;
            }
        } else {
            jVar.y1(i2, this, i, i3);
        }
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
        return this.w.getInt(this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        int i2 = this.w.getInt(this.x + i);
        int i3 = o.f;
        return Integer.reverseBytes(i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        p2(i2);
        I2(this.a, bArr, i, i2, true);
        this.a += i2;
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return this.w.getLong(this.x + i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return this.w.getShort(this.x + i);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        ByteBuffer duplicate = this.w.duplicate();
        int i2 = this.x + i;
        duplicate.clear().position(i2).limit(byteBuffer.remaining() + i2);
        byteBuffer.put(duplicate);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        short s = this.w.getShort(this.x + i);
        int i2 = o.f;
        return Short.reverseBytes(s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        this.w.put(this.x + i, (byte) i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        this.w.putInt(this.x + i, i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        I2(i, bArr, i2, i3, false);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        this.w.putLong(this.x + i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        this.w.putShort(this.x + i, (short) i2);
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

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        r2(i, i3, i2, jVar.J());
        if (jVar.E0()) {
            B1(i, jVar.A(), jVar.I() + i2, i3);
        } else if (jVar.Q0() > 0) {
            ByteBuffer[] W0 = jVar.W0(i2, i3);
            for (ByteBuffer byteBuffer : W0) {
                int remaining = byteBuffer.remaining();
                z1(i, byteBuffer);
                i += remaining;
            }
        } else {
            jVar.d0(i2, this, i, i3);
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        ByteBuffer E2 = E2();
        if (byteBuffer == E2) {
            byteBuffer = byteBuffer.duplicate();
        }
        int i2 = this.x + i;
        E2.clear().position(i2).limit(byteBuffer.remaining() + i2);
        E2.put(byteBuffer);
        return this;
    }
}
