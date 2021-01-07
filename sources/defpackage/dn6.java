package defpackage;

import com.spotify.remoteconfig.w9;
import defpackage.ja6;
import defpackage.qb6;
import defpackage.zt6;

/* renamed from: dn6  reason: default package */
public final class dn6 implements fjf<cn6> {
    private final wlf<en6> a;
    private final wlf<zt6.a> b;
    private final wlf<ja6.a> c;
    private final wlf<ei6> d;
    private final wlf<w9> e;
    private final wlf<qb6.a> f;

    public dn6(wlf<en6> wlf, wlf<zt6.a> wlf2, wlf<ja6.a> wlf3, wlf<ei6> wlf4, wlf<w9> wlf5, wlf<qb6.a> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cn6(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
