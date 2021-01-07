package io.netty.buffer;

import io.netty.util.g;
import io.netty.util.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public abstract class j implements o, Comparable<j> {
    public abstract byte[] A();

    public abstract j B1(int i, byte[] bArr, int i2, int i3);

    public abstract j C1(int i, int i2);

    public abstract int D0(int i);

    public abstract j D1(int i, int i2);

    public abstract boolean E0();

    public abstract j E1(int i, long j);

    public abstract boolean F0();

    public abstract j F1(int i, int i2);

    public abstract ByteBuffer G0(int i, int i2);

    public abstract j G1(int i, int i2);

    public abstract int I();

    public abstract boolean I0();

    public abstract j I1(int i);

    public abstract int J();

    public abstract boolean J0();

    public abstract j J1();

    public abstract boolean K0();

    public abstract j K1(int i, int i2);

    public abstract j L(int i);

    public abstract j L0();

    public abstract String L1(Charset charset);

    /* renamed from: M */
    public abstract int compareTo(j jVar);

    public abstract int M0();

    /* renamed from: M1 */
    public abstract j z(Object obj);

    public abstract j N();

    public abstract long N0();

    public abstract j N1();

    public abstract j O();

    public abstract ByteBuffer O0();

    public abstract int O1();

    public abstract j P(int i);

    public abstract ByteBuffer P0(int i, int i2);

    public abstract j P1(int i);

    public abstract int Q(g gVar);

    public abstract int Q0();

    public abstract int Q1(ScatteringByteChannel scatteringByteChannel, int i);

    public abstract j R1(j jVar);

    public abstract byte S(int i);

    public abstract j S1(j jVar, int i, int i2);

    public abstract int T(int i, GatheringByteChannel gatheringByteChannel, int i2);

    public abstract ByteBuffer[] T0();

    public abstract int T1(int i);

    public abstract j U1(byte[] bArr);

    public abstract j V1(byte[] bArr, int i, int i2);

    public abstract ByteBuffer[] W0(int i, int i2);

    public abstract j W1(int i);

    public abstract j X1(long j);

    public abstract j Y1(int i);

    @Deprecated
    public abstract j Z0(ByteOrder byteOrder);

    public abstract int Z1();

    @Deprecated
    public abstract ByteOrder a1();

    public abstract j a2(int i);

    public abstract byte b1();

    public abstract j d0(int i, j jVar, int i2, int i3);

    public abstract int d1(GatheringByteChannel gatheringByteChannel, int i);

    public abstract j e1(int i);

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    public abstract j f1(byte[] bArr, int i, int i2);

    public abstract int g1();

    public abstract j h0(int i, ByteBuffer byteBuffer);

    public abstract long h1();

    @Override // java.lang.Object
    public abstract int hashCode();

    public abstract j j1(int i);

    public abstract j k0(int i, byte[] bArr, int i2, int i3);

    public abstract short k1();

    public abstract short l1();

    public abstract int m0(int i);

    public abstract int m1();

    public abstract int n1();

    public abstract long o0(int i);

    public abstract j p1(int i);

    public abstract short q0(int i);

    public abstract j r1();

    public abstract short s0(int i);

    public abstract k t();

    public abstract j t1();

    @Override // java.lang.Object
    public abstract String toString();

    public abstract short u0(int i);

    public abstract j u1();

    public abstract long v0(int i);

    public abstract j v1(int i, int i2);

    public abstract j w1(int i, int i2);

    public abstract long x0(int i);

    public abstract int x1(int i, ScatteringByteChannel scatteringByteChannel, int i2);

    public abstract j y1(int i, j jVar, int i2, int i3);

    public abstract j z1(int i, ByteBuffer byteBuffer);
}
