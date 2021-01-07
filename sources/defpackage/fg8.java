package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: fg8  reason: default package */
public final class fg8 implements fjf<eg8> {
    private final wlf<ys2> a;
    private final wlf<Fragment> b;

    public fg8(wlf<ys2> wlf, wlf<Fragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eg8(this.a.get(), this.b.get());
    }
}
