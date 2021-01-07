package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import okhttp3.t;
import okio.e;
import okio.g;
import okio.v;
import okio.w;
import okio.x;

public final class j {
    long a = 0;
    long b;
    final int c;
    final e d;
    private final Deque<t> e;
    private boolean f;
    private final b g;
    final a h;
    final c i;
    final c j;
    ErrorCode k;

    /* access modifiers changed from: package-private */
    public final class a implements v {
        private final e a = new e();
        boolean b;
        boolean c;

        a() {
        }

        private void a(boolean z) {
            j jVar;
            long min;
            j jVar2;
            synchronized (j.this) {
                j.this.j.j();
                while (true) {
                    try {
                        jVar = j.this;
                    } finally {
                        j.this.j.o();
                    }
                    if (jVar.b > 0 || this.c || this.b || jVar.k != null) {
                        break;
                    }
                    jVar.o();
                }
                jVar.j.o();
                j.this.c();
                min = Math.min(j.this.b, this.a.size());
                jVar2 = j.this;
                jVar2.b -= min;
            }
            jVar2.j.j();
            try {
                j jVar3 = j.this;
                jVar3.d.b0(jVar3.c, z && min == this.a.size(), this.a, min);
            } finally {
                j.this.j.o();
            }
        }

        @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (j.this) {
                if (this.b) {
                    return;
                }
            }
            if (!j.this.h.c) {
                if (this.a.size() > 0) {
                    while (this.a.size() > 0) {
                        a(true);
                    }
                } else {
                    j jVar = j.this;
                    jVar.d.b0(jVar.c, true, null, 0);
                }
            }
            synchronized (j.this) {
                this.b = true;
            }
            j.this.d.E.flush();
            j.this.b();
        }

        @Override // okio.v, java.io.Flushable
        public void flush() {
            synchronized (j.this) {
                j.this.c();
            }
            while (this.a.size() > 0) {
                a(false);
                j.this.d.E.flush();
            }
        }

        @Override // okio.v
        public x k() {
            return j.this.j;
        }

