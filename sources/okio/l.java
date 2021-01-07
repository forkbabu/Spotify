package okio;

import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class l implements v {
    private final f a;
    private final Deflater b;
    private final h c;
    private boolean f;
    private final CRC32 n = new CRC32();

    public l(v vVar) {
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        int i = o.b;
        r rVar = new r(vVar);
        this.a = rVar;
        this.c = new h(rVar, deflater);
        e eVar = rVar.a;
        eVar.U(8075);
        eVar.J(8);
        eVar.J(0);
        eVar.Q(0);
        eVar.J(0);
        eVar.J(0);
    }

    @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f) {
            Throwable th = null;
            try {
                this.c.b();
                this.a.k1((int) this.n.getValue());
                this.a.k1((int) this.b.getBytesRead());
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
            this.f = true;
            if (th != null) {
                Charset charset = y.a;
                throw th;
            }
        }
    }

    @Override // okio.v, java.io.Flushable
    public void flush() {
        this.c.flush();
    }

    @Override // okio.v
    public x k() {
        return this.a.k();
    }

    @Override // okio.v
    public void l0(e eVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
        } else if (j != 0) {
            t tVar = eVar.a;
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, (long) (tVar.c - tVar.b));
                this.n.update(tVar.a, tVar.b, min);
                j2 -= (long) min;
                tVar = tVar.f;
            }
            this.c.l0(eVar, j);
        }
    }
}
