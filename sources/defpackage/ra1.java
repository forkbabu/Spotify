package defpackage;

import android.content.Context;
import io.reactivex.y;

/* renamed from: ra1  reason: default package */
public final class ra1 implements fjf<qa1> {
    private final wlf<Context> a;
    private final wlf<y> b;

    public ra1(wlf<Context> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qa1(this.a.get(), this.b.get());
    }
}
