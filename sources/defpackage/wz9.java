package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: wz9  reason: default package */
public final class wz9 implements fjf<a0a> {
    private final wlf<Cosmonaut> a;

    public wz9(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a0a a0a = (a0a) this.a.get().createCosmosService(a0a.class);
        yif.g(a0a, "Cannot return null from a non-@Nullable @Provides method");
        return a0a;
    }
}
