package defpackage;

import com.google.protobuf.u;
import com.spotify.player.sub.l;

/* renamed from: b8f  reason: default package */
public final class b8f implements fjf<a8f> {
    private final wlf<l> a;
    private final wlf<gl0<u>> b;

    public b8f(wlf<l> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a8f(this.a.get(), this.b.get());
    }
}
