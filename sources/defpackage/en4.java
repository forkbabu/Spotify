package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: en4  reason: default package */
public final class en4 implements fjf<cn4> {
    private final wlf<Cosmonaut> a;

    public en4(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        cn4 cn4 = (cn4) this.a.get().createCosmosService(cn4.class);
        yif.g(cn4, "Cannot return null from a non-@Nullable @Provides method");
        return cn4;
    }
}
