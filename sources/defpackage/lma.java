package defpackage;

import com.spotify.http.u;

/* renamed from: lma  reason: default package */
public final class lma implements fjf<pma> {
    private final wlf<u> a;

    public lma(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        pma pma = (pma) this.a.get().c(pma.class);
        yif.g(pma, "Cannot return null from a non-@Nullable @Provides method");
        return pma;
    }
}
