package defpackage;

import com.spotify.http.u;

/* renamed from: b95  reason: default package */
public final class b95 implements fjf<w85> {
    private final wlf<u> a;

    public b95(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w85 w85 = (w85) this.a.get().c(w85.class);
        yif.g(w85, "Cannot return null from a non-@Nullable @Provides method");
        return w85;
    }
}
