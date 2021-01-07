package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.home.common.datasource.g;

/* renamed from: lj5  reason: default package */
public final class lj5 implements fjf<g> {
    private final wlf<u> a;

    public lj5(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g gVar = (g) this.a.get().c(g.class);
        yif.g(gVar, "Cannot return null from a non-@Nullable @Provides method");
        return gVar;
    }
}
