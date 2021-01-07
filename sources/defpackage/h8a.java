package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: h8a  reason: default package */
public final class h8a implements fjf<f8a> {
    private final wlf<Cosmonaut> a;

    public h8a(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f8a f8a = (f8a) this.a.get().createCosmosService(f8a.class);
        yif.g(f8a, "Cannot return null from a non-@Nullable @Provides method");
        return f8a;
    }
}
