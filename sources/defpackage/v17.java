package defpackage;

import com.spotify.http.u;

/* renamed from: v17  reason: default package */
public final class v17 implements fjf<m17> {
    private final wlf<u> a;

    public v17(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        m17 m17 = (m17) this.a.get().c(m17.class);
        yif.g(m17, "Cannot return null from a non-@Nullable @Provides method");
        return m17;
    }
}
