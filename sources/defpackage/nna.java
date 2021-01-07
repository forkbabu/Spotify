package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.music.libs.podcast.loader.n;

/* renamed from: nna  reason: default package */
public final class nna implements fjf<n> {
    private final wlf<Cosmonaut> a;

    public nna(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        n nVar = (n) this.a.get().createCosmosService(n.class);
        yif.g(nVar, "Cannot return null from a non-@Nullable @Provides method");
        return nVar;
    }
}
