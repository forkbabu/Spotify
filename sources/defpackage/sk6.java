package defpackage;

import com.spotify.remoteconfig.u9;

/* renamed from: sk6  reason: default package */
public final class sk6 implements fjf<rk6> {
    private final wlf<tk6> a;
    private final wlf<u9> b;

    public sk6(wlf<tk6> wlf, wlf<u9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rk6(this.a.get(), this.b.get());
    }
}
