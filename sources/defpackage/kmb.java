package defpackage;

import io.reactivex.g;

/* renamed from: kmb  reason: default package */
public final class kmb implements fjf<jmb> {
    private final wlf<lmb> a;
    private final wlf<g<String>> b;

    public kmb(wlf<lmb> wlf, wlf<g<String>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jmb(this.a, this.b);
    }
}
