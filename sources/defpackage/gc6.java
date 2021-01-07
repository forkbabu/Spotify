package defpackage;

import com.spotify.http.u;

/* renamed from: gc6  reason: default package */
public final class gc6 implements fjf<vb6> {
    private final wlf<u> a;

    public gc6(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vb6 vb6 = (vb6) this.a.get().c(vb6.class);
        yif.g(vb6, "Cannot return null from a non-@Nullable @Provides method");
        return vb6;
    }
}