        @Override // okio.v
        public void l0(e eVar, long j) {
            this.a.l0(eVar, j);
            while (this.a.size() >= 16384) {
                a(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b implements w {
        private final e a = new e();
        private final e b = new e();
        private final long c;
        boolean f;
        boolean n;

        b(long j) {
            this.c = j;
        }

        private void b(long j) {
            j.this.d.W(j);
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (j.this) {
                    z = this.n;
                    z2 = true;
                    z3 = this.b.size() + j > this.c;
                }
                if (z3) {
                    gVar.skip(j);
                    j.this.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    gVar.skip(j);
                    return;
                } else {
                    long c2 = gVar.c2(this.a, j);
                    if (c2 != -1) {
                        j -= c2;
                        synchronized (j.this) {
                            if (this.f) {
                                j2 = this.a.size();
                                this.a.b();
                            } else {
                                if (this.b.size() != 0) {
                                    z2 = false;
                                }
                                this.b.n0(this.a);
                                if (z2) {
                                    j.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            b(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
            r11 = -1;
         */
        @Override // okio.w
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long c2(okio.e r11, long r12) {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00af
            L_0x0006:
                r2 = 0
                okhttp3.internal.http2.j r3 = okhttp3.internal.http2.j.this
                monitor-enter(r3)
                okhttp3.internal.http2.j r4 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00ac }
                okhttp3.internal.http2.j$c r4 = r4.i     // Catch:{ all -> 0x00ac }
                r4.j()     // Catch:{ all -> 0x00ac }
                okhttp3.internal.http2.j r4 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00a3 }
                okhttp3.internal.http2.ErrorCode r5 = r4.k     // Catch:{ all -> 0x00a3 }
                if (r5 == 0) goto L_0x0018
                r2 = r5
            L_0x0018:
                boolean r5 = r10.f     // Catch:{ all -> 0x00a3 }
                if (r5 != 0) goto L_0x009b
                java.util.Deque r4 = okhttp3.internal.http2.j.a(r4)     // Catch:{ all -> 0x00a3 }
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00a3 }
                if (r4 != 0) goto L_0x002b
                okhttp3.internal.http2.j r4 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00a3 }
                r4.getClass()     // Catch:{ all -> 0x00a3 }
            L_0x002b:
                okio.e r4 = r10.b     // Catch:{ all -> 0x00a3 }
                long r4 = r4.size()     // Catch:{ all -> 0x00a3 }
                r6 = -1
                int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x006d
                okio.e r4 = r10.b     // Catch:{ all -> 0x00a3 }
                long r8 = r4.size()     // Catch:{ all -> 0x00a3 }
                long r12 = java.lang.Math.min(r12, r8)     // Catch:{ all -> 0x00a3 }
                long r11 = r4.c2(r11, r12)     // Catch:{ all -> 0x00a3 }
                okhttp3.internal.http2.j r13 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00a3 }
                long r4 = r13.a     // Catch:{ all -> 0x00a3 }
                long r4 = r4 + r11
                r13.a = r4     // Catch:{ all -> 0x00a3 }
                if (r2 != 0) goto L_0x0082
                okhttp3.internal.http2.e r13 = r13.d     // Catch:{ all -> 0x00a3 }
                okhttp3.internal.http2.n r13 = r13.B     // Catch:{ all -> 0x00a3 }
                int r13 = r13.d()     // Catch:{ all -> 0x00a3 }
                int r13 = r13 / 2
                long r8 = (long) r13     // Catch:{ all -> 0x00a3 }
                int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r13 < 0) goto L_0x0082
                okhttp3.internal.http2.j r13 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00a3 }
                okhttp3.internal.http2.e r4 = r13.d     // Catch:{ all -> 0x00a3 }
                int r5 = r13.c     // Catch:{ all -> 0x00a3 }
                long r8 = r13.a     // Catch:{ all -> 0x00a3 }
                r4.f0(r5, r8)     // Catch:{ all -> 0x00a3 }
                okhttp3.internal.http2.j r13 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00a3 }
                r13.a = r0     // Catch:{ all -> 0x00a3 }
                goto L_0x0082
            L_0x006d:
                boolean r4 = r10.n     // Catch:{ all -> 0x00a3 }
                if (r4 != 0) goto L_0x0081
                if (r2 != 0) goto L_0x0081
                okhttp3.internal.http2.j r2 = okhttp3.internal.http2.j.this     // Catch:{ all -> 0x00a3 }
                r2.o()     // Catch:{ all -> 0x00a3 }
                okhttp3.internal.http2.j r2 = okhttp3.internal.http2.j.this
                okhttp3.internal.http2.j$c r2 = r2.i
                r2.o()
                monitor-exit(r3)
                goto L_0x0006
            L_0x0081:
                r11 = r6
            L_0x0082:
                okhttp3.internal.http2.j r13 = okhttp3.internal.http2.j.this
                okhttp3.internal.http2.j$c r13 = r13.i
                r13.o()
                monitor-exit(r3)
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 == 0) goto L_0x0092
                r10.b(r11)
                return r11
            L_0x0092:
                if (r2 != 0) goto L_0x0095
                return r6
            L_0x0095:
                okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException
                r11.<init>(r2)
                throw r11
            L_0x009b:
                java.io.IOException r11 = new java.io.IOException
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)
                throw r11
            L_0x00a3:
                r11 = move-exception
                okhttp3.internal.http2.j r12 = okhttp3.internal.http2.j.this
                okhttp3.internal.http2.j$c r12 = r12.i
                r12.o()
                throw r11
            L_0x00ac:
                r11 = move-exception
                monitor-exit(r3)
                throw r11
            L_0x00af:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r12 = defpackage.je.t0(r0, r12)
                r11.<init>(r12)
                goto L_0x00bc
            L_0x00bb:
                throw r11
            L_0x00bc:
                goto L_0x00bb
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.j.b.c2(okio.e, long):long");
        }

        @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            synchronized (j.this) {
                this.f = true;
                size = this.b.size();
                this.b.b();
                if (!j.this.e.isEmpty()) {
                    j.this.getClass();
                }
                j.this.notifyAll();
            }
            if (size > 0) {
                b(size);
            }
            j.this.b();
        }

