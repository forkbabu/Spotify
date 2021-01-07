package okhttp3;

import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.u;

public final class a {
    final u a;
    final o b;
    final SocketFactory c;
    final b d;
    final List<Protocol> e;
    final List<k> f;
    final ProxySelector g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final g k;

    public a(String str, int i2, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<Protocol> list, List<k> list2, ProxySelector proxySelector) {
        u.a aVar = new u.a();
        aVar.i(sSLSocketFactory != null ? Constants.SCHEME : "http");
        aVar.f(str);
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException(je.p0("unexpected port: ", i2));
        }
        aVar.e = i2;
        this.a = aVar.c();
        if (oVar != null) {
            this.b = oVar;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (bVar != null) {
                    this.d = bVar;
                    if (list != null) {
                        this.e = rnf.q(list);
                        if (list2 != null) {
                            this.f = rnf.q(list2);
                            if (proxySelector != null) {
                                this.g = proxySelector;
                                this.h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = gVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public g a() {
        return this.k;
    }

    public List<k> b() {
        return this.f;
    }

    public o c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean d(a aVar) {
        return this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && rnf.n(this.h, aVar.h) && rnf.n(this.i, aVar.i) && rnf.n(this.j, aVar.j) && rnf.n(this.k, aVar.k) && this.a.e == aVar.a.e;
    }

    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public List<Protocol> f() {
        return this.e;
    }

    public Proxy g() {
        return this.h;
    }

    public b h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.h;
        int i2 = 0;
        int hashCode3 = (hashCode2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode4 = (hashCode3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode5 = (hashCode4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        g gVar = this.k;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public ProxySelector i() {
        return this.g;
    }

    public SocketFactory j() {
        return this.c;
    }

    public SSLSocketFactory k() {
        return this.i;
    }

    public u l() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Address{");
        V0.append(this.a.d);
        V0.append(":");
        V0.append(this.a.e);
        if (this.h != null) {
            V0.append(", proxy=");
            V0.append(this.h);
        } else {
            V0.append(", proxySelector=");
            V0.append(this.g);
        }
        V0.append("}");
        return V0.toString();
    }
}
