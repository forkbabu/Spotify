package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.music.libs.podcast.loader.i;

/* renamed from: kna  reason: default package */
public final class kna implements fjf<i> {
    private final wlf<Cosmonaut> a;

    public kna(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        i iVar = (i) this.a.get().createCosmosService(i.class);
        yif.g(iVar, "Cannot return null from a non-@Nullable @Provides method");
        return iVar;
    }
}
