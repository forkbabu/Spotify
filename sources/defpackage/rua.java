package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: rua  reason: default package */
public final class rua implements fjf<qua> {
    private final wlf<mwa> a;
    private final wlf<q3> b;
    private final wlf<Boolean> c;

    public rua(wlf<mwa> wlf, wlf<q3> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qua(this.a.get(), this.b.get(), this.c.get().booleanValue());
    }
}
