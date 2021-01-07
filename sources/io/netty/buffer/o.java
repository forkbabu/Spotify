package io.netty.buffer;

import io.netty.util.Recycler;
import io.netty.util.concurrent.p;
import io.netty.util.h;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.e;
import io.netty.util.internal.i;
import io.netty.util.internal.r;
import io.netty.util.internal.s;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Locale;
import java.util.Map;

public final class o {
    private static final io.netty.util.internal.logging.b a;
    private static final p<CharBuffer> b = new a();
    private static final int c;
    private static final int d;
    static final k e;
    public static final /* synthetic */ int f = 0;

    static class a extends p<CharBuffer> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public CharBuffer d() {
            return CharBuffer.allocate(1024);
        }
    }

    private static final class b {
        private static final char[] a = new char[256];
        private static final char[] b = new char[1024];
        private static final String[] c = new String[16];
        private static final String[] d = new String[4096];
        private static final String[] e = new String[256];
        private static final String[] f = new String[16];

        static {
            char[] charArray = "0123456789abcdef".toCharArray();
            int i = 0;
            for (int i2 = 0; i2 < 256; i2++) {
                char[] cArr = b;
                int i3 = i2 << 1;
                cArr[i3] = charArray[(i2 >>> 4) & 15];
                cArr[i3 + 1] = charArray[i2 & 15];
            }
            int i4 = 0;
            while (true) {
                String[] strArr = c;
                if (i4 >= strArr.length) {
                    break;
                }
                int length = strArr.length - i4;
                StringBuilder sb = new StringBuilder(length * 3);
                for (int i5 = 0; i5 < length; i5++) {
                    sb.append("   ");
                }
                c[i4] = sb.toString();
                i4++;
            }
            int i6 = 0;
            while (true) {
                String[] strArr2 = d;
                if (i6 >= strArr2.length) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(r.a);
                sb2.append(Long.toHexString((((long) (i6 << 4)) & 4294967295L) | 4294967296L));
                sb2.setCharAt(sb2.length() - 9, '|');
                sb2.append('|');
                strArr2[i6] = sb2.toString();
                i6++;
            }
            int i7 = 0;
            while (true) {
                String[] strArr3 = e;
                if (i7 >= strArr3.length) {
                    break;
                }
                StringBuilder S0 = je.S0(' ');
                S0.append(r.a(i7));
                strArr3[i7] = S0.toString();
                i7++;
            }
            int i8 = 0;
            while (true) {
                String[] strArr4 = f;
                if (i8 >= strArr4.length) {
                    break;
                }
                int length2 = strArr4.length - i8;
                StringBuilder sb3 = new StringBuilder(length2);
                for (int i9 = 0; i9 < length2; i9++) {
                    sb3.append(' ');
                }
                f[i8] = sb3.toString();
                i8++;
            }
            while (true) {
                char[] cArr2 = a;
                if (i < cArr2.length) {
                    if (i <= 31 || i >= 127) {
                        cArr2[i] = '.';
                    } else {
                        cArr2[i] = (char) i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        static String a(j jVar, int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException(je.p0("length: ", i2));
            } else if (i2 == 0) {
                return "";
            } else {
                int i3 = i + i2;
                char[] cArr = new char[(i2 << 1)];
                int i4 = 0;
                while (i < i3) {
                    System.arraycopy(b, jVar.u0(i) << 1, cArr, i4, 2);
                    i++;
                    i4 += 2;
                }
                return new String(cArr);
            }
        }

        static String b(byte[] bArr, int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException(je.p0("length: ", i2));
            } else if (i2 == 0) {
                return "";
            } else {
                int i3 = i + i2;
                char[] cArr = new char[(i2 << 1)];
                int i4 = 0;
                while (i < i3) {
                    System.arraycopy(b, (bArr[i] & 255) << 1, cArr, i4, 2);
                    i++;
                    i4 += 2;
                }
                return new String(cArr);
            }
        }

        static void c(StringBuilder sb, j jVar, int i, int i2) {
            char[] cArr = a;
            String[] strArr = e;
            if (i.a(i, i2, jVar.J())) {
                StringBuilder X0 = je.X0("expected: 0 <= offset(", i, ") <= offset + length(", i2, ") <= ");
                X0.append("buf.capacity(");
                X0.append(jVar.J());
                X0.append(')');
                throw new IndexOutOfBoundsException(X0.toString());
            } else if (i2 != 0) {
                StringBuilder V0 = je.V0("         +-------------------------------------------------+");
                String str = r.a;
                V0.append(str);
                V0.append("         |  0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f |");
                V0.append(str);
                V0.append("+--------+-------------------------------------------------+----------------+");
                sb.append(V0.toString());
                int i3 = i2 >>> 4;
                int i4 = i2 & 15;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i5 << 4) + i;
                    d(sb, i5, i6);
                    int i7 = i6 + 16;
                    for (int i8 = i6; i8 < i7; i8++) {
                        sb.append(strArr[jVar.u0(i8)]);
                    }
                    sb.append(" |");
                    while (i6 < i7) {
                        sb.append(cArr[jVar.u0(i6)]);
                        i6++;
                    }
                    sb.append('|');
                }
                if (i4 != 0) {
                    int i9 = (i3 << 4) + i;
                    d(sb, i3, i9);
                    int i10 = i9 + i4;
                    for (int i11 = i9; i11 < i10; i11++) {
                        sb.append(strArr[jVar.u0(i11)]);
                    }
                    sb.append(c[i4]);
                    sb.append(" |");
                    while (i9 < i10) {
                        sb.append(cArr[jVar.u0(i9)]);
                        i9++;
                    }
                    sb.append(f[i4]);
                    sb.append('|');
                }
                sb.append(r.a + "+--------+-------------------------------------------------+----------------+");
            }
        }

        private static void d(StringBuilder sb, int i, int i2) {
            String[] strArr = d;
            if (i < strArr.length) {
                sb.append(strArr[i]);
                return;
            }
            sb.append(r.a);
            sb.append(Long.toHexString((((long) i2) & 4294967295L) | 4294967296L));
            sb.setCharAt(sb.length() - 9, '|');
            sb.append('|');
        }
    }

    static final class c extends l0 {
        private static final Recycler<c> z = new a();
        private final Recycler.e<c> y;

        static class a extends Recycler<c> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public c k(Recycler.e<c> eVar) {
                return new c(eVar, null);
            }
        }

        c(Recycler.e eVar, a aVar) {
            super(k0.d, 256, Integer.MAX_VALUE);
            this.y = eVar;
        }

        static c G2() {
            c j = z.j();
            j.B2(1);
            return j;
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.l0, io.netty.buffer.e
        public void A2() {
            if (J() > o.d) {
                super.A2();
                return;
            }
            this.b = 0;
            this.a = 0;
            this.y.a(this);
        }
    }

    static final class d extends p0 {
        private static final Recycler<d> A = new a();
        private final Recycler.e<d> z;

        static class a extends Recycler<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.netty.util.Recycler$e] */
            /* access modifiers changed from: protected */
            @Override // io.netty.util.Recycler
            public d k(Recycler.e<d> eVar) {
                return new d(eVar, null);
            }
        }

        d(Recycler.e eVar, a aVar) {
            super(k0.d, 256, Integer.MAX_VALUE);
            this.z = eVar;
        }

        static d H2() {
            d j = A.j();
            j.B2(1);
            return j;
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.buffer.p0, io.netty.buffer.e
        public void A2() {
            if (J() > o.d) {
                super.A2();
                return;
            }
            this.b = 0;
            this.a = 0;
            this.z.a(this);
        }
    }

    static {
        k kVar;
        int i = io.netty.util.internal.logging.c.b;
        io.netty.util.internal.logging.b b2 = io.netty.util.internal.logging.c.b(o.class.getName());
        a = b2;
        Charset charset = h.d;
        if (charset != null) {
            Map<Charset, CharsetEncoder> b3 = e.e().b();
            CharsetEncoder charsetEncoder = b3.get(charset);
            if (charsetEncoder != null) {
                charsetEncoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
            } else {
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                CharsetEncoder newEncoder = charset.newEncoder();
                newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                b3.put(charset, newEncoder);
                charsetEncoder = newEncoder;
            }
            charsetEncoder.maxBytesPerChar();
            String trim = s.a("io.netty.allocator.type", PlatformDependent.G() ? "unpooled" : "pooled").toLowerCase(Locale.US).trim();
            if ("unpooled".equals(trim)) {
                kVar = k0.d;
                b2.r("-Dio.netty.allocator.type: {}", trim);
            } else if ("pooled".equals(trim)) {
                kVar = y.v;
                b2.r("-Dio.netty.allocator.type: {}", trim);
            } else {
                kVar = y.v;
                b2.r("-Dio.netty.allocator.type: pooled (unknown: {})", trim);
            }
            e = kVar;
            int c2 = s.c("io.netty.threadLocalDirectBufferSize", 65536);
            d = c2;
            b2.r("-Dio.netty.threadLocalDirectBufferSize: {}", Integer.valueOf(c2));
            int c3 = s.c("io.netty.maxThreadLocalCharBufferSize", 16384);
            c = c3;
            b2.r("-Dio.netty.maxThreadLocalCharBufferSize: {}", Integer.valueOf(c3));
            return;
        }
        throw new NullPointerException("charset");
    }

    private o() {
    }

    public static void b(StringBuilder sb, j jVar) {
        b.c(sb, jVar, jVar.n1(), jVar.m1());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(io.netty.buffer.j r17, io.netty.buffer.j r18) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r17.m1()
            int r3 = r18.m1()
            int r4 = java.lang.Math.min(r2, r3)
            int r5 = r4 >>> 2
            r4 = r4 & 3
            int r6 = r17.n1()
            int r7 = r18.n1()
            if (r5 <= 0) goto L_0x00af
            java.nio.ByteOrder r8 = r17.a1()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            if (r8 != r9) goto L_0x0028
            r8 = 1
            goto L_0x0029
        L_0x0028:
            r8 = 0
        L_0x0029:
            int r5 = r5 << 2
            java.nio.ByteOrder r9 = r17.a1()
            java.nio.ByteOrder r10 = r18.a1()
            r11 = 0
            if (r9 != r10) goto L_0x006b
            if (r8 == 0) goto L_0x0052
            int r8 = r5 + r6
            r9 = r6
            r10 = r7
        L_0x003d:
            if (r9 >= r8) goto L_0x009f
            long r13 = r0.v0(r9)
            long r15 = r1.v0(r10)
            long r13 = r13 - r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004d
            goto L_0x00a0
        L_0x004d:
            int r9 = r9 + 4
            int r10 = r10 + 4
            goto L_0x003d
        L_0x0052:
            int r8 = r5 + r6
            r9 = r6
            r10 = r7
        L_0x0056:
            if (r9 >= r8) goto L_0x009f
            long r13 = r0.x0(r9)
            long r15 = r1.x0(r10)
            long r13 = r13 - r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0066
            goto L_0x00a0
        L_0x0066:
            int r9 = r9 + 4
            int r10 = r10 + 4
            goto L_0x0056
        L_0x006b:
            if (r8 == 0) goto L_0x0086
            int r8 = r5 + r6
            r9 = r6
            r10 = r7
        L_0x0071:
            if (r9 >= r8) goto L_0x009f
            long r13 = r0.v0(r9)
            long r15 = r1.x0(r10)
            long r13 = r13 - r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0081
            goto L_0x00a0
        L_0x0081:
            int r9 = r9 + 4
            int r10 = r10 + 4
            goto L_0x0071
        L_0x0086:
            int r8 = r5 + r6
            r9 = r6
            r10 = r7
        L_0x008a:
            if (r9 >= r8) goto L_0x009f
            long r13 = r0.x0(r9)
            long r15 = r1.v0(r10)
            long r13 = r13 - r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            int r9 = r9 + 4
            int r10 = r10 + 4
            goto L_0x008a
        L_0x009f:
            r13 = r11
        L_0x00a0:
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x00ad
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r0, r13)
            int r1 = (int) r0
            return r1
        L_0x00ad:
            int r6 = r6 + r5
            int r7 = r7 + r5
        L_0x00af:
            int r4 = r4 + r6
        L_0x00b0:
            if (r6 >= r4) goto L_0x00c3
            short r5 = r0.u0(r6)
            short r8 = r1.u0(r7)
            int r5 = r5 - r8
            if (r5 == 0) goto L_0x00be
            return r5
        L_0x00be:
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L_0x00b0
        L_0x00c3:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.buffer.o.c(io.netty.buffer.j, io.netty.buffer.j):int");
    }

    static String d(j jVar, int i, int i2, Charset charset) {
        if (i2 == 0) {
            return "";
        }
        Charset charset2 = h.a;
        if (charset != null) {
            Map<Charset, CharsetDecoder> a2 = e.e().a();
            CharsetDecoder charsetDecoder = a2.get(charset);
            if (charsetDecoder != null) {
                charsetDecoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
            } else {
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                CharsetDecoder newDecoder = charset.newDecoder();
                newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                a2.put(charset, newDecoder);
                charsetDecoder = newDecoder;
            }
            double d2 = (double) i2;
            double maxCharsPerByte = (double) charsetDecoder.maxCharsPerByte();
            Double.isNaN(d2);
            Double.isNaN(maxCharsPerByte);
            Double.isNaN(d2);
            Double.isNaN(maxCharsPerByte);
            int i3 = (int) (d2 * maxCharsPerByte);
            p<CharBuffer> pVar = b;
            CharBuffer b2 = pVar.b();
            if (b2.length() < i3) {
                b2 = CharBuffer.allocate(i3);
                if (i3 <= c) {
                    pVar.i(b2);
                }
            } else {
                b2.clear();
            }
            if (jVar.Q0() == 1) {
                e(charsetDecoder, jVar.G0(i, i2), b2);
            } else {
                j d3 = jVar.t().d(i2);
                try {
                    d3.S1(jVar, i, i2);
                    e(charsetDecoder, d3.G0(0, i2), b2);
                } finally {
                    d3.d();
                }
            }
            return b2.flip().toString();
        }
        throw new NullPointerException("charset");
    }

    private static void e(CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer) {
        try {
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, true);
            if (!decode.isUnderflow()) {
                decode.throwException();
            }
            CoderResult flush = charsetDecoder.flush(charBuffer);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
        } catch (CharacterCodingException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static boolean f(j jVar, j jVar2) {
        int m1 = jVar.m1();
        if (m1 != jVar2.m1()) {
            return false;
        }
        int n1 = jVar.n1();
        int n12 = jVar2.n1();
        if (n1 < 0 || n12 < 0 || m1 < 0) {
            throw new IllegalArgumentException("All indexes and lengths must be non-negative");
        } else if (jVar.Z1() - m1 < n1 || jVar2.Z1() - m1 < n12) {
            return false;
        } else {
            int i = m1 >>> 3;
            if (jVar.a1() == jVar2.a1()) {
                while (i > 0) {
                    if (jVar.o0(n1) != jVar2.o0(n12)) {
                        return false;
                    }
                    n1 += 8;
                    n12 += 8;
                    i--;
                }
            } else {
                while (i > 0) {
                    if (jVar.o0(n1) != Long.reverseBytes(jVar2.o0(n12))) {
                        return false;
                    }
                    n1 += 8;
                    n12 += 8;
                    i--;
                }
            }
            for (int i2 = m1 & 7; i2 > 0; i2--) {
                if (jVar.S(n1) != jVar2.S(n12)) {
                    return false;
                }
                n1++;
                n12++;
            }
            return true;
        }
    }

    public static String g(j jVar) {
        return b.a(jVar, jVar.n1(), jVar.m1());
    }

    public static String h(byte[] bArr, int i, int i2) {
        return b.b(bArr, i, i2);
    }

    public static j i() {
        if (d <= 0) {
            return null;
        }
        if (PlatformDependent.z()) {
            return d.H2();
        }
        return c.G2();
    }
}
