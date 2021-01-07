package defpackage;

import com.spotify.pageloader.s0;
import com.spotify.pageloader.w0;
import kotlin.jvm.internal.h;

/* renamed from: nac  reason: default package */
public final class nac<T> {
    private final nmf<T, s0> a;
    private final cmf<w0> b;
    private final cmf<s0> c;
    private final cmf<s0> d;

    public nac(nmf nmf, cmf cmf, cmf cmf2, cmf cmf3, int i) {
        cmf = (i & 2) != 0 ? null : cmf;
        int i2 = i & 4;
        int i3 = i & 8;
        h.e(nmf, "loaded");
        this.a = nmf;
        this.b = cmf;
        this.c = null;
        this.d = null;
    }

    public final cmf<s0> a() {
        return this.d;
    }

    public final nmf<T, s0> b() {
        return this.a;
    }

    public final cmf<s0> c() {
        return this.c;
    }

    public final cmf<w0> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nac)) {
            return false;
        }
        nac nac = (nac) obj;
        return h.a(this.a, nac.a) && h.a(this.b, nac.b) && h.a(this.c, nac.c) && h.a(this.d, nac.d);
    }

    public int hashCode() {
        nmf<T, s0> nmf = this.a;
        int i = 0;
        int hashCode = (nmf != null ? nmf.hashCode() : 0) * 31;
        cmf<w0> cmf = this.b;
        int hashCode2 = (hashCode + (cmf != null ? cmf.hashCode() : 0)) * 31;
        cmf<s0> cmf2 = this.c;
        int hashCode3 = (hashCode2 + (cmf2 != null ? cmf2.hashCode() : 0)) * 31;
        cmf<s0> cmf3 = this.d;
        if (cmf3 != null) {
            i = cmf3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoadableConfig(loaded=");
        V0.append(this.a);
        V0.append(", placeholder=");
        V0.append(this.b);
        V0.append(", notFound=");
        V0.append(this.c);
        V0.append(", customError=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
