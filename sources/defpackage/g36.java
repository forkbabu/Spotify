package defpackage;

import com.spotify.http.u;

/* renamed from: g36  reason: default package */
public final class g36 implements fjf<e36> {
    private final wlf<u> a;

    public g36(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e36 e36 = (e36) this.a.get().c(e36.class);
        yif.g(e36, "Cannot return null from a non-@Nullable @Provides method");
        return e36;
    }
}
