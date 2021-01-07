package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: dn4  reason: default package */
public final class dn4 implements fjf<zm4> {
    private final wlf<Cosmonaut> a;

    public dn4(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        zm4 zm4 = (zm4) this.a.get().createCosmosService(zm4.class);
        yif.g(zm4, "Cannot return null from a non-@Nullable @Provides method");
        return zm4;
    }
}
