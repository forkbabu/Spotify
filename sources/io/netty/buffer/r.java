package io.netty.buffer;

import io.netty.util.g;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.c;
import io.netty.util.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public final class r extends j {
    private static final ByteBuffer n;
    private static final long o;
    private final k a;
    private final ByteOrder b;
    private final String c;
    private r f;

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
        n = allocateDirect;
        long j = 0;
        try {
            if (PlatformDependent.z()) {
                j = PlatformDependent.h(allocateDirect);
            }
        } catch (Throwable unused) {
        }
        o = j;
    }

    public r(k kVar) {
        this(kVar, ByteOrder.BIG_ENDIAN);
    }

    private j c2(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    private j d2(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(je.p0("length: ", i2));
        } else if (i == 0 && i2 == 0) {
            return this;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private j e2(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(je.q0("length: ", i, " (expected: >= 0)"));
        } else if (i == 0) {
            return this;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        return c.a;
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        d2(i, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j C1(int i, int i2) {
        c2(i);
        c2(i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int D0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j D1(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return true;
    }

    @Override // io.netty.buffer.j
    public j E1(int i, long j) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return o != 0;
    }

    @Override // io.netty.buffer.j
    public j F1(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        return n;
    }

    @Override // io.netty.buffer.j
    public j G1(int i, int i2) {
        d2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return true;
    }

    @Override // io.netty.buffer.j
    public j I1(int i) {
        e2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public int J() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public boolean J0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public j J1() {
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean K0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public j K1(int i, int i2) {
        d2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        throw new ReadOnlyBufferException();
    }

    @Override // io.netty.buffer.j
    public j L0() {
        return this;
    }

    @Override // io.netty.buffer.j
    public String L1(Charset charset) {
        return "";
    }

    @Override // io.netty.buffer.j
    /* renamed from: M */
    public int compareTo(j jVar) {
        return jVar.K0() ? -1 : 0;
    }

    @Override // io.netty.buffer.j
    public int M0() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public j M1(Object obj) {
        return this;
    }

    @Override // io.netty.buffer.j
    public j N() {
        return this;
    }

    @Override // io.netty.buffer.j
    public long N0() {
        if (F0()) {
            return o;
        }
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return null;
    }

    @Override // io.netty.buffer.j
    public j O() {
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer O0() {
        return n;
    }

    @Override // io.netty.buffer.j
    public int O1() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public j P(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(je.q0("minWritableBytes: ", i, " (expected: >= 0)"));
        } else if (i == 0) {
            return this;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        d2(i, i2);
        return n;
    }

    @Override // io.netty.buffer.j
    public j P1(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public int Q(g gVar) {
        return -1;
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return 1;
    }

    @Override // io.netty.buffer.j
    public int Q1(ScatteringByteChannel scatteringByteChannel, int i) {
        e2(i);
        return 0;
    }

    @Override // io.netty.buffer.j
    public j R1(j jVar) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public byte S(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j S1(j jVar, int i, int i2) {
        e2(i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        d2(i, i2);
        return 0;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] T0() {
        return new ByteBuffer[]{n};
    }

    @Override // io.netty.buffer.j
    public int T1(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j U1(byte[] bArr) {
        e2(bArr.length);
        return this;
    }

    @Override // io.netty.buffer.j
    public j V1(byte[] bArr, int i, int i2) {
        e2(i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        d2(i, i2);
        return T0();
    }

    @Override // io.netty.buffer.j
    public j W1(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j X1(long j) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j Y1(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == this.b) {
            return this;
        } else {
            r rVar = this.f;
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r(this.a, byteOrder);
            this.f = rVar2;
            return rVar2;
        }
    }

    @Override // io.netty.buffer.j
    public int Z1() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public ByteOrder a1() {
        return this.b;
    }

    @Override // io.netty.buffer.j
    public j a2(int i) {
        c2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public byte b1() {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.util.o
    public boolean d() {
        return false;
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        d2(i, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        e2(i);
        return 0;
    }

    @Override // io.netty.buffer.j
    public j e1(int i) {
        e2(i);
        return this;
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public boolean equals(Object obj) {
        return (obj instanceof j) && !((j) obj).K0();
    }

    @Override // io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        e2(i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int g1() {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        d2(i, byteBuffer.remaining());
        return this;
    }

    @Override // io.netty.buffer.j
    public long h1() {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public int hashCode() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public j j1(int i) {
        e2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        d2(i, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public short k1() {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public short l1() {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public int m0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public int m1() {
        return 0;
    }

    @Override // io.netty.util.o
    public int n() {
        return 1;
    }

    @Override // io.netty.buffer.j
    public int n1() {
        return 0;
    }

    @Override // io.netty.buffer.j
    public long o0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j p1(int i) {
        c2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public short q0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j r1() {
        return this;
    }

    @Override // io.netty.buffer.j
    public short s0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.a;
    }

    @Override // io.netty.buffer.j
    public j t1() {
        return this;
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public String toString() {
        return this.c;
    }

    @Override // io.netty.buffer.j
    public short u0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j u1() {
        return this;
    }

    @Override // io.netty.buffer.j
    public long v0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public j v1(int i, int i2) {
        d2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public j w1(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public long x0(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        d2(i, i2);
        return 0;
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        d2(i, i3);
        return this;
    }

    @Override // io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        d2(i, byteBuffer.remaining());
        return this;
    }

    private r(k kVar, ByteOrder byteOrder) {
        if (kVar != null) {
            this.a = kVar;
            this.b = byteOrder;
            StringBuilder sb = new StringBuilder();
            sb.append(io.netty.util.internal.r.f(this));
            sb.append(byteOrder == ByteOrder.BIG_ENDIAN ? "BE" : "LE");
            this.c = sb.toString();
            return;
        }
        throw new NullPointerException("alloc");
    }
}
