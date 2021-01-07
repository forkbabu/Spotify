package okio;

import java.nio.charset.Charset;
import java.util.zip.Deflater;

public final class h implements v {
    private final f a;
    private final Deflater b;
    private boolean c;

    h(f fVar, Deflater deflater) {
        this.a = fVar;
        this.b = deflater;
    }

    private void a(boolean z) {
        t D;
        int i;
        e c2 = this.a.c();
        while (true) {
            D = c2.D(1);
            if (z) {
                Deflater deflater = this.b;
                byte[] bArr = D.a;
                int i2 = D.c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = D.a;
                int i3 = D.c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                D.c += i;
                c2.b += (long) i;
                this.a.S();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (D.b == D.c) {
            c2.a = D.a();
            u.a(D);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.b.finish();
        a(false);
    }

    @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                this.b.finish();
                a(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.c = true;
            if (th != null) {
                Charset charset = y.a;
                throw th;
            }
        }
    }

    @Override // okio.v, java.io.Flushable
    public void flush() {
        a(true);
        this.a.flush();
    }

    @Override // okio.v
    public x k() {
        return this.a.k();
    }

    @Override // okio.v
    public void l0(e eVar, long j) {
        y.b(eVar.b, 0, j);
        while (j > 0) {
            t tVar = eVar.a;
            int min = (int) Math.min(j, (long) (tVar.c - tVar.b));
            this.b.setInput(tVar.a, tVar.b, min);
            a(false);
            long j2 = (long) min;
            eVar.b -= j2;
            int i = tVar.b + min;
            tVar.b = i;
            if (i == tVar.c) {
                eVar.a = tVar.a();
                u.a(tVar);
            }
            j -= j2;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DeflaterSink(");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