        @Override // okio.w
        public x k() {
            return j.this.i;
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends okio.c {
        c() {
        }

        /* access modifiers changed from: protected */
        @Override // okio.c
        public IOException m(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        @Override // okio.c
        public void n() {
            j.this.f(ErrorCode.CANCEL);
            j.this.d.O();
        }

        public void o() {
            if (l()) {
                throw m(null);
            }
        }
    }

    j(int i2, e eVar, boolean z, boolean z2, t tVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.i = new c();
        this.j = new c();
        this.k = null;
        if (eVar != null) {
            this.c = i2;
            this.d = eVar;
            this.b = (long) eVar.C.d();
            b bVar = new b((long) eVar.B.d());
            this.g = bVar;
            a aVar = new a();
            this.h = aVar;
            bVar.n = z2;
            aVar.c = z;
            if (tVar != null) {
                arrayDeque.add(tVar);
            }
            if (i() && tVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!i() && tVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean e(ErrorCode errorCode) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.n && this.h.c) {
                return false;
            }
            this.k = errorCode;
            notifyAll();
            this.d.M(this.c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        boolean z;
        boolean j2;
        synchronized (this) {
            b bVar = this.g;
            if (!bVar.n && bVar.f) {
                a aVar = this.h;
                if (aVar.c || aVar.b) {
                    z = true;
                    j2 = j();
                }
            }
            z = false;
            j2 = j();
        }
        if (z) {
            d(ErrorCode.CANCEL);
        } else if (!j2) {
            this.d.M(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a aVar = this.h;
        if (aVar.b) {
            throw new IOException("stream closed");
        } else if (aVar.c) {
            throw new IOException("stream finished");
        } else if (this.k != null) {
            throw new StreamResetException(this.k);
        }
    }

    public void d(ErrorCode errorCode) {
        if (e(errorCode)) {
            e eVar = this.d;
            eVar.E.m(this.c, errorCode);
        }
    }

    public void f(ErrorCode errorCode) {
        if (e(errorCode)) {
            this.d.d0(this.c, errorCode);
        }
    }

    public v g() {
        synchronized (this) {
            if (!this.f) {
                if (!i()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.h;
    }

    public w h() {
        return this.g;
    }

    public boolean i() {
        if (this.d.a == ((this.c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean j() {
        if (this.k != null) {
            return false;
        }
        b bVar = this.g;
        if (bVar.n || bVar.f) {
            a aVar = this.h;
            if ((aVar.c || aVar.b) && this.f) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void k(g gVar, int i2) {
        this.g.a(gVar, (long) i2);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        boolean j2;
        synchronized (this) {
            this.g.n = true;
            j2 = j();
            notifyAll();
        }
        if (!j2) {
            this.d.M(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(List<a> list) {
        boolean j2;
        synchronized (this) {
            this.f = true;
            this.e.add(rnf.A(list));
            j2 = j();
            notifyAll();
        }
        if (!j2) {
            this.d.M(this.c);
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized t n() {
        this.i.j();
        while (this.e.isEmpty() && this.k == null) {
            try {
                o();
            } catch (Throwable th) {
                this.i.o();
                throw th;
            }
        }
        this.i.o();
        if (!this.e.isEmpty()) {
        } else {
            throw new StreamResetException(this.k);
        }
        return this.e.removeFirst();
    }

    /* access modifiers changed from: package-private */
    public void o() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
