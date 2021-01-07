package io.netty.buffer;

import io.netty.util.internal.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* access modifiers changed from: package-private */
public class e0 extends e {
    protected final ByteBuffer t;
    private final k u;
    private ByteBuffer v;

    e0(k kVar, ByteBuffer byteBuffer) {
        super(byteBuffer.remaining());
        if (byteBuffer.isReadOnly()) {
            this.u = kVar;
            ByteBuffer order = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
            this.t = order;
            a2(order.limit());
            return;
        }
        StringBuilder V0 = je.V0("must be a readonly buffer: ");
        V0.append(r.f(byteBuffer));
        throw new IllegalArgumentException(V0.toString());
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        return this.t.array();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public void A2() {
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer C2() {
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.t.duplicate();
        this.v = duplicate;
        return duplicate;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return this.t.hasArray();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return false;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        t2();
        return (ByteBuffer) C2().clear().position(i).limit(i + i2);
    }

    @Override // io.netty.buffer.j
    public int I() {
        return this.t.arrayOffset();
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return this.t.isDirect();
    }

    @Override // io.netty.buffer.j
    public int J() {
        return M0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public boolean J0() {
        return this.t.isReadOnly();
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public long N0() {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return null;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        return (ByteBuffer) this.t.duplicate().position(i).limit(i + i2);
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return 1;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        t2();
        return c2(i);
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        t2();
        if (i2 == 0) {
            return 0;
        }
        ByteBuffer C2 = C2();
        C2.clear().position(i).limit(i + i2);
        return gatheringByteChannel.write(C2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        t2();
        return d2(i);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        return new ByteBuffer[]{P0(i, i2)};
    }

    @Override // io.netty.buffer.j
    public ByteOrder a1() {
        return ByteOrder.BIG_ENDIAN;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        return this.t.get(i);
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

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return this.t.getInt(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        int i2 = this.t.getInt(i);
        int i3 = o.f;
        return Integer.reverseBytes(i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return this.t.getLong(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return this.t.getShort(i);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        t2();
        o2(i, 1);
        if (byteBuffer != null) {
            int min = Math.min(M0() - i, byteBuffer.remaining());
            ByteBuffer C2 = C2();
            C2.clear().position(i).limit(i + min);
            byteBuffer.put(C2);
            return this;
        }
        throw new NullPointerException("dst");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        short s = this.t.getShort(i);
        int i2 = o.f;
        return Short.reverseBytes(s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        n2(i, i3, i2, bArr.length);
        if (i2 < 0 || i2 > bArr.length - i3) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)));
        }
        ByteBuffer C2 = C2();
        C2.clear().position(i).limit(i + i3);
        C2.get(bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        t2();
        int i2 = this.t.getInt(i);
        int i3 = o.f;
        return Integer.reverseBytes(i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        t2();
        return f2(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        t2();
        return g2(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        t2();
        short s = this.t.getShort(i);
        int i2 = o.f;
        return Short.reverseBytes(s);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.u;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }
}
