package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.http.o;

/* renamed from: gn0  reason: default package */
public final class gn0 implements fjf<o> {
    private final wlf<Cosmonaut> a;
    private final wlf<RxResolver> b;

    public gn0(wlf<Cosmonaut> wlf, wlf<RxResolver> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        RxResolver rxResolver = this.b.get();
        rxResolver.getClass();
        o oVar = (o) this.a.get().createCosmosService(o.class, new vm0(rxResolver));
        yif.g(oVar, "Cannot return null from a non-@Nullable @Provides method");
        return oVar;
    }
}
