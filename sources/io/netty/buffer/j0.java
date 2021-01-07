package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class j0 {
    private static final k a;
    public static final j b;

    static {
        k0 k0Var = k0.d;
        a = k0Var;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        b = k0Var.i(0, 0);
    }

    public static j a(int i) {
        return a.d(i);
    }

    public static j b(int i) {
        return a.h(i);
    }

    public static j c(j jVar) {
        return new s0(jVar);
    }

    public static j d(ByteBuffer byteBuffer) {
        j jVar;
        if (!byteBuffer.hasRemaining()) {
            return b;
        }
        if (!byteBuffer.isDirect() && byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                jVar = b;
            } else if (position == 0 && remaining == array.length) {
                jVar = e(array);
            } else {
                jVar = e(array).K1(position, remaining);
            }
            return jVar.Z0(byteBuffer.order());
        } else if (PlatformDependent.z()) {
            if (!byteBuffer.isReadOnly()) {
                return new p0(a, byteBuffer, byteBuffer.remaining());
            }
            if (byteBuffer.isDirect()) {
                return new f0(a, byteBuffer);
            }
            return new e0(a, byteBuffer);
        } else if (byteBuffer.isReadOnly()) {
            return new e0(a, byteBuffer);
        } else {
            return new l0(a, byteBuffer, byteBuffer.remaining());
        }
    }

    public static j e(byte[] bArr) {
        if (bArr.length == 0) {
            return b;
        }
        return new n0(a, bArr, bArr.length);
    }
}
