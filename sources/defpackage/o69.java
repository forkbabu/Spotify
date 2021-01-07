package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: o69  reason: default package */
public final class o69 implements fjf<ha9> {
    private final wlf<Cosmonaut> a;

    public o69(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ha9 ha9 = (ha9) this.a.get().createCosmosService(ha9.class);
        yif.g(ha9, "Cannot return null from a non-@Nullable @Provides method");
        return ha9;
    }
}
