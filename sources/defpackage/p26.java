package defpackage;

import com.spotify.http.u;

/* renamed from: p26  reason: default package */
public final class p26 implements fjf<q26> {
    private final wlf<u> a;

    public p26(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q26 q26 = (q26) this.a.get().c(q26.class);
        yif.g(q26, "Cannot return null from a non-@Nullable @Provides method");
        return q26;
    }
}
