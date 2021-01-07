package io.netty.buffer;

import io.netty.util.o;
import java.nio.ByteBuffer;

@Deprecated
public abstract class c extends a {
    protected c(int i) {
        super(i);
    }

    @Override // io.netty.buffer.j
    public ByteBuffer G0(int i, int i2) {
        return P0(i, i2);
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j
    public boolean J0() {
        return N1().J0();
    }

    @Override // io.netty.buffer.j
    public final j M1(Object obj) {
        N1().z(obj);
        return this;
    }

    @Override // io.netty.buffer.j
    public ByteBuffer P0(int i, int i2) {
        return N1().P0(i, i2);
    }

    @Override // io.netty.util.o
    public final boolean d() {
        return N1().d();
    }

    @Override // io.netty.util.o
    public final int n() {
        return N1().n();
    }

    @Override // io.netty.buffer.j
    public final j t1() {
        N1().t1();
        return this;
    }

    @Override // io.netty.buffer.a, io.netty.buffer.j, io.netty.util.o
    public o z(Object obj) {
        N1().z(obj);
        return this;
    }
}
