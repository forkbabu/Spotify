package defpackage;

import com.spotify.ubi.specification.factories.y2;

/* renamed from: eb1  reason: default package */
public final class eb1 implements fjf<db1> {
    private final wlf<ere> a;
    private final wlf<y2> b;

    public eb1(wlf<ere> wlf, wlf<y2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new db1(this.a.get(), this.b.get());
    }
}
