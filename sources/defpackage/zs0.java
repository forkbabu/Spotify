package defpackage;

import com.google.protobuf.u;
import com.spotify.libs.connect.instrumentation.a;
import com.spotify.libs.connect.providers.h;

/* renamed from: zs0  reason: default package */
public final class zs0 implements fjf<ys0> {
    private final wlf<gl0<u>> a;
    private final wlf<h> b;
    private final wlf<a> c;

    public zs0(wlf<gl0<u>> wlf, wlf<h> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ys0(this.a.get(), this.b.get(), this.c.get());
    }
}
