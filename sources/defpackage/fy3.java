package defpackage;

import android.content.Context;

/* renamed from: fy3  reason: default package */
public final class fy3 implements fjf<ey3> {
    private final wlf<Context> a;
    private final wlf<Boolean> b;

    public fy3(wlf<Context> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ey3(this.a.get(), this.b.get().booleanValue());
    }
}
