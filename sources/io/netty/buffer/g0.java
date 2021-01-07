package io.netty.buffer;

import io.netty.util.o;
import io.netty.util.p;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
public final class g0 extends w0 {
    private final p b;

    g0(j jVar, p pVar) {
        super(jVar);
        this.b = pVar;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j J1() {
        return new g0(super.J1(), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j K1(int i, int i2) {
        return new g0(super.K1(i, i2), this.b);
    }

    @Override // io.netty.buffer.j
    public j M1(Object obj) {
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j O() {
        return new g0(super.O(), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        this.b.b();
        if (a1() == byteOrder) {
            return this;
        }
        return new g0(super.Z0(byteOrder), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.util.o
    public boolean d() {
        boolean d = super.d();
        if (d) {
            this.b.close();
        }
        return d;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j j1(int i) {
        return new g0(super.j1(i), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j u1() {
        return new g0(super.u1(), this.b);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j v1(int i, int i2) {
        return new g0(super.v1(i, i2), this.b);
    }

    @Override // io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        return this;
    }
}
