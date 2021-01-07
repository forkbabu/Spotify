package defpackage;

import androidx.fragment.app.Fragment;
import defpackage.bxd;

/* renamed from: axd  reason: default package */
public final class axd implements fjf<bxd> {
    private final wlf<bxd.a> a;
    private final wlf<Fragment> b;

    public axd(wlf<bxd.a> wlf, wlf<Fragment> wlf2) {
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
