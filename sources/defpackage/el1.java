package defpackage;

import com.spotify.mobile.android.rx.w;

/* renamed from: el1  reason: default package */
public final class el1 implements fjf<dl1> {
    private final wlf<w> a;
    private final wlf<sxd> b;
    private final wlf<vw0> c;

    public el1(wlf<w> wlf, wlf<sxd> wlf2, wlf<vw0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dl1(this.a.get(), this.b.get(), this.c.get());
    }
}
