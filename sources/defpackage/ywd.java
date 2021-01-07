package defpackage;

import androidx.fragment.app.c;
import defpackage.bxd;

/* renamed from: ywd  reason: default package */
public final class ywd implements fjf<bxd> {
    private final wlf<bxd.a> a;
    private final wlf<c> b;

    public ywd(wlf<bxd.a> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        bxd a2 = this.a.get().a(this.b.get().A());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
