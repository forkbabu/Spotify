package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class s {
    private final TlsVersion a;
    private final h b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private s(TlsVersion tlsVersion, h hVar, List<Certificate> list, List<Certificate> list2) {
        this.a = tlsVersion;
        this.b = hVar;
        this.c = list;
        this.d = list2;
    }

    public static s b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            h a2 = h.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                TlsVersion d2 = TlsVersion.d(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = rnf.r(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = rnf.r(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new s(d2, a2, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static s c(TlsVersion tlsVersion, h hVar, List<Certificate> list, List<Certificate> list2) {
        return new s(tlsVersion, hVar, rnf.q(list), rnf.q(list2));
    }

    public h a() {
        return this.b;
    }

    public List<Certificate> d() {
        return this.d;
    }

    public List<Certificate> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.a.equals(sVar.a) || !this.b.equals(sVar.b) || !this.c.equals(sVar.c) || !this.d.equals(sVar.d)) {
            return false;
        }
        return true;
    }

    public TlsVersion f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
