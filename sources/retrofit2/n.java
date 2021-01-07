package retrofit2;

import java.io.IOException;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.f;
import okio.g;
import okio.j;
import okio.o;
import okio.w;

final class n<T> implements b<T> {
    private final u a;
    private final Object[] b;
    private final e.a c;
    private final j<e0, T> f;
    private volatile boolean n;
    private e o;
    private Throwable p;
    private boolean q;

    class a implements f {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // okhttp3.f
        public void onFailure(e eVar, IOException iOException) {
            try {
                this.a.a(n.this, iOException);
            } catch (Throwable th) {
                a0.p(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.f
        public void onResponse(e eVar, d0 d0Var) {
            try {
                try {
                    this.a.b(n.this, n.this.c(d0Var));
                } catch (Throwable th) {
                    a0.p(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                a0.p(th2);
                th2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends e0 {
        private final e0 b;
        private final g c;
        IOException f;

        class a extends j {
            a(w wVar) {
                super(wVar);
            }

            @Override // okio.j, okio.w
            public long c2(okio.e eVar, long j) {
                try {
                    return super.c2(eVar, j);
                } catch (IOException e) {
                    b.this.f = e;
                    throw e;
                }
            }
        }

        b(e0 e0Var) {
            this.b = e0Var;
            this.c = o.d(new a(e0Var.l()));
        }

        @Override // okhttp3.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // okhttp3.e0
        public long f() {
            return this.b.f();
        }

        @Override // okhttp3.e0
        public okhttp3.w g() {
            return this.b.g();
        }

        @Override // okhttp3.e0
        public g l() {
            return this.c;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends e0 {
        private final okhttp3.w b;
        private final long c;

        c(okhttp3.w wVar, long j) {
            this.b = wVar;
            this.c = j;
        }

        @Override // okhttp3.e0
        public long f() {
            return this.c;
        }

        @Override // okhttp3.e0
        public okhttp3.w g() {
            return this.b;
        }

        @Override // okhttp3.e0
        public g l() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    n(u uVar, Object[] objArr, e.a aVar, j<e0, T> jVar) {
        this.a = uVar;
        this.b = objArr;
        this.c = aVar;
        this.f = jVar;
    }

    private e b() {
        e b2 = this.c.b(this.a.a(this.b));
        if (b2 != null) {
            return b2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.b
    public b G1() {
        return new n(this.a, this.b, this.c, this.f);
    }

    /* access modifiers changed from: package-private */
    public v<T> c(d0 d0Var) {
        e0 a2 = d0Var.a();
        d0.a s = d0Var.s();
        s.b(new c(a2.g(), a2.f()));
        d0 c2 = s.c();
        int f2 = c2.f();
        if (f2 < 200 || f2 >= 300) {
            try {
                return v.c(a0.a(a2), c2);
            } finally {
                a2.close();
            }
        } else if (f2 == 204 || f2 == 205) {
            a2.close();
            return v.i(null, c2);
        } else {
            b bVar = new b(a2);
            try {
                return v.i(this.f.convert(bVar), c2);
            } catch (RuntimeException e) {
                IOException iOException = bVar.f;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }

    @Override // retrofit2.b
    public void cancel() {
        e eVar;
        this.n = true;
        synchronized (this) {
            eVar = this.o;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return new n(this.a, this.b, this.c, this.f);
    }

    @Override // retrofit2.b
    public void d0(d<T> dVar) {
        e eVar;
        Throwable th;
        synchronized (this) {
            if (!this.q) {
                this.q = true;
                eVar = this.o;
                th = this.p;
                if (eVar == null && th == null) {
                    try {
                        e b2 = b();
                        this.o = b2;
                        eVar = b2;
                    } catch (Throwable th2) {
                        th = th2;
                        a0.p(th);
                        this.p = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.n) {
            eVar.cancel();
        }
        eVar.h1(new a(dVar));
    }

    @Override // retrofit2.b
    public v<T> h() {
        e eVar;
        synchronized (this) {
            if (!this.q) {
                this.q = true;
                Throwable th = this.p;
                if (th == null) {
                    eVar = this.o;
                    if (eVar == null) {
                        try {
                            eVar = b();
                            this.o = eVar;
                        } catch (IOException | Error | RuntimeException e) {
                            a0.p(e);
                            this.p = e;
                            throw e;
                        }
                    }
                } else if (th instanceof IOException) {
                    throw ((IOException) th);
                } else if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.n) {
            eVar.cancel();
        }
        return c(eVar.h());
    }

    @Override // retrofit2.b
    public synchronized a0 i() {
        e eVar = this.o;
        if (eVar != null) {
            return eVar.i();
        }
        Throwable th = this.p;
        if (th == null) {
            try {
                e b2 = b();
                this.o = b2;
                return b2.i();
            } catch (Error | RuntimeException e) {
                a0.p(e);
                this.p = e;
                throw e;
            } catch (IOException e2) {
                this.p = e2;
                throw new RuntimeException("Unable to create request.", e2);
            }
        } else if (th instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.p);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    @Override // retrofit2.b
    public boolean l() {
        boolean z = true;
        if (this.n) {
            return true;
        }
        synchronized (this) {
            e eVar = this.o;
            if (eVar == null || !eVar.l()) {
                z = false;
            }
        }
        return z;
    }
}
