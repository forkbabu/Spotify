package defpackage;

import com.spotify.cosmos.router.Request;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.a;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.g;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.f;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.p;
import okhttp3.u;
import okhttp3.v;
import okhttp3.y;

/* renamed from: iof  reason: default package */
public final class iof implements v {
    private final y a;
    private volatile f b;
    private Object c;
    private volatile boolean d;

    public iof(y yVar, boolean z) {
        this.a = yVar;
    }

    private a c(u uVar) {
        g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (uVar.l()) {
            SSLSocketFactory z = this.a.z();
            hostnameVerifier = this.a.p();
            sSLSocketFactory = z;
            gVar = this.a.e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new a(uVar.k(), uVar.v(), this.a.m(), this.a.y(), sSLSocketFactory, hostnameVerifier, gVar, this.a.u(), this.a.t(), this.a.s(), this.a.j(), this.a.v());
    }

    private a0 d(d0 d0Var, f0 f0Var) {
        String h;
        int f = d0Var.f();
        String g = d0Var.C().g();
        c0 c0Var = null;
        if (f == 307 || f == 308) {
            if (!g.equals(Request.GET) && !g.equals("HEAD")) {
                return null;
            }
        } else if (f == 401) {
            this.a.c().getClass();
            return null;
        } else if (f != 503) {
            if (f != 407) {
                if (f != 408) {
                    switch (f) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (!this.a.x()) {
                    return null;
                } else {
                    d0Var.C().a();
                    if ((d0Var.v() == null || d0Var.v().f() != 408) && g(d0Var, 0) <= 0) {
                        return d0Var.C();
                    }
                    return null;
                }
            } else if (f0Var.b().type() == Proxy.Type.HTTP) {
                this.a.u().getClass();
                return null;
            } else {
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
        } else if ((d0Var.v() == null || d0Var.v().f() != 503) && g(d0Var, Integer.MAX_VALUE) == 0) {
            return d0Var.C();
        } else {
            return null;
        }
        if (!this.a.n() || (h = d0Var.h("Location")) == null) {
            return null;
        }
        u.a o = d0Var.C().k().o(h);
        u c2 = o != null ? o.c() : null;
        if (c2 == null) {
            return null;
        }
        if (!c2.z().equals(d0Var.C().k().z()) && !this.a.o()) {
            return null;
        }
        a0.a h2 = d0Var.C().h();
        if (yif.F(g)) {
            boolean equals = g.equals("PROPFIND");
            if (!g.equals("PROPFIND")) {
                h2.g(Request.GET, null);
            } else {
                if (equals) {
                    c0Var = d0Var.C().a();
                }
                h2.g(g, c0Var);
            }
            if (!equals) {
                h2.h("Transfer-Encoding");
                h2.h("Content-Length");
                h2.h("Content-Type");
            }
        }
        if (!h(d0Var, c2)) {
            h2.h("Authorization");
        }
        h2.k(c2);
        return h2.b();
    }

    private boolean f(IOException iOException, f fVar, boolean z, a0 a0Var) {
        fVar.m(iOException);
        if (!this.a.x()) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if ((!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) && fVar.g()) {
            return true;
        }
        return false;
    }

    private int g(d0 d0Var, int i) {
        String h = d0Var.h("Retry-After");
        if (h == null) {
            return i;
        }
        if (h.matches("\\d+")) {
            return Integer.valueOf(h).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean h(d0 d0Var, u uVar) {
        u k = d0Var.C().k();
        return k.k().equals(uVar.k()) && k.v() == uVar.v() && k.z().equals(uVar.z());
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        fof fof = (fof) aVar;
        a0 i = fof.i();
        e a2 = fof.a();
        p d2 = fof.d();
        f fVar = new f(this.a.g(), c(i.k()), a2, d2, this.c);
        this.b = fVar;
        int i2 = 0;
        d0 d0Var = null;
        while (!this.d) {
            try {
                d0 g = fof.g(i, fVar, null, null);
                if (d0Var != null) {
                    d0.a s = g.s();
                    d0.a s2 = d0Var.s();
                    s2.b(null);
                    s.l(s2.c());
                    g = s.c();
                }
                try {
                    a0 d3 = d(g, fVar.l());
                    if (d3 == null) {
                        fVar.j();
                        return g;
                    }
                    rnf.g(g.a());
                    int i3 = i2 + 1;
                    if (i3 <= 20) {
                        if (!h(g, d3.k())) {
                            fVar.j();
                            fVar = new f(this.a.g(), c(d3.k()), a2, d2, this.c);
                            this.b = fVar;
                        } else if (fVar.c() != null) {
                            throw new IllegalStateException("Closing the body of " + g + " didn't close its backing stream. Bad interceptor?");
                        }
                        d0Var = g;
                        i = d3;
                        i2 = i3;
                    } else {
                        fVar.j();
                        throw new ProtocolException(je.p0("Too many follow-up requests: ", i3));
                    }
                } catch (IOException e) {
                    fVar.j();
                    throw e;
                }
            } catch (RouteException e2) {
                if (!f(e2.c(), fVar, false, i)) {
                    throw e2.b();
                }
            } catch (IOException e3) {
                if (!f(e3, fVar, !(e3 instanceof ConnectionShutdownException), i)) {
                    throw e3;
                }
            } catch (Throwable th) {
                fVar.m(null);
                fVar.j();
                throw th;
            }
        }
        fVar.j();
        throw new IOException("Canceled");
    }

    public void b() {
        this.d = true;
        f fVar = this.b;
        if (fVar != null) {
            fVar.b();
        }
    }

    public boolean e() {
        return this.d;
    }

    public void i(Object obj) {
        this.c = obj;
    }
}
