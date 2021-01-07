package com.google.firebase.crashlytics.internal.proto;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class CodedOutputStream implements Flushable {
    private final byte[] a;
    private final int b;
    private int c = 0;
    private final OutputStream f;

    /* access modifiers changed from: package-private */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f = outputStream;
        this.a = bArr;
        this.b = bArr.length;
    }

    public static int a(int i, boolean z) {
        return f(i) + 1;
    }

    public static int b(int i, a aVar) {
        return f(i) + e(aVar.e()) + aVar.e();
    }

    public static int d(int i, int i2) {
        return f(i) + (i2 >= 0 ? e(i2) : 10);
    }

    public static int e(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int f(int i) {
        return e((i << 3) | 0);
    }

    public static int g(int i, int i2) {
        return f(i) + e(i2);
    }

    public static int h(int i, long j) {
        return f(i) + ((-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10);
    }

    public static CodedOutputStream i(OutputStream outputStream) {
        return new CodedOutputStream(outputStream, new byte[4096]);
    }

    private void j() {
        OutputStream outputStream = this.f;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f != null) {
            j();
        }
    }

    public void l(int i, boolean z) {
        q((i << 3) | 0);
        o(z ? 1 : 0);
    }

    public void m(int i, a aVar) {
        q((i << 3) | 2);
        q(aVar.e());
        int e = aVar.e();
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i4 >= e) {
            aVar.c(this.a, 0, i3, e);
            this.c += e;
            return;
        }
        aVar.c(this.a, 0, i3, i4);
        int i5 = i4 + 0;
        int i6 = e - i4;
        this.c = this.b;
        j();
        if (i6 <= this.b) {
            aVar.c(this.a, i5, 0, i6);
            this.c = i6;
            return;
        }
        InputStream d = aVar.d();
        long j = (long) i5;
        if (j == d.skip(j)) {
            while (i6 > 0) {
                int min = Math.min(i6, this.b);
                int read = d.read(this.a, 0, min);
                if (read == min) {
                    this.f.write(this.a, 0, read);
                    i6 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public void n(int i, int i2) {
        q((i << 3) | 0);
        if (i2 >= 0) {
            q(i2);
        } else {
            r((long) i2);
        }
    }

    public void o(int i) {
        byte b2 = (byte) i;
        if (this.c == this.b) {
            j();
        }
        byte[] bArr = this.a;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b2;
    }

    public void p(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, this.a, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, this.a, i2, i3);
        int i4 = i3 + 0;
        int i5 = length - i3;
        this.c = this.b;
        j();
        if (i5 <= this.b) {
            System.arraycopy(bArr, i4, this.a, 0, i5);
            this.c = i5;
            return;
        }
        this.f.write(bArr, i4, i5);
    }

    public void q(int i) {
        while ((i & -128) != 0) {
            o((i & 127) | 128);
            i >>>= 7;
        }
        o(i);
    }

    public void r(long j) {
        while ((-128 & j) != 0) {
            o((((int) j) & 127) | 128);
            j >>>= 7;
        }
        o((int) j);
    }

    public void s(int i, int i2) {
        q((i << 3) | i2);
    }

    public void t(int i, int i2) {
        q((i << 3) | 0);
        q(i2);
    }

    public void u(int i, long j) {
        q((i << 3) | 0);
        r(j);
    }
}
