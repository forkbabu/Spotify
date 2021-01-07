package io.netty.buffer;

import io.netty.util.internal.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* access modifiers changed from: package-private */
public abstract class f extends c {
    private final j r;
    private final int s;

    f(j jVar, int i, int i2) {
        super(i2);
        A2(i, i2, jVar);
        if (jVar instanceof f) {
            f fVar = (f) jVar;
            this.r = fVar.r;
            this.s = fVar.s + i;
        } else if (jVar instanceof q) {
            this.r = jVar.N1();
            this.s = i;
        } else {
            this.r = jVar;
            this.s = i;
        }
        a2(i2);
    }

    static void A2(int i, int i2, j jVar) {
        if (i.a(i, i2, jVar.J())) {
            throw new IndexOutOfBoundsException(jVar + ".slice(" + i + ", " + i2 + ')');
        }
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        return N1().A();
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        o2(i, i3);
        N1().B1(i + this.s, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final int B2(int i) {
        return i + this.s;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        o2(i, 4);
        N1().D1(i + this.s, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return N1().E0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        o2(i, 8);
        N1().E1(i + this.s, j);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return N1().F0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        o2(i, 2);
        N1().F1(i + this.s, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        return N1().I() + this.s;
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return N1().I0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j K1(int i, int i2) {
        o2(i, i2);
        return N1().K1(i + this.s, i2);
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    @Override // io.netty.buffer.j
    public long N0() {
        return N1().N0() + ((long) this.s);
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return this.r;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j O() {
        j K1 = N1().K1(this.s, J());
        K1.C1(this.a, this.b);
        return K1;
    }

    @Override // io.netty.buffer.c, io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        o2(i, i2);
        return N1().P0(i + this.s, i2);
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return N1().Q0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        o2(i, 1);
        return N1().S(i + this.s);
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        o2(i, i2);
        return N1().T(i + this.s, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        o2(i, 4);
        return N1().T1(i + this.s);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        o2(i, i2);
        return N1().W0(i + this.s, i2);
    }

    @Override // io.netty.buffer.j
    @Deprecated
    public ByteOrder a1() {
        return N1().a1();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        return N1().S(i + this.s);
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        o2(i, i3);
        N1().d0(i + this.s, jVar, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return N1().T1(i + this.s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return N1().m0(i + this.s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return N1().o0(i + this.s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return N1().q0(i + this.s);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        o2(i, byteBuffer.remaining());
        N1().h0(i + this.s, byteBuffer);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        return N1().s0(i + this.s);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        N1().w1(i + this.s, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        N1().D1(i + this.s, i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        o2(i, i3);
        N1().k0(i + this.s, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        N1().E1(i + this.s, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        N1().F1(i + this.s, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        o2(i, 4);
        return N1().m0(i + this.s);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        o2(i, 8);
        return N1().o0(i + this.s);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        o2(i, 2);
        return N1().q0(i + this.s);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        o2(i, 2);
        return N1().s0(i + this.s);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return N1().t();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        o2(i, 1);
        N1().w1(i + this.s, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        o2(i, i2);
        return N1().x1(i + this.s, scatteringByteChannel, i2);
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        o2(i, i3);
        N1().y1(i + this.s, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        o2(i, byteBuffer.remaining());
        N1().z1(i + this.s, byteBuffer);
        return this;
    }
}
