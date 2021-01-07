package defpackage;

import androidx.fragment.app.c;
import defpackage.lh3;

/* renamed from: sh3  reason: default package */
public final class sh3 implements fjf<rh3> {
    private final wlf<c> a;
    private final wlf<lh3.a> b;
    private final wlf<uh3> c;

    public sh3(wlf<c> wlf, wlf<lh3.a> wlf2, wlf<uh3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rh3(this.a.get(), this.b.get(), this.c.get());
    }
}
