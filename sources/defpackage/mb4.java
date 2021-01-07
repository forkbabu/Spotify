package defpackage;

import com.spotify.http.u;

/* renamed from: mb4  reason: default package */
public final class mb4 implements fjf<cf4> {
    private final wlf<u> a;

    public mb4(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        cf4 cf4 = (cf4) this.a.get().c(cf4.class);
        yif.g(cf4, "Cannot return null from a non-@Nullable @Provides method");
        return cf4;
    }
}
