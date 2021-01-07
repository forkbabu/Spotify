package defpackage;

import com.spotify.http.u;

/* renamed from: iga  reason: default package */
public final class iga implements fjf<kga> {
    private final wlf<u> a;

    public iga(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        kga kga = (kga) this.a.get().c(kga.class);
        yif.g(kga, "Cannot return null from a non-@Nullable @Provides method");
        return kga;
    }
}
