package defpackage;

import java.nio.ByteBuffer;

/* renamed from: oe  reason: default package */
public final class oe {
    public static long a(ByteBuffer byteBuffer, int i) {
        int l;
        if (i != 1) {
            if (i == 2) {
                l = h7.l(byteBuffer);
            } else if (i == 3) {
                l = h7.m(byteBuffer);
            } else if (i == 4) {
                return h7.n(byteBuffer);
            } else {
                if (i == 8) {
                    return h7.p(byteBuffer);
                }
                throw new RuntimeException("I don't know how to read " + i + " bytes");
            }
            return (long) l;
        }
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        return (long) i2;
    }
}
