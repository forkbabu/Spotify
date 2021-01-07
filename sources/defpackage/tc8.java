package defpackage;

import com.spotify.ubi.specification.factories.p3;

/* renamed from: tc8  reason: default package */
public final class tc8 implements fjf<sc8> {
    private final wlf<p3> a;

    public tc8(wlf<p3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sc8(this.a.get());
    }
}
