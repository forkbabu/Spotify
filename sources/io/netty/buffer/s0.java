package io.netty.buffer;

import io.netty.util.o;
import java.nio.ByteOrder;

/* access modifiers changed from: package-private */
public final class s0 extends w0 {
    private i0 b;

    s0(j jVar) {
        super(jVar);
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j J1() {
        return new s0(this.a.J1());
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j K1(int i, int i2) {
        return new s0(this.a.K1(i, i2));
    }

    @Override // io.netty.buffer.j
    public j M1(Object obj) {
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j O() {
        return new s0(this.a.O());
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j Z0(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == a1()) {
            return this;
        } else {
            i0 i0Var = this.b;
            if (i0Var != null) {
                return i0Var;
            }
            i0 i0Var2 = new i0(this);
            this.b = i0Var2;
            return i0Var2;
        }
    }

    @Override // io.netty.buffer.w0, io.netty.util.o
    public boolean d() {
        return false;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j j1(int i) {
        return new s0(this.a.j1(i));
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j t1() {
        return this;
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j u1() {
        return new s0(this.a.u1());
    }

    @Override // io.netty.buffer.w0, io.netty.buffer.j
    public j v1(int i, int i2) {
        return new s0(this.a.v1(i, i2));
    }

    @Override // io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        return this;
    }
}
