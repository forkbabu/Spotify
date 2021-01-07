package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.i;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

final class t0 {
    private static final boolean a = PlatformDependent.H();
    public static final /* synthetic */ int b = 0;

    static void a(a aVar, long j, int i, j jVar, int i2, int i3) {
        aVar.t2();
        aVar.o2(i, i3);
        if (jVar == null) {
            throw new NullPointerException("dst");
        } else if (i.a(i2, i3, jVar.J())) {
            throw new IndexOutOfBoundsException(je.p0("dstIndex: ", i2));
        } else if (jVar.F0()) {
            PlatformDependent.d(j, jVar.N0() + ((long) i2), (long) i3);
        } else if (jVar.E0()) {
            PlatformDependent.e(j, jVar.A(), jVar.I() + i2, (long) i3);
        } else {
            jVar.y1(i2, aVar, i, i3);
        }
    }

    static void b(a aVar, long j, int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        aVar.t2();
        aVar.o2(i, remaining);
        if (byteBuffer.remaining() != 0) {
            if (byteBuffer.isDirect()) {
                if (!byteBuffer.isReadOnly()) {
                    PlatformDependent.d(j, PlatformDependent.h(byteBuffer) + ((long) byteBuffer.position()), (long) byteBuffer.remaining());
                    byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                    return;
                }
                throw new ReadOnlyBufferException();
            } else if (byteBuffer.hasArray()) {
                PlatformDependent.e(j, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), (long) byteBuffer.remaining());
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
            } else {
                byteBuffer.put(aVar.O0());
            }
        }
    }

    static void c(a aVar, long j, int i, byte[] bArr, int i2, int i3) {
        aVar.t2();
        aVar.o2(i, i3);
        if (bArr == null) {
            throw new NullPointerException("dst");
        } else if (i.a(i2, i3, bArr.length)) {
            throw new IndexOutOfBoundsException(je.p0("dstIndex: ", i2));
        } else if (i3 != 0) {
            PlatformDependent.e(j, bArr, i2, (long) i3);
        }
    }

    static int d(long j) {
        if (a) {
            int p = PlatformDependent.p(j);
            return PlatformDependent.q ? p : Integer.reverseBytes(p);
        }
        return (PlatformDependent.m(j + 3) & 255) | (PlatformDependent.m(j) << 24) | ((PlatformDependent.m(1 + j) & 255) << 16) | ((PlatformDependent.m(2 + j) & 255) << 8);
    }

    static int e(byte[] bArr, int i) {
        if (a) {
            int q = PlatformDependent.q(bArr, i);
            return PlatformDependent.q ? q : Integer.reverseBytes(q);
        }
        return (PlatformDependent.n(bArr, i + 3) & 255) | (PlatformDependent.n(bArr, i) << 24) | ((PlatformDependent.n(bArr, i + 1) & 255) << 16) | ((PlatformDependent.n(bArr, i + 2) & 255) << 8);
    }

    static int f(long j) {
        if (a) {
            int p = PlatformDependent.p(j);
            return PlatformDependent.q ? Integer.reverseBytes(p) : p;
        }
        return (PlatformDependent.m(j + 3) << 24) | (PlatformDependent.m(j) & 255) | ((PlatformDependent.m(1 + j) & 255) << 8) | ((PlatformDependent.m(2 + j) & 255) << 16);
    }

    static int g(byte[] bArr, int i) {
        if (a) {
            int q = PlatformDependent.q(bArr, i);
            return PlatformDependent.q ? Integer.reverseBytes(q) : q;
        }
        return (PlatformDependent.n(bArr, i + 3) << 24) | (PlatformDependent.n(bArr, i) & 255) | ((PlatformDependent.n(bArr, i + 1) & 255) << 8) | ((PlatformDependent.n(bArr, i + 2) & 255) << 16);
    }

    static long h(long j) {
        if (a) {
            long s = PlatformDependent.s(j);
            return PlatformDependent.q ? s : Long.reverseBytes(s);
        }
        return (((long) PlatformDependent.m(j + 7)) & 255) | (((long) PlatformDependent.m(j)) << 56) | ((((long) PlatformDependent.m(1 + j)) & 255) << 48) | ((((long) PlatformDependent.m(2 + j)) & 255) << 40) | ((((long) PlatformDependent.m(3 + j)) & 255) << 32) | ((((long) PlatformDependent.m(4 + j)) & 255) << 24) | ((((long) PlatformDependent.m(5 + j)) & 255) << 16) | ((((long) PlatformDependent.m(6 + j)) & 255) << 8);
    }

    static long i(byte[] bArr, int i) {
        if (a) {
            long t = PlatformDependent.t(bArr, i);
            return PlatformDependent.q ? t : Long.reverseBytes(t);
        }
        return (((long) PlatformDependent.n(bArr, i + 7)) & 255) | (((long) PlatformDependent.n(bArr, i)) << 56) | ((((long) PlatformDependent.n(bArr, i + 1)) & 255) << 48) | ((((long) PlatformDependent.n(bArr, i + 2)) & 255) << 40) | ((((long) PlatformDependent.n(bArr, i + 3)) & 255) << 32) | ((((long) PlatformDependent.n(bArr, i + 4)) & 255) << 24) | ((((long) PlatformDependent.n(bArr, i + 5)) & 255) << 16) | ((((long) PlatformDependent.n(bArr, i + 6)) & 255) << 8);
    }

    static short j(long j) {
        if (a) {
            short u = PlatformDependent.u(j);
            return PlatformDependent.q ? u : Short.reverseBytes(u);
        }
        return (short) ((PlatformDependent.m(j + 1) & 255) | (PlatformDependent.m(j) << 8));
    }

    static short k(byte[] bArr, int i) {
        if (a) {
            short v = PlatformDependent.v(bArr, i);
            return PlatformDependent.q ? v : Short.reverseBytes(v);
        }
        return (short) ((PlatformDependent.n(bArr, i + 1) & 255) | (PlatformDependent.n(bArr, i) << 8));
    }

    static short l(long j) {
        if (a) {
            short u = PlatformDependent.u(j);
            return PlatformDependent.q ? Short.reverseBytes(u) : u;
        }
        return (short) ((PlatformDependent.m(j + 1) << 8) | (PlatformDependent.m(j) & 255));
    }

    static short m(byte[] bArr, int i) {
        if (!a) {
            return (short) ((PlatformDependent.m((long) i) & 255) | (PlatformDependent.m((long) (i + 1)) << 8));
        }
        short v = PlatformDependent.v(bArr, i);
        return PlatformDependent.q ? Short.reverseBytes(v) : v;
    }

    static void n(a aVar, long j, int i, j jVar, int i2, int i3) {
        aVar.t2();
        aVar.o2(i, i3);
        if (jVar == null) {
            throw new NullPointerException("src");
        } else if (i.a(i2, i3, jVar.J())) {
            throw new IndexOutOfBoundsException(je.p0("srcIndex: ", i2));
        } else if (i3 == 0) {
        } else {
            if (jVar.F0()) {
                PlatformDependent.d(jVar.N0() + ((long) i2), j, (long) i3);
            } else if (jVar.E0()) {
                PlatformDependent.f(jVar.A(), jVar.I() + i2, j, (long) i3);
            } else {
                jVar.d0(i2, aVar, i, i3);
            }
        }
    }

    static void o(a aVar, long j, int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        aVar.t2();
        aVar.o2(i, remaining);
        int remaining2 = byteBuffer.remaining();
        if (remaining2 != 0) {
            if (byteBuffer.isDirect()) {
                PlatformDependent.d(PlatformDependent.h(byteBuffer) + ((long) byteBuffer.position()), j, (long) byteBuffer.remaining());
                byteBuffer.position(byteBuffer.position() + remaining2);
            } else if (byteBuffer.hasArray()) {
                PlatformDependent.f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), j, (long) remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
            } else {
                j d = aVar.t().d(remaining2);
                try {
                    byte[] A = d.A();
                    byteBuffer.get(A, d.I(), remaining2);
                    PlatformDependent.f(A, d.I(), j, (long) remaining2);
                } finally {
                    d.d();
                }
            }
        }
    }

    static void p(long j, int i) {
        if (a) {
            if (!PlatformDependent.q) {
                i = Integer.reverseBytes(i);
            }
            PlatformDependent.W(j, i);
            return;
        }
        PlatformDependent.U(j, (byte) (i >>> 24));
        PlatformDependent.U(1 + j, (byte) (i >>> 16));
        PlatformDependent.U(2 + j, (byte) (i >>> 8));
        PlatformDependent.U(j + 3, (byte) i);
    }

    static void q(byte[] bArr, int i, int i2) {
        if (a) {
            if (!PlatformDependent.q) {
                i2 = Integer.reverseBytes(i2);
            }
            PlatformDependent.X(bArr, i, i2);
            return;
        }
        PlatformDependent.V(bArr, i, (byte) (i2 >>> 24));
        PlatformDependent.V(bArr, i + 1, (byte) (i2 >>> 16));
        PlatformDependent.V(bArr, i + 2, (byte) (i2 >>> 8));
        PlatformDependent.V(bArr, i + 3, (byte) i2);
    }

    static void r(long j, long j2) {
        if (a) {
            if (!PlatformDependent.q) {
                j2 = Long.reverseBytes(j2);
            }
            PlatformDependent.Y(j, j2);
            return;
        }
        PlatformDependent.U(j, (byte) ((int) (j2 >>> 56)));
        PlatformDependent.U(1 + j, (byte) ((int) (j2 >>> 48)));
        PlatformDependent.U(2 + j, (byte) ((int) (j2 >>> 40)));
        PlatformDependent.U(3 + j, (byte) ((int) (j2 >>> 32)));
        PlatformDependent.U(4 + j, (byte) ((int) (j2 >>> 24)));
        PlatformDependent.U(5 + j, (byte) ((int) (j2 >>> 16)));
        PlatformDependent.U(6 + j, (byte) ((int) (j2 >>> 8)));
        PlatformDependent.U(j + 7, (byte) ((int) j2));
    }

    static void s(byte[] bArr, int i, long j) {
        if (a) {
            if (!PlatformDependent.q) {
                j = Long.reverseBytes(j);
            }
            PlatformDependent.Z(bArr, i, j);
            return;
        }
        PlatformDependent.V(bArr, i, (byte) ((int) (j >>> 56)));
        PlatformDependent.V(bArr, i + 1, (byte) ((int) (j >>> 48)));
        PlatformDependent.V(bArr, i + 2, (byte) ((int) (j >>> 40)));
        PlatformDependent.V(bArr, i + 3, (byte) ((int) (j >>> 32)));
        PlatformDependent.V(bArr, i + 4, (byte) ((int) (j >>> 24)));
        PlatformDependent.V(bArr, i + 5, (byte) ((int) (j >>> 16)));
        PlatformDependent.V(bArr, i + 6, (byte) ((int) (j >>> 8)));
        PlatformDependent.V(bArr, i + 7, (byte) ((int) j));
    }

    static void t(long j, int i) {
        if (a) {
            short s = (short) i;
            if (!PlatformDependent.q) {
                s = Short.reverseBytes(s);
            }
            PlatformDependent.a0(j, s);
            return;
        }
        PlatformDependent.U(j, (byte) (i >>> 8));
        PlatformDependent.U(j + 1, (byte) i);
    }

    static void u(byte[] bArr, int i, int i2) {
        if (a) {
            short s = (short) i2;
            if (!PlatformDependent.q) {
                s = Short.reverseBytes(s);
            }
            PlatformDependent.b0(bArr, i, s);
            return;
        }
        PlatformDependent.V(bArr, i, (byte) (i2 >>> 8));
        PlatformDependent.V(bArr, i + 1, (byte) i2);
    }
}
