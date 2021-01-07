package defpackage;

import io.reactivex.g;

/* renamed from: d4b  reason: default package */
public final class d4b implements fjf<c4b> {
    private final wlf<g<y6b>> a;

    public d4b(wlf<g<y6b>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c4b(this.a);
    }
}
