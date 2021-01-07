package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: hf5  reason: default package */
public final class hf5 implements fjf<gf5> {
    private final wlf<Cosmonaut> a;

    public hf5(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        gf5 gf5 = (gf5) this.a.get().createCosmosService(gf5.class);
        yif.g(gf5, "Cannot return null from a non-@Nullable @Provides method");
        return gf5;
    }
}
