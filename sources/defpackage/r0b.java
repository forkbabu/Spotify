package defpackage;

import defpackage.xya;
import io.reactivex.w;

/* renamed from: r0b  reason: default package */
public final class r0b implements fjf<q0b> {
    private final wlf<vz0> a;
    private final wlf<w<xya.g, tz0>> b;

    public r0b(wlf<vz0> wlf, wlf<w<xya.g, tz0>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q0b(this.a.get(), this.b.get());
    }
}
