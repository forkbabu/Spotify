package defpackage;

import io.reactivex.y;

/* renamed from: at4  reason: default package */
public final class at4 implements fjf<zs4> {
    private final wlf<wt4> a;
    private final wlf<y> b;

    public at4(wlf<wt4> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zs4(this.a.get(), this.b.get());
    }
}
