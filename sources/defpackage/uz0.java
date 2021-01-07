package defpackage;

import com.spotify.http.u;

/* renamed from: uz0  reason: default package */
public final class uz0 implements fjf<vz0> {
    private final wlf<u> a;

    public uz0(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vz0 vz0 = (vz0) this.a.get().c(vz0.class);
        yif.g(vz0, "Cannot return null from a non-@Nullable @Provides method");
        return vz0;
    }
}
