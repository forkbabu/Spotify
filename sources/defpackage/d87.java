package defpackage;

import com.spotify.podcast.endpoints.s;
import com.spotify.remoteconfig.q6;

/* renamed from: d87  reason: default package */
public final class d87 implements fjf<c87> {
    private final wlf<s> a;
    private final wlf<e87> b;
    private final wlf<q6> c;

    public d87(wlf<s> wlf, wlf<e87> wlf2, wlf<q6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c87(this.a.get(), this.b.get(), this.c.get());
    }
}
