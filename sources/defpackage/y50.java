package defpackage;

import com.google.protobuf.u;
import com.spotify.remoteconfig.j8;

/* renamed from: y50  reason: default package */
public final class y50 implements fjf<x50> {
    private final wlf<j8> a;
    private final wlf<gl0<u>> b;
    private final wlf<b60> c;

    public y50(wlf<j8> wlf, wlf<gl0<u>> wlf2, wlf<b60> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x50(this.a.get(), this.b.get(), this.c.get());
    }
}
