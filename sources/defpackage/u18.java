package defpackage;

import com.spotify.remoteconfig.lj;

/* renamed from: u18  reason: default package */
public final class u18 implements fjf<e18> {
    private final wlf<lj> a;

    public u18(wlf<lj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return e18.c(this.a.get());
    }
}
