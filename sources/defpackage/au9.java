package defpackage;

import com.spotify.cosmos.session.SessionClient;
import com.spotify.http.m;
import com.spotify.remoteconfig.dc;

/* renamed from: au9  reason: default package */
public final class au9 implements fjf<ut9> {
    private final wlf<m> a;
    private final wlf<dc> b;
    private final wlf<SessionClient> c;

    public au9(wlf<m> wlf, wlf<dc> wlf2, wlf<SessionClient> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ut9(this.a.get(), this.b.get(), this.c.get());
    }
}
