package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class f0 extends e0 {
    private final long w;

    f0(k kVar, ByteBuffer byteBuffer) {
        super(kVar, byteBuffer);
        this.w = PlatformDependent.h(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e0, io.netty.buffer.a
    public byte c2(int i) {
        int i2 = t0.b;
        return PlatformDependent.m(this.w + ((long) i));
    }

    @Override // io.netty.buffer.e0, io.netty.buffer.j
    public j d0(int i, j jVar, int i2, int i3) {
        t2();
        o2(i, i3);
        if (jVar == null) {
            throw new NullPointerException("dst");
        } else if (i2 < 0 || i2 > jVar.J() - i3) {
            throw new IndexOutOfBoundsException(je.p0("dstIndex: ", i2));
        } else {
            if (jVar.F0()) {
                PlatformDependent.d(this.w + ((long) i), jVar.N0() + ((long) i2), (long) i3);
            } else if (jVar.E0()) {
                PlatformDependent.e(this.w + ((long) i), jVar.A(), jVar.I() + i2, (long) i3);
            } else {
                jVar.y1(i2, this, i, i3);
            }
            return this;
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e0, io.netty.buffer.a
    public int d2(int i) {
        return t0.d(this.w + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e0, io.netty.buffer.a
    public long f2(int i) {
        return t0.h(this.w + ((long) i));
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.buffer.e0, io.netty.buffer.a
    public short g2(int i) {
        return t0.j(this.w + ((long) i));
    }

    @Override // io.netty.buffer.e0, io.netty.buffer.j
    public j h0(int i, ByteBuffer byteBuffer) {
        t2();
        o2(i, 1);
        if (byteBuffer != null) {
            int min = Math.min(M0() - i, byteBuffer.remaining());
            ByteBuffer C2 = C2();
            C2.clear().position(i).limit(i + min);
            byteBuffer.put(C2);
            return this;
        }
        throw new NullPointerException("dst");
    }

    @Override // io.netty.buffer.e0, io.netty.buffer.j
    public j k0(int i, byte[] bArr, int i2, int i3) {
        t2();
        o2(i, i3);
        if (bArr == null) {
            throw new NullPointerException("dst");
        } else if (i2 < 0 || i2 > bArr.length - i3) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)));
        } else {
            if (i3 != 0) {
                PlatformDependent.e(this.w + ((long) i), bArr, i2, (long) i3);
            }
            return this;
        }
    }
}
