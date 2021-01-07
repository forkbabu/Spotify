package defpackage;

import com.spotify.http.u;

/* renamed from: z69  reason: default package */
public final class z69 implements fjf<ia9> {
    private final wlf<u> a;

    public z69(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ia9 ia9 = (ia9) this.a.get().c(ia9.class);
        yif.g(ia9, "Cannot return null from a non-@Nullable @Provides method");
        return ia9;
    }
}
