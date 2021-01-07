package defpackage;

import com.spotify.libs.pse.model.e;

/* renamed from: vy0  reason: default package */
public final class vy0 implements fjf<e> {
    private final wlf<hx0> a;

    public vy0(wlf<hx0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
