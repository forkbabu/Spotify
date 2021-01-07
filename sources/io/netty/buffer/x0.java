package io.netty.buffer;

import io.netty.util.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class x0 extends p {
    private final p A;

    x0(p pVar) {
        super(pVar.t());
        this.A = pVar;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final byte[] A() {
        return this.A.A();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.e
    public final void A2() {
        this.A.A2();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j C1(int i, int i2) {
        this.A.C1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int D0(int i) {
        return this.A.D0(i);
    }

    @Override // io.netty.buffer.p
    public p D2(boolean z, j jVar) {
        this.A.D2(z, jVar);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final boolean E0() {
        return this.A.E0();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final boolean F0() {
        return this.A.F0();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        return this.A.G0(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: G2 */
    public p L(int i) {
        this.A.L(i);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final int I() {
        return this.A.I();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final boolean I0() {
        return this.A.I0();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final int J() {
        return this.A.J();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public boolean J0() {
        return this.A.J0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j J1() {
        return this.A.J1();
    }

    @Override // io.netty.buffer.p
    public p J2() {
        this.A.J2();
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final boolean K0() {
        return this.A.K0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j K1(int i, int i2) {
        return this.A.K1(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: K2 */
    public p N() {
        this.A.N();
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j L0() {
        this.A.L0();
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public String L1(Charset charset) {
        return this.A.L1(charset);
    }

    @Override // io.netty.buffer.p
    /* renamed from: L2 */
    public p P(int i) {
        this.A.P(i);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int M(j jVar) {
        return this.A.compareTo(jVar);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int M0() {
        return this.A.M0();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final long N0() {
        return this.A.N0();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final j N1() {
        return this.A;
    }

    @Override // io.netty.buffer.p
    /* renamed from: N2 */
    public p d0(int i, j jVar, int i2, int i3) {
        this.A.d0(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j O() {
        return this.A.O();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public ByteBuffer O0() {
        return this.A.O0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int O1() {
        return this.A.O1();
    }

    @Override // io.netty.buffer.p
    /* renamed from: O2 */
    public p h0(int i, ByteBuffer byteBuffer) {
        this.A.h0(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        return this.A.P0(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: P2 */
    public p k0(int i, byte[] bArr, int i2, int i3) {
        this.A.k0(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int Q(g gVar) {
        return this.A.Q(gVar);
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public int Q0() {
        return this.A.Q0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int Q1(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.A.Q1(scatteringByteChannel, i);
    }

    @Override // io.netty.buffer.p
    public final p Q2() {
        this.A.L0();
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: R2 */
    public p f1(byte[] bArr, int i, int i2) {
        this.A.f1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        return this.A.S(i);
    }

    @Override // io.netty.buffer.p
    public final p S2(int i) {
        this.A.p1(i);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return this.A.T(i, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public ByteBuffer[] T0() {
        return this.A.T0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        return this.A.T1(i);
    }

    @Override // io.netty.buffer.p
    public final p T2() {
        this.A.r1();
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: U2 */
    public p t1() {
        this.A.t1();
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: V2 */
    public p w1(int i, int i2) {
        this.A.w1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        return this.A.W0(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: W2 */
    public p y1(int i, j jVar, int i2, int i3) {
        this.A.y1(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: X2 */
    public p z1(int i, ByteBuffer byteBuffer) {
        this.A.z1(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: Y2 */
    public p B1(int i, byte[] bArr, int i2, int i3) {
        this.A.B1(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        return this.A.Z0(byteOrder);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int Z1() {
        return this.A.Z1();
    }

    @Override // io.netty.buffer.p
    public final p Z2(int i, int i2) {
        this.A.C1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final ByteOrder a1() {
        return this.A.a1();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j a2(int i) {
        this.A.a2(i);
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: a3 */
    public p D1(int i, int i2) {
        this.A.D1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte b1() {
        return this.A.b1();
    }

    @Override // io.netty.buffer.p
    /* renamed from: b3 */
    public p E1(int i, long j) {
        this.A.E1(i, j);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final byte c2(int i) {
        return this.A.c2(i);
    }

    @Override // io.netty.buffer.p
    /* renamed from: c3 */
    public p F1(int i, int i2) {
        this.A.F1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.e, io.netty.util.o
    public boolean d() {
        return this.A.d();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        return this.A.d1(gatheringByteChannel, i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final int d2(int i) {
        return this.A.d2(i);
    }

    @Override // io.netty.buffer.p
    /* renamed from: d3 */
    public p G1(int i, int i2) {
        this.A.G1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j e1(int i) {
        return this.A.e1(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final int e2(int i) {
        return this.A.e2(i);
    }

    @Override // io.netty.buffer.p
    /* renamed from: e3 */
    public p I1(int i) {
        this.A.I1(i);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j, java.lang.Object
    public final boolean equals(Object obj) {
        return this.A.equals(obj);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final long f2(int i) {
        return this.A.f2(i);
    }

    @Override // io.netty.buffer.p
    public final int f3(int i) {
        return this.A.f3(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int g1() {
        return this.A.g1();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final short g2(int i) {
        return this.A.g2(i);
    }

    @Override // io.netty.buffer.p
    /* renamed from: g3 */
    public p z(Object obj) {
        this.A.z(obj);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long h1() {
        return this.A.h1();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final short h2(int i) {
        return this.A.h2(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j, java.lang.Object
    public final int hashCode() {
        return this.A.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final void i2(int i, int i2) {
        this.A.i2(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: i3 */
    public p P1(int i) {
        this.A.P1(i);
        return this;
    }

    @Override // io.netty.buffer.p, java.lang.Iterable
    public Iterator<j> iterator() {
        return this.A.iterator();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j j1(int i) {
        return this.A.j1(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final void j2(int i, int i2) {
        this.A.j2(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: j3 */
    public p R1(j jVar) {
        this.A.R1(jVar);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short k1() {
        return this.A.k1();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final void k2(int i, long j) {
        this.A.k2(i, j);
    }

    @Override // io.netty.buffer.p
    /* renamed from: k3 */
    public p z2(j jVar, int i) {
        this.A.z2(jVar, i);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short l1() {
        return this.A.l1();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p, io.netty.buffer.a
    public final void l2(int i, int i2) {
        this.A.l2(i, i2);
    }

    @Override // io.netty.buffer.p
    /* renamed from: l3 */
    public p S1(j jVar, int i, int i2) {
        this.A.S1(jVar, i, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        return this.A.m0(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int m1() {
        return this.A.m1();
    }

    @Override // io.netty.buffer.p
    /* renamed from: m3 */
    public p U1(byte[] bArr) {
        this.A.U1(bArr);
        return this;
    }

    @Override // io.netty.buffer.e, io.netty.util.o
    public final int n() {
        return this.A.n();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final int n1() {
        return this.A.n1();
    }

    @Override // io.netty.buffer.p
    /* renamed from: n3 */
    public p V1(byte[] bArr, int i, int i2) {
        this.A.V1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        return this.A.o0(i);
    }

    @Override // io.netty.buffer.p
    /* renamed from: o3 */
    public p W1(int i) {
        this.A.W1(i);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j p1(int i) {
        this.A.p1(i);
        return this;
    }

    @Override // io.netty.buffer.p
    /* renamed from: p3 */
    public p X1(long j) {
        this.A.X1(j);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        return this.A.q0(i);
    }

    @Override // io.netty.buffer.p
    /* renamed from: q3 */
    public p Y1(int i) {
        this.A.Y1(i);
        return this;
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j
    public j r1() {
        this.A.r1();
        return this;
    }

    @Override // io.netty.buffer.p
    public final p r3(int i) {
        this.A.a2(i);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        return this.A.s0(i);
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public final k t() {
        return this.A.t();
    }

    @Override // io.netty.buffer.p, io.netty.buffer.a, io.netty.buffer.j, java.lang.Object
    public final String toString() {
        return this.A.toString();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short u0(int i) {
        return this.A.u0(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j u1() {
        return this.A.u1();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long v0(int i) {
        return this.A.v0(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j v1(int i, int i2) {
        return this.A.v1(i, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long x0(int i) {
        return this.A.x0(i);
    }

    @Override // io.netty.buffer.p, io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return this.A.x1(i, scatteringByteChannel, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public i0 x2() {
        return this.A.x2();
    }

    @Override // io.netty.buffer.a
    public String y2(int i, int i2, Charset charset) {
        return this.A.y2(i, i2, charset);
    }
}
