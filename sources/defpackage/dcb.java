package defpackage;

import com.spotify.http.u;

/* renamed from: dcb  reason: default package */
public final class dcb implements fjf<ccb> {
    private final wlf<u> a;

    public dcb(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ccb ccb = (ccb) this.a.get().c(ccb.class);
        yif.g(ccb, "Cannot return null from a non-@Nullable @Provides method");
        return ccb;
    }
}
