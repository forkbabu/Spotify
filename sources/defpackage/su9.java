package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.imageresolve.r;

/* renamed from: su9  reason: default package */
public final class su9 implements fjf<r> {
    private final wlf<Cosmonaut> a;

    public su9(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        r rVar = (r) this.a.get().createCosmosService(r.class);
        yif.g(rVar, "Cannot return null from a non-@Nullable @Provides method");
        return rVar;
    }
}
