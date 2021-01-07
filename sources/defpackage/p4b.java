package defpackage;

import io.reactivex.k;

/* renamed from: p4b  reason: default package */
public final class p4b implements fjf<o4b> {
    private final wlf<g4b> a;
    private final wlf<k<b91, b91>> b;

    public p4b(wlf<g4b> wlf, wlf<k<b91, b91>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o4b(this.a.get(), this.b.get());
    }
}
