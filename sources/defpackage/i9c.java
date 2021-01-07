package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.music.offlinetrials.limited.trackentity.endpoint.a;

/* renamed from: i9c  reason: default package */
public final class i9c implements fjf<a> {
    private final wlf<Cosmonaut> a;

    public i9c(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = (a) this.a.get().createCosmosService(a.class);
        yif.g(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
