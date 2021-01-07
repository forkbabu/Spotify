package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: g8a  reason: default package */
public final class g8a implements fjf<p8a> {
    private final wlf<Cosmonaut> a;

    public g8a(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        p8a p8a = (p8a) this.a.get().createCosmosService(p8a.class);
        yif.g(p8a, "Cannot return null from a non-@Nullable @Provides method");
        return p8a;
    }
}
