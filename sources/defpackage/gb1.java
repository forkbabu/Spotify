package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: gb1  reason: default package */
public final class gb1 implements fjf<fb1> {
    private final wlf<Cosmonaut> a;

    public gb1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fb1 fb1 = (fb1) this.a.get().createCosmosService(fb1.class);
        yif.g(fb1, "Cannot return null from a non-@Nullable @Provides method");
        return fb1;
    }
}
