package defpackage;

import com.spotify.ubi.specification.factories.a3;

/* renamed from: zsc  reason: default package */
public final class zsc implements fjf<ysc> {
    private final wlf<ere> a;
    private final wlf<a3> b;

    public zsc(wlf<ere> wlf, wlf<a3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ysc(this.a.get(), this.b.get());
    }
}
