package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: ag4  reason: default package */
public final class ag4 implements fjf<zf4> {
    private final wlf<ys2> a;
    private final wlf<Fragment> b;

    public ag4(wlf<ys2> wlf, wlf<Fragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zf4(this.a.get(), this.b.get());
    }
}
