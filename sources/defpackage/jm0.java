package defpackage;

import com.spotify.http.u;
import com.spotify.signup.api.services.a;

/* renamed from: jm0  reason: default package */
public final class jm0 implements fjf<iae> {
    private final wlf<u> a;

    public jm0(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return iae.a((a) this.a.get().c(a.class), "client_mobile");
    }
}
