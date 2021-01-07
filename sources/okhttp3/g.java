package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

public final class g {
    public static final g c = new a().a();
    private final Set<b> a;
    private final wof b;

    public static final class a {
        private final List<b> a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.a), null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    g(Set<b> set, wof wof) {
        this.a = set;
        this.b = wof;
    }

    public static String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder V0 = je.V0("sha256/");
            V0.append(ByteString.s(((X509Certificate) certificate).getPublicKey().getEncoded()).w().d());
            return V0.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<b> it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        } else if (!emptyList.isEmpty()) {
            wof wof = this.b;
            if (wof != null) {
                list = wof.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (emptyList.size() > 0) {
                    ((b) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder Z0 = je.Z0("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                Z0.append("\n    ");
                Z0.append(b(x509Certificate2));
                Z0.append(": ");
                Z0.append(x509Certificate2.getSubjectDN().getName());
            }
            Z0.append("\n  Pinned certificates for ");
            Z0.append(str);
            Z0.append(":");
            int size3 = emptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Z0.append("\n    ");
                Z0.append((b) emptyList.get(i3));
            }
            throw new SSLPeerUnverifiedException(Z0.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public g c(wof wof) {
        return rnf.n(this.b, wof) ? this : new g(this.a, wof);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (rnf.n(this.b, gVar.b) && this.a.equals(gVar.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        wof wof = this.b;
        return this.a.hashCode() + ((wof != null ? wof.hashCode() : 0) * 31);
    }
}
