package defpackage;

import android.content.Context;

/* renamed from: fa6  reason: default package */
public final class fa6 implements fjf<ea6> {
    private final wlf<Context> a;

    public fa6(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ea6(this.a.get());
    }
}
