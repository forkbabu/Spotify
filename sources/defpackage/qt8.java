package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: qt8  reason: default package */
public final class qt8 implements fjf<pt8> {
    private final wlf<ys2> a;
    private final wlf<Fragment> b;

    public qt8(wlf<ys2> wlf, wlf<Fragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pt8(this.a.get(), this.b.get());
    }
}
