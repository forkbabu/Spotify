package defpackage;

import android.content.Context;
import io.reactivex.y;

/* renamed from: qef  reason: default package */
public final class qef implements fjf<pef> {
    private final wlf<Context> a;
    private final wlf<y> b;

    public qef(wlf<Context> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pef(this.a.get(), this.b.get());
    }
}
