package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
public abstract class g extends i0 {
    private final boolean c;
    private final a f;

    g(a aVar) {
        super(aVar);
        this.f = aVar;
        this.c = PlatformDependent.q != (a1() == ByteOrder.BIG_ENDIAN) ? false : true;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final int D0(int i) {
        return q0(i) & 65535;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final j D1(int i, int i2) {
        this.f.o2(i, 4);
        a aVar = this.f;
        if (!this.c) {
            i2 = Integer.reverseBytes(i2);
        }
        f2(aVar, i, i2);
        return this;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final j E1(int i, long j) {
        a aVar = this.f;
        aVar.t2();
        aVar.o2(i, 8);
        a aVar2 = this.f;
        if (!this.c) {
            j = Long.reverseBytes(j);
        }
        g2(aVar2, i, j);
        return this;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final j F1(int i, int i2) {
        this.f.o2(i, 2);
        a aVar = this.f;
        short s = (short) i2;
        if (!this.c) {
            s = Short.reverseBytes(s);
        }
        h2(aVar, i, s);
        return this;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final int T1(int i) {
        this.f.o2(i, 4);
        int c2 = c2(this.f, i);
        return this.c ? c2 : Integer.reverseBytes(c2);
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final j W1(int i) {
        this.f.P(4);
        a aVar = this.f;
        int i2 = aVar.b;
        if (!this.c) {
            i = Integer.reverseBytes(i);
        }
        f2(aVar, i2, i);
        this.f.b += 4;
        return this;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final j X1(long j) {
        this.f.P(8);
        a aVar = this.f;
        int i = aVar.b;
        if (!this.c) {
            j = Long.reverseBytes(j);
        }
        g2(aVar, i, j);
        this.f.b += 8;
        return this;
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final j Y1(int i) {
        this.f.P(2);
        a aVar = this.f;
        int i2 = aVar.b;
        short s = (short) i;
        if (!this.c) {
            s = Short.reverseBytes(s);
        }
        h2(aVar, i2, s);
        this.f.b += 2;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract int c2(a aVar, int i);

    /* access modifiers changed from: protected */
    public abstract long d2(a aVar, int i);

    /* access modifiers changed from: protected */
    public abstract short e2(a aVar, int i);

    /* access modifiers changed from: protected */
    public abstract void f2(a aVar, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void g2(a aVar, int i, long j);

    /* access modifiers changed from: protected */
    public abstract void h2(a aVar, int i, short s);

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final long o0(int i) {
        a aVar = this.f;
        aVar.t2();
        aVar.o2(i, 8);
        long d2 = d2(this.f, i);
        return this.c ? d2 : Long.reverseBytes(d2);
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final short q0(int i) {
        this.f.o2(i, 2);
        short e2 = e2(this.f, i);
        return this.c ? e2 : Short.reverseBytes(e2);
    }

    @Override // io.netty.buffer.i0, io.netty.buffer.j
    public final long v0(int i) {
        return ((long) T1(i)) & 4294967295L;
    }
}
