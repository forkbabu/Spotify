package io.netty.buffer;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.g;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.i;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.r;
import io.netty.util.internal.s;
import io.netty.util.o;
import io.netty.util.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public abstract class a extends j {
    private static final b o;
    private static final boolean p;
    static final ResourceLeakDetector<j> q = q.b().c(j.class, 128, Long.MAX_VALUE);
    int a;
    int b;
    private int c;
    private int f;
    private int n;

    static {
        int i = c.b;
        b b2 = c.b(a.class.getName());
        o = b2;
        boolean b3 = s.b("io.netty.buffer.bytebuf.checkAccessible", true);
        p = b3;
        if (b2.c()) {
            b2.b("-D{}: {}", "io.netty.buffer.bytebuf.checkAccessible", Boolean.valueOf(b3));
        }
    }

    protected a(int i) {
        if (i >= 0) {
            this.n = i;
            return;
        }
        throw new IllegalArgumentException(je.q0("maxCapacity: ", i, " (expected: >= 0)"));
    }

    private void q2(int i) {
        t2();
        if (this.a > this.b - i) {
            throw new IndexOutOfBoundsException(String.format("readerIndex(%d) + length(%d) exceeds writerIndex(%d): %s", Integer.valueOf(this.a), Integer.valueOf(i), Integer.valueOf(this.b), this));
        }
    }

    private void u2(int i) {
        if (i > O1()) {
            if (i <= this.n - this.b) {
                L(t().e(this.b + i, this.n));
                return;
            }
            throw new IndexOutOfBoundsException(String.format("writerIndex(%d) + minWritableBytes(%d) exceeds maxCapacity(%d): %s", Integer.valueOf(this.b), Integer.valueOf(i), Integer.valueOf(this.n), this));
        }
    }

    @Override // io.netty.buffer.j
    public j C1(int i, int i2) {
        if (i < 0 || i > i2 || i2 > J()) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d, writerIndex: %d (expected: 0 <= readerIndex <= writerIndex <= capacity(%d))", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(J())));
        }
        this.a = i;
        this.b = i2;
        return this;
    }

    @Override // io.netty.buffer.j
    public int D0(int i) {
        return q0(i) & 65535;
    }

    @Override // io.netty.buffer.j
    public j D1(int i, int i2) {
        t2();
        o2(i, 4);
        j2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public j E1(int i, long j) {
        t2();
        o2(i, 8);
        k2(i, j);
        return this;
    }

    @Override // io.netty.buffer.j
    public j F1(int i, int i2) {
        t2();
        o2(i, 2);
        l2(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public j G1(int i, int i2) {
        if (i2 == 0) {
            return this;
        }
        t2();
        o2(i, i2);
        int i3 = i2 & 7;
        for (int i4 = i2 >>> 3; i4 > 0; i4--) {
            k2(i, 0);
            i += 8;
        }
        if (i3 == 4) {
            j2(i, 0);
        } else if (i3 < 4) {
            while (i3 > 0) {
                i2(i, 0);
                i++;
                i3--;
            }
        } else {
            j2(i, 0);
            int i5 = i + 4;
            for (int i6 = i3 - 4; i6 > 0; i6--) {
                i2(i5, 0);
                i5++;
            }
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public j I1(int i) {
        p2(i);
        this.a += i;
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean J0() {
        return false;
    }

    @Override // io.netty.buffer.j
    public j J1() {
        return K1(this.a, m1());
    }

    @Override // io.netty.buffer.j
    public boolean K0() {
        return this.b > this.a;
    }

    @Override // io.netty.buffer.j
    public j K1(int i, int i2) {
        return new o0(this, i, i2);
    }

    @Override // io.netty.buffer.j
    public j L0() {
        this.c = this.a;
        return this;
    }

    @Override // io.netty.buffer.j
    public String L1(Charset charset) {
        return y2(this.a, m1(), charset);
    }

    @Override // io.netty.buffer.j
    /* renamed from: M */
    public int compareTo(j jVar) {
        return o.c(this, jVar);
    }

    @Override // io.netty.buffer.j
    public int M0() {
        return this.n;
    }

    @Override // io.netty.buffer.j
    public j N() {
        t2();
        int i = this.a;
        if (i == 0) {
            return this;
        }
        if (i == this.b) {
            m2(i);
            this.a = 0;
            this.b = 0;
            return this;
        }
        if (i >= (J() >>> 1)) {
            int i2 = this.a;
            y1(0, this, i2, this.b - i2);
            int i3 = this.b;
            int i4 = this.a;
            this.b = i3 - i4;
            m2(i4);
            this.a = 0;
        }
        return this;
    }

    @Override // io.netty.buffer.j
    public j O() {
        return new m0(this);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer O0() {
        return P0(this.a, m1());
    }

    @Override // io.netty.buffer.j
    public int O1() {
        return J() - this.b;
    }

    @Override // io.netty.buffer.j
    public j P(int i) {
        if (i >= 0) {
            u2(i);
            return this;
        }
        throw new IllegalArgumentException(String.format("minWritableBytes: %d (expected: >= 0)", Integer.valueOf(i)));
    }

    @Override // io.netty.buffer.j
    public j P1(int i) {
        t2();
        u2(1);
        int i2 = this.b;
        this.b = i2 + 1;
        i2(i2, i);
        return this;
    }

    @Override // io.netty.buffer.j
    public int Q(g gVar) {
        t2();
        try {
            int i = this.b;
            for (int i2 = this.a; i2 < i; i2++) {
                if (!gVar.a(c2(i2))) {
                    return i2;
                }
            }
            return -1;
        } catch (Exception e) {
            PlatformDependent.f0(e);
            return -1;
        }
    }

    @Override // io.netty.buffer.j
    public int Q1(ScatteringByteChannel scatteringByteChannel, int i) {
        t2();
        P(i);
        int x1 = x1(this.b, scatteringByteChannel, i);
        if (x1 > 0) {
            this.b += x1;
        }
        return x1;
    }

    @Override // io.netty.buffer.j
    public j R1(j jVar) {
        z2(jVar, jVar.m1());
        return this;
    }

    @Override // io.netty.buffer.j
    public byte S(int i) {
        t2();
        o2(i, 1);
        return c2(i);
    }

    @Override // io.netty.buffer.j
    public j S1(j jVar, int i, int i2) {
        t2();
        P(i2);
        y1(this.b, jVar, i, i2);
        this.b += i2;
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] T0() {
        return W0(this.a, m1());
    }

    @Override // io.netty.buffer.j
    public int T1(int i) {
        t2();
        o2(i, 4);
        return d2(i);
    }

    @Override // io.netty.buffer.j
    public j U1(byte[] bArr) {
        V1(bArr, 0, bArr.length);
        return this;
    }

    @Override // io.netty.buffer.j
    public j V1(byte[] bArr, int i, int i2) {
        t2();
        P(i2);
        B1(this.b, bArr, i, i2);
        this.b += i2;
        return this;
    }

    @Override // io.netty.buffer.j
    public j W1(int i) {
        t2();
        u2(4);
        j2(this.b, i);
        this.b += 4;
        return this;
    }

    @Override // io.netty.buffer.j
    public j X1(long j) {
        t2();
        u2(8);
        k2(this.b, j);
        this.b += 8;
        return this;
    }

    @Override // io.netty.buffer.j
    public j Y1(int i) {
        t2();
        u2(2);
        l2(this.b, i);
        this.b += 2;
        return this;
    }

    @Override // io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == a1()) {
            return this;
        } else {
            return x2();
        }
    }

    @Override // io.netty.buffer.j
    public int Z1() {
        return this.b;
    }

    @Override // io.netty.buffer.j
    public j a2(int i) {
        if (i < this.a || i > J()) {
            throw new IndexOutOfBoundsException(String.format("writerIndex: %d (expected: readerIndex(%d) <= writerIndex <= capacity(%d))", Integer.valueOf(i), Integer.valueOf(this.a), Integer.valueOf(J())));
        }
        this.b = i;
        return this;
    }

    @Override // io.netty.buffer.j
    public byte b1() {
        q2(1);
        int i = this.a;
        byte c2 = c2(i);
        this.a = i + 1;
        return c2;
    }

    /* access modifiers changed from: protected */
    public abstract byte c2(int i);

    @Override // io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        p2(i);
        int T = T(this.a, gatheringByteChannel, i);
        this.a += T;
        return T;
    }

    /* access modifiers changed from: protected */
    public abstract int d2(int i);

    @Override // io.netty.buffer.j
    public j e1(int i) {
        p2(i);
        if (i == 0) {
            return j0.b;
        }
        j i2 = t().i(i, this.n);
        i2.S1(this, this.a, i);
        this.a += i;
        return i2;
    }

    /* access modifiers changed from: protected */
    public abstract int e2(int i);

    @Override // io.netty.buffer.j, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return o.f(this, (j) obj);
        }
        return false;
    }

    @Override // io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        p2(i2);
        k0(this.a, bArr, i, i2);
        this.a += i2;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract long f2(int i);

    @Override // io.netty.buffer.j
    public int g1() {
        q2(4);
        int d2 = d2(this.a);
        this.a += 4;
        return d2;
    }

    /* access modifiers changed from: protected */
    public abstract short g2(int i);

    @Override // io.netty.buffer.j
    public long h1() {
        q2(8);
        long f2 = f2(this.a);
        this.a += 8;
        return f2;
    }

    /* access modifiers changed from: protected */
    public abstract short h2(int i);

    @Override // io.netty.buffer.j, java.lang.Object
    public int hashCode() {
        int i;
        int i2 = o.f;
        int m1 = m1();
        int i3 = m1 >>> 2;
        int i4 = m1 & 3;
        int n1 = n1();
        if (a1() == ByteOrder.BIG_ENDIAN) {
            i = 1;
            while (i3 > 0) {
                i = (i * 31) + T1(n1);
                n1 += 4;
                i3--;
            }
        } else {
            i = 1;
            while (i3 > 0) {
                i = (i * 31) + Integer.reverseBytes(T1(n1));
                n1 += 4;
                i3--;
            }
        }
        while (i4 > 0) {
            i = (i * 31) + S(n1);
            i4--;
            n1++;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract void i2(int i, int i2);

    @Override // io.netty.buffer.j
    public j j1(int i) {
        j v1 = v1(this.a, i);
        this.a += i;
        return v1;
    }

    /* access modifiers changed from: protected */
    public abstract void j2(int i, int i2);

    @Override // io.netty.buffer.j
    public short k1() {
        q2(2);
        short g2 = g2(this.a);
        this.a += 2;
        return g2;
    }

    /* access modifiers changed from: protected */
    public abstract void k2(int i, long j);

    @Override // io.netty.buffer.j
    public short l1() {
        return (short) (b1() & 255);
    }

    /* access modifiers changed from: protected */
    public abstract void l2(int i, int i2);

    @Override // io.netty.buffer.j
    public int m0(int i) {
        t2();
        o2(i, 4);
        return e2(i);
    }

    @Override // io.netty.buffer.j
    public int m1() {
        return this.b - this.a;
    }

    /* access modifiers changed from: protected */
    public final void m2(int i) {
        int i2 = this.c;
        if (i2 <= i) {
            this.c = 0;
            int i3 = this.f;
            if (i3 <= i) {
                this.f = 0;
            } else {
                this.f = i3 - i;
            }
        } else {
            this.c = i2 - i;
            this.f -= i;
        }
    }

    @Override // io.netty.buffer.j
    public int n1() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void n2(int i, int i2, int i3, int i4) {
        t2();
        o2(i, i2);
        if (i.a(i3, i2, i4)) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
        }
    }

    @Override // io.netty.buffer.j
    public long o0(int i) {
        t2();
        o2(i, 8);
        return f2(i);
    }

    /* access modifiers changed from: package-private */
    public final void o2(int i, int i2) {
        if (i.a(i, i2, J())) {
            throw new IndexOutOfBoundsException(String.format("index: %d, length: %d (expected: range(0, %d))", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(J())));
        }
    }

    @Override // io.netty.buffer.j
    public j p1(int i) {
        if (i < 0 || i > this.b) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d (expected: 0 <= readerIndex <= writerIndex(%d))", Integer.valueOf(i), Integer.valueOf(this.b)));
        }
        this.a = i;
        return this;
    }

    /* access modifiers changed from: protected */
    public final void p2(int i) {
        if (i >= 0) {
            q2(i);
            return;
        }
        throw new IllegalArgumentException(je.q0("minimumReadableBytes: ", i, " (expected: >= 0)"));
    }

    @Override // io.netty.buffer.j
    public short q0(int i) {
        t2();
        o2(i, 2);
        return g2(i);
    }

    @Override // io.netty.buffer.j
    public j r1() {
        p1(this.c);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void r2(int i, int i2, int i3, int i4) {
        t2();
        o2(i, i2);
        if (i.a(i3, i2, i4)) {
            throw new IndexOutOfBoundsException(String.format("srcIndex: %d, length: %d (expected: range(0, %d))", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
        }
    }

    @Override // io.netty.buffer.j
    public short s0(int i) {
        t2();
        o2(i, 2);
        return h2(i);
    }

    /* access modifiers changed from: package-private */
    public final void s2() {
        this.f = 0;
        this.c = 0;
    }

    /* access modifiers changed from: protected */
    public final void t2() {
        if (p && n() == 0) {
            throw new IllegalReferenceCountException(0);
        }
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public String toString() {
        if (n() == 0) {
            return r.f(this) + "(freed)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r.f(this));
        sb.append("(ridx: ");
        sb.append(this.a);
        sb.append(", widx: ");
        sb.append(this.b);
        sb.append(", cap: ");
        sb.append(J());
        if (this.n != Integer.MAX_VALUE) {
            sb.append('/');
            sb.append(this.n);
        }
        j N1 = N1();
        if (N1 != null) {
            sb.append(", unwrapped: ");
            sb.append(N1);
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // io.netty.buffer.j
    public short u0(int i) {
        return (short) (S(i) & 255);
    }

    @Override // io.netty.buffer.j
    public j u1() {
        return J1().t1();
    }

    @Override // io.netty.buffer.j
    public long v0(int i) {
        return ((long) T1(i)) & 4294967295L;
    }

    @Override // io.netty.buffer.j
    public j v1(int i, int i2) {
        return K1(i, i2).t1();
    }

    public j v2() {
        this.f = this.b;
        return this;
    }

    @Override // io.netty.buffer.j
    public j w1(int i, int i2) {
        t2();
        o2(i, 1);
        i2(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void w2(int i) {
        this.n = i;
    }

    @Override // io.netty.buffer.j
    public long x0(int i) {
        return ((long) m0(i)) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    public i0 x2() {
        return new i0(this);
    }

    public String y2(int i, int i2, Charset charset) {
        return o.d(this, i, i2, charset);
    }

    @Override // io.netty.buffer.j, io.netty.util.o
    public /* bridge */ /* synthetic */ o z(Object obj) {
        return z(obj);
    }

    public j z2(j jVar, int i) {
        if (i <= jVar.m1()) {
            S1(jVar, jVar.n1(), i);
            jVar.p1(jVar.n1() + i);
            return this;
        }
        throw new IndexOutOfBoundsException(String.format("length(%d) exceeds src.readableBytes(%d) where src is: %s", Integer.valueOf(i), Integer.valueOf(jVar.m1()), jVar));
    }
}
