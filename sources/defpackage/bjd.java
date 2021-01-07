package defpackage;

import com.spotify.http.u;

/* renamed from: bjd  reason: default package */
public final class bjd implements fjf<ajd> {
    private final wlf<u> a;

    public bjd(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ajd ajd = (ajd) this.a.get().c(ajd.class);
        yif.g(ajd, "Cannot return null from a non-@Nullable @Provides method");
        return ajd;
    }
}
