package defpackage;

import android.content.Context;

/* renamed from: gg0  reason: default package */
public final class gg0 implements fjf<fg0> {
    private final wlf<Context> a;
    private final wlf<Boolean> b;

    public gg0(wlf<Context> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fg0(this.a.get(), this.b.get().booleanValue());
    }
}
