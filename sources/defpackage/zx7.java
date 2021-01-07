package defpackage;

import androidx.fragment.app.Fragment;
import defpackage.bxd;
import kotlin.jvm.internal.h;

/* renamed from: zx7  reason: default package */
public final class zx7 implements fjf<bxd> {
    private final yx7 a;
    private final wlf<bxd.a> b;
    private final wlf<Fragment> c;

    public zx7(yx7 yx7, wlf<bxd.a> wlf, wlf<Fragment> wlf2) {
        this.a = yx7;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        yx7 yx7 = this.a;
        bxd.a aVar = this.b.get();
        Fragment fragment = this.c.get();
        yx7.getClass();
        h.e(aVar, "playerApisFactory");
        h.e(fragment, "fragment");
        bxd a2 = aVar.a(fragment.A());
        h.d(a2, "playerApisFactory.create(fragment.lifecycle)");
        return a2;
    }
}
