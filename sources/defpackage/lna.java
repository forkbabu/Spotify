package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.music.libs.podcast.loader.k;

/* renamed from: lna  reason: default package */
public final class lna implements fjf<k> {
    private final wlf<Cosmonaut> a;

    public lna(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        k kVar = (k) this.a.get().createCosmosService(k.class);
        yif.g(kVar, "Cannot return null from a non-@Nullable @Provides method");
        return kVar;
    }
}
