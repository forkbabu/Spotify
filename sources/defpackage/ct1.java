package defpackage;

import android.content.Context;
import io.reactivex.y;

/* renamed from: ct1  reason: default package */
public final class ct1 implements fjf<bt1> {
    private final wlf<Context> a;
    private final wlf<at1> b;
    private final wlf<y> c;

    public ct1(wlf<Context> wlf, wlf<at1> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bt1(this.a.get(), this.b.get(), this.c.get());
    }
}
