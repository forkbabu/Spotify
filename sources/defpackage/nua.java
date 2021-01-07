package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: nua  reason: default package */
public final class nua implements fjf<mua> {
    private final wlf<jwa> a;
    private final wlf<q3> b;

    public nua(wlf<jwa> wlf, wlf<q3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mua(this.a.get(), this.b.get());
    }
}
