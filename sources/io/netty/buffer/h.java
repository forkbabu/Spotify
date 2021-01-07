package io.netty.buffer;

import io.netty.util.g;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.s;
import io.netty.util.o;
import io.netty.util.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class h extends w0 {
    private static final boolean c;
    private static final b f;
    private final p b;

    static {
        int i = c.b;
        b b2 = c.b(h.class.getName());
        f = b2;
        boolean b3 = s.b("io.netty.leakDetection.acquireAndReleaseOnly", false);
        c = b3;
        if (b2.c()) {
            b2.b("-D{}: {}", "io.netty.leakDetection.acquireAndReleaseOnly", Boolean.valueOf(b3));
        }
    }

    h(j jVar, p pVar) {
        super(jVar);
        this.b = pVar;
    }

    static void c2(p pVar) {
        if (!c) {
            pVar.b();
        }
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        c2(this.b);
        this.a.B1(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int D0(int i) {
        c2(this.b);
        return this.a.D0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j D1(int i, int i2) {
        c2(this.b);
        this.a.D1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j E1(int i, long j) {
        c2(this.b);
        this.a.E1(i, j);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j F1(int i, int i2) {
        c2(this.b);
        this.a.F1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        c2(this.b);
        return this.a.G0(i, i2);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j G1(int i, int i2) {
        c2(this.b);
        this.a.G1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j I1(int i) {
        c2(this.b);
        this.a.I1(i);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j J1() {
        c2(this.b);
        return new h(this.a.J1(), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j K1(int i, int i2) {
        c2(this.b);
        return new h(this.a.K1(i, i2), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j L(int i) {
        c2(this.b);
        this.a.L(i);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public String L1(Charset charset) {
        c2(this.b);
        return this.a.L1(charset);
    }

    @Override // io.netty.buffer.j
    public j M1(Object obj) {
        this.b.a(obj);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j N() {
        c2(this.b);
        this.a.N();
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j O() {
        c2(this.b);
        return new h(this.a.O(), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public ByteBuffer O0() {
        c2(this.b);
        return super.O0();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j P(int i) {
        c2(this.b);
        this.a.P(i);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        c2(this.b);
        return this.a.P0(i, i2);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j P1(int i) {
        c2(this.b);
        this.a.P1(i);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int Q(g gVar) {
        c2(this.b);
        return this.a.Q(gVar);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int Q0() {
        c2(this.b);
        return super.Q0();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int Q1(ScatteringByteChannel scatteringByteChannel, int i) {
        c2(this.b);
        return this.a.Q1(scatteringByteChannel, i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j R1(j jVar) {
        c2(this.b);
        this.a.R1(jVar);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public byte S(int i) {
        c2(this.b);
        return this.a.S(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j S1(j jVar, int i, int i2) {
        c2(this.b);
        this.a.S1(jVar, i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        c2(this.b);
        return this.a.T(i, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public ByteBuffer[] T0() {
        c2(this.b);
        return super.T0();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int T1(int i) {
        c2(this.b);
        return this.a.T1(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j U1(byte[] bArr) {
        c2(this.b);
        this.a.U1(bArr);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j V1(byte[] bArr, int i, int i2) {
        c2(this.b);
        this.a.V1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        c2(this.b);
        return this.a.W0(i, i2);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j W1(int i) {
        c2(this.b);
        this.a.W1(i);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j X1(long j) {
        c2(this.b);
        this.a.X1(j);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j Y1(int i) {
        c2(this.b);
        this.a.Y1(i);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        c2(this.b);
        if (a1() == byteOrder) {
            return this;
        }
        return new h(this.a.Z0(byteOrder), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public byte b1() {
        c2(this.b);
        return super.b1();
    }

    @Override // io.netty.buffer.w0, io.netty.util.o
    public boolean d() {
        boolean d = this.a.d();
        if (d) {
            this.b.close();
        } else {
            this.b.b();
        }
        return d;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        c2(this.b);
        this.a.d0(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int d1(GatheringByteChannel gatheringByteChannel, int i) {
        c2(this.b);
        return this.a.d1(gatheringByteChannel, i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j e1(int i) {
        c2(this.b);
        return this.a.e1(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j f1(byte[] bArr, int i, int i2) {
        c2(this.b);
        this.a.f1(bArr, i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int g1() {
        c2(this.b);
        return super.g1();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        c2(this.b);
        this.a.h0(i, byteBuffer);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public long h1() {
        c2(this.b);
        return super.h1();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j j1(int i) {
        c2(this.b);
        return new h(this.a.j1(i), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        c2(this.b);
        this.a.k0(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public short k1() {
        c2(this.b);
        return super.k1();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public short l1() {
        c2(this.b);
        return super.l1();
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int m0(int i) {
        c2(this.b);
        return this.a.m0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public long o0(int i) {
        c2(this.b);
        return this.a.o0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public short q0(int i) {
        c2(this.b);
        return this.a.q0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public short s0(int i) {
        c2(this.b);
        return this.a.s0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j t1() {
        this.b.b();
        this.a.t1();
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public short u0(int i) {
        c2(this.b);
        return this.a.u0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j u1() {
        c2(this.b);
        return new h(this.a.u1(), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public long v0(int i) {
        c2(this.b);
        return this.a.v0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j v1(int i, int i2) {
        c2(this.b);
        return new h(this.a.v1(i, i2), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j w1(int i, int i2) {
        c2(this.b);
        this.a.w1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public long x0(int i) {
        c2(this.b);
        return this.a.x0(i);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        c2(this.b);
        return this.a.x1(i, scatteringByteChannel, i2);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        c2(this.b);
        this.a.y1(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        this.b.a(obj);
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        c2(this.b);
        this.a.z1(i, byteBuffer);
        return this;
    }
}
