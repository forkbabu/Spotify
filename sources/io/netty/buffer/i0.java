package io.netty.buffer;

import io.netty.util.g;
import io.netty.util.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

@Deprecated
public class i0 extends j {
    private final j a;
    private final ByteOrder b;

    public i0(j jVar) {
        if (jVar != null) {
            this.a = jVar;
            ByteOrder a1 = jVar.a1();
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            if (a1 == byteOrder) {
                this.b = ByteOrder.LITTLE_ENDIAN;
            } else {
                this.b = byteOrder;
            }
        } else {
            throw new NullPointerException("buf");
        }
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        return this.a.A();
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        this.a.B1(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j C1(int i, int i2) {
        this.a.C1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int D0(int i) {
        return q0(i) & 65535;
    }

    @Override // io.netty.buffer.j
    public j D1(int i, int i2) {
        j jVar = this.a;
        int i3 = o.f;
        jVar.D1(i, Integer.reverseBytes(i2));
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return this.a.E0();
    }

    @Override // io.netty.buffer.j
    public j E1(int i, long j) {
        j jVar = this.a;
        int i2 = o.f;
        jVar.E1(i, Long.reverseBytes(j));
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return this.a.F0();
    }

    @Override // io.netty.buffer.j
    public j F1(int i, int i2) {
        j jVar = this.a;
        int i3 = o.f;
        jVar.F1(i, Short.reverseBytes((short) i2));
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        return this.a.P0(i, i2).order(this.b);
    }

    @Override // io.netty.buffer.j
    public j G1(int i, int i2) {
        this.a.G1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        return this.a.I();
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return this.a.I0();
    }

    @Override // io.netty.buffer.j
    public j I1(int i) {
        this.a.I1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public int J() {
        return this.a.J();
    }

    @Override // io.netty.buffer.j
    public boolean J0() {
        return this.a.J0();
    }

    @Override // io.netty.buffer.j
    public j J1() {
        return this.a.J1().Z0(this.b);
    }

    @Override // io.netty.buffer.j
    public boolean K0() {
        return this.a.K0();
    }

    @Override // io.netty.buffer.j
    public j K1(int i, int i2) {
        return this.a.K1(i, i2).Z0(this.b);
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        this.a.L(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public j L0() {
        this.a.L0();
        return this;
    }

    @Override // io.netty.buffer.j
    public String L1(Charset charset) {
        return this.a.L1(charset);
    }

    @Override // io.netty.buffer.j
    public int M(j jVar) {
        return o.c(this, jVar);
    }

    @Override // io.netty.buffer.j
    public int M0() {
        return this.a.M0();
    }

    @Override // io.netty.buffer.j
    public j M1(Object obj) {
        this.a.z(obj);
        return this;
    }

    @Override // io.netty.buffer.j
    public j N() {
        this.a.N();
        return this;
    }

    @Override // io.netty.buffer.j
    public long N0() {
        return this.a.N0();
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return this.a.N1();
    }

    @Override // io.netty.buffer.j
    public j O() {
        return this.a.O().Z0(this.b);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer O0() {
        return this.a.O0().order(this.b);
    }

    @Override // io.netty.buffer.j
    public int O1() {
        return this.a.O1();
    }

    @Override // io.netty.buffer.j
    public j P(int i) {
        this.a.P(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        return this.a.P0(i, i2).order(this.b);
    }

    @Override // io.netty.buffer.j
    public j P1(int i) {
        this.a.P1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public int Q(g gVar) {
        return this.a.Q(gVar);
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return this.a.Q0();
    }

    @Override // io.netty.buffer.j
    public int Q1(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.a.Q1(scatteringByteChannel, i);
    }

    @Override // io.netty.buffer.j
    public j R1(j jVar) {
        this.a.R1(jVar);
        return this;
    }

    @Override // io.netty.buffer.j
    public byte S(int i) {
        return this.a.S(i);
    }

    @Override // io.netty.buffer.j
    public j S1(j jVar, int i, int i2) {
        this.a.S1(jVar, i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return this.a.T(i, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] T0() {
        ByteBuffer[] T0 = this.a.T0();
        for (int i = 0; i < T0.length; i++) {
            T0[i] = T0[i].order(this.b);
        }
        return T0;
    }

    @Override // io.netty.buffer.j
    public int T1(int i) {
        int T1 = this.a.T1(i);
        int i2 = o.f;
        return Integer.reverseBytes(T1);
    }

    @Override // io.netty.buffer.j
    public j U1(byte[] bArr) {
        this.a.U1(bArr);
        return this;
    }

    @Override // io.netty.buffer.j
    public j V1(byte[] bArr, int i, int i2) {
        this.a.V1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        ByteBuffer[] W0 = this.a.W0(i, i2);
        for (int i3 = 0; i3 < W0.length; i3++) {
            W0[i3] = W0[i3].order(this.b);
        }
        return W0;
    }

    @Override // io.netty.buffer.j
    public j W1(int i) {
        j jVar = this.a;
        int i2 = o.f;
        jVar.W1(Integer.reverseBytes(i));
        return this;
    }

    @Override // io.netty.buffer.j
    public j X1(long j) {
        j jVar = this.a;
        int i = o.f;
        jVar.X1(Long.reverseBytes(j));
        return this;
    }

    @Override // io.netty.buffer.j
    public j Y1(int i) {
        j jVar = this.a;
        int i2 = o.f;
        jVar.Y1(Short.reverseBytes((short) i));
        return this;
    }

    @Override // io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == this.b) {
            return this;
        } else {
            return this.a;
        }
    }

    @Override // io.netty.buffer.j
    public int Z1() {
        return this.a.Z1();
    }

    @Override // io.netty.buffer.j
    public ByteOrder a1() {
        return this.b;
    }

    @Override // io.netty.buffer.j
    public j a2(int i) {
        this.a.a2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public byte b1() {
        return this.a.b1();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.netty.buffer.j, java.lang.Comparable
    public int compareTo(j jVar) {
        return o.c(this, jVar);
    }

    @Override // io.netty.util.o
    public boolean d() {
        return this.a.d();
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        this.a.d0(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        return this.a.d1(gatheringByteChannel, i);
    }

    @Override // io.netty.buffer.j
    public j e1(int i) {
        return this.a.e1(i).Z0(this.b);
    }

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
        this.a.f1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int g1() {
        int g1 = this.a.g1();
        int i = o.f;
        return Integer.reverseBytes(g1);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        this.a.h0(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.j
    public long h1() {
        long h1 = this.a.h1();
        int i = o.f;
        return Long.reverseBytes(h1);
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // io.netty.buffer.j
    public j j1(int i) {
        return this.a.j1(i).Z0(this.b);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        this.a.k0(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public short k1() {
        short k1 = this.a.k1();
        int i = o.f;
        return Short.reverseBytes(k1);
    }

    @Override // io.netty.buffer.j
    public short l1() {
        return this.a.l1();
    }

    @Override // io.netty.buffer.j
    public int m0(int i) {
        return this.a.T1(i);
    }

    @Override // io.netty.buffer.j
    public int m1() {
        return this.a.m1();
    }

    @Override // io.netty.util.o
    public int n() {
        return this.a.n();
    }

    @Override // io.netty.buffer.j
    public int n1() {
        return this.a.n1();
    }

    @Override // io.netty.buffer.j
    public long o0(int i) {
        long o0 = this.a.o0(i);
        int i2 = o.f;
        return Long.reverseBytes(o0);
    }

    @Override // io.netty.buffer.j
    public j p1(int i) {
        this.a.p1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public short q0(int i) {
        short q0 = this.a.q0(i);
        int i2 = o.f;
        return Short.reverseBytes(q0);
    }

    @Override // io.netty.buffer.j
    public j r1() {
        this.a.r1();
        return this;
    }

    @Override // io.netty.buffer.j
    public short s0(int i) {
        return this.a.q0(i);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return this.a.t();
    }

    @Override // io.netty.buffer.j
    public j t1() {
        this.a.t1();
        return this;
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Swapped(");
        V0.append(this.a);
        V0.append(')');
        return V0.toString();
    }

    @Override // io.netty.buffer.j
    public short u0(int i) {
        return this.a.u0(i);
    }

    @Override // io.netty.buffer.j
    public j u1() {
        return this.a.u1().Z0(this.b);
    }

    @Override // io.netty.buffer.j
    public long v0(int i) {
        return ((long) T1(i)) & 4294967295L;
    }

    @Override // io.netty.buffer.j
    public j v1(int i, int i2) {
        return this.a.v1(i, i2).Z0(this.b);
    }

    @Override // io.netty.buffer.j
    public j w1(int i, int i2) {
        this.a.w1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public long x0(int i) {
        return ((long) this.a.T1(i)) & 4294967295L;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return this.a.x1(i, scatteringByteChannel, i2);
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        this.a.y1(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        this.a.z(obj);
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        this.a.z1(i, byteBuffer);
        return this;
    }
}
