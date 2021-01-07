package defpackage;

import com.spotify.ubi.specification.factories.l1;
import defpackage.xhb;
import kotlin.jvm.internal.h;

/* renamed from: bib  reason: default package */
public final class bib implements fjf<mhb> {
    private final wlf<ere> a;
    private final wlf<l1> b;

    public bib(wlf<ere> wlf, wlf<l1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        ere ere = this.a.get();
        l1 l1Var = this.b.get();
        xhb.a aVar = xhb.a;
        h.e(ere, "userBehaviourEventLogger");
        h.e(l1Var, "mobileHubsNewMarketingFormatEventFactory");
        return new mhb(ere, l1Var);
    }
}
