package defpackage;

import com.google.common.base.Optional;
import com.spotify.http.clienttoken.ClientTokenProvider;

/* renamed from: xm0  reason: default package */
public final class xm0 implements fjf<on0> {
    private final wlf<ClientTokenProvider> a;
    private final wlf<Optional<Boolean>> b;

    public xm0(wlf<ClientTokenProvider> wlf, wlf<Optional<Boolean>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new on0(this.a.get(), this.b.get());
    }
}
