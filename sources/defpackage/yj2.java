package defpackage;

import com.spotify.http.u;

/* renamed from: yj2  reason: default package */
public final class yj2 implements fjf<xj2> {
    private final wlf<u> a;

    public yj2(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xj2(this.a.get());
    }
}
