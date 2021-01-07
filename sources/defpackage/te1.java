package defpackage;

import com.spotify.http.u;

/* renamed from: te1  reason: default package */
public final class te1 implements fjf<lj1> {
    private final wlf<u> a;

    public te1(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        lj1 lj1 = (lj1) this.a.get().c(lj1.class);
        yif.g(lj1, "Cannot return null from a non-@Nullable @Provides method");
        return lj1;
    }
}
