package defpackage;

import com.spotify.ubi.specification.factories.y;

/* renamed from: pk2  reason: default package */
public final class pk2 implements fjf<ok2> {
    private final wlf<ere> a;
    private final wlf<y> b;

    public pk2(wlf<ere> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ok2(this.a.get(), this.b.get());
    }
}
