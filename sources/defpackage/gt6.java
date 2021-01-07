package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.playlistentity.story.header.g0;

/* renamed from: gt6  reason: default package */
public final class gt6 implements fjf<g0> {
    private final wlf<u> a;

    public gt6(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g0 g0Var = (g0) this.a.get().c(g0.class);
        yif.g(g0Var, "Cannot return null from a non-@Nullable @Provides method");
        return g0Var;
    }
}
