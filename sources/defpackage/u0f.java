package defpackage;

import com.google.protobuf.u;
import com.spotify.player.sub.l;

/* renamed from: u0f  reason: default package */
public final class u0f implements fjf<t0f> {
    private final wlf<l> a;
    private final wlf<gl0<u>> b;

    public u0f(wlf<l> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t0f(this.a.get(), this.b.get());
    }
}
