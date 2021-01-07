package defpackage;

import com.spotify.remoteconfig.lj;

/* renamed from: v18  reason: default package */
public final class v18 implements fjf<e18> {
    private final wlf<lj> a;

    public v18(wlf<lj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return e18.d(this.a.get());
    }
}
