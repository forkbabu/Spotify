package defpackage;

import com.spotify.remoteconfig.gj;

/* renamed from: pu0  reason: default package */
public final class pu0 implements fjf<Boolean> {
    private final wlf<gj> a;

    public pu0(wlf<gj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().d());
    }
}
