package defpackage;

import com.spotify.http.u;

/* renamed from: ue1  reason: default package */
public final class ue1 implements fjf<cj1> {
    private final wlf<u> a;

    public ue1(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        cj1 cj1 = (cj1) this.a.get().c(cj1.class);
        yif.g(cj1, "Cannot return null from a non-@Nullable @Provides method");
        return cj1;
    }
}
