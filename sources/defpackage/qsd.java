package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

/* renamed from: qsd  reason: default package */
public final class qsd {
    private final vsd a;
    private final c b;
    private final ij9 c;
    private final ifd d;
    private final String e;

    public qsd(vsd vsd, c cVar, a aVar, ifd ifd, String str) {
        h.e(vsd, "defaultTitle");
        h.e(cVar, "viewUri");
        h.e(aVar, "pageIdentifier");
        h.e(ifd, "featureIdentifier");
        ij9 b2 = ij9.b(aVar, null);
        h.d(b2, "PageViewObservable.create(pageIdentifier)");
        h.e(vsd, "defaultTitle");
        h.e(cVar, "viewUri");
        h.e(b2, "pageViewObservable");
        h.e(ifd, "featureIdentifier");
        this.a = vsd;
        this.b = cVar;
        this.c = b2;
        this.d = ifd;
        this.e = str;
    }

    public final vsd a() {
        return this.a;
    }

    public final ifd b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final ij9 d() {
        return this.c;
    }

    public final c e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsd)) {
            return false;
        }
        qsd qsd = (qsd) obj;
        return h.a(this.a, qsd.a) && h.a(this.b, qsd.b) && h.a(this.c, qsd.c) && h.a(this.d, qsd.d) && h.a(this.e, qsd.e);
    }

    public int hashCode() {
        vsd vsd = this.a;
        int i = 0;
        int hashCode = (vsd != null ? vsd.hashCode() : 0) * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        ij9 ij9 = this.c;
        int hashCode3 = (hashCode2 + (ij9 != null ? ij9.hashCode() : 0)) * 31;
        ifd ifd = this.d;
        int hashCode4 = (hashCode3 + (ifd != null ? ifd.hashCode() : 0)) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PageLegacyMetadata(defaultTitle=");
        V0.append(this.a);
        V0.append(", viewUri=");
        V0.append(this.b);
        V0.append(", pageViewObservable=");
        V0.append(this.c);
        V0.append(", featureIdentifier=");
        V0.append(this.d);
        V0.append(", pageTag=");
        return je.I0(V0, this.e, ")");
    }
}
