package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Protocol;
import okhttp3.a;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.i;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.d;
import okhttp3.internal.http2.e;
import okhttp3.j;
import okhttp3.p;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okhttp3.y;
import okio.f;
import okio.g;
import okio.o;
import okio.w;
import okio.x;

public final class c extends e.j implements i {
    private final j b;
    private final f0 c;
    private Socket d;
    private Socket e;
    private s f;
    private Protocol g;
    private e h;
    private g i;
    private f j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<f>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(j jVar, f0 f0Var) {
        this.b = jVar;
        this.c = f0Var;
    }

    private void e(int i2, int i3, okhttp3.e eVar, p pVar) {
        Socket socket;
        Proxy b2 = this.c.b();
        a a = this.c.a();
        if (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) {
            socket = a.j().createSocket();
        } else {
            socket = new Socket(b2);
        }
        this.d = socket;
        pVar.d(eVar, this.c.d(), b2);
        this.d.setSoTimeout(i3);
        try {
            sof.h().g(this.d, this.c.d(), i2);
            try {
                this.i = o.d(o.k(this.d));
                this.j = o.c(o.h(this.d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder V0 = je.V0("Failed to connect to ");
            V0.append(this.c.d());
            ConnectException connectException = new ConnectException(V0.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private void f(int i2, int i3, int i4, okhttp3.e eVar, p pVar) {
        a0.a aVar = new a0.a();
        aVar.k(this.c.a().l());
        aVar.g("CONNECT", null);
        aVar.e("Host", rnf.p(this.c.a().l(), true));
        aVar.e("Proxy-Connection", "Keep-Alive");
        aVar.e("User-Agent", "okhttp/3.12.10");
        a0 b2 = aVar.b();
        d0.a aVar2 = new d0.a();
        aVar2.p(b2);
        aVar2.m(Protocol.HTTP_1_1);
        aVar2.f(407);
        aVar2.j("Preemptive Authenticate");
        aVar2.b(rnf.c);
        aVar2.q(-1);
        aVar2.n(-1);
        aVar2.h("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.c();
        this.c.a().h().getClass();
        u k2 = b2.k();
        e(i2, i3, eVar, pVar);
        StringBuilder V0 = je.V0("CONNECT ");
        V0.append(rnf.p(k2, true));
        V0.append(" HTTP/1.1");
        String sb = V0.toString();
        g gVar = this.i;
        kof kof = new kof(null, null, gVar, this.j);
        x k3 = gVar.k();
        long j2 = (long) i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k3.g(j2, timeUnit);
        this.j.k().g((long) i4, timeUnit);
        kof.k(b2.e(), sb);
        kof.a();
        d0.a e2 = kof.e(false);
        e2.p(b2);
        d0 c2 = e2.c();
        long a = eof.a(c2);
        if (a == -1) {
            a = 0;
        }
        w h2 = kof.h(a);
        rnf.w(h2, Integer.MAX_VALUE, timeUnit);
        h2.close();
        int f2 = c2.f();
        if (f2 != 200) {
            if (f2 == 407) {
                this.c.a().h().getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder V02 = je.V0("Unexpected response code for CONNECT: ");
            V02.append(c2.f());
            throw new IOException(V02.toString());
        } else if (!this.i.c().l1() || !this.j.c().l1()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016e A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0174 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(okhttp3.internal.connection.b r7, int r8, okhttp3.e r9, okhttp3.p r10) {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.g(okhttp3.internal.connection.b, int, okhttp3.e, okhttp3.p):void");
    }

    private void o(int i2) {
        this.e.setSoTimeout(0);
        e.h hVar = new e.h(true);
        hVar.d(this.e, this.c.a().l().k(), this.i, this.j);
        hVar.b(this);
        hVar.c(i2);
        e a = hVar.a();
        this.h = a;
        a.U();
    }

    @Override // okhttp3.internal.http2.e.j
    public void a(e eVar) {
        synchronized (this.b) {
            this.m = eVar.w();
        }
    }

    @Override // okhttp3.internal.http2.e.j
    public void b(okhttp3.internal.http2.j jVar) {
        jVar.d(ErrorCode.REFUSED_STREAM);
    }

    public void c() {
        rnf.h(this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081 A[Catch:{ IOException -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r14, int r15, int r16, int r17, boolean r18, okhttp3.e r19, okhttp3.p r20) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.d(int, int, int, int, boolean, okhttp3.e, okhttp3.p):void");
    }

    public s h() {
        return this.f;
    }

    public boolean i(a aVar, f0 f0Var) {
        if (this.n.size() >= this.m || this.k || !pnf.a.g(this.c.a(), aVar)) {
            return false;
        }
        if (aVar.l().k().equals(this.c.a().l().k())) {
            return true;
        }
        if (this.h == null || f0Var == null || f0Var.b().type() != Proxy.Type.DIRECT || this.c.b().type() != Proxy.Type.DIRECT || !this.c.d().equals(f0Var.d()) || f0Var.a().e() != xof.a || !p(aVar.l())) {
            return false;
        }
        try {
            aVar.a().a(aVar.l().k(), this.f.e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean j(boolean z) {
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        e eVar = this.h;
        if (eVar != null) {
            return eVar.v(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.e.getSoTimeout();
                try {
                    this.e.setSoTimeout(1);
                    if (this.i.l1()) {
                        this.e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.e.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean k() {
        return this.h != null;
    }

    public cof l(y yVar, v.a aVar, f fVar) {
        if (this.h != null) {
            return new d(yVar, aVar, fVar, this.h);
        }
        fof fof = (fof) aVar;
        this.e.setSoTimeout(fof.h());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.i.k().g((long) fof.h(), timeUnit);
        this.j.k().g((long) fof.k(), timeUnit);
        return new kof(yVar, fVar, this.i, this.j);
    }

    public f0 m() {
        return this.c;
    }

    public Socket n() {
        return this.e;
    }

    public boolean p(u uVar) {
        if (uVar.v() != this.c.a().l().v()) {
            return false;
        }
        if (uVar.k().equals(this.c.a().l().k())) {
            return true;
        }
        if (this.f == null || !xof.a.c(uVar.k(), (X509Certificate) this.f.e().get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Connection{");
        V0.append(this.c.a().l().k());
        V0.append(":");
        V0.append(this.c.a().l().v());
        V0.append(", proxy=");
        V0.append(this.c.b());
        V0.append(" hostAddress=");
        V0.append(this.c.d());
        V0.append(" cipherSuite=");
        s sVar = this.f;
        V0.append(sVar != null ? sVar.a() : "none");
        V0.append(" protocol=");
        V0.append(this.g);
        V0.append('}');
        return V0.toString();
    }
}
