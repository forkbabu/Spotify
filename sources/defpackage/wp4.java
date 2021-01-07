package defpackage;

import android.content.Context;

/* renamed from: wp4  reason: default package */
public final class wp4 implements fjf<sp4> {
    private final wlf<Context> a;
    private final wlf<tp4> b;

    public wp4(wlf<Context> wlf, wlf<tp4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sp4(this.a.get(), this.b.get());
    }
}
