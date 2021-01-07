package defpackage;

import com.spotify.libs.search.offline.model.OfflineEntity;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: dta  reason: default package */
public final class dta implements fjf<cta> {
    private final wlf<hta> a;
    private final wlf<hsa<OfflineEntity>> b;
    private final wlf<q3> c;

    public dta(wlf<hta> wlf, wlf<hsa<OfflineEntity>> wlf2, wlf<q3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cta(this.a.get(), this.b.get(), this.c.get());
    }
}
