package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class p0 extends e {
    private final k t;
    private ByteBuffer u;
    private int v;
    private boolean w;
    ByteBuffer x;
    long y;

    protected p0(k kVar, int i, int i2) {
        super(i2);
        if (kVar == null) {
            throw new NullPointerException("alloc");
        } else if (i < 0) {
            throw new IllegalArgumentException(je.p0("initialCapacity: ", i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(je.p0("maxCapacity: ", i2));
        } else if (i <= i2) {
            this.t = kVar;
            G2(C2(i), false);
        } else {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    private int E2(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        t2();
        if (i2 == 0) {
            return 0;
        }
        if (z) {
            byteBuffer = F2();
        } else {
            byteBuffer = this.x.duplicate();
        }
        byteBuffer.clear().position(i).limit(i + i2);
        return gatheringByteChannel.write(byteBuffer);
    }

    private ByteBuffer F2() {
        ByteBuffer byteBuffer = this.u;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.x.duplicate();
        this.u = duplicate;
        return duplicate;
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        throw new UnsupportedOperationException("direct buffer");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public void A2() {
        ByteBuffer byteBuffer = this.x;
        if (byteBuffer != null) {
            this.x = null;
            if (!this.w) {
                D2(byteBuffer);
            }
        }
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        long j = this.y + ((long) i);
        int i4 = t0.b;
        t2();
        o2(i, i3);
        if (i3 != 0) {
            PlatformDependent.f(bArr, i2, j, (long) i3);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public ByteBuffer C2(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    /* access modifiers changed from: protected */
    public void D2(ByteBuffer byteBuffer) {
        PlatformDependent.k(byteBuffer);
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return true;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        t2();
        o2(i, i2);
        return (ByteBuffer) F2().clear().position(i).limit(i + i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j G1(int i, int i2) {
        long j = this.y + ((long) i);
        int i3 = t0.b;
        if (i2 != 0) {
            t2();
            o2(i, i2);
            PlatformDependent.d0(j, (long) i2, (byte) 0);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void G2(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2;
        if (z && (byteBuffer2 = this.x) != null) {
            if (this.w) {
                this.w = false;
            } else {
                D2(byteBuffer2);
            }
        }
        this.x = byteBuffer;
        this.y = PlatformDependent.h(byteBuffer);
        this.u = null;
        this.v = byteBuffer.remaining();
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
        return this.v;
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        t2();
        if (i < 0 || i > M0()) {
            throw new IllegalArgumentException(je.p0("newCapacity: ", i));
        }
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.v;
        if (i > i4) {
            ByteBuffer byteBuffer = this.x;
            ByteBuffer C2 = C2(i);
            byteBuffer.position(0).limit(byteBuffer.capacity());
            C2.position(0).limit(byteBuffer.capacity());
            C2.put(byteBuffer);
            C2.clear();
            G2(C2, true);
        } else if (i < i4) {
            ByteBuffer byteBuffer2 = this.x;
            ByteBuffer C22 = C2(i);
            if (i2 < i) {
                if (i3 > i) {
                    a2(i);
                } else {
                    i = i3;
                }
                byteBuffer2.position(i2).limit(i);
                C22.position(i2).limit(i);
                C22.put(byteBuffer2);
                C22.clear();
            } else {
                C1(i, i);
            }
            G2(C22, true);
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public long N0() {
        t2();
        return this.y;
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return null;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        t2();
        o2(i, i2);
        return ((ByteBuffer) this.x.duplicate().position(i).limit(i + i2)).slice();
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return 1;
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return E2(i, gatheringByteChannel, i2, false);
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
        int i2 = t0.b;
        return PlatformDependent.m(this.y + ((long) i));
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        t0.a(this, this.y + ((long) i), i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        p2(i);
        int E2 = E2(this.a, gatheringByteChannel, i, true);
        this.a += E2;
        return E2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return t0.d(this.y + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return t0.f(this.y + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return t0.h(this.y + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return t0.j(this.y + ((long) i));
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        t0.b(this, this.y + ((long) i), i, byteBuffer);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        return t0.l(this.y + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        int i3 = t0.b;
        PlatformDependent.U(this.y + ((long) i), (byte) i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        t0.p(this.y + ((long) i), i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        t0.c(this, this.y + ((long) i), i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        t0.r(this.y + ((long) i), j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        t0.t(this.y + ((long) i), i2);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.t;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        t2();
        ByteBuffer F2 = F2();
        F2.clear().position(i).limit(i + i2);
        try {
            return scatteringByteChannel.read(F2);
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
        t0.n(this, this.y + ((long) i), i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        t0.o(this, this.y + ((long) i), i, byteBuffer);
        return this;
    }

    protected p0(k kVar, ByteBuffer byteBuffer, int i) {
        super(i);
        if (kVar == null) {
            throw new NullPointerException("alloc");
        } else if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("initialBuffer is not a direct buffer.");
        } else if (!byteBuffer.isReadOnly()) {
            int remaining = byteBuffer.remaining();
            if (remaining <= i) {
                this.t = kVar;
                this.w = false;
                G2(byteBuffer.slice().order(ByteOrder.BIG_ENDIAN), false);
                a2(remaining);
                return;
            }
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", Integer.valueOf(remaining), Integer.valueOf(i)));
        } else {
            throw new IllegalArgumentException("initialBuffer is a read-only buffer.");
        }
    }
}
