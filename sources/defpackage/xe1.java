package defpackage;

import com.spotify.http.u;

/* renamed from: xe1  reason: default package */
public final class xe1 implements fjf<vj1> {
    private final wlf<u> a;

    public xe1(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vj1 vj1 = (vj1) this.a.get().c(vj1.class);
        yif.g(vj1, "Cannot return null from a non-@Nullable @Provides method");
        return vj1;
    }
}
