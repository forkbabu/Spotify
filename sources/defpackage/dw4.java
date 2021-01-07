package defpackage;

import android.content.Context;

/* renamed from: dw4  reason: default package */
public final class dw4 implements fjf<cw4> {
    private final wlf<Context> a;

    public dw4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cw4(this.a.get());
    }
}
