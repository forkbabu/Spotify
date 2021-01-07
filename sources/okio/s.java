package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class s implements g {
    public final e a = new e();
    public final w b;
    boolean c;

    s(w wVar) {
        if (wVar != null) {
            this.b = wVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // okio.g
    public byte[] B0(long j) {
        if (n(j)) {
            return this.a.B0(j);
        }
        throw new EOFException();
    }

    @Override // okio.g
    public short E0() {
        L0(2);
        return this.a.E0();
    }

    @Override // okio.g
    public String E1(Charset charset) {
        if (charset != null) {
            this.a.n0(this.b);
            e eVar = this.a;
            eVar.getClass();
            try {
                return eVar.r(eVar.b, charset);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    @Override // okio.g
    public e L() {
        return this.a;
    }

    @Override // okio.g
    public void L0(long j) {
        if (!n(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.g
    public long Q0(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    @Override // okio.g
    public long R(ByteString byteString) {
        if (!this.c) {
            long j = 0;
            while (true) {
                long p = this.a.p(byteString, j);
                if (p != -1) {
                    return p;
                }
                e eVar = this.a;
                long j2 = eVar.b;
                if (this.b.c2(eVar, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // okio.g
    public int R1() {
        L0(4);
        return this.a.R1();
    }

    @Override // okio.g
    public String V(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return this.a.w(a2);
            }
            if (j2 < Long.MAX_VALUE && n(j2) && this.a.g(j2 - 1) == 13 && n(1 + j2) && this.a.g(j2) == 10) {
                return this.a.w(j2);
            }
            e eVar = new e();
            e eVar2 = this.a;
            eVar2.f(eVar, 0, Math.min(32L, eVar2.b));
            StringBuilder V0 = je.V0("\\n not found: limit=");
            V0.append(Math.min(this.a.b, j));
            V0.append(" content=");
            V0.append(eVar.q().p());
            V0.append((char) 8230);
            throw new EOFException(V0.toString());
        }
        throw new IllegalArgumentException(je.t0("limit < 0: ", j));
    }

    @Override // okio.g
    public ByteString Z0(long j) {
        if (n(j)) {
            return this.a.Z0(j);
        }
        throw new EOFException();
    }

    public long a(byte b2, long j, long j2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        } else {
            while (j < j2) {
                long m = this.a.m(b2, j, j2);
                if (m == -1) {
                    e eVar = this.a;
                    long j3 = eVar.b;
                    if (j3 >= j2 || this.b.c2(eVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return m;
                }
            }
            return -1;
        }
    }

    @Override // okio.g, okio.f
    public e c() {
        return this.a;
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
        } else if (!this.c) {
            e eVar2 = this.a;
            if (eVar2.b == 0 && this.b.c2(eVar2, 8192) == -1) {
                return -1;
            }
            return this.a.c2(eVar, Math.min(j, this.a.b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.b();
        }
    }

    @Override // okio.g
    public long d2(v vVar) {
        long j = 0;
        while (this.b.c2(this.a, 8192) != -1) {
            long d = this.a.d();
            if (d > 0) {
                j += d;
                ((e) vVar).l0(this.a, d);
            }
        }
        e eVar = this.a;
        long j2 = eVar.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        ((e) vVar).l0(eVar, j2);
        return j3;
    }

    @Override // okio.g
    public boolean g0(long j, ByteString byteString) {
        int x = byteString.x();
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || x < 0 || byteString.x() - 0 < x) {
            return false;
        } else {
            for (int i = 0; i < x; i++) {
                long j2 = ((long) i) + j;
                if (!(n(1 + j2) && this.a.g(j2) == byteString.n(0 + i))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // okio.g
    public byte[] j1() {
        this.a.n0(this.b);
        return this.a.j1();
    }

    @Override // okio.w
    public x k() {
        return this.b.k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // okio.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long k2() {
        /*
            r6 = this;
            r0 = 1
            r6.L0(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.n(r3)
            if (r3 == 0) goto L_0x004a
            okio.e r3 = r6.a
            long r4 = (long) r1
            byte r3 = r3.g(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0030
        L_0x001f:
            r4 = 97
            if (r3 < r4) goto L_0x0027
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L_0x0030
        L_0x0027:
            r4 = 65
            if (r3 < r4) goto L_0x0032
            r4 = 70
            if (r3 <= r4) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = r2
            goto L_0x0007
        L_0x0032:
            if (r1 == 0) goto L_0x0035
            goto L_0x004a
        L_0x0035:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x004a:
            okio.e r0 = r6.a
            long r0 = r0.k2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.s.k2():long");
    }

    @Override // okio.g
    public boolean l1() {
        if (!this.c) {
            return this.a.l1() && this.b.c2(this.a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.g
    public InputStream m2() {
        return new a();
    }

    @Override // okio.g
    public boolean n(long j) {
        e eVar;
        if (j < 0) {
            throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
        } else if (!this.c) {
            do {
                eVar = this.a;
                if (eVar.b >= j) {
                    return true;
                }
            } while (this.b.c2(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // okio.g
    public int n2(q qVar) {
        if (!this.c) {
            do {
                int B = this.a.B(qVar, true);
                if (B == -1) {
                    return -1;
                }
                if (B != -2) {
                    this.a.skip((long) qVar.a[B].x());
                    return B;
                }
            } while (this.b.c2(this.a, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.g
    public long r1() {
        byte g;
        L0(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!n((long) i2)) {
                break;
            }
            g = this.a.g((long) i);
            if ((g < 48 || g > 57) && !(i == 0 && g == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(g)));
        }
        return this.a.r1();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        e eVar = this.a;
        if (eVar.b == 0 && this.b.c2(eVar, 8192) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override // okio.g
    public byte readByte() {
        L0(1);
        return this.a.readByte();
    }

    @Override // okio.g
    public void readFully(byte[] bArr) {
        try {
            L0((long) bArr.length);
            this.a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                e eVar = this.a;
                long j = eVar.b;
                if (j > 0) {
                    int read = eVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // okio.g
    public int readInt() {
        L0(4);
        return this.a.readInt();
    }

    @Override // okio.g
    public short readShort() {
        L0(2);
        return this.a.readShort();
    }

    @Override // okio.g
    public void skip(long j) {
        if (!this.c) {
            while (j > 0) {
                e eVar = this.a;
                if (eVar.b == 0 && this.b.c2(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.a.b);
                this.a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("buffer(");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }

    @Override // okio.g
    public String y0() {
        return V(Long.MAX_VALUE);
    }

    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            s sVar = s.this;
            if (!sVar.c) {
                return (int) Math.min(sVar.a.b, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            s.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            s sVar = s.this;
            if (!sVar.c) {
                e eVar = sVar.a;
                if (eVar.b == 0 && sVar.b.c2(eVar, 8192) == -1) {
                    return -1;
                }
                return s.this.a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @Override // java.lang.Object
        public String toString() {
            return s.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!s.this.c) {
                y.b((long) bArr.length, (long) i, (long) i2);
                s sVar = s.this;
                e eVar = sVar.a;
                if (eVar.b == 0 && sVar.b.c2(eVar, 8192) == -1) {
                    return -1;
                }
                return s.this.a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
