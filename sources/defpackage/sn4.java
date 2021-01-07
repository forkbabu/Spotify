package defpackage;

import com.spotify.libs.connect.instrumentation.e;

/* renamed from: sn4  reason: default package */
public final class sn4 implements fjf<rn4> {
    private final wlf<op4> a;
    private final wlf<e> b;

    public sn4(wlf<op4> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rn4(this.a.get(), this.b.get());
    }
}
