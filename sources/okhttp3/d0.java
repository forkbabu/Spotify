package okhttp3;

import java.io.Closeable;
import okhttp3.t;

public final class d0 implements Closeable {
    final a0 a;
    final Protocol b;
    final int c;
    final String f;
    final s n;
    final t o;
    final e0 p;
    final d0 q;
    final d0 r;
    final d0 s;
    final long t;
    final long u;
    private volatile d v;

    d0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.f = aVar.d;
        this.n = aVar.e;
        this.o = new t(aVar.f);
        this.p = aVar.g;
        this.q = aVar.h;
        this.r = aVar.i;
        this.s = aVar.j;
        this.t = aVar.k;
        this.u = aVar.l;
    }

    public long B() {
        return this.u;
    }

    public a0 C() {
        return this.a;
    }

    public long D() {
        return this.t;
    }

    public e0 a() {
        return this.p;
    }

    public d b() {
        d dVar = this.v;
        if (dVar != null) {
            return dVar;
        }
        d j = d.j(this.o);
        this.v = j;
        return j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0 e0Var = this.p;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public d0 d() {
        return this.r;
    }

    public int f() {
        return this.c;
    }

    public s g() {
        return this.n;
    }

    public String h(String str) {
        String c2 = this.o.c(str);
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    public String i(String str, String str2) {
        String c2 = this.o.c(str);
        return c2 != null ? c2 : str2;
    }

    public t l() {
        return this.o;
    }

    public boolean m() {
        int i = this.c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public boolean p() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public String q() {
        return this.f;
    }

    public d0 r() {
        return this.q;
    }

    public a s() {
        return new a(this);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Response{protocol=");
        V0.append(this.b);
        V0.append(", code=");
        V0.append(this.c);
        V0.append(", message=");
        V0.append(this.f);
        V0.append(", url=");
        V0.append(this.a.a);
        V0.append('}');
        return V0.toString();
    }

    public d0 v() {
        return this.s;
    }

    public Protocol w() {
        return this.b;
    }

    public static class a {
        a0 a;
        Protocol b;
        int c;
        String d;
        s e;
        t.a f;
        e0 g;
        d0 h;
        d0 i;
        d0 j;
        long k;
        long l;

        public a() {
            this.c = -1;
            this.f = new t.a();
        }

        private void e(String str, d0 d0Var) {
            if (d0Var.p != null) {
                throw new IllegalArgumentException(je.x0(str, ".body != null"));
            } else if (d0Var.q != null) {
                throw new IllegalArgumentException(je.x0(str, ".networkResponse != null"));
            } else if (d0Var.r != null) {
                throw new IllegalArgumentException(je.x0(str, ".cacheResponse != null"));
            } else if (d0Var.s != null) {
                throw new IllegalArgumentException(je.x0(str, ".priorResponse != null"));
            }
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            this.g = e0Var;
            return this;
        }

        public d0 c() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder V0 = je.V0("code < 0: ");
                V0.append(this.c);
                throw new IllegalStateException(V0.toString());
            } else if (this.d != null) {
                return new d0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a d(d0 d0Var) {
            if (d0Var != null) {
                e("cacheResponse", d0Var);
            }
            this.i = d0Var;
            return this;
        }

        public a f(int i2) {
            this.c = i2;
            return this;
        }

        public a g(s sVar) {
            this.e = sVar;
            return this;
        }

        public a h(String str, String str2) {
            t.a aVar = this.f;
            aVar.getClass();
            t.a(str);
            t.b(str2, str);
            aVar.g(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a i(t tVar) {
            this.f = tVar.e();
            return this;
        }

        public a j(String str) {
            this.d = str;
            return this;
        }

        public a k(d0 d0Var) {
            if (d0Var != null) {
                e("networkResponse", d0Var);
            }
            this.h = d0Var;
            return this;
        }

        public a l(d0 d0Var) {
            if (d0Var.p == null) {
                this.j = d0Var;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        public a m(Protocol protocol) {
            this.b = protocol;
            return this;
        }

        public a n(long j2) {
            this.l = j2;
            return this;
        }

        public a o(String str) {
            this.f.g(str);
            return this;
        }

        public a p(a0 a0Var) {
            this.a = a0Var;
            return this;
        }

        public a q(long j2) {
            this.k = j2;
            return this;
        }

        a(d0 d0Var) {
            this.c = -1;
            this.a = d0Var.a;
            this.b = d0Var.b;
            this.c = d0Var.c;
            this.d = d0Var.f;
            this.e = d0Var.n;
            this.f = d0Var.o.e();
            this.g = d0Var.p;
            this.h = d0Var.q;
            this.i = d0Var.r;
            this.j = d0Var.s;
            this.k = d0Var.t;
            this.l = d0Var.u;
        }
    }
}
