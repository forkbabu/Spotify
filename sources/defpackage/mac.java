package defpackage;

import io.reactivex.y;

/* renamed from: mac  reason: default package */
public final class mac implements fjf<lac> {
    private final wlf<o61> a;
    private final wlf<v9c> b;
    private final wlf<jrd> c;
    private final wlf<y> d;

    public mac(wlf<o61> wlf, wlf<v9c> wlf2, wlf<jrd> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lac(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
