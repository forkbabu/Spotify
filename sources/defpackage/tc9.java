package defpackage;

import com.spotify.ubi.specification.factories.o4;

/* renamed from: tc9  reason: default package */
public final class tc9 implements fjf<sc9> {
    private final wlf<o4> a;
    private final wlf<ere> b;

    public tc9(wlf<o4> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sc9(this.a.get(), this.b.get());
    }
}
