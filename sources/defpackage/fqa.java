package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: fqa  reason: default package */
public final class fqa implements fjf<cqa> {
    private final wlf<Cosmonaut> a;

    public fqa(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    public static cqa a(Cosmonaut cosmonaut) {
        cqa cqa = (cqa) cosmonaut.createCosmosService(cqa.class);
        yif.g(cqa, "Cannot return null from a non-@Nullable @Provides method");
        return cqa;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
