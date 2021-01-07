package io.netty.buffer;

import io.netty.util.Recycler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class d extends e {
    private final Recycler.e<d> t;
    private a u;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.netty.util.Recycler$e<? extends io.netty.buffer.d> */
    /* JADX WARN: Multi-variable type inference failed */
    d(Recycler.e<? extends d> eVar) {
        super(0);
        this.t = eVar;
    }

    @Override // io.netty.buffer.j
    public byte[] A() {
        return this.u.A();
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e
    public final void A2() {
        a aVar = this.u;
        this.t.a(this);
        aVar.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.netty.buffer.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final <U extends d> U C2(a aVar, j jVar, int i, int i2, int i3) {
        jVar.t1();
        this.u = aVar;
        try {
            w2(i3);
            this.a = i;
            this.b = i2;
            B2(1);
            return this;
        } catch (Throwable th) {
            this.u = null;
            jVar.d();
            throw th;
        }
    }

    public final a D2() {
        return this.u;
    }

    @Override // io.netty.buffer.j
    public boolean E0() {
        return this.u.E0();
    }

    @Override // io.netty.buffer.j
    public boolean F0() {
        return this.u.F0();
    }

    @Override // io.netty.buffer.j
    public final ByteBuffer G0(int i, int i2) {
        return P0(i, i2);
    }

    @Override // io.netty.buffer.j
    public final boolean I0() {
        return this.u.I0();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public boolean J0() {
        return this.u.J0();
    }

    @Override // io.netty.buffer.j
    public j N1() {
        return this.u;
    }

    @Override // io.netty.buffer.j
    public final int Q0() {
        return this.u.Q0();
    }

    @Override // io.netty.buffer.j
    @Deprecated
    public final ByteOrder a1() {
        return this.u.a1();
    }

    @Override // io.netty.buffer.j
    public final k t() {
        return this.u.t();
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public final j u1() {
        int i = this.a;
        return v1(i, this.b - i);
    }
}
