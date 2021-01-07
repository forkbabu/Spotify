package defpackage;

import com.spotify.http.u;

/* renamed from: pa5  reason: default package */
public final class pa5 implements fjf<na5> {
    private final wlf<u> a;

    public pa5(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        na5 na5 = (na5) this.a.get().c(na5.class);
        yif.g(na5, "Cannot return null from a non-@Nullable @Provides method");
        return na5;
    }
}
