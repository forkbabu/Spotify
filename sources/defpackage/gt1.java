package defpackage;

import com.spotify.http.u;

/* renamed from: gt1  reason: default package */
public final class gt1 implements fjf<at1> {
    private final wlf<u> a;

    public gt1(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        at1 at1 = (at1) this.a.get().c(at1.class);
        yif.g(at1, "Cannot return null from a non-@Nullable @Provides method");
        return at1;
    }
}
