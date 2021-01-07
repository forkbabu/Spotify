package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.http.wg.e;

/* renamed from: bn0  reason: default package */
public final class bn0 implements fjf<e> {
    private final wlf<Cosmonaut> a;
    private final wlf<RxResolver> b;

    public bn0(wlf<Cosmonaut> wlf, wlf<RxResolver> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        RxResolver rxResolver = this.b.get();
        rxResolver.getClass();
        e eVar = (e) this.a.get().createCosmosService(e.class, new vm0(rxResolver));
        yif.g(eVar, "Cannot return null from a non-@Nullable @Provides method");
        return eVar;
    }
}
