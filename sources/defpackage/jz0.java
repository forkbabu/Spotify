package defpackage;

import com.google.protobuf.u;
import com.spotify.music.spotlets.tracker.identifier.a;

/* renamed from: jz0  reason: default package */
public final class jz0 implements fjf<iz0> {
    private final wlf<a> a;
    private final wlf<gl0<u>> b;
    private final wlf<kx0> c;

    public jz0(wlf<a> wlf, wlf<gl0<u>> wlf2, wlf<kx0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iz0(this.a.get(), this.b.get(), this.c.get());
    }
}
