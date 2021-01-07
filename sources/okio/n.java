package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class n implements w {
    private final g a;
    private final Inflater b;
    private int c;
    private boolean f;

    n(g gVar, Inflater inflater) {
        this.a = gVar;
        this.b = inflater;
    }

    private void a() {
        int i = this.c;
        if (i != 0) {
            int remaining = i - this.b.getRemaining();
            this.c -= remaining;
            this.a.skip((long) remaining);
        }
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        t D;
        if (j < 0) {
            throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
        } else if (this.f) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean z = false;
                if (this.b.needsInput()) {
                    a();
                    if (this.b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.a.l1()) {
                        z = true;
                    } else {
                        t tVar = this.a.c().a;
                        int i = tVar.c;
                        int i2 = tVar.b;
                        int i3 = i - i2;
                        this.c = i3;
                        this.b.setInput(tVar.a, i2, i3);
                    }
                }
                try {
                    D = eVar.D(1);
                    int inflate = this.b.inflate(D.a, D.c, (int) Math.min(j, (long) (8192 - D.c)));
                    if (inflate > 0) {
                        D.c += inflate;
                        long j2 = (long) inflate;
                        eVar.b += j2;
                        return j2;
                    } else if (this.b.finished()) {
                        break;
                    } else if (this.b.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            a();
            if (D.b != D.c) {
                return -1;
            }
            eVar.a = D.a();
            u.a(D);
            return -1;
        }
    }

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f) {
            this.b.end();
            this.f = true;
            this.a.close();
        }
    }

    @Override // okio.w
    public x k() {
        return this.a.k();
    }
}
