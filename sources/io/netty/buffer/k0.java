package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;

public final class k0 extends b {
    public static final k0 d = new k0(PlatformDependent.i());

    public k0(boolean z) {
        super(z);
    }

    @Override // io.netty.buffer.b
    public p a(int i) {
        return b.q(new p(this, true, i));
    }

    @Override // io.netty.buffer.b
    public p b(int i) {
        return b.q(new p(this, false, i));
    }

    @Override // io.netty.buffer.k
    public boolean g() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.b
    public j n(int i, int i2) {
        j jVar;
        if (PlatformDependent.z()) {
            int i3 = t0.b;
            if (PlatformDependent.h0()) {
                jVar = new r0(this, i, i2);
            } else {
                jVar = new p0(this, i, i2);
            }
        } else {
            jVar = new l0(this, i, i2);
        }
        return b.p(jVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.b
    public j o(int i, int i2) {
        return PlatformDependent.z() ? new q0(this, i, i2) : new n0(this, i, i2);
    }
}
