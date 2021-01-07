package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: dg9  reason: default package */
public final class dg9 implements fjf<cg9> {
    private final wlf<ys2> a;
    private final wlf<Fragment> b;

    public dg9(wlf<ys2> wlf, wlf<Fragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cg9(this.a.get(), this.b.get());
    }
}
