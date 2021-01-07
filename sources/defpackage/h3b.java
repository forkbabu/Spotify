package defpackage;

import com.spotify.libs.search.offline.model.OfflineResults;

/* renamed from: h3b  reason: default package */
public final class h3b implements fjf<g3b> {
    private final wlf<qqa> a;
    private final wlf<sg0<OfflineResults, b91>> b;

    public h3b(wlf<qqa> wlf, wlf<sg0<OfflineResults, b91>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g3b(this.a.get(), this.b.get());
    }
}
