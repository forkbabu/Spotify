package defpackage;

import com.spotify.remoteconfig.s9;

/* renamed from: gk6  reason: default package */
public final class gk6 implements fjf<fk6> {
    private final wlf<hk6> a;
    private final wlf<s9> b;

    public gk6(wlf<hk6> wlf, wlf<s9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fk6(this.a.get(), this.b.get());
    }
}
