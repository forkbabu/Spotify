package defpackage;

import io.reactivex.s;
import io.reactivex.y;

/* renamed from: bia  reason: default package */
public final class bia implements fjf<aia> {
    private final wlf<s<na1>> a;
    private final wlf<yha> b;
    private final wlf<y> c;

    public bia(wlf<s<na1>> wlf, wlf<yha> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aia(this.a.get(), this.b.get(), this.c.get());
    }
}
