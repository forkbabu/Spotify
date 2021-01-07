package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: jv0  reason: default package */
public final class jv0 implements fjf<iv0> {
    private final wlf<gj> a;

    public jv0(wlf<gj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iv0(this.a.get());
    }
}
