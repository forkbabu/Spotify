package defpackage;

import com.spotify.http.u;

/* renamed from: kr9  reason: default package */
public final class kr9 implements fjf<at9> {
    private final wlf<u> a;

    public kr9(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        at9 at9 = (at9) this.a.get().b(at9.class);
        yif.g(at9, "Cannot return null from a non-@Nullable @Provides method");
        return at9;
    }
}
