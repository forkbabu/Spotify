package defpackage;

import com.spotify.http.u;
import com.spotify.signup.api.services.a;

/* renamed from: ibe  reason: default package */
public final class ibe implements fjf<iae> {
    private final wlf<u> a;

    public ibe(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return iae.a((a) this.a.get().c(a.class), "client_mobile");
    }
}
