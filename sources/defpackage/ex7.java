package defpackage;

import androidx.fragment.app.Fragment;
import defpackage.bxd;
import kotlin.jvm.internal.h;

/* renamed from: ex7  reason: default package */
public final class ex7 implements fjf<bxd> {
    private final dx7 a;
    private final wlf<bxd.a> b;
    private final wlf<Fragment> c;

    public ex7(dx7 dx7, wlf<bxd.a> wlf, wlf<Fragment> wlf2) {
        this.a = dx7;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        dx7 dx7 = this.a;
        bxd.a aVar = this.b.get();
        Fragment fragment = this.c.get();
        dx7.getClass();
        h.e(aVar, "playerApisFactory");
        h.e(fragment, "fragment");
        bxd a2 = aVar.a(fragment.A());
        h.d(a2, "playerApisFactory.create(fragment.lifecycle)");
        return a2;
    }
}
