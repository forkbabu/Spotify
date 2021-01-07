package defpackage;

import com.spotify.libs.connect.instrumentation.e;

/* renamed from: gr4  reason: default package */
public final class gr4 implements fjf<fr4> {
    private final wlf<zs4> a;
    private final wlf<e> b;

    public gr4(wlf<zs4> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fr4(this.a.get(), this.b.get());
    }
}
