package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: wl9  reason: default package */
public final class wl9 implements fjf<mk9> {
    private final wlf<Cosmonaut> a;

    public wl9(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        mk9 mk9 = (mk9) this.a.get().createCosmosService(mk9.class);
        yif.g(mk9, "Cannot return null from a non-@Nullable @Provides method");
        return mk9;
    }
}
