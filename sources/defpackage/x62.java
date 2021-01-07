package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.mobile.android.video.endvideo.j;

/* renamed from: x62  reason: default package */
public final class x62 implements fjf<j> {
    private final wlf<Cosmonaut> a;

    public x62(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        j jVar = (j) this.a.get().createCosmosService(j.class);
        yif.g(jVar, "Cannot return null from a non-@Nullable @Provides method");
        return jVar;
    }
}
