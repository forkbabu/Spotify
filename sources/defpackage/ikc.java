package defpackage;

import defpackage.lgc;
import defpackage.zrc;

/* renamed from: ikc  reason: default package */
public final class ikc implements fjf<zrc.a> {
    private final wlf<lgc> a;

    public ikc(wlf<lgc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        lgc lgc = this.a.get();
        lgc.b(true);
        return zrc.a.a(lgc.a.class, lgc);
    }
}
