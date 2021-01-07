package defpackage;

import com.spotify.http.u;

/* renamed from: ic6  reason: default package */
public final class ic6 implements fjf<wb6> {
    private final wlf<u> a;

    public ic6(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        wb6 wb6 = (wb6) this.a.get().c(wb6.class);
        yif.g(wb6, "Cannot return null from a non-@Nullable @Provides method");
        return wb6;
    }
}
