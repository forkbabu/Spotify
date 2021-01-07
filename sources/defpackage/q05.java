package defpackage;

import com.spotify.http.u;

/* renamed from: q05  reason: default package */
public final class q05 implements fjf<p05> {
    private final wlf<u> a;

    public q05(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p05(this.a.get());
    }
}
