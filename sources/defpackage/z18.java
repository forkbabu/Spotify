package defpackage;

import com.spotify.inappmessaging.m;

/* renamed from: z18  reason: default package */
public final class z18 implements fjf<rp0> {
    private final wlf<m> a;

    public z18(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rp0 a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
