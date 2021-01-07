package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: hr0  reason: default package */
public final class hr0 implements fjf<gr0> {
    private final wlf<gj> a;

    public hr0(wlf<gj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gr0(this.a.get());
    }
}
