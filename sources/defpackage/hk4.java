package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: hk4  reason: default package */
public final class hk4 implements fjf<sk4> {
    private final wlf<Boolean> a;
    private final wlf<pk4> b;

    public hk4(wlf<Boolean> wlf, wlf<pk4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean booleanValue = this.a.get().booleanValue();
        pk4 pk4 = this.b.get();
        h.e(pk4, "gradientHeaderFactory");
        return new sk4(booleanValue, false, pk4);
    }
}
