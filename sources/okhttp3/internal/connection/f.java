package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import okhttp3.f0;
import okhttp3.internal.connection.e;
import okhttp3.j;
import okhttp3.p;
import okhttp3.v;
import okhttp3.y;

public final class f {
    public final okhttp3.a a;
    private e.a b;
    private f0 c;
    private final j d;
    public final okhttp3.e e;
    public final p f;
    private final Object g;
    private final e h;
    private int i;
    private c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private cof n;

    public static final class a extends WeakReference<f> {
        public final Object a;

        a(f fVar, Object obj) {
            super(fVar);
            this.a = obj;
        }
    }

    public f(j jVar, okhttp3.a aVar, okhttp3.e eVar, p pVar, Object obj) {
        this.d = jVar;
        this.a = aVar;
        this.e = eVar;
        this.f = pVar;
        this.h = new e(aVar, pnf.a.j(jVar), eVar, pVar);
        this.g = obj;
    }

    private Socket e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.n = null;
        }
        if (z2) {
            this.l = true;
        }
        c cVar = this.j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.k = true;
        }
        if (this.n != null) {
            return null;
        }
        if (!(this.l || cVar.k)) {
            return null;
        }
        int size = cVar.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (cVar.n.get(i2).get() == this) {
                cVar.n.remove(i2);
                if (this.j.n.isEmpty()) {
                    this.j.o = System.nanoTime();
                    if (pnf.a.e(this.d, this.j)) {
                        socket = this.j.n();
                        this.j = null;
                        return socket;
                    }
                }
                socket = null;
                this.j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    private c f(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        c cVar;
        Socket socket;
        Socket e2;
        c cVar2;
        boolean z3;
        f0 f0Var;
        boolean z4;
        e.a aVar;
        while (true) {
            synchronized (this.d) {
                if (this.l) {
                    throw new IllegalStateException("released");
                } else if (this.n != null) {
                    throw new IllegalStateException("codec != null");
                } else if (!this.m) {
                    cVar = this.j;
                    socket = null;
                    e2 = (cVar == null || !cVar.k) ? null : e(false, false, true);
                    cVar2 = this.j;
                    if (cVar2 != null) {
                        cVar = null;
                    } else {
                        cVar2 = null;
                    }
                    if (!this.k) {
                        cVar = null;
                    }
                    if (cVar2 == null) {
                        pnf.a.h(this.d, this.a, this, null);
                        c cVar3 = this.j;
                        if (cVar3 != null) {
                            cVar2 = cVar3;
                            z3 = true;
                            f0Var = null;
                        } else {
                            f0Var = this.c;
                        }
                    } else {
                        f0Var = null;
                    }
                    z3 = false;
                } else {
                    throw new IOException("Canceled");
                }
            }
            rnf.h(e2);
            if (cVar != null) {
                this.f.getClass();
            }
            if (z3) {
                this.f.getClass();
            }
            if (cVar2 != null) {
                this.c = this.j.m();
            } else {
                if (f0Var != null || ((aVar = this.b) != null && aVar.b())) {
                    z4 = false;
                } else {
                    this.b = this.h.d();
                    z4 = true;
                }
                synchronized (this.d) {
                    if (!this.m) {
                        if (z4) {
                            ArrayList arrayList = (ArrayList) this.b.a();
                            int size = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size) {
                                    break;
                                }
                                f0 f0Var2 = (f0) arrayList.get(i6);
                                pnf.a.h(this.d, this.a, this, f0Var2);
                                c cVar4 = this.j;
                                if (cVar4 != null) {
                                    this.c = f0Var2;
                                    cVar2 = cVar4;
                                    z3 = true;
                                    break;
                                }
                                i6++;
                            }
                        }
                        if (!z3) {
                            if (f0Var == null) {
                                f0Var = this.b.c();
                            }
                            this.c = f0Var;
                            this.i = 0;
                            c cVar5 = new c(this.d, f0Var);
                            a(cVar5, false);
                            cVar2 = cVar5;
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                }
                if (z3) {
                    this.f.getClass();
                } else {
                    cVar2.d(i2, i3, i4, i5, z, this.e, this.f);
                    pnf.a.j(this.d).a(cVar2.m());
                    synchronized (this.d) {
                        this.k = true;
                        pnf.a.i(this.d, cVar2);
                        if (cVar2.k()) {
                            socket = pnf.a.f(this.d, this.a, this);
                            cVar2 = this.j;
                        }
                    }
                    rnf.h(socket);
                    this.f.getClass();
                }
            }
            synchronized (this.d) {
                if (cVar2.l == 0 && !cVar2.k()) {
                    return cVar2;
                }
            }
            if (cVar2.j(z2)) {
                return cVar2;
            }
            i();
        }
    }

    public void a(c cVar, boolean z) {
        if (this.j == null) {
            this.j = cVar;
            this.k = z;
            cVar.n.add(new a(this, this.g));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        cof cof;
        c cVar;
        synchronized (this.d) {
            this.m = true;
            cof = this.n;
            cVar = this.j;
        }
        if (cof != null) {
            cof.cancel();
        } else if (cVar != null) {
            cVar.c();
        }
    }

    public cof c() {
        cof cof;
        synchronized (this.d) {
            cof = this.n;
        }
        return cof;
    }

    public synchronized c d() {
        return this.j;
    }

    public boolean g() {
        e.a aVar;
        return this.c != null || ((aVar = this.b) != null && aVar.b()) || this.h.b();
    }

    public cof h(y yVar, v.a aVar, boolean z) {
        fof fof = (fof) aVar;
        try {
            cof l2 = f(fof.b(), fof.h(), fof.k(), yVar.r(), yVar.x(), z).l(yVar, fof, this);
            synchronized (this.d) {
                this.n = l2;
            }
            return l2;
        } catch (IOException e2) {
            throw new RouteException(e2);
        }
    }

    public void i() {
        c cVar;
        Socket e2;
        synchronized (this.d) {
            cVar = this.j;
            e2 = e(true, false, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        rnf.h(e2);
        if (cVar != null) {
            this.f.getClass();
        }
    }

    public void j() {
        c cVar;
        Socket e2;
        synchronized (this.d) {
            cVar = this.j;
            e2 = e(false, true, false);
            if (this.j != null) {
                cVar = null;
            }
        }
        rnf.h(e2);
        if (cVar != null) {
            pnf.a.k(this.e, null);
            this.f.getClass();
            this.f.a(this.e);
        }
    }

    public Socket k(c cVar) {
        if (this.n == null && this.j.n.size() == 1) {
            Socket e2 = e(true, false, false);
            this.j = cVar;
            cVar.n.add(this.j.n.get(0));
            return e2;
        }
        throw new IllegalStateException();
    }

    public f0 l() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(java.io.IOException r7) {
        /*
            r6 = this;
            okhttp3.j r0 = r6.d
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0063 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0023
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch:{ all -> 0x0063 }
            okhttp3.internal.http2.ErrorCode r7 = r7.errorCode     // Catch:{ all -> 0x0063 }
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0063 }
            if (r7 != r1) goto L_0x001c
            int r7 = r6.i     // Catch:{ all -> 0x0063 }
            int r7 = r7 + r4
            r6.i = r7     // Catch:{ all -> 0x0063 }
            if (r7 <= r4) goto L_0x0046
            r6.c = r3     // Catch:{ all -> 0x0063 }
            goto L_0x0044
        L_0x001c:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ all -> 0x0063 }
            if (r7 == r1) goto L_0x0046
            r6.c = r3     // Catch:{ all -> 0x0063 }
            goto L_0x0044
        L_0x0023:
            okhttp3.internal.connection.c r1 = r6.j     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0046
            boolean r1 = r1.k()     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0046
        L_0x0031:
            okhttp3.internal.connection.c r1 = r6.j     // Catch:{ all -> 0x0063 }
            int r1 = r1.l     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0044
            okhttp3.f0 r1 = r6.c     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            okhttp3.internal.connection.e r5 = r6.h     // Catch:{ all -> 0x0063 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0063 }
        L_0x0042:
            r6.c = r3     // Catch:{ all -> 0x0063 }
        L_0x0044:
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            okhttp3.internal.connection.c r1 = r6.j     // Catch:{ all -> 0x0063 }
            java.net.Socket r7 = r6.e(r7, r2, r4)     // Catch:{ all -> 0x0063 }
            okhttp3.internal.connection.c r2 = r6.j     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0057
            boolean r2 = r6.k     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r3 = r1
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            defpackage.rnf.h(r7)
            if (r3 == 0) goto L_0x0062
            okhttp3.p r7 = r6.f
            r7.getClass()
        L_0x0062:
            return
        L_0x0063:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.m(java.io.IOException):void");
    }

    public void n(boolean z, cof cof, long j2, IOException iOException) {
        c cVar;
        Socket e2;
        boolean z2;
        this.f.f(this.e, j2);
        synchronized (this.d) {
            if (cof != null) {
                if (cof == this.n) {
                    if (!z) {
                        this.j.l++;
                    }
                    cVar = this.j;
                    e2 = e(z, false, true);
                    if (this.j != null) {
                        cVar = null;
                    }
                    z2 = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + cof);
        }
        rnf.h(e2);
        if (cVar != null) {
            this.f.getClass();
        }
        if (iOException != null) {
            this.f.b(this.e, pnf.a.k(this.e, iOException));
        } else if (z2) {
            pnf.a.k(this.e, null);
            this.f.a(this.e);
        }
    }

    public String toString() {
        c d2 = d();
        return d2 != null ? d2.toString() : this.a.toString();
    }
}
