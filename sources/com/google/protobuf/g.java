package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.u;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class g {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private int h;
    private int i = Integer.MAX_VALUE;
    private int j;

    private g(byte[] bArr, int i2, int i3, boolean z) {
        this.a = bArr;
        this.c = i3 + i2;
        this.e = i2;
        this.h = -i2;
        this.f = null;
        this.b = z;
    }

    private void D() {
        int i2 = this.c + this.d;
        this.c = i2;
        int i3 = this.h + i2;
        int i4 = this.i;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.d = i5;
            this.c = i2 - i5;
            return;
        }
        this.d = 0;
    }

    private void E(int i2) {
        if (!H(i2)) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private boolean H(int i2) {
        int i3 = this.e;
        int i4 = i3 + i2;
        int i5 = this.c;
        if (i4 > i5) {
            if (this.h + i3 + i2 <= this.i && this.f != null) {
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.a;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.h += i3;
                    this.c -= i3;
                    this.e = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.a;
                int i6 = this.c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.a.length) {
                    throw new IllegalStateException(je.q0("InputStream#read(byte[]) returned invalid result: ", read, "\nThe InputStream implementation is buggy."));
                } else if (read > 0) {
                    this.c += read;
                    if ((this.h + i2) - 67108864 <= 0) {
                        D();
                        if (this.c >= i2) {
                            return true;
                        }
                        return H(i2);
                    }
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        throw new IllegalStateException(je.q0("refillBuffer() called when ", i2, " bytes were already available in buffer"));
    }

    public static g c(InputStream inputStream) {
        return new g(inputStream, 4096);
    }

    public static g d(byte[] bArr, int i2, int i3) {
        g gVar = new g(bArr, i2, i3, false);
        try {
            gVar.g(i3);
            return gVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    static g e(byte[] bArr, int i2, int i3, boolean z) {
        g gVar = new g(bArr, i2, i3, z);
        try {
            gVar.g(i3);
            return gVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private byte[] r(int i2) {
        if (i2 > 0) {
            int i3 = this.h;
            int i4 = this.e;
            int i5 = i3 + i4 + i2;
            if (i5 <= 67108864) {
                int i6 = this.i;
                if (i5 <= i6) {
                    InputStream inputStream = this.f;
                    if (inputStream != null) {
                        int i7 = this.c;
                        int i8 = i7 - i4;
                        this.h = i3 + i7;
                        this.e = 0;
                        this.c = 0;
                        int i9 = i2 - i8;
                        if (i9 < 4096 || i9 <= inputStream.available()) {
                            byte[] bArr = new byte[i2];
                            System.arraycopy(this.a, i4, bArr, 0, i8);
                            while (i8 < i2) {
                                int read = this.f.read(bArr, i8, i2 - i8);
                                if (read != -1) {
                                    this.h += read;
                                    i8 += read;
                                } else {
                                    throw InvalidProtocolBufferException.e();
                                }
                            }
                            return bArr;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (i9 > 0) {
                            int min = Math.min(i9, 4096);
                            byte[] bArr2 = new byte[min];
                            int i10 = 0;
                            while (i10 < min) {
                                int read2 = this.f.read(bArr2, i10, min - i10);
                                if (read2 != -1) {
                                    this.h += read2;
                                    i10 += read2;
                                } else {
                                    throw InvalidProtocolBufferException.e();
                                }
                            }
                            i9 -= min;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i2];
                        System.arraycopy(this.a, i4, bArr3, 0, i8);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            byte[] bArr4 = (byte[]) it.next();
                            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
                            i8 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                G((i6 - i3) - i4);
                throw InvalidProtocolBufferException.e();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        } else if (i2 == 0) {
            return o.b;
        } else {
            throw InvalidProtocolBufferException.c();
        }
    }

    public static int v(int i2, InputStream inputStream) {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i3 |= (read & 127) << i4;
                if ((read & 128) == 0) {
                    return i3;
                }
                i4 += 7;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
        while (i4 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.e();
            } else if ((read2 & 128) == 0) {
                return i3;
            } else {
                i4 += 7;
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public String A() {
        byte[] bArr;
        int u = u();
        int i2 = this.e;
        int i3 = this.c;
        if (u <= i3 - i2 && u > 0) {
            bArr = this.a;
            this.e = i2 + u;
        } else if (u == 0) {
            return "";
        } else {
            if (u <= i3) {
                E(u);
                bArr = this.a;
                this.e = u + 0;
            } else {
                bArr = r(u);
            }
            i2 = 0;
        }
        if (Utf8.g(bArr, i2, i2 + u)) {
            return new String(bArr, i2, u, o.a);
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public int B() {
        boolean z = true;
        if (this.e != this.c || H(1)) {
            z = false;
        }
        if (z) {
            this.g = 0;
            return 0;
        }
        int u = u();
        this.g = u;
        if ((u >>> 3) != 0) {
            return u;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public long C() {
        return w();
    }

    public boolean F(int i2) {
        int B;
        int i3 = i2 & 7;
        if (i3 == 0) {
            int i4 = this.c;
            int i5 = this.e;
            if (i4 - i5 >= 10) {
                byte[] bArr = this.a;
                int i6 = 0;
                while (true) {
                    if (i6 >= 10) {
                        break;
                    }
                    int i7 = i5 + 1;
                    if (bArr[i5] >= 0) {
                        this.e = i7;
                        break;
                    }
                    i6++;
                    i5 = i7;
                }
            }
            for (int i8 = 0; i8 < 10; i8++) {
                if (q() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.b();
        } else if (i3 == 1) {
            G(8);
            return true;
        } else if (i3 == 2) {
            G(u());
            return true;
        } else if (i3 == 3) {
            do {
                B = B();
                if (B == 0) {
                    break;
                }
            } while (F(B));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                G(4);
                return true;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    public void G(int i2) {
        int i3 = this.c;
        int i4 = this.e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.e = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.h;
            int i6 = i5 + i4 + i2;
            int i7 = this.i;
            if (i6 <= i7) {
                int i8 = i3 - i4;
                this.e = i3;
                E(1);
                while (true) {
                    int i9 = i2 - i8;
                    int i10 = this.c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.e = i10;
                        E(1);
                    } else {
                        this.e = i9;
                        return;
                    }
                }
            } else {
                G((i7 - i5) - i4);
                throw InvalidProtocolBufferException.e();
            }
        } else {
            throw InvalidProtocolBufferException.c();
        }
    }

    public void a(int i2) {
        if (this.g != i2) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public int b() {
        int i2 = this.i;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.h + this.e);
    }

    public void f(int i2) {
        this.i = i2;
        D();
    }

    public int g(int i2) {
        if (i2 >= 0) {
            int i3 = this.h + this.e + i2;
            int i4 = this.i;
            if (i3 <= i4) {
                this.i = i3;
                D();
                return i4;
            }
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.c();
    }

    public boolean h() {
        return w() != 0;
    }

    public ByteString i() {
        int u = u();
        int i2 = this.c;
        int i3 = this.e;
        if (u <= i2 - i3 && u > 0) {
            boolean z = this.b;
            ByteString i4 = ByteString.i(this.a, i3, u);
            this.e += u;
            return i4;
        } else if (u == 0) {
            return ByteString.a;
        } else {
            byte[] r = r(u);
            ByteString byteString = ByteString.a;
            return new ByteString.LiteralByteString(r);
        }
    }

    public double j() {
        return Double.longBitsToDouble(t());
    }

    public int k() {
        return u();
    }

    public float l() {
        return Float.intBitsToFloat(s());
    }

    public int m() {
        return u();
    }

    public long n() {
        return w();
    }

    public <T extends u> T o(x<T> xVar, k kVar) {
        int u = u();
        if (this.j < 100) {
            int g2 = g(u);
            this.j++;
            T d2 = xVar.d(this, kVar);
            a(0);
            this.j--;
            this.i = g2;
            D();
            return d2;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void p(u.a aVar, k kVar) {
        int u = u();
        if (this.j < 100) {
            int g2 = g(u);
            this.j++;
            aVar.mergeFrom(this, kVar);
            a(0);
            this.j--;
            this.i = g2;
            D();
            return;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public byte q() {
        if (this.e == this.c) {
            E(1);
        }
        byte[] bArr = this.a;
        int i2 = this.e;
        this.e = i2 + 1;
        return bArr[i2];
    }

    public int s() {
        int i2 = this.e;
        if (this.c - i2 < 4) {
            E(4);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public long t() {
        int i2 = this.e;
        if (this.c - i2 < 8) {
            E(8);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int u() {
        /*
            r5 = this;
            int r0 = r5.e
            int r1 = r5.c
            if (r1 != r0) goto L_0x0007
            goto L_0x006a
        L_0x0007:
            byte[] r2 = r5.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.e = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0018
            goto L_0x006a
        L_0x0018:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0070
        L_0x0024:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r1 = r3
            goto L_0x0070
        L_0x0031:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0070
        L_0x003f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0070
        L_0x006a:
            long r0 = r5.x()
            int r1 = (int) r0
            return r1
        L_0x0070:
            r5.e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.u():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long w() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.w():long");
    }

    /* access modifiers changed from: package-private */
    public long x() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte q = q();
            j2 |= ((long) (q & Byte.MAX_VALUE)) << i2;
            if ((q & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public int y() {
        int u = u();
        return (-(u & 1)) ^ (u >>> 1);
    }

    public String z() {
        int u = u();
        int i2 = this.c;
        if (u <= i2 - this.e && u > 0) {
            String str = new String(this.a, this.e, u, o.a);
            this.e += u;
            return str;
        } else if (u == 0) {
            return "";
        } else {
            if (u > i2) {
                return new String(r(u), o.a);
            }
            E(u);
            String str2 = new String(this.a, this.e, u, o.a);
            this.e += u;
            return str2;
        }
    }

    private g(InputStream inputStream, int i2) {
        this.a = new byte[i2];
        this.e = 0;
        this.h = 0;
        this.f = inputStream;
        this.b = false;
    }
}
