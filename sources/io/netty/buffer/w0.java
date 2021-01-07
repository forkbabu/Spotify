package io.netty.buffer;

import io.netty.util.g;
import io.netty.util.internal.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class w0 extends j {
    protected final j a;

    protected w0(j jVar) {
        if (jVar != null) {
            this.a = jVar;
            return;
        }
        throw new NullPointerException("buf");
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
        return this.a.D0(i);
    }

    @Override // io.netty.buffer.j
    public j D1(int i, int i2) {
        this.a.D1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return this.a.E0();
    }

    @Override // io.netty.buffer.j
    public j E1(int i, long j) {
        this.a.E1(i, j);
        return this;
    }

    @Override // io.netty.buffer.j
    public final boolean F0() {
        return this.a.F0();
    }

    @Override // io.netty.buffer.j
    public j F1(int i, int i2) {
        this.a.F1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        return this.a.G0(i, i2);
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
    public final boolean I0() {
        return this.a.I0();
    }

    @Override // io.netty.buffer.j
    public j I1(int i) {
        this.a.I1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public final int J() {
        return this.a.J();
    }

    @Override // io.netty.buffer.j
    public boolean J0() {
        return this.a.J0();
    }

    @Override // io.netty.buffer.j
    public j J1() {
        return this.a.J1();
    }

    @Override // io.netty.buffer.j
    public final boolean K0() {
        return this.a.K0();
    }

    @Override // io.netty.buffer.j
    public j K1(int i, int i2) {
        return this.a.K1(i, i2);
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        this.a.L(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public final j L0() {
        this.a.L0();
        return this;
    }

    @Override // io.netty.buffer.j
    public String L1(Charset charset) {
        return this.a.L1(charset);
    }

    @Override // io.netty.buffer.j
    /* renamed from: M */
    public int compareTo(j jVar) {
        return this.a.compareTo(jVar);
    }

    @Override // io.netty.buffer.j
    public final int M0() {
        return this.a.M0();
    }

    @Override // io.netty.buffer.j
    public j N() {
        this.a.N();
        return this;
    }

    @Override // io.netty.buffer.j
    public final long N0() {
        return this.a.N0();
    }

    @Override // io.netty.buffer.j
    public final j N1() {
        return this.a;
    }

    @Override // io.netty.buffer.j
    public j O() {
        return this.a.O();
    }

    @Override // io.netty.buffer.j
    public ByteBuffer O0() {
        return this.a.O0();
    }

    @Override // io.netty.buffer.j
    public final int O1() {
        return this.a.O1();
    }

    @Override // io.netty.buffer.j
    public j P(int i) {
        this.a.P(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        return this.a.P0(i, i2);
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
        return this.a.T0();
    }

    @Override // io.netty.buffer.j
    public int T1(int i) {
        return this.a.T1(i);
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
        return this.a.W0(i, i2);
    }

    @Override // io.netty.buffer.j
    public j W1(int i) {
        this.a.W1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public j X1(long j) {
        this.a.X1(j);
        return this;
    }

    @Override // io.netty.buffer.j
    public j Y1(int i) {
        this.a.Y1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        return this.a.Z0(byteOrder);
    }

    @Override // io.netty.buffer.j
    public final int Z1() {
        return this.a.Z1();
    }

    @Override // io.netty.buffer.j
    public final ByteOrder a1() {
        return this.a.a1();
    }

    @Override // io.netty.buffer.j
    public final j a2(int i) {
        this.a.a2(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public byte b1() {
        return this.a.b1();
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
        return this.a.e1(i);
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    @Override // io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        this.a.f1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int g1() {
        return this.a.g1();
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        this.a.h0(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.j
    public long h1() {
        return this.a.h1();
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // io.netty.buffer.j
    public j j1(int i) {
        return this.a.j1(i);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        this.a.k0(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public short k1() {
        return this.a.k1();
    }

    @Override // io.netty.buffer.j
    public short l1() {
        return this.a.l1();
    }

    @Override // io.netty.buffer.j
    public int m0(int i) {
        return this.a.m0(i);
    }

    @Override // io.netty.buffer.j
    public final int m1() {
        return this.a.m1();
    }

    @Override // io.netty.util.o
    public final int n() {
        return this.a.n();
    }

    @Override // io.netty.buffer.j
    public final int n1() {
        return this.a.n1();
    }

    @Override // io.netty.buffer.j
    public long o0(int i) {
        return this.a.o0(i);
    }

    @Override // io.netty.buffer.j
    public final j p1(int i) {
        this.a.p1(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public short q0(int i) {
        return this.a.q0(i);
    }

    @Override // io.netty.buffer.j
    public final j r1() {
        this.a.r1();
        return this;
    }

    @Override // io.netty.buffer.j
    public short s0(int i) {
        return this.a.s0(i);
    }

    @Override // io.netty.buffer.j
    public final k t() {
        return this.a.t();
    }

    @Override // io.netty.buffer.j
    public j t1() {
        this.a.t1();
        return this;
    }

    @Override // io.netty.buffer.j, java.lang.Object
    public String toString() {
        return r.f(this) + '(' + this.a.toString() + ')';
    }

    @Override // io.netty.buffer.j
    public short u0(int i) {
        return this.a.u0(i);
    }

    @Override // io.netty.buffer.j
    public j u1() {
        return this.a.u1();
    }

    @Override // io.netty.buffer.j
    public long v0(int i) {
        return this.a.v0(i);
    }

    @Override // io.netty.buffer.j
    public j v1(int i, int i2) {
        return this.a.v1(i, i2);
    }

    @Override // io.netty.buffer.j
    public j w1(int i, int i2) {
        this.a.w1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public long x0(int i) {
        return this.a.x0(i);
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

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        this.a.z1(i, byteBuffer);
        return this;
    }
}
