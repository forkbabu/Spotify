package defpackage;

import com.spotify.http.u;

/* renamed from: gu8  reason: default package */
public final class gu8 implements fjf<eu8> {
    private final wlf<u> a;

    public gu8(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        eu8 eu8 = (eu8) this.a.get().c(eu8.class);
        yif.g(eu8, "Cannot return null from a non-@Nullable @Provides method");
        return eu8;
    }
}
