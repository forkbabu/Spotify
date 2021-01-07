package io.netty.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

@Deprecated
public class q extends c {
    private final j r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(j jVar) {
        super(jVar.M0());
        int n1 = jVar.n1();
        int Z1 = jVar.Z1();
        if (jVar instanceof q) {
            this.r = ((q) jVar).r;
        } else if (jVar instanceof d) {
            this.r = jVar.N1();
        } else {
            this.r = jVar;
        }
        C1(n1, Z1);
        L0();
        v2();
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        return N1().A();
    }

    @Override // io.netty.buffer.j
    public j B1(int i, byte[] bArr, int i2, int i3) {
        N1().B1(i, bArr, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j D1(int i, int i2) {
        N1().D1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return N1().E0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j E1(int i, long j) {
        N1().E1(i, j);
        return this;
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return N1().F0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j F1(int i, int i2) {
        N1().F1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int I() {
        return N1().I();
    }

    @Override // io.netty.buffer.j
    public boolean I0() {
        return N1().I0();
    }

    @Override // io.netty.buffer.j
    public int J() {
        return N1().J();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j K1(int i, int i2) {
        return N1().K1(i, i2);
    }

    @Override // io.netty.buffer.j
    public j L(int i) {
        N1().L(i);
        return this;
    }

    @Override // io.netty.buffer.j
    public long N0() {
        return N1().N0();
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return this.r;
    }

    @Override // io.netty.buffer.j
    public int Q0() {
        return N1().Q0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public byte S(int i) {
        return N1().S(i);
    }

    @Override // io.netty.buffer.j
    public int T(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return N1().T(i, gatheringByteChannel, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int T1(int i) {
        return N1().T1(i);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer[] W0(int i, int i2) {
        return N1().W0(i, i2);
    }

    @Override // io.netty.buffer.j
    @Deprecated
    public ByteOrder a1() {
        return N1().a1();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public byte c2(int i) {
        return N1().S(i);
    }

    @Override // io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        N1().d0(i, jVar, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int d2(int i) {
        return N1().T1(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public int e2(int i) {
        return N1().m0(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public long f2(int i) {
        return N1().o0(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short g2(int i) {
        return N1().q0(i);
    }

    @Override // io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        N1().h0(i, byteBuffer);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public short h2(int i) {
        return N1().s0(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void i2(int i, int i2) {
        N1().w1(i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void j2(int i, int i2) {
        N1().D1(i, i2);
    }

    @Override // io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        N1().k0(i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void k2(int i, long j) {
        N1().E1(i, j);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.a
    public void l2(int i, int i2) {
        N1().F1(i, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public int m0(int i) {
        return N1().m0(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public long o0(int i) {
        return N1().o0(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short q0(int i) {
        return N1().q0(i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public short s0(int i) {
        return N1().s0(i);
    }

    @Override // io.netty.buffer.j
    public k t() {
        return N1().t();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public j w1(int i, int i2) {
        N1().w1(i, i2);
        return this;
    }

    @Override // io.netty.buffer.j
    public int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return N1().x1(i, scatteringByteChannel, i2);
    }

    @Override // io.netty.buffer.j
    public j y1(int i, j jVar, int i2, int i3) {
        N1().y1(i, jVar, i2, i3);
        return this;
    }

    @Override // io.netty.buffer.j
    public j z1(int i, ByteBuffer byteBuffer) {
        N1().z1(i, byteBuffer);
        return this;
    }
}
