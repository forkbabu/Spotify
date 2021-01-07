package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.remoteconfig.x4;

/* renamed from: uj1  reason: default package */
public final class uj1 implements fjf<tj1> {
    private final wlf<x4> a;
    private final wlf<vj1> b;
    private final wlf<lj1> c;
    private final wlf<ii1> d;
    private final wlf<w> e;

    public uj1(wlf<x4> wlf, wlf<vj1> wlf2, wlf<lj1> wlf3, wlf<ii1> wlf4, wlf<w> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tj1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
