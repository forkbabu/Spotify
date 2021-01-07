package defpackage;

import com.spotify.http.u;

/* renamed from: ul8  reason: default package */
public final class ul8 implements fjf<lo8> {
    private final wlf<u> a;

    public ul8(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        lo8 lo8 = (lo8) this.a.get().c(lo8.class);
        yif.g(lo8, "Cannot return null from a non-@Nullable @Provides method");
        return lo8;
    }
}
