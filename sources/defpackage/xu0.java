package defpackage;

import com.spotify.libs.connect.u;

/* renamed from: xu0  reason: default package */
public final class xu0 implements fjf<wu0> {
    private final wlf<u> a;
    private final wlf<yu0> b;

    public xu0(wlf<u> wlf, wlf<yu0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wu0(this.a.get(), this.b.get());
    }
}
