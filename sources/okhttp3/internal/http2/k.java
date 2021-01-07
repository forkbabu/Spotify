package okhttp3.internal.http2;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.b;
import okio.e;
import okio.f;

/* access modifiers changed from: package-private */
public final class k implements Closeable {
    private static final Logger p = Logger.getLogger(c.class.getName());
    private final f a;
    private final boolean b;
    private final e c;
    private int f = 16384;
    private boolean n;
    final b.C0659b o;

    k(f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
        e eVar = new e();
        this.c = eVar;
        this.o = new b.C0659b(eVar);
    }

    private void s(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f, j);
            long j2 = (long) min;
            j -= j2;
            f(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.a.l0(this.c, j2);
        }
    }

    public synchronized void a(n nVar) {
        if (!this.n) {
            this.f = nVar.f(this.f);
            if (nVar.c() != -1) {
                this.o.d(nVar.c());
            }
            f(0, 0, (byte) 4, (byte) 1);
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b() {
        if (this.n) {
            throw new IOException("closed");
        } else if (this.b) {
            Logger logger = p;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(rnf.o(">> CONNECTION %s", c.a.p()));
            }
            this.a.write(c.a.B());
            this.a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.n = true;
        this.a.close();
    }

    public synchronized void d(boolean z, int i, e eVar, int i2) {
        if (!this.n) {
            f(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.a.l0(eVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void f(int i, int i2, byte b2, byte b3) {
        Logger logger = p;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c.a(false, i, i2, b2, b3));
        }
        int i3 = this.f;
        if (i2 > i3) {
            c.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            f fVar = this.a;
            fVar.writeByte((i2 >>> 16) & BitmapRenderer.ALPHA_VISIBLE);
            fVar.writeByte((i2 >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
            fVar.writeByte(i2 & BitmapRenderer.ALPHA_VISIBLE);
            this.a.writeByte(b2 & 255);
            this.a.writeByte(b3 & 255);
            this.a.writeInt(i & Integer.MAX_VALUE);
        } else {
            c.b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    public synchronized void flush() {
        if (!this.n) {
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void g(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.n) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            f(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.a.writeInt(i);
            this.a.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        } else {
            c.b("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z, int i, List<a> list) {
        if (!this.n) {
            this.o.f(list);
            long size = this.c.size();
            int min = (int) Math.min((long) this.f, size);
            long j = (long) min;
            byte b2 = size == j ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            f(i, min, (byte) 1, b2);
            this.a.l0(this.c, j);
            if (size > j) {
                s(i, size - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int i() {
        return this.f;
    }

    public synchronized void l(boolean z, int i, int i2) {
        if (!this.n) {
            f(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.a.writeInt(i);
            this.a.writeInt(i2);
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void m(int i, ErrorCode errorCode) {
        if (this.n) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            f(i, 4, (byte) 3, (byte) 0);
            this.a.writeInt(errorCode.httpCode);
            this.a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void p(n nVar) {
        if (!this.n) {
            int i = 0;
            f(0, nVar.j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (nVar.g(i)) {
                    this.a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.a.writeInt(nVar.b(i));
                }
                i++;
            }
            this.a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ZIILjava/util/List<Lokhttp3/internal/http2/a;>;)V */
    public synchronized void q(boolean z, int i, List list) {
        if (!this.n) {
            h(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void r(int i, long j) {
        if (this.n) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            c.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            f(i, 4, (byte) 8, (byte) 0);
            this.a.writeInt((int) j);
            this.a.flush();
        }
    }
}
