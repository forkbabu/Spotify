package defpackage;

import android.content.Context;
import com.google.android.gms.common.d;

/* renamed from: ws0  reason: default package */
public final class ws0 implements fjf<vs0> {
    private final wlf<Context> a;
    private final wlf<d> b;

    public ws0(wlf<Context> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vs0(this.a.get(), this.b.get());
    }
}
