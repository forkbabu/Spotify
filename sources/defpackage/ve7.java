package defpackage;

import com.spotify.http.u;

/* renamed from: ve7  reason: default package */
public final class ve7 implements fjf<ne7> {
    private final wlf<u> a;

    public ve7(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ne7 ne7 = (ne7) this.a.get().c(ne7.class);
        yif.g(ne7, "Cannot return null from a non-@Nullable @Provides method");
        return ne7;
    }
}
