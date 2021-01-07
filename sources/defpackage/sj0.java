package defpackage;

import com.spotify.remoteconfig.bc;
import defpackage.ov9;

/* renamed from: sj0  reason: default package */
public final class sj0 implements fjf<rj0> {
    private final wlf<ov9.a> a;
    private final wlf<bc> b;

    public sj0(wlf<ov9.a> wlf, wlf<bc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static rj0 a(ov9.a aVar, bc bcVar) {
        return new rj0(aVar, bcVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rj0(this.a.get(), this.b.get());
    }
}
