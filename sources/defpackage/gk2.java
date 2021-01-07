package defpackage;

import com.spotify.http.u;

/* renamed from: gk2  reason: default package */
public final class gk2 implements fjf<fk2> {
    private final wlf<u> a;

    public gk2(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fk2 fk2 = (fk2) this.a.get().c(fk2.class);
        yif.g(fk2, "Cannot return null from a non-@Nullable @Provides method");
        return fk2;
    }
}
