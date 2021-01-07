package com.google.protobuf;

import com.google.protobuf.Utf8;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends e {
    private static final Logger a = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean b = c0.g();
    private static final long c = c0.c();
    public static final /* synthetic */ int d = 0;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super(je.x0("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class b extends CodedOutputStream {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int i) {
            super(null);
            if (i >= 0) {
                int max = Math.max(i, 20);
                this.e = new byte[max];
                this.f = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        public final void W(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & BitmapRenderer.ALPHA_VISIBLE);
            int i4 = i3 + 1;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & BitmapRenderer.ALPHA_VISIBLE);
            int i5 = i4 + 1;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & BitmapRenderer.ALPHA_VISIBLE);
            this.g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & BitmapRenderer.ALPHA_VISIBLE);
            this.h += 4;
        }

        /* access modifiers changed from: package-private */
        public final void X(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.g = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.g = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & BitmapRenderer.ALPHA_VISIBLE);
            int i7 = i6 + 1;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & BitmapRenderer.ALPHA_VISIBLE);
            int i8 = i7 + 1;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & BitmapRenderer.ALPHA_VISIBLE);
            this.g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & BitmapRenderer.ALPHA_VISIBLE);
            this.h += 8;
        }

        /* access modifiers changed from: package-private */
        public final void Y(int i) {
            if (CodedOutputStream.b) {
                long j = CodedOutputStream.c + ((long) this.g);
                long j2 = j;
                while ((i & -128) != 0) {
                    c0.i(this.e, j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                    j2 = 1 + j2;
                }
                c0.i(this.e, j2, (byte) i);
                int i2 = (int) ((1 + j2) - j);
                this.g += i2;
                this.h += i2;
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                this.h++;
                i >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr2[i4] = (byte) i;
            this.h++;
        }

        /* access modifiers changed from: package-private */
        public final void Z(long j) {
            if (CodedOutputStream.b) {
                long j2 = CodedOutputStream.c + ((long) this.g);
                long j3 = j;
                long j4 = j2;
                while ((j3 & -128) != 0) {
                    c0.i(this.e, j4, (byte) ((((int) j3) & 127) | 128));
                    j3 >>>= 7;
                    j4 = 1 + j4;
                }
                c0.i(this.e, j4, (byte) ((int) j3));
                int i = (int) ((1 + j4) - j2);
                this.g += i;
                this.h += i;
                return;
            }
            long j5 = j;
            while ((j5 & -128) != 0) {
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr[i2] = (byte) ((((int) j5) & 127) | 128);
                this.h++;
                j5 >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr2[i3] = (byte) ((int) j5);
            this.h++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int y() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* access modifiers changed from: private */
    public static class c extends CodedOutputStream {
        private final byte[] e;
        private final int f;
        private int g;

        c(byte[] bArr, int i, int i2) {
            super(null);
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.e = bArr;
                    this.g = i;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A(int i, boolean z) {
            T((i << 3) | 0);
            z(z ? (byte) 1 : 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B(byte[] bArr, int i, int i2) {
            T(i2);
            W(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C(int i, ByteString byteString) {
            T((i << 3) | 2);
            D(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void D(ByteString byteString) {
            T(byteString.size());
            byteString.E(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F(int i, int i2) {
            T((i << 3) | 5);
            G(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G(int i) {
            try {
                byte[] bArr = this.e;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) (i & BitmapRenderer.ALPHA_VISIBLE);
                int i4 = i3 + 1;
                this.g = i4;
                bArr[i3] = (byte) ((i >> 8) & BitmapRenderer.ALPHA_VISIBLE);
                int i5 = i4 + 1;
                this.g = i5;
                bArr[i4] = (byte) ((i >> 16) & BitmapRenderer.ALPHA_VISIBLE);
                this.g = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & BitmapRenderer.ALPHA_VISIBLE);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H(int i, long j) {
            T((i << 3) | 1);
            I(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void I(long j) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) (((int) j) & BitmapRenderer.ALPHA_VISIBLE);
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & BitmapRenderer.ALPHA_VISIBLE);
                int i4 = i3 + 1;
                this.g = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & BitmapRenderer.ALPHA_VISIBLE);
                int i5 = i4 + 1;
                this.g = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & BitmapRenderer.ALPHA_VISIBLE);
                int i6 = i5 + 1;
                this.g = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & BitmapRenderer.ALPHA_VISIBLE);
                int i7 = i6 + 1;
                this.g = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & BitmapRenderer.ALPHA_VISIBLE);
                int i8 = i7 + 1;
                this.g = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & BitmapRenderer.ALPHA_VISIBLE);
                this.g = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & BitmapRenderer.ALPHA_VISIBLE);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K(int i, int i2) {
            T((i << 3) | 0);
            if (i2 >= 0) {
                T(i2);
            } else {
                V((long) i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(int i) {
            if (i >= 0) {
                T(i);
            } else {
                V((long) i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(int i, u uVar) {
            T((i << 3) | 2);
            T(uVar.getSerializedSize());
            uVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(u uVar) {
            T(uVar.getSerializedSize());
            uVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(int i, String str) {
            T((i << 3) | 2);
            Q(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(String str) {
            int i = this.g;
            try {
                int t = CodedOutputStream.t(str.length() * 3);
                int t2 = CodedOutputStream.t(str.length());
                if (t2 == t) {
                    int i2 = i + t2;
                    this.g = i2;
                    int d = Utf8.d(str, this.e, i2, y());
                    this.g = i;
                    T((d - i) - t2);
                    this.g = d;
                    return;
                }
                T(Utf8.e(str));
                this.g = Utf8.d(str, this.e, this.g, y());
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.g = i;
                x(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i, int i2) {
            T((i << 3) | i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(int i, int i2) {
            T((i << 3) | 0);
            T(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(int i) {
            if (!CodedOutputStream.b || y() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                long j = CodedOutputStream.c + ((long) this.g);
                while ((i & -128) != 0) {
                    c0.i(this.e, j, (byte) ((i & 127) | 128));
                    this.g++;
                    i >>>= 7;
                    j = 1 + j;
                }
                c0.i(this.e, j, (byte) i);
                this.g++;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i, long j) {
            T((i << 3) | 0);
            V(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(long j) {
            if (!CodedOutputStream.b || y() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                long j2 = CodedOutputStream.c + ((long) this.g);
                while ((j & -128) != 0) {
                    c0.i(this.e, j2, (byte) ((((int) j) & 127) | 128));
                    this.g++;
                    j >>>= 7;
                    j2 = 1 + j2;
                }
                c0.i(this.e, j2, (byte) ((int) j));
                this.g++;
            }
        }

        public final void W(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.e, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // com.google.protobuf.e
        public final void a(byte[] bArr, int i, int i2) {
            W(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int y() {
            return this.f - this.g;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void z(byte b) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class d extends b {
        private final OutputStream i;

        d(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream != null) {
                this.i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void a0() {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        private void c0(int i2) {
            if (this.f - this.g < i2) {
                a0();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void A(int i2, boolean z) {
            c0(11);
            Y((i2 << 3) | 0);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = this.e;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr[i3] = b;
            this.h++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void B(byte[] bArr, int i2, int i3) {
            c0(10);
            Y(i3);
            d0(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void C(int i2, ByteString byteString) {
            T((i2 << 3) | 2);
            D(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void D(ByteString byteString) {
            T(byteString.size());
            byteString.E(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void F(int i2, int i3) {
            c0(14);
            Y((i2 << 3) | 5);
            W(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void G(int i2) {
            c0(4);
            W(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void H(int i2, long j) {
            c0(18);
            Y((i2 << 3) | 1);
            X(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void I(long j) {
            c0(8);
            X(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void K(int i2, int i3) {
            c0(20);
            Y((i2 << 3) | 0);
            if (i3 >= 0) {
                Y(i3);
            } else {
                Z((long) i3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void L(int i2) {
            if (i2 >= 0) {
                c0(10);
                Y(i2);
                return;
            }
            V((long) i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void M(int i2, u uVar) {
            T((i2 << 3) | 2);
            T(uVar.getSerializedSize());
            uVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void N(u uVar) {
            T(uVar.getSerializedSize());
            uVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void P(int i2, String str) {
            T((i2 << 3) | 2);
            Q(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void Q(String str) {
            int i2;
            try {
                int length = str.length() * 3;
                int t = CodedOutputStream.t(length);
                int i3 = t + length;
                int i4 = this.f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int d = Utf8.d(str, bArr, 0, length);
                    T(d);
                    d0(bArr, 0, d);
                    return;
                }
                if (i3 > i4 - this.g) {
                    a0();
                }
                int t2 = CodedOutputStream.t(str.length());
                int i5 = this.g;
                if (t2 == t) {
                    int i6 = i5 + t2;
                    try {
                        this.g = i6;
                        int d2 = Utf8.d(str, this.e, i6, this.f - i6);
                        this.g = i5;
                        i2 = (d2 - i5) - t2;
                        Y(i2);
                        this.g = d2;
                    } catch (Utf8.UnpairedSurrogateException e) {
                        this.h -= this.g - i5;
                        this.g = i5;
                        throw e;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new OutOfSpaceException(e2);
                    }
                } else {
                    i2 = Utf8.e(str);
                    Y(i2);
                    this.g = Utf8.d(str, this.e, this.g, i2);
                }
                this.h += i2;
            } catch (Utf8.UnpairedSurrogateException e3) {
                x(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void R(int i2, int i3) {
            T((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void S(int i2, int i3) {
            c0(20);
            Y((i2 << 3) | 0);
            Y(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void T(int i2) {
            c0(10);
            Y(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void U(int i2, long j) {
            c0(20);
            Y((i2 << 3) | 0);
            Z(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void V(long j) {
            c0(10);
            Z(j);
        }

        @Override // com.google.protobuf.e
        public void a(byte[] bArr, int i2, int i3) {
            d0(bArr, i2, i3);
        }

        public void b0() {
            if (this.g > 0) {
                a0();
            }
        }

        public void d0(byte[] bArr, int i2, int i3) {
            int i4 = this.f;
            int i5 = this.g;
            if (i4 - i5 >= i3) {
                System.arraycopy(bArr, i2, this.e, i5, i3);
                this.g += i3;
                this.h += i3;
                return;
            }
            int i6 = i4 - i5;
            System.arraycopy(bArr, i2, this.e, i5, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.g = this.f;
            this.h += i6;
            a0();
            if (i8 <= this.f) {
                System.arraycopy(bArr, i7, this.e, 0, i8);
                this.g = i8;
            } else {
                this.i.write(bArr, i7, i8);
            }
            this.h += i8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void z(byte b) {
            if (this.g == this.f) {
                a0();
            }
            byte[] bArr = this.e;
            int i2 = this.g;
            this.g = i2 + 1;
            bArr[i2] = b;
            this.h++;
        }
    }

    private CodedOutputStream() {
    }

    public static int d(int i, boolean z) {
        return r(i) + 1;
    }

    public static int e(int i, ByteString byteString) {
        return r(i) + m(byteString.size());
    }

    public static int f(ByteString byteString) {
        return m(byteString.size());
    }

    public static int g(int i, double d2) {
        return r(i) + 8;
    }

    public static int h(int i, int i2) {
        return r(i) + k(i2);
    }

    public static int i(int i, float f) {
        return r(i) + 4;
    }

    public static int j(int i, int i2) {
        return k(i2) + r(i);
    }

    public static int k(int i) {
        if (i >= 0) {
            return t(i);
        }
        return 10;
    }

    public static int l(int i, long j) {
        return r(i) + v(j);
    }

    static int m(int i) {
        return t(i) + i;
    }

    public static int n(int i, u uVar) {
        return r(i) + m(uVar.getSerializedSize());
    }

    public static int o(int i, int i2) {
        return r(i) + t(w(i2));
    }

    public static int p(int i, String str) {
        return q(str) + r(i);
    }

    public static int q(String str) {
        int i;
        try {
            i = Utf8.e(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(o.a).length;
        }
        return m(i);
    }

    public static int r(int i) {
        return t((i << 3) | 0);
    }

    public static int s(int i, int i2) {
        return t(i2) + r(i);
    }

    public static int t(int i) {
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

    public static int u(int i, long j) {
        return v(j) + r(i);
    }

    public static int v(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int w(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void A(int i, boolean z);

    /* access modifiers changed from: package-private */
    public abstract void B(byte[] bArr, int i, int i2);

    public abstract void C(int i, ByteString byteString);

    public abstract void D(ByteString byteString);

    public final void E(int i, double d2) {
        H(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void F(int i, int i2);

    public abstract void G(int i);

    public abstract void H(int i, long j);

    public abstract void I(long j);

    public final void J(int i, float f) {
        F(i, Float.floatToRawIntBits(f));
    }

    public abstract void K(int i, int i2);

    public abstract void L(int i);

    public abstract void M(int i, u uVar);

    public abstract void N(u uVar);

    public final void O(int i, int i2) {
        S(i, w(i2));
    }

    public abstract void P(int i, String str);

    public abstract void Q(String str);

    public abstract void R(int i, int i2);

    public abstract void S(int i, int i2);

    public abstract void T(int i);

    public abstract void U(int i, long j);

    public abstract void V(long j);

    /* access modifiers changed from: package-private */
    public final void x(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(o.a);
        try {
            T(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    public abstract int y();

    public abstract void z(byte b2);

    CodedOutputStream(a aVar) {
    }
}
