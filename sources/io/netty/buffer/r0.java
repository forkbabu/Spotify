package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

final class r0 extends p0 {
    r0(k kVar, int i, int i2) {
        super(kVar, i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p0
    public ByteBuffer C2(int i) {
        return PlatformDependent.b(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.p0
    public void D2(ByteBuffer byteBuffer) {
        PlatformDependent.l(byteBuffer);
    }

    @Override // io.netty.buffer.p0, io.netty.buffer.j
    public j L(int i) {
        t2();
        if (i < 0 || i > M0()) {
            throw new IllegalArgumentException(je.p0("newCapacity: ", i));
        }
        int i2 = this.a;
        int i3 = this.b;
        int J = J();
        if (i > J) {
            G2(PlatformDependent.c0(this.x, i), false);
        } else if (i < J) {
            ByteBuffer byteBuffer = this.x;
            ByteBuffer b = PlatformDependent.b(i);
            if (i2 < i) {
                if (i3 > i) {
                    a2(i);
                } else {
                    i = i3;
                }
                byteBuffer.position(i2).limit(i);
                b.position(i2).limit(i);
                b.put(byteBuffer);
                b.clear();
            } else {
                C1(i, i);
            }
            G2(b, true);
        }
        return this;
    }
}
