package defpackage;

import com.spotify.http.u;

/* renamed from: i75  reason: default package */
public final class i75 implements fjf<e75> {
    private final wlf<u> a;

    public i75(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e75 e75 = (e75) this.a.get().c(e75.class);
        yif.g(e75, "Cannot return null from a non-@Nullable @Provides method");
        return e75;
    }
}
