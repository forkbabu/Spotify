package okio;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class e implements g, f, Cloneable, ByteChannel {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    t a;
    long b;

    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            e eVar = e.this;
            if (eVar.b > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.lang.Object
        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return e.this.read(bArr, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public int B(q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        t tVar;
        int i4;
        t tVar2 = this.a;
        int i5 = -2;
        if (tVar2 != null) {
            byte[] bArr = tVar2.a;
            int i6 = tVar2.b;
            int i7 = tVar2.c;
            int[] iArr = qVar.b;
            t tVar3 = tVar2;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (tVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = (i11 * -1) + i12;
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & 255) != iArr[i12]) {
                            return i9;
                        }
                        boolean z2 = i16 == i14;
                        if (i15 == i7) {
                            t tVar4 = tVar3.f;
                            i4 = tVar4.b;
                            byte[] bArr2 = tVar4.a;
                            i3 = tVar4.c;
                            if (tVar4 != tVar2) {
                                tVar = tVar4;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                tVar = null;
                            }
                        } else {
                            i3 = i7;
                            i4 = i15;
                            tVar = tVar3;
                        }
                        if (z2) {
                            i = iArr[i16];
                            i2 = i4;
                            i7 = i3;
                            tVar3 = tVar;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i12 = i16;
                        tVar3 = tVar;
                    }
                } else {
                    int i17 = i6 + 1;
                    int i18 = bArr[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (i18 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i17 == i7) {
                                tVar3 = tVar3.f;
                                i2 = tVar3.b;
                                bArr = tVar3.a;
                                i7 = tVar3.c;
                                if (tVar3 == tVar2) {
                                    tVar3 = null;
                                }
                            } else {
                                i2 = i17;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            return z ? i5 : i9;
        } else if (z) {
            return -2;
        } else {
            return qVar.indexOf(ByteString.f);
        }
    }

    @Override // okio.g
    public byte[] B0(long j) {
        y.b(this.b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(je.t0("byteCount > Integer.MAX_VALUE: ", j));
    }

    public final ByteString C() {
        long j = this.b;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                return ByteString.f;
            }
            return new SegmentedByteString(this, i);
        }
        StringBuilder V0 = je.V0("size > Integer.MAX_VALUE: ");
        V0.append(this.b);
        throw new IllegalArgumentException(V0.toString());
    }

    /* access modifiers changed from: package-private */
    public t D(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        t tVar = this.a;
        if (tVar == null) {
            t b2 = u.b();
            this.a = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        t tVar2 = tVar.g;
        if (tVar2.c + i <= 8192 && tVar2.e) {
            return tVar2;
        }
        t b3 = u.b();
        tVar2.b(b3);
        return b3;
    }

    @Override // okio.g
    public short E0() {
        short readShort = readShort();
        Charset charset = y.a;
        int i = readShort & 65535;
        return (short) (((i & BitmapRenderer.ALPHA_VISIBLE) << 8) | ((65280 & i) >>> 8));
    }

    @Override // okio.g
    public String E1(Charset charset) {
        try {
            return r(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public e F(ByteString byteString) {
        if (byteString != null) {
            byteString.D(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public e G(byte[] bArr) {
        if (bArr != null) {
            I(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public e I(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            y.b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                t D = D(1);
                int min = Math.min(i3 - i, 8192 - D.c);
                System.arraycopy(bArr, i, D.a, D.c, min);
                i += min;
                D.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public e J(int i) {
        t D = D(1);
        byte[] bArr = D.a;
        int i2 = D.c;
        D.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // okio.g
    public e L() {
        return this;
    }

    @Override // okio.g
    public void L0(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: M */
    public e N0(long j) {
        if (j == 0) {
            J(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                b0("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        t D = D(i);
        byte[] bArr = D.a;
        int i2 = D.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        D.c += i;
        this.b += (long) i;
        return this;
    }

    /* renamed from: O */
    public e J1(long j) {
        if (j == 0) {
            J(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        t D = D(numberOfTrailingZeros);
        byte[] bArr = D.a;
        int i = D.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        D.c += numberOfTrailingZeros;
        this.b += (long) numberOfTrailingZeros;
        return this;
    }

    public e Q(int i) {
        t D = D(4);
        byte[] bArr = D.a;
        int i2 = D.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & BitmapRenderer.ALPHA_VISIBLE);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & BitmapRenderer.ALPHA_VISIBLE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
        bArr[i5] = (byte) (i & BitmapRenderer.ALPHA_VISIBLE);
        D.c = i5 + 1;
        this.b += 4;
        return this;
    }

    @Override // okio.g
    public long Q0(byte b2) {
        return m(b2, 0, Long.MAX_VALUE);
    }

    @Override // okio.g
    public long R(ByteString byteString) {
        return p(byteString, 0);
    }

    @Override // okio.g
    public int R1() {
        return y.c(readInt());
    }

    @Override // okio.f
    public f S() {
        return this;
    }

    public e U(int i) {
        t D = D(2);
        byte[] bArr = D.a;
        int i2 = D.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
        bArr[i3] = (byte) (i & BitmapRenderer.ALPHA_VISIBLE);
        D.c = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // okio.g
    public String V(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long m = m((byte) 10, 0, j2);
            if (m != -1) {
                return w(m);
            }
            if (j2 < this.b && g(j2 - 1) == 13 && g(j2) == 10) {
                return w(j2);
            }
            e eVar = new e();
            f(eVar, 0, Math.min(32L, this.b));
            StringBuilder V0 = je.V0("\\n not found: limit=");
            V0.append(Math.min(this.b, j));
            V0.append(" content=");
            V0.append(eVar.q().p());
            V0.append((char) 8230);
            throw new EOFException(V0.toString());
        }
        throw new IllegalArgumentException(je.t0("limit < 0: ", j));
    }

    public e W(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            throw new IllegalAccessError(je.p0("beginIndex < 0: ", i));
        } else if (i2 < i) {
            throw new IllegalArgumentException(je.s0("endIndex < beginIndex: ", i2, " < ", i));
        } else if (i2 > str.length()) {
            StringBuilder W0 = je.W0("endIndex > string.length: ", i2, " > ");
            W0.append(str.length());
            throw new IllegalArgumentException(W0.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(y.a)) {
            c0(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            I(bytes, 0, bytes.length);
            return this;
        }
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f Y1(ByteString byteString) {
        F(byteString);
        return this;
    }

    @Override // okio.g
    public ByteString Z0(long j) {
        return new ByteString(B0(j));
    }

    public final void b() {
        try {
            skip(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public e b0(String str) {
        c0(str, 0, str.length());
        return this;
    }

    @Override // okio.g, okio.f
    public e c() {
        return this;
    }

    public e c0(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException(je.p0("beginIndex < 0: ", i));
        } else if (i2 < i) {
            throw new IllegalArgumentException(je.s0("endIndex < beginIndex: ", i2, " < ", i));
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    t D = D(1);
                    byte[] bArr = D.a;
                    int i3 = D.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    int i5 = D.c;
                    int i6 = (i3 + i) - i5;
                    D.c = i5 + i6;
                    this.b += (long) i6;
                } else {
                    if (charAt2 < 2048) {
                        J((charAt2 >> 6) | 192);
                        J((charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        J((charAt2 >> '\f') | 224);
                        J(((charAt2 >> 6) & 63) | 128);
                        J((charAt2 & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            J(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            J((i8 >> 18) | 240);
                            J(((i8 >> 12) & 63) | 128);
                            J(((i8 >> 6) & 63) | 128);
                            J((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder W0 = je.W0("endIndex > string.length: ", i2, " > ");
            W0.append(str.length());
            throw new IllegalArgumentException(W0.toString());
        }
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            eVar.l0(this, j);
            return j;
        } else {
            throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        e eVar = new e();
        if (this.b != 0) {
            t c2 = this.a.c();
            eVar.a = c2;
            c2.g = c2;
            c2.f = c2;
            t tVar = this.a;
            while (true) {
                tVar = tVar.f;
                if (tVar == this.a) {
                    break;
                }
                eVar.a.g.b(tVar.c());
            }
            eVar.b = this.b;
        }
        return eVar;
    }

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long d() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        t tVar = this.a.g;
        int i = tVar.c;
        return (i >= 8192 || !tVar.e) ? j : j - ((long) (i - tVar.b));
    }

    @Override // okio.g
    public long d2(v vVar) {
        long j = this.b;
        if (j > 0) {
            ((e) vVar).l0(this, j);
        }
        return j;
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f e0(String str) {
        b0(str);
        return this;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j = this.b;
        if (j != eVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        t tVar = this.a;
        t tVar2 = eVar.a;
        int i = tVar.b;
        int i2 = tVar2.b;
        while (j2 < this.b) {
            long min = (long) Math.min(tVar.c - i, tVar2.c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (tVar.a[i] != tVar2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == tVar.c) {
                tVar = tVar.f;
                i = tVar.b;
            }
            if (i2 == tVar2.c) {
                tVar2 = tVar2.f;
                i2 = tVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final e f(e eVar, long j, long j2) {
        if (eVar != null) {
            y.b(this.b, j, j2);
            if (j2 == 0) {
                return this;
            }
            eVar.b += j2;
            t tVar = this.a;
            while (true) {
                int i = tVar.c;
                int i2 = tVar.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                tVar = tVar.f;
            }
            while (j2 > 0) {
                t c2 = tVar.c();
                int i3 = (int) (((long) c2.b) + j);
                c2.b = i3;
                c2.c = Math.min(i3 + ((int) j2), c2.c);
                t tVar2 = eVar.a;
                if (tVar2 == null) {
                    c2.g = c2;
                    c2.f = c2;
                    eVar.a = c2;
                } else {
                    tVar2.g.b(c2);
                }
                j2 -= (long) (c2.c - c2.b);
                tVar = tVar.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public e f0(int i) {
        if (i < 128) {
            J(i);
        } else if (i < 2048) {
            J((i >> 6) | 192);
            J((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                J((i >> 12) | 224);
                J(((i >> 6) & 63) | 128);
                J((i & 63) | 128);
            } else {
                J(63);
            }
        } else if (i <= 1114111) {
            J((i >> 18) | 240);
            J(((i >> 12) & 63) | 128);
            J(((i >> 6) & 63) | 128);
            J((i & 63) | 128);
        } else {
            StringBuilder V0 = je.V0("Unexpected code point: ");
            V0.append(Integer.toHexString(i));
            throw new IllegalArgumentException(V0.toString());
        }
        return this;
    }

    @Override // okio.f, okio.v, java.io.Flushable
    public void flush() {
    }

    public final byte g(long j) {
        int i;
        y.b(this.b, j, 1);
        long j2 = this.b;
        if (j2 - j > j) {
            t tVar = this.a;
            while (true) {
                int i2 = tVar.c;
                int i3 = tVar.b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return tVar.a[i3 + ((int) j)];
                }
                j -= j3;
                tVar = tVar.f;
            }
        } else {
            long j4 = j - j2;
            t tVar2 = this.a;
            do {
                tVar2 = tVar2.g;
                int i4 = tVar2.c;
                i = tVar2.b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return tVar2.a[i + ((int) j4)];
        }
    }

    @Override // okio.g
    public boolean g0(long j, ByteString byteString) {
        int x = byteString.x();
        if (j < 0 || x < 0 || this.b - j < ((long) x) || byteString.x() - 0 < x) {
            return false;
        }
        for (int i = 0; i < x; i++) {
            if (g(((long) i) + j) != byteString.n(0 + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        t tVar = this.a;
        if (tVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = tVar.c;
            for (int i3 = tVar.b; i3 < i2; i3++) {
                i = (i * 31) + tVar.a[i3];
            }
            tVar = tVar.f;
        } while (tVar != this.a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.g
    public byte[] j1() {
        try {
            return B0(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.w
    public x k() {
        return x.d;
    }

    @Override // okio.f
    public f k1(int i) {
        Q(y.c(i));
        return this;
    }

    @Override // okio.g
    public long k2() {
        byte b2;
        int i;
        int i2;
        if (this.b != 0) {
            int i3 = 0;
            boolean z = false;
            long j = 0;
            do {
                t tVar = this.a;
                byte[] bArr = tVar.a;
                int i4 = tVar.b;
                int i5 = tVar.c;
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    b2 = bArr[i4];
                    if (b2 < 48 || b2 > 57) {
                        if (b2 >= 97 && b2 <= 102) {
                            i2 = b2 - 97;
                        } else if (b2 < 65 || b2 > 70) {
                            break;
                        } else {
                            i2 = b2 - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = b2 - 48;
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i);
                        i4++;
                        i3++;
                    } else {
                        e O = new e().J1(j);
                        O.J(b2);
                        StringBuilder V0 = je.V0("Number too large: ");
                        V0.append(O.s());
                        throw new NumberFormatException(V0.toString());
                    }
                }
                if (i3 != 0) {
                    z = true;
                    if (i4 == i5) {
                        this.a = tVar.a();
                        u.a(tVar);
                    } else {
                        tVar.b = i4;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    StringBuilder V02 = je.V0("Expected leading [0-9a-fA-F] character but was 0x");
                    V02.append(Integer.toHexString(b2));
                    throw new NumberFormatException(V02.toString());
                }
            } while (this.a != null);
            this.b -= (long) i3;
            return j;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.v
    public void l0(e eVar, long j) {
        t tVar;
        int i;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            y.b(eVar.b, 0, j);
            while (j > 0) {
                t tVar2 = eVar.a;
                int i2 = 0;
                if (j < ((long) (tVar2.c - tVar2.b))) {
                    t tVar3 = this.a;
                    t tVar4 = tVar3 != null ? tVar3.g : null;
                    if (tVar4 != null && tVar4.e) {
                        long j2 = ((long) tVar4.c) + j;
                        if (tVar4.d) {
                            i = 0;
                        } else {
                            i = tVar4.b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            tVar2.d(tVar4, (int) j);
                            eVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    int i3 = (int) j;
                    tVar2.getClass();
                    if (i3 <= 0 || i3 > tVar2.c - tVar2.b) {
                        throw new IllegalArgumentException();
                    }
                    if (i3 >= 1024) {
                        tVar = tVar2.c();
                    } else {
                        tVar = u.b();
                        System.arraycopy(tVar2.a, tVar2.b, tVar.a, 0, i3);
                    }
                    tVar.c = tVar.b + i3;
                    tVar2.b += i3;
                    tVar2.g.b(tVar);
                    eVar.a = tVar;
                }
                t tVar5 = eVar.a;
                long j3 = (long) (tVar5.c - tVar5.b);
                eVar.a = tVar5.a();
                t tVar6 = this.a;
                if (tVar6 == null) {
                    this.a = tVar5;
                    tVar5.g = tVar5;
                    tVar5.f = tVar5;
                } else {
                    tVar6.g.b(tVar5);
                    t tVar7 = tVar5.g;
                    if (tVar7 == tVar5) {
                        throw new IllegalStateException();
                    } else if (tVar7.e) {
                        int i4 = tVar5.c - tVar5.b;
                        int i5 = 8192 - tVar7.c;
                        if (!tVar7.d) {
                            i2 = tVar7.b;
                        }
                        if (i4 <= i5 + i2) {
                            tVar5.d(tVar7, i4);
                            tVar5.a();
                            u.a(tVar5);
                        }
                    }
                }
                eVar.b -= j3;
                this.b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // okio.g
    public boolean l1() {
        return this.b == 0;
    }

    public long m(byte b2, long j, long j2) {
        t tVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (tVar = this.a) == null) {
            return -1;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                tVar = tVar.g;
                j4 -= (long) (tVar.c - tVar.b);
            }
        } else {
            while (true) {
                long j6 = ((long) (tVar.c - tVar.b)) + j3;
                if (j6 >= j) {
                    break;
                }
                tVar = tVar.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = tVar.a;
            int min = (int) Math.min((long) tVar.c, (((long) tVar.b) + j5) - j4);
            for (int i = (int) ((((long) tVar.b) + j7) - j4); i < min; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - tVar.b)) + j4;
                }
            }
            j4 += (long) (tVar.c - tVar.b);
            tVar = tVar.f;
            j7 = j4;
        }
        return -1;
    }

    @Override // okio.g
    public InputStream m2() {
        return new a();
    }

    @Override // okio.g
    public boolean n(long j) {
        return this.b >= j;
    }

    @Override // okio.f
    public long n0(w wVar) {
        if (wVar != null) {
            long j = 0;
            while (true) {
                long c2 = wVar.c2(this, 8192);
                if (c2 == -1) {
                    return j;
                }
                j += c2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // okio.g
    public int n2(q qVar) {
        int B = B(qVar, false);
        if (B == -1) {
            return -1;
        }
        try {
            skip((long) qVar.a[B].x());
            return B;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public long p(ByteString byteString, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            t tVar = this.a;
            if (tVar == null) {
                return -1;
            }
            long j3 = this.b;
            if (j3 - j < j) {
                while (j3 > j) {
                    tVar = tVar.g;
                    j3 -= (long) (tVar.c - tVar.b);
                }
            } else {
                while (true) {
                    long j4 = ((long) (tVar.c - tVar.b)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    tVar = tVar.f;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (byteString.x() == 2) {
                byte n = byteString.n(0);
                byte n2 = byteString.n(1);
                while (j3 < this.b) {
                    byte[] bArr = tVar.a;
                    i = (int) ((((long) tVar.b) + j) - j3);
                    int i3 = tVar.c;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 == n || b2 == n2) {
                            i2 = tVar.b;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (tVar.c - tVar.b);
                    tVar = tVar.f;
                    j = j3;
                }
                return -1;
            }
            byte[] q = byteString.q();
            while (j3 < this.b) {
                byte[] bArr2 = tVar.a;
                i = (int) ((((long) tVar.b) + j) - j3);
                int i4 = tVar.c;
                while (i < i4) {
                    byte b3 = bArr2[i];
                    for (byte b4 : q) {
                        if (b3 == b4) {
                            i2 = tVar.b;
                        }
                    }
                    i++;
                }
                j3 += (long) (tVar.c - tVar.b);
                tVar = tVar.f;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public ByteString q() {
        return new ByteString(j1());
    }

    public String r(long j, Charset charset) {
        y.b(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException(je.t0("byteCount > Integer.MAX_VALUE: ", j));
        } else if (j == 0) {
            return "";
        } else {
            t tVar = this.a;
            if (((long) tVar.b) + j > ((long) tVar.c)) {
                return new String(B0(j), charset);
            }
            String str = new String(tVar.a, tVar.b, (int) j, charset);
            int i = (int) (((long) tVar.b) + j);
            tVar.b = i;
            this.b -= j;
            if (i == tVar.c) {
                this.a = tVar.a();
                u.a(tVar);
            }
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r7 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r2 = defpackage.je.V0("Expected leading [0-9] or '-' character but was 0x");
        r2.append(java.lang.Integer.toHexString(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        r17.b -= (long) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if (r8 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return r3;
     */
    @Override // okio.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long r1() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00be
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0014:
            okio.t r10 = r0.a
            byte[] r11 = r10.a
            int r12 = r10.b
            int r13 = r10.c
        L_0x001c:
            if (r12 >= r13) goto L_0x0097
            byte r14 = r11[r12]
            r15 = 48
            if (r14 < r15) goto L_0x0067
            r15 = 57
            if (r14 > r15) goto L_0x0067
            int r15 = 48 - r14
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0038
            long r1 = (long) r15
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r15
            long r3 = r3 + r1
            goto L_0x0071
        L_0x003f:
            okio.e r1 = new okio.e
            r1.<init>()
            okio.e r1 = r1.N0(r3)
            r1.J(r14)
            if (r8 != 0) goto L_0x0050
            r1.readByte()
        L_0x0050:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = defpackage.je.V0(r3)
            java.lang.String r1 = r1.s()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0067:
            r1 = 45
            if (r14 != r1) goto L_0x007b
            if (r7 != 0) goto L_0x007b
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0071:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x007b:
            if (r7 == 0) goto L_0x0080
            r1 = 1
            r9 = 1
            goto L_0x0097
        L_0x0080:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = defpackage.je.V0(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0097:
            if (r12 != r13) goto L_0x00a3
            okio.t r1 = r10.a()
            r0.a = r1
            okio.u.a(r10)
            goto L_0x00a5
        L_0x00a3:
            r10.b = r12
        L_0x00a5:
            if (r9 != 0) goto L_0x00b3
            okio.t r1 = r0.a
            if (r1 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00b3:
            long r1 = r0.b
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.b = r1
            if (r8 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            long r3 = -r3
        L_0x00bd:
            return r3
        L_0x00be:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00c7
        L_0x00c6:
            throw r1
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.e.r1():long");
    }

    public int read(byte[] bArr, int i, int i2) {
        y.b((long) bArr.length, (long) i, (long) i2);
        t tVar = this.a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i2, tVar.c - tVar.b);
        System.arraycopy(tVar.a, tVar.b, bArr, i, min);
        int i3 = tVar.b + min;
        tVar.b = i3;
        this.b -= (long) min;
        if (i3 == tVar.c) {
            this.a = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    @Override // okio.g
    public byte readByte() {
        long j = this.b;
        if (j != 0) {
            t tVar = this.a;
            int i = tVar.b;
            int i2 = tVar.c;
            int i3 = i + 1;
            byte b2 = tVar.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.g
    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.g
    public int readInt() {
        long j = this.b;
        if (j >= 4) {
            t tVar = this.a;
            int i = tVar.b;
            int i2 = tVar.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = tVar.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.b = j - 4;
            if (i8 == i2) {
                this.a = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i8;
            }
            return i9;
        }
        StringBuilder V0 = je.V0("size < 4: ");
        V0.append(this.b);
        throw new IllegalStateException(V0.toString());
    }

    @Override // okio.g
    public short readShort() {
        long j = this.b;
        if (j >= 2) {
            t tVar = this.a;
            int i = tVar.b;
            int i2 = tVar.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = tVar.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 2;
            if (i4 == i2) {
                this.a = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i4;
            }
            return (short) i5;
        }
        StringBuilder V0 = je.V0("size < 2: ");
        V0.append(this.b);
        throw new IllegalStateException(V0.toString());
    }

    public String s() {
        try {
            return r(this.b, y.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long size() {
        return this.b;
    }

    @Override // okio.g
    public void skip(long j) {
        while (j > 0) {
            t tVar = this.a;
            if (tVar != null) {
                int min = (int) Math.min(j, (long) (tVar.c - tVar.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                t tVar2 = this.a;
                int i = tVar2.b + min;
                tVar2.b = i;
                if (i == tVar2.c) {
                    this.a = tVar2.a();
                    u.a(tVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.lang.Object
    public String toString() {
        return C().toString();
    }

    public String v(long j) {
        return r(j, y.a);
    }

    /* access modifiers changed from: package-private */
    public String w(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (g(j2) == 13) {
                String v = v(j2);
                skip(2);
                return v;
            }
        }
        String v2 = v(j);
        skip(1);
        return v2;
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f write(byte[] bArr) {
        G(bArr);
        return this;
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f writeByte(int i) {
        J(i);
        return this;
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f writeInt(int i) {
        Q(i);
        return this;
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f writeShort(int i) {
        U(i);
        return this;
    }

    @Override // okio.g
    public String y0() {
        return V(Long.MAX_VALUE);
    }

    @Override // okio.f
    public /* bridge */ /* synthetic */ f write(byte[] bArr, int i, int i2) {
        I(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                t D = D(1);
                int min = Math.min(i, 8192 - D.c);
                byteBuffer.get(D.a, D.c, min);
                i -= min;
                D.c += min;
            }
            this.b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        t tVar = this.a;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), tVar.c - tVar.b);
        byteBuffer.put(tVar.a, tVar.b, min);
        int i = tVar.b + min;
        tVar.b = i;
        this.b -= (long) min;
        if (i == tVar.c) {
            this.a = tVar.a();
            u.a(tVar);
        }
        return min;
    }
}
