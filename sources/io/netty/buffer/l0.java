package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class l0 extends e {
    private final k t;
    private ByteBuffer u;
    private ByteBuffer v;
    private int w;
    private boolean x;

    protected l0(k kVar, int i, int i2) {
        super(i2);
        if (kVar == null) {
            throw new NullPointerException("alloc");
        } else if (i < 0) {
            throw new IllegalArgumentException(je.p0("initialCapacity: ", i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(je.p0("maxCapacity: ", i2));
        } else if (i <= i2) {
            this.t = kVar;
            F2(ByteBuffer.allocateDirect(i));
        } else {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    private int C2(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        t2();
        if (i2 == 0) {
            return 0;
        }
        if (z) {
            byteBuffer = E2();
        } else {
            byteBuffer = this.u.duplicate();
        }
        byteBuffer.clear().position(i).limit(i + i2);
        return gatheringByteChannel.write(byteBuffer);
    }

    private void D2(int i, byte[] bArr, int i2, int i3, boolean z) {
        ByteBuffer byteBuffer;
        n2(i, i3, i2, bArr.length);
        if (z) {
            byteBuffer = E2();
        } else {
            byteBuffer = this.u.duplicate();
        }
        byteBuffer.clear().position(i).limit(i + i3);
        byteBuffer.get(bArr, i2, i3);
    }

    private ByteBuffer E2() {
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.u.duplicate();
        this.v = duplicate;
        return duplicate;
    }

    private void F2(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.u;
        if (byteBuffer2 != null) {
            if (this.x) {
                this.x = false;
            } else {
                PlatformDependent.k(byteBuffer2);
            }
        }
        this.u = byteBuffer;
        this.v = null;
        this.w = byteBuffer.remaining();
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        throw new UnsupportedOperationException("direct buffer");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public void A2() {
        ByteBuffer byteBuffer = this.u;
        if (byteBuffer != null) {
            this.u = null;
            if (!this.x) {
                PlatformDependent.k(byteBuffer);
            }
        }
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        r2(i, i3, i2, bArr.length);
        ByteBuffer E2 = E2();
        E2.clear().position(i).limit(i + i3);
        E2.put(bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        t2();
        this.u.putInt(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return false;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        t2();
        this.u.putLong(i, j);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return false;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        t2();
        this.u.putShort(i, (short) i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        t2();
        o2(i, i2);
        return (ByteBuffer) E2().clear().position(i).limit(i + i2);
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
    public int J() {
        return this.w;
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        t2();
        if (i < 0 || i > M0()) {
            throw new IllegalArgumentException(je.p0("newCapacity: ", i));
        }
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.w;
        if (i > i4) {
            ByteBuffer byteBuffer = this.u;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            byteBuffer.position(0).limit(byteBuffer.capacity());
            allocateDirect.position(0).limit(byteBuffer.capacity());
            allocateDirect.put(byteBuffer);
            allocateDirect.clear();
            F2(allocateDirect);
        } else if (i < i4) {
            ByteBuffer byteBuffer2 = this.u;
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
            if (i2 < i) {
                if (i3 > i) {
                    a2(i);
                } else {
                    i = i3;
                }
                byteBuffer2.position(i2).limit(i);
                allocateDirect2.position(i2).limit(i);
                allocateDirect2.put(byteBuffer2);
                allocateDirect2.clear();
            } else {
                C1(i, i);
            }
            F2(allocateDirect2);
        }
        return this;
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
        t2();
        o2(i, i2);
        return ((ByteBuffer) this.u.duplicate().position(i).limit(i + i2)).slice();
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return 1;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        t2();
        return this.u.get(i);
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return C2(i, gatheringByteChannel, i2, false);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        t2();
        return this.u.getInt(i);
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
        return this.u.get(i);
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
        int C2 = C2(this.a, gatheringByteChannel, i, true);
        this.a += C2;
        return C2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return this.u.getInt(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        int i2 = this.u.getInt(i);
        int i3 = o.f;
        return Integer.reverseBytes(i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        p2(i2);
        D2(this.a, bArr, i, i2, true);
        this.a += i2;
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return this.u.getLong(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return this.u.getShort(i);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        ByteBuffer duplicate = this.u.duplicate();
        duplicate.clear().position(i).limit(byteBuffer.remaining() + i);
        byteBuffer.put(duplicate);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        short s = this.u.getShort(i);
        int i2 = o.f;
        return Short.reverseBytes(s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        this.u.put(i, (byte) i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        this.u.putInt(i, i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        D2(i, bArr, i2, i3, false);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        this.u.putLong(i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        this.u.putShort(i, (short) i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        t2();
        return this.u.getLong(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        t2();
        return this.u.getShort(i);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.t;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        t2();
        this.u.put(i, (byte) i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        t2();
        E2().clear().position(i).limit(i + i2);
        try {
            return scatteringByteChannel.read(this.v);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        r2(i, i3, i2, jVar.J());
        if (jVar.Q0() > 0) {
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
        t2();
        ByteBuffer E2 = E2();
        if (byteBuffer == E2) {
            byteBuffer = byteBuffer.duplicate();
        }
        E2.clear().position(i).limit(byteBuffer.remaining() + i);
        E2.put(byteBuffer);
        return this;
    }

    protected l0(k kVar, ByteBuffer byteBuffer, int i) {
        super(i);
        if (kVar == null) {
            throw new NullPointerException("alloc");
        } else if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("initialBuffer is not a direct buffer.");
        } else if (!byteBuffer.isReadOnly()) {
            int remaining = byteBuffer.remaining();
            if (remaining <= i) {
                this.t = kVar;
                this.x = true;
                F2(byteBuffer.slice().order(ByteOrder.BIG_ENDIAN));
                a2(remaining);
                return;
            }
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", Integer.valueOf(remaining), Integer.valueOf(i)));
        } else {
            throw new IllegalArgumentException("initialBuffer is a read-only buffer.");
        }
    }
}
