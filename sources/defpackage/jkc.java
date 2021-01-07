package defpackage;

import defpackage.wgc;
import defpackage.zrc;

/* renamed from: jkc  reason: default package */
public final class jkc implements fjf<zrc.a> {
    private final wlf<wgc> a;

    public jkc(wlf<wgc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return zrc.a.a(wgc.a.class, this.a.get());
    }
}
