package io.netty.buffer;

import io.netty.util.p;
import java.nio.ByteOrder;

final class h0 extends x0 {
    private final p B;

    h0(p pVar, p pVar2) {
        super(pVar);
        this.B = pVar2;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j J1() {
        return new g0(super.J1(), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j K1(int i, int i2) {
        return new g0(super.K1(i, i2), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j O() {
        return new g0(super.O(), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        this.B.b();
        if (a1() == byteOrder) {
            return this;
        }
        return new g0(super.Z0(byteOrder), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.e, io.netty.util.o
    public boolean d() {
        boolean d = super.d();
        if (d) {
            this.B.close();
        }
        return d;
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j j1(int i) {
        return new g0(super.j1(i), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j u1() {
        return new g0(super.u1(), this.B);
    }

    @Override // io.netty.buffer.x0, io.netty.buffer.a, io.netty.buffer.j
    public j v1(int i, int i2) {
        return new g0(super.v1(i, i2), this.B);
    }
}
