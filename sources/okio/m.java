package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class m implements w {
    private int a = 0;
    private final g b;
    private final Inflater c;
    private final n f;
    private final CRC32 n = new CRC32();

    public m(w wVar) {
        if (wVar != null) {
            Inflater inflater = new Inflater(true);
            this.c = inflater;
            int i = o.b;
            s sVar = new s(wVar);
            this.b = sVar;
            this.f = new n(sVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private void b(e eVar, long j, long j2) {
        t tVar = eVar.a;
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
            int i3 = (int) (((long) tVar.b) + j);
            int min = (int) Math.min((long) (tVar.c - i3), j2);
            this.n.update(tVar.a, i3, min);
            j2 -= (long) min;
            tVar = tVar.f;
            j = 0;
        }
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        long j2;
        if (j < 0) {
            throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
        } else if (j == 0) {
            return 0;
        } else {
            if (this.a == 0) {
                this.b.L0(10);
                byte g = this.b.c().g(3);
                boolean z = ((g >> 1) & 1) == 1;
                if (z) {
                    b(this.b.c(), 0, 10);
                }
                a("ID1ID2", 8075, this.b.readShort());
                this.b.skip(8);
                if (((g >> 2) & 1) == 1) {
                    this.b.L0(2);
                    if (z) {
                        b(this.b.c(), 0, 2);
                    }
                    long E0 = (long) this.b.c().E0();
                    this.b.L0(E0);
                    if (z) {
                        j2 = E0;
                        b(this.b.c(), 0, E0);
                    } else {
                        j2 = E0;
                    }
                    this.b.skip(j2);
                }
                if (((g >> 3) & 1) == 1) {
                    long Q0 = this.b.Q0((byte) 0);
                    if (Q0 != -1) {
                        if (z) {
                            b(this.b.c(), 0, Q0 + 1);
                        }
                        this.b.skip(Q0 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((g >> 4) & 1) == 1) {
                    long Q02 = this.b.Q0((byte) 0);
                    if (Q02 != -1) {
                        if (z) {
                            b(this.b.c(), 0, Q02 + 1);
                        }
                        this.b.skip(Q02 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", this.b.E0(), (short) ((int) this.n.getValue()));
                    this.n.reset();
                }
                this.a = 1;
            }
            if (this.a == 1) {
                long j3 = eVar.b;
                long c2 = this.f.c2(eVar, j);
                if (c2 != -1) {
                    b(eVar, j3, c2);
                    return c2;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                a("CRC", this.b.R1(), (int) this.n.getValue());
                a("ISIZE", this.b.R1(), (int) this.c.getBytesWritten());
                this.a = 3;
                if (!this.b.l1()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f.close();
    }

    @Override // okio.w
    public x k() {
        return this.b.k();
    }
}
