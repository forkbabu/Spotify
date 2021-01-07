package okio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class r implements f {
    public final e a = new e();
    public final v b;
    boolean c;

    r(v vVar) {
        if (vVar != null) {
            this.b = vVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // okio.f
    public f J1(long j) {
        if (!this.c) {
            this.a.J1(j);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f N0(long j) {
        if (!this.c) {
            this.a.N0(j);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f S() {
        if (!this.c) {
            long d = this.a.d();
            if (d > 0) {
                this.b.l0(this.a, d);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f Y1(ByteString byteString) {
        if (!this.c) {
            this.a.F(byteString);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public e c() {
        return this.a;
    }

    @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                e eVar = this.a;
                long j = eVar.b;
                if (j > 0) {
                    this.b.l0(eVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                Charset charset = y.a;
                throw th;
            }
        }
    }

    @Override // okio.f
    public f e0(String str) {
        if (!this.c) {
            this.a.b0(str);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f, okio.v, java.io.Flushable
    public void flush() {
        if (!this.c) {
            e eVar = this.a;
            long j = eVar.b;
            if (j > 0) {
                this.b.l0(eVar, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // okio.v
    public x k() {
        return this.b.k();
    }

    @Override // okio.f
    public f k1(int i) {
        if (!this.c) {
            e eVar = this.a;
            eVar.getClass();
            eVar.Q(y.c(i));
            S();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.v
    public void l0(e eVar, long j) {
        if (!this.c) {
            this.a.l0(eVar, j);
            S();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public long n0(w wVar) {
        long j = 0;
        while (true) {
            long c2 = wVar.c2(this.a, 8192);
            if (c2 == -1) {
                return j;
            }
            j += c2;
            S();
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("buffer(");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }

    @Override // okio.f
    public f write(byte[] bArr) {
        if (!this.c) {
            this.a.G(bArr);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f writeByte(int i) {
        if (!this.c) {
            this.a.J(i);
            S();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f writeInt(int i) {
        if (!this.c) {
            this.a.Q(i);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f writeShort(int i) {
        if (!this.c) {
            this.a.U(i);
            S();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.f
    public f write(byte[] bArr, int i, int i2) {
        if (!this.c) {
            this.a.I(bArr, i, i2);
            return S();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.c) {
            int write = this.a.write(byteBuffer);
            S();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
