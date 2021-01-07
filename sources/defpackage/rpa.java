package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: rpa  reason: default package */
public final class rpa implements fjf<qpa> {
    private final wlf<ys2> a;
    private final wlf<Fragment> b;

    public rpa(wlf<ys2> wlf, wlf<Fragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qpa(this.a.get(), this.b.get());
    }
}
