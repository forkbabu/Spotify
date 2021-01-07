package io.netty.buffer;

import io.netty.util.Recycler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
public abstract class x<T> extends e {
    w A;
    private ByteBuffer B;
    private final Recycler.e<x<T>> t;
    protected t<T> u;
    protected long v;
    protected T w;
    protected int x;
    protected int y;
    int z;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.netty.util.Recycler$e<? extends io.netty.buffer.x<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    protected x(Recycler.e<? extends x<T>> eVar, int i) {
        super(i);
        this.t = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public final void A2() {
        long j = this.v;
        if (j >= 0) {
            this.v = -1;
            this.w = null;
            t<T> tVar = this.u;
            tVar.a.h(tVar, j, this.z, this.A);
            this.t.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void C2(t<T> tVar, long j, int i, int i2, int i3, w wVar) {
        this.u = tVar;
        this.v = j;
        this.w = tVar.b;
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.B = null;
        this.A = wVar;
    }

    /* access modifiers changed from: package-private */
    public void D2(t<T> tVar, int i) {
        this.u = tVar;
        this.v = 0;
        this.w = tVar.b;
        this.x = 0;
        this.z = i;
        this.y = i;
        this.B = null;
        this.A = null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer E2() {
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer F2 = F2(this.w);
        this.B = F2;
        return F2;
    }

    /* access modifiers changed from: protected */
    public abstract ByteBuffer F2(T t2);

    /* access modifiers changed from: package-private */
    public final void G2(int i) {
        w2(i);
        B2(1);
        this.a = 0;
        this.b = 0;
        s2();
    }

    @Override // io.netty.buffer.j
    public final int J() {
        return this.y;
    }

    @Override // io.netty.buffer.j
    public final j L(int i) {
        t2();
        t<T> tVar = this.u;
        if (!tVar.c) {
            int i2 = this.y;
            if (i <= i2) {
                if (i < i2) {
                    int i3 = this.z;
                    if (i > (i3 >>> 1)) {
                        if (i3 > 512) {
                            this.y = i;
                            C1(Math.min(this.a, i), Math.min(this.b, i));
                            return this;
                        } else if (i > i3 - 16) {
                            this.y = i;
                            C1(Math.min(this.a, i), Math.min(this.b, i));
                            return this;
                        }
                    }
                }
                return this;
            } else if (i <= this.z) {
                this.y = i;
                return this;
            }
        } else if (i == this.y) {
            return this;
        }
        tVar.a.p(this, i, true);
        return this;
    }

    @Override // io.netty.buffer.j
    public final j N1() {
        return null;
    }

    @Override // io.netty.buffer.j
    public final ByteOrder a1() {
        return ByteOrder.BIG_ENDIAN;
    }

    @Override // io.netty.buffer.j
    public final k t() {
        return this.u.a.a;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final j u1() {
        int i = this.a;
        return b0.E2(this, this, i, this.b - i);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final j v1(int i, int i2) {
        return b0.E2(this, this, i, i2);
    }
}
