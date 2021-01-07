package defpackage;

import com.spotify.ubi.specification.factories.v4;

/* renamed from: tt5  reason: default package */
public final class tt5 implements fjf<st5> {
    private final wlf<ere> a;
    private final wlf<v4> b;
    private final wlf<rt5> c;

    public tt5(wlf<ere> wlf, wlf<v4> wlf2, wlf<rt5> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new st5(this.a.get(), this.b.get(), this.c.get());
    }
}
