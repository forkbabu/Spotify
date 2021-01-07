package okhttp3;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.h;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.d;
import okhttp3.internal.connection.f;
import okhttp3.p;
import okhttp3.t;

public class y implements Cloneable, e.a {
    static final List<Protocol> L = rnf.r(Protocol.HTTP_2, Protocol.HTTP_1_1);
    static final List<k> M = rnf.r(k.g, k.i);
    final b A;
    final j B;
    final o C;
    final boolean D;
    final boolean E;
    final boolean F;
    final int G;
    final int H;
    final int I;
    final int J;
    final int K;
    final n a;
    final Proxy b;
    final List<Protocol> c;
    final List<k> f;
    final List<v> n;
    final List<v> o;
    final p.b p;
    final ProxySelector q;
    final m r;
    final c s;
    final znf t;
    final SocketFactory u;
    final SSLSocketFactory v;
    final wof w;
    final HostnameVerifier x;
    final g y;
    final b z;

    class a extends pnf {
        a() {
        }

        @Override // defpackage.pnf
        public void a(t.a aVar, String str) {
            aVar.c(str);
        }

        @Override // defpackage.pnf
        public void b(t.a aVar, String str, String str2) {
            aVar.a.add(str);
            aVar.a.add(str2.trim());
        }

        @Override // defpackage.pnf
        public void c(k kVar, SSLSocket sSLSocket, boolean z) {
            String[] strArr;
            String[] strArr2;
            if (kVar.c != null) {
                strArr = rnf.t(h.b, sSLSocket.getEnabledCipherSuites(), kVar.c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (kVar.d != null) {
                strArr2 = rnf.t(rnf.p, sSLSocket.getEnabledProtocols(), kVar.d);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            Comparator<String> comparator = h.b;
            byte[] bArr = rnf.a;
            int length = supportedCipherSuites.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (((h.a) comparator).compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i++;
            }
            if (z && i != -1) {
                String str = supportedCipherSuites[i];
                int length2 = strArr.length + 1;
                String[] strArr3 = new String[length2];
                System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                strArr3[length2 - 1] = str;
                strArr = strArr3;
            }
            boolean z2 = kVar.a;
            if (!z2) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                String[] strArr4 = (String[]) strArr.clone();
                if (!z2) {
                    throw new IllegalStateException("no TLS versions for cleartext connections");
                } else if (strArr2.length != 0) {
                    String[] strArr5 = (String[]) strArr2.clone();
                    if (strArr5 != null) {
                        sSLSocket.setEnabledProtocols(strArr5);
                    }
                    if (strArr4 != null) {
                        sSLSocket.setEnabledCipherSuites(strArr4);
                    }
                } else {
                    throw new IllegalArgumentException("At least one TLS version is required");
                }
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        @Override // defpackage.pnf
        public int d(d0.a aVar) {
            return aVar.c;
        }

        @Override // defpackage.pnf
        public boolean e(j jVar, c cVar) {
            return jVar.b(cVar);
        }

        @Override // defpackage.pnf
        public Socket f(j jVar, a aVar, f fVar) {
            return jVar.c(aVar, fVar);
        }

        @Override // defpackage.pnf
        public boolean g(a aVar, a aVar2) {
            return aVar.d(aVar2);
        }

        @Override // defpackage.pnf
        public c h(j jVar, a aVar, f fVar, f0 f0Var) {
            return jVar.d(aVar, fVar, f0Var);
        }

        @Override // defpackage.pnf
        public void i(j jVar, c cVar) {
            jVar.f(cVar);
        }

        @Override // defpackage.pnf
        public d j(j jVar) {
            return jVar.e;
        }

        @Override // defpackage.pnf
        public IOException k(e eVar, IOException iOException) {
            return ((z) eVar).e(iOException);
        }
    }

    static {
        pnf.a = new a();
    }

    public y() {
        this(new b());
    }

    public int A() {
        return this.J;
    }

    @Override // okhttp3.e.a
    public e b(a0 a0Var) {
        return z.d(this, a0Var, false);
    }

    public b c() {
        return this.A;
    }

    public c d() {
        return this.s;
    }

    public g e() {
        return this.y;
    }

    public int f() {
        return this.H;
    }

    public j g() {
        return this.B;
    }

    public List<k> j() {
        return this.f;
    }

    public m k() {
        return this.r;
    }

    public o m() {
        return this.C;
    }

    public boolean n() {
        return this.E;
    }

    public boolean o() {
        return this.D;
    }

    public HostnameVerifier p() {
        return this.x;
    }

    public b q() {
        return new b(this);
    }

    public int r() {
        return this.K;
    }

    public List<Protocol> s() {
        return this.c;
    }

    public Proxy t() {
        return this.b;
    }

    public b u() {
        return this.z;
    }

    public ProxySelector v() {
        return this.q;
    }

    public int w() {
        return this.I;
    }

    public boolean x() {
        return this.F;
    }

    public SocketFactory y() {
        return this.u;
    }

    public SSLSocketFactory z() {
        return this.v;
    }

    y(b bVar) {
        boolean z2;
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        List<k> list = bVar.d;
        this.f = list;
        this.n = rnf.q(bVar.e);
        this.o = rnf.q(bVar.f);
        this.p = bVar.g;
        this.q = bVar.h;
        this.r = bVar.i;
        this.s = bVar.j;
        this.t = bVar.k;
        this.u = bVar.l;
        Iterator<k> it = list.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                k next = it.next();
                if (z2 || next.a) {
                    z2 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.m;
        if (sSLSocketFactory != null || !z2) {
            this.v = sSLSocketFactory;
            this.w = bVar.n;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    SSLContext i = sof.h().i();
                    i.init(null, new TrustManager[]{x509TrustManager}, null);
                    this.v = i.getSocketFactory();
                    this.w = sof.h().c(x509TrustManager);
                } catch (GeneralSecurityException e) {
                    throw rnf.b("No System TLS", e);
                }
            } catch (GeneralSecurityException e2) {
                throw rnf.b("No System TLS", e2);
            }
        }
        if (this.v != null) {
            sof.h().e(this.v);
        }
        this.x = bVar.o;
        this.y = bVar.p.c(this.w);
        this.z = bVar.q;
        this.A = bVar.r;
        this.B = bVar.s;
        this.C = bVar.t;
        this.D = bVar.u;
        this.E = bVar.v;
        this.F = bVar.w;
        this.G = bVar.x;
        this.H = bVar.y;
        this.I = bVar.z;
        this.J = bVar.A;
        this.K = bVar.B;
        if (this.n.contains(null)) {
            StringBuilder V0 = je.V0("Null interceptor: ");
            V0.append(this.n);
            throw new IllegalStateException(V0.toString());
        } else if (this.o.contains(null)) {
            StringBuilder V02 = je.V0("Null network interceptor: ");
            V02.append(this.o);
            throw new IllegalStateException(V02.toString());
        }
    }

    public static final class b {
        int A;
        int B;
        n a;
        Proxy b;
        List<Protocol> c;
        List<k> d;
        final List<v> e;
        final List<v> f;
        p.b g;
        ProxySelector h;
        m i;
        c j;
        znf k;
        SocketFactory l;
        SSLSocketFactory m;
        wof n;
        HostnameVerifier o;
        g p;
        b q;
        b r;
        j s;
        o t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new n();
            this.c = y.L;
            this.d = y.M;
            this.g = new q(p.a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new tof();
            }
            this.i = m.a;
            this.l = SocketFactory.getDefault();
            this.o = xof.a;
            this.p = g.c;
            b bVar = b.a;
            this.q = bVar;
            this.r = bVar;
            this.s = new j();
            this.t = o.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public b a(v vVar) {
            this.e.add(vVar);
            return this;
        }

        public b b(v vVar) {
            this.f.add(vVar);
            return this;
        }

        public y c() {
            return new y(this);
        }

        public b d(c cVar) {
            this.j = cVar;
            this.k = null;
            return this;
        }

        public b e(long j2, TimeUnit timeUnit) {
            this.x = rnf.e("timeout", j2, timeUnit);
            return this;
        }

        public b f(long j2, TimeUnit timeUnit) {
            this.y = rnf.e("timeout", j2, timeUnit);
            return this;
        }

        public b g(List<k> list) {
            this.d = rnf.q(list);
            return this;
        }

        public b h(p.b bVar) {
            this.g = bVar;
            return this;
        }

        public b i(boolean z2) {
            this.v = z2;
            return this;
        }

        public List<v> j() {
            return this.e;
        }

        public b k(long j2, TimeUnit timeUnit) {
            this.z = rnf.e("timeout", j2, timeUnit);
            return this;
        }

        public b l(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.m = sSLSocketFactory;
                this.n = sof.h().c(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        public b m(long j2, TimeUnit timeUnit) {
            this.A = rnf.e("timeout", j2, timeUnit);
            return this;
        }

        b(y yVar) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            this.a = yVar.a;
            this.b = yVar.b;
            this.c = yVar.c;
            this.d = yVar.f;
            arrayList.addAll(yVar.n);
            arrayList2.addAll(yVar.o);
            this.g = yVar.p;
            this.h = yVar.q;
            this.i = yVar.r;
            this.k = yVar.t;
            this.j = yVar.s;
            this.l = yVar.u;
            this.m = yVar.v;
            this.n = yVar.w;
            this.o = yVar.x;
            this.p = yVar.y;
            this.q = yVar.z;
            this.r = yVar.A;
            this.s = yVar.B;
            this.t = yVar.C;
            this.u = yVar.D;
            this.v = yVar.E;
            this.w = yVar.F;
            this.x = yVar.G;
            this.y = yVar.H;
            this.z = yVar.I;
            this.A = yVar.J;
            this.B = yVar.K;
        }
    }
}
