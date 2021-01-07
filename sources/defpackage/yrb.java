package defpackage;

import io.reactivex.g;

/* renamed from: yrb  reason: default package */
public final class yrb implements fjf<xrb> {
    private final wlf<g<String>> a;
    private final wlf<esb> b;

    public yrb(wlf<g<String>> wlf, wlf<esb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xrb(this.a, this.b);
    }
}
