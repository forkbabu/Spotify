package defpackage;

import com.spotify.http.u;
import com.spotify.signup.api.services.a;

/* renamed from: lw5  reason: default package */
public final class lw5 implements fjf<iae> {
    private final wlf<u> a;

    public lw5(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return iae.a((a) this.a.get().c(a.class), "client_mobile");
    }
}
