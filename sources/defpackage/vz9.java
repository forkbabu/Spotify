package defpackage;

import com.spotify.http.u;

/* renamed from: vz9  reason: default package */
public final class vz9 implements fjf<zz9> {
    private final wlf<u> a;

    public vz9(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        zz9 zz9 = (zz9) this.a.get().c(zz9.class);
        yif.g(zz9, "Cannot return null from a non-@Nullable @Provides method");
        return zz9;
    }
}
