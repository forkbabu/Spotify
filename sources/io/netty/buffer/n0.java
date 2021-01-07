package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class n0 extends e {
    private final k t;
    byte[] u;
    private ByteBuffer v;

    protected n0(k kVar, int i, int i2) {
        this(kVar, new byte[i], 0, 0, i2);
    }

    private int C2(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        t2();
        if (z) {
            byteBuffer = D2();
        } else {
            byteBuffer = ByteBuffer.wrap(this.u);
        }
        return gatheringByteChannel.write((ByteBuffer) byteBuffer.clear().position(i).limit(i + i2));
    }

    private ByteBuffer D2() {
        ByteBuffer byteBuffer = this.v;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.u);
        this.v = wrap;
        return wrap;
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        t2();
        return this.u;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public void A2() {
        this.u = null;
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        r2(i, i3, i2, bArr.length);
        System.arraycopy(bArr, i2, this.u, i, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        t2();
        j2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return true;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        t2();
        k2(i, j);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return false;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        t2();
        l2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        t2();
        o2(i, i2);
        return (ByteBuffer) D2().clear().position(i).limit(i + i2);
    }

    @Override // io.netty.buffer.j
    public int I() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public int J() {
        t2();
        return this.u.length;
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        t2();
        if (i < 0 || i > M0()) {
            throw new IllegalArgumentException(je.p0("newCapacity: ", i));
        }
        byte[] bArr = this.u;
        int length = bArr.length;
        if (i > length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.u = bArr2;
            this.v = null;
        } else if (i < length) {
            byte[] bArr3 = new byte[i];
            int i2 = this.a;
            if (i2 < i) {
                int i3 = this.b;
                if (i3 > i) {
                    a2(i);
                } else {
                    i = i3;
                }
                System.arraycopy(this.u, i2, bArr3, i2, i - i2);
            } else {
                C1(i, i);
            }
            this.u = bArr3;
            this.v = null;
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
        return ByteBuffer.wrap(this.u, i, i2).slice();
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
        return C2(i, gatheringByteChannel, i2, false);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        t2();
        return d2(i);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        t2();
        return new ByteBuffer[]{ByteBuffer.wrap(this.u, i, i2).slice()};
    }

    @Override // io.netty.buffer.j
    public ByteOrder a1() {
        return ByteOrder.BIG_ENDIAN;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        return this.u[i];
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        n2(i, i3, i2, jVar.J());
        if (jVar.F0()) {
            PlatformDependent.f(this.u, i, ((long) i2) + jVar.N0(), (long) i3);
        } else if (jVar.E0()) {
            k0(i, jVar.A(), jVar.I() + i2, i3);
        } else {
            jVar.B1(i2, this.u, i, i3);
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
        return s.a(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return s.b(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return s.c(this.u, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        byte[] bArr = this.u;
        return (short) ((bArr[i + 1] & 255) | (bArr[i] << 8));
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        t2();
        o2(i, remaining);
        byteBuffer.put(this.u, i, byteBuffer.remaining());
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        byte[] bArr = this.u;
        return (short) ((bArr[i + 1] << 8) | (bArr[i] & 255));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        this.u[i] = (byte) i2;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        s.d(this.u, i, i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        n2(i, i3, i2, bArr.length);
        System.arraycopy(this.u, i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        s.e(this.u, i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        byte[] bArr = this.u;
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        t2();
        return e2(i);
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
        return h2(i);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.t;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        t2();
        i2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        t2();
        try {
            return scatteringByteChannel.read((ByteBuffer) D2().clear().position(i).limit(i + i2));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        r2(i, i3, i2, jVar.J());
        if (jVar.F0()) {
            PlatformDependent.e(jVar.N0() + ((long) i2), this.u, i, (long) i3);
        } else if (jVar.E0()) {
            B1(i, jVar.A(), jVar.I() + i2, i3);
        } else {
            jVar.k0(i2, this.u, i, i3);
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        t2();
        byteBuffer.get(this.u, i, byteBuffer.remaining());
        return this;
    }

    protected n0(k kVar, byte[] bArr, int i) {
        this(kVar, bArr, 0, bArr.length, i);
    }

    private n0(k kVar, byte[] bArr, int i, int i2, int i3) {
        super(i3);
        if (kVar == null) {
            throw new NullPointerException("alloc");
        } else if (bArr.length <= i3) {
            this.t = kVar;
            this.u = bArr;
            this.v = null;
            C1(i, i2);
        } else {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", Integer.valueOf(bArr.length), Integer.valueOf(i3)));
        }
    }
}
