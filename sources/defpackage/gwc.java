package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: gwc  reason: default package */
public final class gwc implements fjf<iwc> {
    private final wlf<Cosmonaut> a;

    public gwc(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        iwc iwc = (iwc) this.a.get().createCosmosService(iwc.class);
        yif.g(iwc, "Cannot return null from a non-@Nullable @Provides method");
        return iwc;
    }
}
