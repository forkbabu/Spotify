package defpackage;

import com.spotify.libs.connect.instrumentation.e;

/* renamed from: on4  reason: default package */
public final class on4 implements fjf<nn4> {
    private final wlf<ao4> a;
    private final wlf<e> b;

    public on4(wlf<ao4> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nn4(this.a.get(), this.b.get());
    }
}
