package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.b;
import okhttp3.internal.http2.e;
import okio.ByteString;
import okio.e;
import okio.g;
import okio.w;
import okio.x;

/* access modifiers changed from: package-private */
public final class i implements Closeable {
    static final Logger n = Logger.getLogger(c.class.getName());
    private final g a;
    private final a b;
    private final boolean c;
    final b.a f;

    /* access modifiers changed from: package-private */
    public static final class a implements w {
        private final g a;
        int b;
        byte c;
        int f;
        int n;
        short o;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // okio.w
        public long c2(e eVar, long j) {
            int i;
            int readInt;
            do {
                int i2 = this.n;
                if (i2 == 0) {
                    this.a.skip((long) this.o);
                    this.o = 0;
                    if ((this.c & 4) != 0) {
                        return -1;
                    }
                    i = this.f;
                    int h = i.h(this.a);
                    this.n = h;
                    this.b = h;
                    byte readByte = (byte) (this.a.readByte() & 255);
                    this.c = (byte) (this.a.readByte() & 255);
                    Logger logger = i.n;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(c.a(true, this.f, this.b, readByte, this.c));
                    }
                    readInt = this.a.readInt() & Integer.MAX_VALUE;
                    this.f = readInt;
                    if (readByte != 9) {
                        c.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                } else {
                    long c2 = this.a.c2(eVar, Math.min(j, (long) i2));
                    if (c2 == -1) {
                        return -1;
                    }
                    this.n = (int) (((long) this.n) - c2);
                    return c2;
                }
            } while (readInt == i);
            c.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okio.w
        public x k() {
            return this.a.k();
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    i(g gVar, boolean z) {
        this.a = gVar;
        this.c = z;
        a aVar = new a(gVar);
        this.b = aVar;
        this.f = new b.a(4096, aVar);
    }

    static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        c.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    private void f(b bVar, int i, int i2) {
        j[] jVarArr;
        if (i < 8) {
            c.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.a.readInt();
            int readInt2 = this.a.readInt();
            int i3 = i - 8;
            if (ErrorCode.d(readInt2) != null) {
                ByteString byteString = ByteString.f;
                if (i3 > 0) {
                    byteString = this.a.Z0((long) i3);
                }
                e.l lVar = (e.l) bVar;
                lVar.getClass();
                byteString.x();
                synchronized (e.this) {
                    jVarArr = (j[]) e.this.c.values().toArray(new j[e.this.c.size()]);
                    e.this.p = true;
                }
                for (j jVar : jVarArr) {
                    if (jVar.c > readInt && jVar.i()) {
                        ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                        synchronized (jVar) {
                            if (jVar.k == null) {
                                jVar.k = errorCode;
                                jVar.notifyAll();
                            }
                        }
                        e.this.M(jVar.c);
                    }
                }
                return;
            }
            c.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            c.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private List<a> g(int i, short s, byte b2, int i2) {
        a aVar = this.b;
        aVar.n = i;
        aVar.b = i;
        aVar.o = s;
        aVar.c = b2;
        aVar.f = i2;
        this.f.h();
        return this.f.d();
    }

    static int h(g gVar) {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    private void i(b bVar, int i, int i2) {
        if (i == 4) {
            long readInt = ((long) this.a.readInt()) & 2147483647L;
            if (readInt != 0) {
                e.l lVar = (e.l) bVar;
                if (i2 == 0) {
                    synchronized (e.this) {
                        e eVar = e.this;
                        eVar.A += readInt;
                        eVar.notifyAll();
                    }
                    return;
                }
                j s = e.this.s(i2);
                if (s != null) {
                    synchronized (s) {
                        s.b += readInt;
                        if (readInt > 0) {
                            s.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            c.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        c.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    public boolean b(boolean z, b bVar) {
        short s = 0;
        try {
            this.a.L0(9);
            int h = h(this.a);
            if (h < 0 || h > 16384) {
                c.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(h));
                throw null;
            }
            byte readByte = (byte) (this.a.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.a.readByte() & 255);
                int readInt = this.a.readInt() & Integer.MAX_VALUE;
                Logger logger = n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.a(true, readInt, h, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        if (readInt != 0) {
                            boolean z2 = (readByte2 & 1) != 0;
                            if (!((readByte2 & 32) != 0)) {
                                if ((readByte2 & 8) != 0) {
                                    s = (short) (this.a.readByte() & 255);
                                }
                                int a2 = a(h, readByte2, s);
                                g gVar = this.a;
                                e.l lVar = (e.l) bVar;
                                if (e.this.J(readInt)) {
                                    e.this.C(readInt, gVar, a2, z2);
                                } else {
                                    j s2 = e.this.s(readInt);
                                    if (s2 == null) {
                                        e.this.d0(readInt, ErrorCode.PROTOCOL_ERROR);
                                        long j = (long) a2;
                                        e.this.W(j);
                                        gVar.skip(j);
                                    } else {
                                        s2.k(gVar, a2);
                                        if (z2) {
                                            s2.l();
                                        }
                                    }
                                }
                                this.a.skip((long) s);
                                break;
                            } else {
                                c.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                                throw null;
                            }
                        } else {
                            c.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 1:
                        if (readInt != 0) {
                            boolean z3 = (readByte2 & 1) != 0;
                            short readByte3 = (readByte2 & 8) != 0 ? (short) (this.a.readByte() & 255) : 0;
                            if ((readByte2 & 32) != 0) {
                                this.a.readInt();
                                this.a.readByte();
                                ((e.l) bVar).getClass();
                                h -= 5;
                            }
                            List<a> g = g(a(h, readByte2, readByte3), readByte3, readByte2, readInt);
                            e.l lVar2 = (e.l) bVar;
                            if (e.this.J(readInt)) {
                                e.this.F(readInt, g, z3);
                                break;
                            } else {
                                synchronized (e.this) {
                                    j s3 = e.this.s(readInt);
                                    if (s3 == null) {
                                        if (e.this.p) {
                                            break;
                                        } else {
                                            e eVar = e.this;
                                            if (readInt > eVar.n) {
                                                if (readInt % 2 == eVar.o % 2) {
                                                    break;
                                                } else {
                                                    j jVar = new j(readInt, e.this, false, z3, rnf.A(g));
                                                    e eVar2 = e.this;
                                                    eVar2.n = readInt;
                                                    eVar2.c.put(Integer.valueOf(readInt), jVar);
                                                    e.H.execute(new f(lVar2, "OkHttp %s stream %d", new Object[]{e.this.f, Integer.valueOf(readInt)}, jVar));
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        s3.m(g);
                                        if (z3) {
                                            s3.l();
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            c.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 2:
                        if (h != 5) {
                            c.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(h));
                            throw null;
                        } else if (readInt != 0) {
                            this.a.readInt();
                            this.a.readByte();
                            ((e.l) bVar).getClass();
                            break;
                        } else {
                            c.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 3:
                        if (h != 4) {
                            c.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(h));
                            throw null;
                        } else if (readInt != 0) {
                            int readInt2 = this.a.readInt();
                            ErrorCode d = ErrorCode.d(readInt2);
                            if (d != null) {
                                e.l lVar3 = (e.l) bVar;
                                if (e.this.J(readInt)) {
                                    e.this.I(readInt, d);
                                    break;
                                } else {
                                    j M = e.this.M(readInt);
                                    if (M != null) {
                                        synchronized (M) {
                                            if (M.k == null) {
                                                M.k = d;
                                                M.notifyAll();
                                            }
                                            break;
                                        }
                                    }
                                }
                            } else {
                                c.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                                throw null;
                            }
                        } else {
                            c.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 4:
                        if (readInt != 0) {
                            c.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        } else if ((readByte2 & 1) != 0) {
                            if (h == 0) {
                                ((e.l) bVar).getClass();
                                break;
                            } else {
                                c.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                throw null;
                            }
                        } else if (h % 6 == 0) {
                            n nVar = new n();
                            for (int i = 0; i < h; i += 6) {
                                int readShort = this.a.readShort() & 65535;
                                int readInt3 = this.a.readInt();
                                if (readShort != 2) {
                                    if (readShort == 3) {
                                        readShort = 4;
                                    } else if (readShort == 4) {
                                        readShort = 7;
                                        if (readInt3 < 0) {
                                            c.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                    } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                        c.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                        throw null;
                                    }
                                } else if (!(readInt3 == 0 || readInt3 == 1)) {
                                    c.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                                nVar.i(readShort, readInt3);
                            }
                            e.l lVar4 = (e.l) bVar;
                            lVar4.getClass();
                            e.this.q.execute(new g(lVar4, "OkHttp %s ACK Settings", new Object[]{e.this.f}, false, nVar));
                            break;
                        } else {
                            c.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(h));
                            throw null;
                        }
                    case 5:
                        if (readInt != 0) {
                            if ((readByte2 & 8) != 0) {
                                s = (short) (this.a.readByte() & 255);
                            }
                            e.this.G(this.a.readInt() & Integer.MAX_VALUE, g(a(h - 4, readByte2, s), s, readByte2, readInt));
                            break;
                        } else {
                            c.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 6:
                        if (h != 8) {
                            c.c("TYPE_PING length != 8: %s", Integer.valueOf(h));
                            throw null;
                        } else if (readInt == 0) {
                            int readInt4 = this.a.readInt();
                            int readInt5 = this.a.readInt();
                            if ((readByte2 & 1) != 0) {
                                s = 1;
                            }
                            e.l lVar5 = (e.l) bVar;
                            lVar5.getClass();
                            if (s != 0) {
                                synchronized (e.this) {
                                    if (readInt4 == 1) {
                                        try {
                                            e.d(e.this);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } else if (readInt4 == 2) {
                                        e.p(e.this);
                                    } else if (readInt4 == 3) {
                                        e.q(e.this);
                                        e.this.notifyAll();
                                    }
                                }
                                break;
                            } else {
                                try {
                                    e.this.q.execute(new e.k(true, readInt4, readInt5));
                                    break;
                                } catch (RejectedExecutionException unused) {
                                    break;
                                }
                            }
                        } else {
                            c.c("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                    case 7:
                        f(bVar, h, readInt);
                        break;
                    case 8:
                        i(bVar, h, readInt);
                        break;
                    default:
                        this.a.skip((long) h);
                        break;
                }
                return true;
            }
            c.c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public void d(b bVar) {
        if (!this.c) {
            g gVar = this.a;
            ByteString byteString = c.a;
            ByteString Z0 = gVar.Z0((long) byteString.x());
            Logger logger = n;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(rnf.o("<< CONNECTION %s", Z0.p()));
            }
            if (!byteString.equals(Z0)) {
                c.c("Expected a connection header but was %s", Z0.C());
                throw null;
            }
        } else if (!b(true, bVar)) {
            c.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }
}
