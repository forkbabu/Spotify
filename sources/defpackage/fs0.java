package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: fs0  reason: default package */
public final class fs0 implements fjf<gs0> {
    private final wlf<Cosmonaut> a;

    public fs0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        gs0 gs0 = (gs0) this.a.get().createCosmosService(gs0.class);
        yif.g(gs0, "Cannot return null from a non-@Nullable @Provides method");
        return gs0;
    }
}
