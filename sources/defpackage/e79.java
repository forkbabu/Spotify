package defpackage;

import com.spotify.ubi.specification.factories.r4;

/* renamed from: e79  reason: default package */
public final class e79 implements fjf<xc9> {
    private final wlf<ere> a;

    public e79(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xc9(this.a.get(), new r4());
    }
}
