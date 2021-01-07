package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: mz0  reason: default package */
public final class mz0 implements fjf<lz0> {
    private final wlf<Cosmonaut> a;

    public mz0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        lz0 lz0 = (lz0) this.a.get().createCosmosService(lz0.class);
        yif.g(lz0, "Cannot return null from a non-@Nullable @Provides method");
        return lz0;
    }
}
