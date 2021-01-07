package io.netty.buffer;

import io.netty.util.g;
import io.netty.util.o;
import io.netty.util.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

final class i extends x0 {
    private final p B;

    i(p pVar, p pVar2) {
        super(pVar);
        this.B = pVar2;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        h.c2(this.B);
        super.B1(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int D0(int i) {
        h.c2(this.B);
        return super.D0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        h.c2(this.B);
        super.D1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p D2(boolean z, j jVar) {
        h.c2(this.B);
        super.D2(z, jVar);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        h.c2(this.B);
        super.E1(i, j);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        h.c2(this.B);
        super.F1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        h.c2(this.B);
        return super.G0(i, i2);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j G1(int i, int i2) {
        h.c2(this.B);
        super.G1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p G2(int i) {
        h.c2(this.B);
        super.L(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j I1(int i) {
        h.c2(this.B);
        super.I1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public boolean J0() {
        h.c2(this.B);
        return super.J0();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j J1() {
        h.c2(this.B);
        return new h(super.J1(), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p J2() {
        h.c2(this.B);
        super.J2();
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j K1(int i, int i2) {
        h.c2(this.B);
        return new h(super.K1(i, i2), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p K2() {
        h.c2(this.B);
        super.N();
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j L(int i) {
        h.c2(this.B);
        super.L(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public String L1(Charset charset) {
        h.c2(this.B);
        return super.L1(charset);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p L2(int i) {
        h.c2(this.B);
        super.P(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.e, io.netty.buffer.j
    public j M1(Object obj) {
        this.B.a(obj);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public /* bridge */ /* synthetic */ j N() {
        K2();
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p N2(int i, j jVar, int i2, int i3) {
        h.c2(this.B);
        super.d0(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j O() {
        h.c2(this.B);
        return new h(super.O(), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public ByteBuffer O0() {
        h.c2(this.B);
        return super.O0();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p O2(int i, ByteBuffer byteBuffer) {
        h.c2(this.B);
        super.h0(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j P(int i) {
        h.c2(this.B);
        super.P(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        h.c2(this.B);
        return super.P0(i, i2);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j P1(int i) {
        h.c2(this.B);
        super.P1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p P2(int i, byte[] bArr, int i2, int i3) {
        h.c2(this.B);
        super.k0(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int Q(g gVar) {
        h.c2(this.B);
        return super.Q(gVar);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public int Q0() {
        h.c2(this.B);
        return super.Q0();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int Q1(ScatteringByteChannel scatteringByteChannel, int i) {
        h.c2(this.B);
        return super.Q1(scatteringByteChannel, i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j R1(j jVar) {
        h.c2(this.B);
        super.R1(jVar);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p R2(byte[] bArr, int i, int i2) {
        h.c2(this.B);
        super.f1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        h.c2(this.B);
        return super.S(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j S1(j jVar, int i, int i2) {
        h.c2(this.B);
        super.S1(jVar, i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        h.c2(this.B);
        return super.T(i, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public ByteBuffer[] T0() {
        h.c2(this.B);
        return super.T0();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        h.c2(this.B);
        return super.T1(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j U1(byte[] bArr) {
        h.c2(this.B);
        super.U1(bArr);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p U2() {
        this.B.b();
        super.t1();
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j V1(byte[] bArr, int i, int i2) {
        h.c2(this.B);
        super.V1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    /* renamed from: V2 */
    public p w1(int i, int i2) {
        h.c2(this.B);
        super.w1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        h.c2(this.B);
        return super.W0(i, i2);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j W1(int i) {
        h.c2(this.B);
        super.W1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p W2(int i, j jVar, int i2, int i3) {
        h.c2(this.B);
        super.y1(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j X1(long j) {
        h.c2(this.B);
        super.X1(j);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p X2(int i, ByteBuffer byteBuffer) {
        h.c2(this.B);
        super.z1(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j Y1(int i) {
        h.c2(this.B);
        super.Y1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p Y2(int i, byte[] bArr, int i2, int i3) {
        h.c2(this.B);
        super.B1(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        h.c2(this.B);
        if (a1() == byteOrder) {
            return this;
        }
        return new h(super.Z0(byteOrder), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p a3(int i, int i2) {
        h.c2(this.B);
        super.D1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public byte b1() {
        h.c2(this.B);
        return super.b1();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p b3(int i, long j) {
        h.c2(this.B);
        super.E1(i, j);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p c3(int i, int i2) {
        h.c2(this.B);
        super.F1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.e, io.netty.util.o
    public boolean d() {
        boolean d = super.d();
        if (d) {
            this.B.close();
        } else {
            this.B.b();
        }
        return d;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        h.c2(this.B);
        super.d0(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        h.c2(this.B);
        return super.d1(gatheringByteChannel, i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p d3(int i, int i2) {
        h.c2(this.B);
        super.G1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j e1(int i) {
        h.c2(this.B);
        return super.e1(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p e3(int i) {
        h.c2(this.B);
        super.I1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        h.c2(this.B);
        super.f1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int g1() {
        h.c2(this.B);
        return super.g1();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p g3(Object obj) {
        this.B.a(obj);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        h.c2(this.B);
        super.h0(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public long h1() {
        h.c2(this.B);
        return super.h1();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p i3(int i) {
        h.c2(this.B);
        super.P1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, java.lang.Iterable
    public Iterator<j> iterator() {
        h.c2(this.B);
        return super.iterator();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j j1(int i) {
        h.c2(this.B);
        return new h(super.j1(i), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p j3(j jVar) {
        h.c2(this.B);
        super.R1(jVar);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        h.c2(this.B);
        super.k0(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public short k1() {
        h.c2(this.B);
        return super.k1();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p k3(j jVar, int i) {
        h.c2(this.B);
        super.z2(jVar, i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public short l1() {
        h.c2(this.B);
        return super.l1();
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p l3(j jVar, int i, int i2) {
        h.c2(this.B);
        super.S1(jVar, i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        h.c2(this.B);
        return super.m0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p m3(byte[] bArr) {
        h.c2(this.B);
        super.U1(bArr);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p n3(byte[] bArr, int i, int i2) {
        h.c2(this.B);
        super.V1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        h.c2(this.B);
        return super.o0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p o3(int i) {
        h.c2(this.B);
        super.W1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p p3(long j) {
        h.c2(this.B);
        super.X1(j);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        h.c2(this.B);
        return super.q0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p
    public p q3(int i) {
        h.c2(this.B);
        super.Y1(i);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        h.c2(this.B);
        return super.s0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.e, io.netty.buffer.j
    public /* bridge */ /* synthetic */ j t1() {
        U2();
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public short u0(int i) {
        h.c2(this.B);
        return super.u0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j u1() {
        h.c2(this.B);
        return new h(super.u1(), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public long v0(int i) {
        h.c2(this.B);
        return super.v0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j v1(int i, int i2) {
        h.c2(this.B);
        return new h(super.v1(i, i2), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public long x0(int i) {
        h.c2(this.B);
        return super.x0(i);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        h.c2(this.B);
        return super.x1(i, scatteringByteChannel, i2);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        h.c2(this.B);
        super.y1(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a
    public String y2(int i, int i2, Charset charset) {
        h.c2(this.B);
        return super.y2(i, i2, charset);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        this.B.a(obj);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        h.c2(this.B);
        super.z1(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.p, io.netty.buffer.a
    public j z2(j jVar, int i) {
        h.c2(this.B);
        super.z2(jVar, i);
        return this;
    }
}
