package defpackage;

import com.spotify.http.u;

/* renamed from: of2  reason: default package */
public final class of2 implements fjf<nf2> {
    private final wlf<u> a;

    public of2(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        nf2 nf2 = (nf2) this.a.get().c(nf2.class);
        yif.g(nf2, "Cannot return null from a non-@Nullable @Provides method");
        return nf2;
    }
}
