package defpackage;

import com.spotify.http.u;

/* renamed from: dgd  reason: default package */
public final class dgd implements fjf<hgd> {
    private final wlf<u> a;

    public dgd(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hgd hgd = (hgd) this.a.get().c(hgd.class);
        yif.g(hgd, "Cannot return null from a non-@Nullable @Provides method");
        return hgd;
    }
}
