package defpackage;

import com.spotify.http.u;

/* renamed from: jr9  reason: default package */
public final class jr9 implements fjf<ps9> {
    private final wlf<u> a;

    public jr9(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ps9 ps9 = (ps9) this.a.get().b(ps9.class);
        yif.g(ps9, "Cannot return null from a non-@Nullable @Provides method");
        return ps9;
    }
}
