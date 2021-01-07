package defpackage;

import com.spotify.http.u;

/* renamed from: yz9  reason: default package */
public final class yz9 implements fjf<b0a> {
    private final wlf<u> a;

    public yz9(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        b0a b0a = (b0a) this.a.get().c(b0a.class);
        yif.g(b0a, "Cannot return null from a non-@Nullable @Provides method");
        return b0a;
    }
}
