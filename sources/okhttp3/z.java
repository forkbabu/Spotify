package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okio.c;

/* access modifiers changed from: package-private */
public final class z implements e {
    final y a;
    final iof b;
    final c c;
    private p f;
    final a0 n;
    final boolean o;
    private boolean p;

    class a extends c {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // okio.c
        public void n() {
            z.this.b.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends qnf {
        private final f b;

        b(f fVar) {
            super("OkHttp %s", z.this.n.a.y());
            this.b = fVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ IOException -> 0x004f, all -> 0x0025, all -> 0x0092 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[Catch:{ IOException -> 0x004f, all -> 0x0025, all -> 0x0092 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[Catch:{ IOException -> 0x004f, all -> 0x0025, all -> 0x0092 }] */
        @Override // defpackage.qnf
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r5 = this;
                okhttp3.z r0 = okhttp3.z.this
                okio.c r0 = r0.c
                r0.j()
                r0 = 0
                okhttp3.z r1 = okhttp3.z.this     // Catch:{ IOException -> 0x004f, all -> 0x0025 }
                okhttp3.d0 r0 = r1.c()     // Catch:{ IOException -> 0x004f, all -> 0x0025 }
                r1 = 1
                okhttp3.f r2 = r5.b     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
                okhttp3.z r3 = okhttp3.z.this     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
                r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
                okhttp3.z r0 = okhttp3.z.this
                okhttp3.y r0 = r0.a
            L_0x001a:
                okhttp3.n r0 = r0.a
                r0.d(r5)
                goto L_0x0091
            L_0x0021:
                r0 = move-exception
                goto L_0x0028
            L_0x0023:
                r0 = move-exception
                goto L_0x0052
            L_0x0025:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0028:
                okhttp3.z r2 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                iof r2 = r2.b     // Catch:{ all -> 0x0092 }
                r2.b()     // Catch:{ all -> 0x0092 }
                if (r1 != 0) goto L_0x004e
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0092 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
                r2.<init>()     // Catch:{ all -> 0x0092 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0092 }
                r2.append(r0)     // Catch:{ all -> 0x0092 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0092 }
                r1.<init>(r2)     // Catch:{ all -> 0x0092 }
                okhttp3.f r2 = r5.b     // Catch:{ all -> 0x0092 }
                okhttp3.z r3 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                r2.onFailure(r3, r1)     // Catch:{ all -> 0x0092 }
            L_0x004e:
                throw r0     // Catch:{ all -> 0x0092 }
            L_0x004f:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0052:
                okhttp3.z r2 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                java.io.IOException r0 = r2.e(r0)     // Catch:{ all -> 0x0092 }
                if (r1 == 0) goto L_0x007a
                sof r1 = defpackage.sof.h()     // Catch:{ all -> 0x0092 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
                r3.<init>()     // Catch:{ all -> 0x0092 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0092 }
                okhttp3.z r4 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                java.lang.String r4 = r4.f()     // Catch:{ all -> 0x0092 }
                r3.append(r4)     // Catch:{ all -> 0x0092 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0092 }
                r1.m(r2, r3, r0)     // Catch:{ all -> 0x0092 }
                goto L_0x008c
            L_0x007a:
                okhttp3.z r1 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                okhttp3.p r1 = okhttp3.z.b(r1)     // Catch:{ all -> 0x0092 }
                okhttp3.z r2 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                r1.b(r2, r0)     // Catch:{ all -> 0x0092 }
                okhttp3.f r1 = r5.b     // Catch:{ all -> 0x0092 }
                okhttp3.z r2 = okhttp3.z.this     // Catch:{ all -> 0x0092 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0092 }
            L_0x008c:
                okhttp3.z r0 = okhttp3.z.this
                okhttp3.y r0 = r0.a
                goto L_0x001a
            L_0x0091:
                return
            L_0x0092:
                r0 = move-exception
                okhttp3.z r1 = okhttp3.z.this
                okhttp3.y r1 = r1.a
                okhttp3.n r1 = r1.a
                r1.d(r5)
                goto L_0x009e
            L_0x009d:
                throw r0
            L_0x009e:
                goto L_0x009d
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.z.b.a():void");
        }

        /* access modifiers changed from: package-private */
        public void b(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                z.this.f.b(z.this, interruptedIOException);
                this.b.onFailure(z.this, interruptedIOException);
                z.this.a.a.d(this);
            } catch (Throwable th) {
                z.this.a.a.d(this);
                throw th;
            }
        }
    }

    private z(y yVar, a0 a0Var, boolean z) {
        this.a = yVar;
        this.n = a0Var;
        this.o = z;
        this.b = new iof(yVar, z);
        a aVar = new a();
        this.c = aVar;
        aVar.g((long) yVar.G, TimeUnit.MILLISECONDS);
    }

    static z d(y yVar, a0 a0Var, boolean z) {
        z zVar = new z(yVar, a0Var, z);
        zVar.f = yVar.p.a(zVar);
        return zVar;
    }

    /* access modifiers changed from: package-private */
    public d0 c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.n);
        arrayList.add(this.b);
        arrayList.add(new aof(this.a.r));
        y yVar = this.a;
        c cVar = yVar.s;
        arrayList.add(new tnf(cVar != null ? cVar.a : yVar.t));
        arrayList.add(new okhttp3.internal.connection.a(this.a));
        if (!this.o) {
            arrayList.addAll(this.a.o);
        }
        arrayList.add(new bof(this.o));
        a0 a0Var = this.n;
        p pVar = this.f;
        y yVar2 = this.a;
        d0 f2 = new fof(arrayList, null, null, null, 0, a0Var, this, pVar, yVar2.H, yVar2.I, yVar2.J).f(a0Var);
        if (!this.b.e()) {
            return f2;
        }
        rnf.g(f2);
        throw new IOException("Canceled");
    }

    @Override // okhttp3.e
    public void cancel() {
        this.b.b();
    }

    @Override // java.lang.Object
    public Object clone() {
        y yVar = this.a;
        z zVar = new z(yVar, this.n, this.o);
        zVar.f = yVar.p.a(zVar);
        return zVar;
    }

    /* access modifiers changed from: package-private */
    public IOException e(IOException iOException) {
        if (!this.c.l()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.e() ? "canceled " : "");
        sb.append(this.o ? "web socket" : "call");
        sb.append(" to ");
        sb.append(this.n.a.y());
        return sb.toString();
    }

    @Override // okhttp3.e
    public d0 h() {
        synchronized (this) {
            if (!this.p) {
                this.p = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.b.i(sof.h().k("response.body().close()"));
        this.c.j();
        this.f.c(this);
        try {
            this.a.a.b(this);
            d0 c2 = c();
            if (c2 != null) {
                this.a.a.e(this);
                return c2;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            IOException e2 = e(e);
            this.f.b(this, e2);
            throw e2;
        } catch (Throwable th) {
            this.a.a.e(this);
            throw th;
        }
    }

    @Override // okhttp3.e
    public void h1(f fVar) {
        synchronized (this) {
            if (!this.p) {
                this.p = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.b.i(sof.h().k("response.body().close()"));
        this.f.c(this);
        this.a.a.a(new b(fVar));
    }

    @Override // okhttp3.e
    public a0 i() {
        return this.n;
    }

    @Override // okhttp3.e
    public boolean l() {
        return this.b.e();
    }
}
